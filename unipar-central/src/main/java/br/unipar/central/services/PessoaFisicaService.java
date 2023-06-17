package br.unipar.central.services;

import br.unipar.central.exceptions.CampoNaoInformadoException;
import br.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.unipar.central.exceptions.TamanhoCampoInvalidoException;
import br.unipar.central.exceptions.ValorInvalidoException;
import br.unipar.central.models.PessoaFisica;
import br.unipar.central.repositories.PessoaFisicaDAO;
import java.sql.SQLException;
import java.util.List;

public class PessoaFisicaService {

    public void validar(PessoaFisica pessoaFP) throws
            EntidadeNaoInformadaException,
            CampoNaoInformadoException,
            TamanhoCampoInvalidoException,
            ValorInvalidoException {

        if (pessoaFP == null) {
            throw new EntidadeNaoInformadaException("Pessoa");
        }

        if (pessoaFP.getNome() == null
                || pessoaFP.getNome().isEmpty()
                || pessoaFP.getNome().isBlank()) {
            throw new CampoNaoInformadoException("Nome");
        }

        if ((pessoaFP.getNome().length() > 60)) {
            throw new TamanhoCampoInvalidoException("Nome", 60);
        }

        if (pessoaFP.getCpf() == null
                || pessoaFP.getCpf().isEmpty()
                || pessoaFP.getCpf().isBlank()) {
            throw new CampoNaoInformadoException("Cpf");
        }

        if ((pessoaFP.getCpf().length() > 11)) {
            throw new TamanhoCampoInvalidoException("Cpf", 11);
        }

        if (pessoaFP.getRg() == null
                || pessoaFP.getRg().isEmpty()
                || pessoaFP.getRg().isBlank()) {
            throw new CampoNaoInformadoException("RG");
        }

        if ((pessoaFP.getRg().length() == 15)) {
            throw new TamanhoCampoInvalidoException("RG", 15);
        }
        
        if (pessoaFP.getPessoa() == null) {
            throw new EntidadeNaoInformadaException("Pessoa");
        }
    }

    public List<PessoaFisica> findAll() throws SQLException {

        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
        List<PessoaFisica> resultado = pessoaFisicaDAO.findAll();

        return resultado;
    }

    public PessoaFisica findById(String cpf) throws SQLException, TamanhoCampoInvalidoException, Exception {

        if (cpf.length() <= 0) {
            throw new TamanhoCampoInvalidoException("Cpf", 1);
        }

        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
        PessoaFisica retorno = pessoaFisicaDAO.findById(cpf);

        if (retorno == null) {
            throw new Exception("País com o id: " + cpf + " não encontrado");
        }

        return pessoaFisicaDAO.findById(cpf);
    }

    public void insert(PessoaFisica pessoaFisica) throws SQLException, EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException, ValorInvalidoException {
        validar(pessoaFisica);
        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
        pessoaFisicaDAO.insert(pessoaFisica);
    }

    public void update(PessoaFisica pessoaFisica) throws SQLException, EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException, ValorInvalidoException {
        validar(pessoaFisica);
        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
        pessoaFisicaDAO.update(pessoaFisica);
    }

    public void delete(String cpf) throws SQLException {
        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
        pessoaFisicaDAO.delete(cpf);

    }
}
