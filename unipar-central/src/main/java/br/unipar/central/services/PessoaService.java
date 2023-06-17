package br.unipar.central.services;

import br.unipar.central.exceptions.CampoNaoInformadoException;
import br.unipar.central.repositories.PessoaDao;
import br.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.unipar.central.exceptions.TamanhoCampoInvalidoException;
import br.unipar.central.exceptions.ValorInvalidoException;
import br.unipar.central.models.Pessoa;

import java.sql.SQLException;
import java.util.List;

public class PessoaService {

    public void validar(Pessoa PPJ) throws
            EntidadeNaoInformadaException,
            CampoNaoInformadoException,
            TamanhoCampoInvalidoException,
            ValorInvalidoException {

        String idStr = String.valueOf(PPJ.getId());

        if (PPJ == null) {
            throw new EntidadeNaoInformadaException("pessoa");
        }

        if (PPJ.getId() == 0) {
            throw new CampoNaoInformadoException("id");
        }

        if (!idStr.matches("\\d+")) {
            throw new ValorInvalidoException("id");
        }

        if (PPJ.getEmail() == null
                || PPJ.getEmail().isEmpty()
                || PPJ.getEmail().isBlank()) {
            throw new CampoNaoInformadoException("email");
        }

        if ((PPJ.getEmail().length() > 100)) {
            throw new TamanhoCampoInvalidoException("email", 100);
        }

        if (PPJ.getRa() == null
                || PPJ.getRa().isEmpty()
                || PPJ.getRa().isBlank()) {
            throw new CampoNaoInformadoException("ra");
        }

        if ((PPJ.getRa().length() > 8)) {
            throw new TamanhoCampoInvalidoException("ra", 8);
        }

    }

    public List<Pessoa> findAll() throws SQLException {

        PessoaDao pessoaDAO = new PessoaDao();
        List<Pessoa> resultado = pessoaDAO.findAll();

        return resultado;
    }

    public Pessoa findById(int id) throws SQLException, TamanhoCampoInvalidoException, Exception {

        if (id <= 0) {
            throw new TamanhoCampoInvalidoException("id", 1);
        }

        PessoaDao pessoaDAO = new PessoaDao();
        Pessoa retorno = pessoaDAO.findById(id);

        if (retorno == null) {
            throw new Exception("Não foi possível encontrar um país com o id: " + id + " informado");
        }

        return pessoaDAO.findById(id);
    }

    public void insert(Pessoa pessoa) throws SQLException, EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException, ValorInvalidoException {
        validar(pessoa);
        PessoaDao pessoaDAO = new PessoaDao();
        pessoaDAO.insert(pessoa);
    }

    public void update(Pessoa pessoa) throws SQLException, EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException, ValorInvalidoException {
        validar(pessoa);
        PessoaDao pessoaDAO = new PessoaDao();
        pessoaDAO.update(pessoa);
    }

    public void delete(int id) throws SQLException {
        PessoaDao pessoaDAO = new PessoaDao();
        pessoaDAO.delete(id);

    }
}
