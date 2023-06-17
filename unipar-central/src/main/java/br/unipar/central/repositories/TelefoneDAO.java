package br.unipar.central.repositories;


import br.unipar.central.enums.OperadoraEnum;
import br.unipar.central.models.Telefone;
import br.unipar.central.utils.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TelefoneDAO {

    private static final String INSERT = "INSERT INTO telefone(id, numero, operadora, ra, agencia_id, pessoa_id) VALUES(?, ?, ?::INTEGER, ?, ?, ?)";

    private static final String FIND_ALL = "SELECT id, numero, operadora, ra, agencia_id, pessoa_id FROM telefone ";

    private static final String FIND_BY_ID = "SELECT id, numero, operadora, ra, agencia_id, pessoa_id FROM telefone WHERE id = ? ";

    private static final String DELETE_BY_ID = "DELETE FROM telefone WHERE id = ?";

    private static final String UPDATE = "UPDATE telefone SET  numero = ?, operadora = ?, ra = ?, agencia_id = ?, pessoa_id = ? WHERE id = ?";

    public List<Telefone> findAll() throws SQLException {
        ArrayList<Telefone> retorno = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            conn = new DatabaseUtils().getConnection();

            pstmt = conn.prepareStatement(FIND_ALL);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Telefone telefone = new Telefone();
                telefone.setId(rs.getInt("id"));
                telefone.setNumero(rs.getString("numero"));
                telefone.setOperadoraEnum(OperadoraEnum.paraEnum(rs.getInt("operadora")));
                telefone.setRa(rs.getString("ra"));
                telefone.setAgencia(new AgenciaDAO().findById(rs.getInt("agencia_id")));
                telefone.setPessoa(new PessoaDao().findById(rs.getInt("pessoa_id")));
                retorno.add(telefone);
            }
        } finally {

            if (conn != null) {
                conn.close();
            }

            if (conn != null) {
                pstmt.close();
            }
        }

        return retorno;
    }

    public Telefone findById(int id) throws SQLException {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Telefone retorno = null;

        try {
            conn = new DatabaseUtils().getConnection();

            pstmt = conn.prepareStatement(FIND_BY_ID);

            pstmt.setInt(1, id);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                retorno = new Telefone();
                retorno.setId(rs.getInt("id"));
                retorno.setNumero(rs.getString("numero"));
                retorno.setOperadoraEnum(OperadoraEnum.paraEnum(rs.getInt("operadora")));
                retorno.setRa(rs.getString("ra"));
                retorno.setAgencia(new AgenciaDAO().findById(rs.getInt("agencia_id")));
                retorno.setPessoa(new PessoaDao().findById(rs.getInt("pessoa_id")));

            }
        } finally {

            if (rs != null) {
                rs.close();
            }

            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return retorno;
    }

    public void insert(Telefone telefone) throws SQLException {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {

            conn = new DatabaseUtils().getConnection();
            pstmt = conn.prepareStatement(INSERT);

            pstmt.setInt(1, telefone.getId());
            pstmt.setString(2, telefone.getNumero());
            pstmt.setInt(3, mapearTipoConta(telefone.getOperadoraEnum()));
            pstmt.setString(4, telefone.getRa());
            pstmt.setInt(5, telefone.getAgencia().getId());
            pstmt.setInt(6, telefone.getPessoa().getId());

            pstmt.executeUpdate();
        } finally {

            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

    }

    public void update(Telefone telefone) throws SQLException {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {

            conn = new DatabaseUtils().getConnection();
            pstmt = conn.prepareStatement(UPDATE);

            
            pstmt.setString(1, telefone.getNumero());
            pstmt.setInt(2, mapearTipoConta(telefone.getOperadoraEnum()));
            pstmt.setString(3, telefone.getRa());
            pstmt.setInt(4, telefone.getAgencia().getId());
            pstmt.setInt(5, telefone.getPessoa().getId());
            pstmt.setInt(6, telefone.getId());
            pstmt.executeUpdate();
//UPDATE telefone SET  numero = ?, operadora = ?, ra = ?, agencia_id = ?, pessoa_id = ? WHERE id = ?
        } finally {

            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

    }

    public void delete(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {

            conn = new DatabaseUtils().getConnection();
            pstmt = conn.prepareStatement(DELETE_BY_ID);

            pstmt.setInt(1, id);

            pstmt.executeUpdate();

        } finally {

            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    private int mapearTipoConta(OperadoraEnum tipoOp) {
        if (tipoOp == OperadoraEnum.TIM) {
            return 1;
        } else if (tipoOp == OperadoraEnum.CLARO) {
            return 2;
        } else if (tipoOp == OperadoraEnum.VIVO) {
            return 3;
        } else if (tipoOp == OperadoraEnum.OI) {
            return 4;
        } else if (tipoOp == OperadoraEnum.CORREIOS) {
            return 5;
        } else if (tipoOp == OperadoraEnum.LARICELL) {
            return 6;
        } else if (tipoOp == OperadoraEnum.TESLA) {
            return 7;
        } else if (tipoOp == OperadoraEnum.IPHONE) {
            return 8;
        } else if (tipoOp == OperadoraEnum.OUTROS) {
            return 9;
        } else if (tipoOp == OperadoraEnum.VALOR44) {
            return 44;
        } else if (tipoOp == OperadoraEnum.VALOR21) {
            return 21;
        } else if (tipoOp == OperadoraEnum.VALOR45) {
            return 45;
        } else if (tipoOp == OperadoraEnum.VALOR11) {
            return 11;
        } else if (tipoOp == OperadoraEnum.VALOR34) {
            return 34;

        } else {
            throw new IllegalArgumentException("Tipo de operadora inválido: " + tipoOp);
        }
    }
}
