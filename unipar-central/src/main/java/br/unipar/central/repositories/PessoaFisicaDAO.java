package br.unipar.central.repositories;

import br.unipar.central.models.PessoaFisica;
import br.unipar.central.utils.DatabaseUtils;
import br.unipar.central.models.Pessoa;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaFisicaDAO {

    private static final String INSERT = "INSERT INTO pessoafisica(nome, cpf, rg, datanascimento, pessoa_id) VALUES(?, ?, ?, ?, ?)";

    private static final String FIND_ALL = "SELECT nome, cpf, rg, datanascimento, pessoa_id FROM pessoafisica ";

    private static final String FIND_BY_ID = "SELECT nome, cpf, rg, datanascimento, pessoa_id FROM pessoafisica WHERE cpf = ? ";

    private static final String DELETE_BY_ID = "DELETE FROM pessoafisica WHERE cpf = ?";

    private static final String UPDATE = "UPDATE pessoafisica SET nome = ?, rg = ?, datanascimento = ?, pessoa_id = ? WHERE cpf = ?";

    public List<PessoaFisica> findAll() throws SQLException {
        ArrayList<PessoaFisica> retorno = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            conn = new DatabaseUtils().getConnection();

            pstmt = conn.prepareStatement(FIND_ALL);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                PessoaFisica pessoaFisica = new PessoaFisica();
                pessoaFisica.setNome(rs.getString("nome"));
                pessoaFisica.setCpf(rs.getString("cpf"));
                pessoaFisica.setRg(rs.getString("rg"));
                pessoaFisica.setDataNascimento(Date.valueOf(rs.getString("datanascimento")));
                pessoaFisica.setPessoa(new PessoaDao().findById(rs.getInt("pessoa_id")));
                retorno.add(pessoaFisica);
            }
        } finally {

            if (rs != null) {
                rs.close();
            }

            if (conn != null) {
                conn.close();
            }

            if (pstmt != null) {
                pstmt.close();
            }
        }

        return retorno;
    }

    public PessoaFisica findById(String cpf) throws SQLException {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        PessoaFisica retorno = null;

        try {
            conn = new DatabaseUtils().getConnection();

            pstmt = conn.prepareStatement(FIND_BY_ID);

            pstmt.setString(1, cpf);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                retorno = new PessoaFisica();
                retorno.setNome(rs.getString("nome"));
                retorno.setCpf(rs.getString("cpf"));
                retorno.setRg(rs.getString("rg"));
                retorno.setDataNascimento(Date.valueOf(rs.getString("datanascimento")));
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

    public void insert(PessoaFisica pessoaFisica) throws SQLException {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {

            conn = new DatabaseUtils().getConnection();
            pstmt = conn.prepareStatement(INSERT);

            pstmt.setString(1, pessoaFisica.getNome());
            pstmt.setString(2, pessoaFisica.getCpf());
            pstmt.setString(3, pessoaFisica.getRg());
            pstmt.setDate(4, Date.valueOf(pessoaFisica.getDataNascimento().toString()));
            pstmt.setInt(5, pessoaFisica.getPessoa().getId());

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

    public void update(PessoaFisica pessoaFisica) throws SQLException {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {

            conn = new DatabaseUtils().getConnection();
            pstmt = conn.prepareStatement(UPDATE);

            pstmt.setString(1, pessoaFisica.getNome());
            pstmt.setString(2, pessoaFisica.getRg());
            pstmt.setDate(3, Date.valueOf(pessoaFisica.getDataNascimento().toString()));
            pstmt.setInt(4, pessoaFisica.getPessoa().getId());
            pstmt.setString(5, pessoaFisica.getCpf());

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

    public void delete(String cpf) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {

            conn = new DatabaseUtils().getConnection();
            pstmt = conn.prepareStatement(DELETE_BY_ID);

            pstmt.setString(1, cpf);

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
}


