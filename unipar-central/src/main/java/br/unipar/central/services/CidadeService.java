package br.unipar.central.services;
import br.unipar.central.models.Cidade;
import br.unipar.central.exceptions.CampoNaoInformadoException;
import br.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.unipar.central.exceptions.TamanhoCampoInvalidoException;
import br.unipar.central.exceptions.ValorInvalidoException;
import br.unipar.central.repositories.CidadeDAO;
import java.sql.SQLException;
import java.util.List;



public class CidadeService {
    
    public void validar(Cidade cidade) throws
            EntidadeNaoInformadaException,
            CampoNaoInformadoException,
            TamanhoCampoInvalidoException,
            ValorInvalidoException {

        String idStr = String.valueOf(cidade.getId());

        if (cidade == null) {
            throw new EntidadeNaoInformadaException("cidade");
        }

        if (cidade.getId() == 0) {
            throw new CampoNaoInformadoException("id");
        }

        if (!idStr.matches("\\d+")) {
            throw new ValorInvalidoException("id");
        }

        if (cidade.getNome() == null
                || cidade.getNome().isEmpty()
                || cidade.getNome().isBlank()) {
            throw new CampoNaoInformadoException("nome da cidade");
        }

        if ((cidade.getNome().length() > 30)) {
            throw new TamanhoCampoInvalidoException("nome da cidade", 30);
        }

        if (cidade.getRa() == null
                || cidade.getRa().isEmpty()
                || cidade.getRa().isBlank()) {
            throw new CampoNaoInformadoException("ra");
        }

        if ((cidade.getRa().length() > 8)) {
            throw new TamanhoCampoInvalidoException("ra", 8);
        }

    }

    public List<Cidade> findAll() throws SQLException {

        CidadeDAO cidadeDAO = new CidadeDAO();
        List<Cidade> resultado = cidadeDAO.findAll();

        return resultado;
    }

    public Cidade findById(int id) throws SQLException, TamanhoCampoInvalidoException, Exception {

        if (id <= 0) {
            throw new TamanhoCampoInvalidoException("id", 1);
        }

        CidadeDAO cidadeDAO = new CidadeDAO();
        Cidade retorno = cidadeDAO.findById(id);

        if (retorno == null) {
            throw new Exception("Não foi possível encontrar um país com o id: " + id + " informado");
        }

        return cidadeDAO.findById(id);
    }

    public void insert(Cidade cidade) throws SQLException, EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException, ValorInvalidoException {
        validar(cidade);
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.insert(cidade);
    }

    public void update(Cidade cidade) throws SQLException, EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException, ValorInvalidoException {
        validar(cidade);
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.update(cidade);
    }

    public void delete(int id) throws SQLException {
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.delete(id);

    }
}
