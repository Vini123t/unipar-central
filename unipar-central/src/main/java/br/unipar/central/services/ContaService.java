package br.unipar.central.services;

import br.unipar.central.DAO.ContaDAO;
import br.unipar.central.exceptions.CampoNaoInformadoException;
import br.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.unipar.central.exceptions.SaldoZeradoException;
import br.unipar.central.exceptions.TamanhoCampoInvalidoException;
import br.unipar.central.exceptions.ValorInvalidoException;
import br.unipar.central.models.Conta;

import java.sql.SQLException;
import java.util.List;

public class ContaService {

    public void validar(Conta conta) throws
            EntidadeNaoInformadaException,
            CampoNaoInformadoException,
            TamanhoCampoInvalidoException,
            ValorInvalidoException,
            SaldoZeradoException {

        String idStr = String.valueOf(conta.getId());

        if (conta == null) {
            throw new EntidadeNaoInformadaException("Pais");
        }

        if (conta.getId() == 0) {
            throw new CampoNaoInformadoException("Código do país");
        }

        if (!idStr.matches("\\d+")) {
            throw new ValorInvalidoException("Código do país");
        }

        if (conta.getNumero() == null
                || conta.getNumero().isEmpty()
                || conta.getNumero().isBlank()) {
            throw new CampoNaoInformadoException("Numero da conta");
        }

        if ((conta.getNumero().length() > 10)) {
            throw new TamanhoCampoInvalidoException("Numero da conta", 10);
        }

        if (conta.getDigito() == null
                || conta.getDigito().isEmpty()
                || conta.getDigito().isBlank()) {
            throw new CampoNaoInformadoException("Dígito da conta");
        }

        if ((conta.getDigito().length() > 1)) {
            throw new TamanhoCampoInvalidoException("Dígito da conta", 1);
        }

        if (conta.getSaldo() < 0
                || conta.getSaldo() > 0) {
            throw new SaldoZeradoException("Saldo em conta");
        }
        
        if (conta.getTipoConta() == null) {
            throw new CampoNaoInformadoException("Tipo da conta");
        }

        if (conta.getRa() == null
                || conta.getRa().isEmpty()
                || conta.getRa().isBlank()) {
            throw new CampoNaoInformadoException("RA");
        }

        if ((conta.getRa().length() > 8)) {
            throw new TamanhoCampoInvalidoException("RA", 8);
        }

        if (conta.getAgencia() == null) {
            throw new EntidadeNaoInformadaException("Agência");
        }

        if (conta.getPessoa() == null) {
            throw new EntidadeNaoInformadaException("Pessoa");
        }

    }
//--------------------------------------------------------------------------------------------------
    public void validarUpdate(Conta conta) throws EntidadeNaoInformadaException,
            CampoNaoInformadoException,
            TamanhoCampoInvalidoException,
            ValorInvalidoException {

        String idStr = String.valueOf(conta.getId());

        if (conta == null) {
            throw new EntidadeNaoInformadaException("Pais");
        }

        if (conta.getId() == 0) {
            throw new CampoNaoInformadoException("Código do país");
        }

        if (!idStr.matches("\\d+")) {
            throw new ValorInvalidoException("Código do país");
        }

        if (conta.getNumero() == null
                || conta.getNumero().isEmpty()
                || conta.getNumero().isBlank()) {
            throw new CampoNaoInformadoException("Numero da conta");
        }

        if ((conta.getNumero().length() > 10)) {
            throw new TamanhoCampoInvalidoException("Numero da conta", 10);
        }

        if (conta.getDigito() == null
                || conta.getDigito().isEmpty()
                || conta.getDigito().isBlank()) {
            throw new CampoNaoInformadoException("Dígito da conta");
        }

        if ((conta.getDigito().length() > 1)) {
            throw new TamanhoCampoInvalidoException("Dígito da conta", 1);
        }

        if (conta.getTipoConta() == null) {
            throw new CampoNaoInformadoException("Tipo da conta");
        }

        if (conta.getRa() == null
                || conta.getRa().isEmpty()
                || conta.getRa().isBlank()) {
            throw new CampoNaoInformadoException("RA");
        }

        if ((conta.getRa().length() > 8)) {
            throw new TamanhoCampoInvalidoException("RA", 8);
        }

        if (conta.getAgencia() == null) {
            throw new EntidadeNaoInformadaException("agência");
        }

        if (conta.getPessoa() == null) {
            throw new EntidadeNaoInformadaException("Pessoa ");
        }

    }

    public List<Conta> findAll() throws SQLException {

        ContaDAO contaDAO = new ContaDAO();
        List<Conta> resultado = contaDAO.findAll();

        return resultado;
    }

    public Conta findById(int id) throws SQLException, TamanhoCampoInvalidoException, Exception {

        if (id <= 0) {
            throw new TamanhoCampoInvalidoException("id", 1);
        }

        ContaDAO contaDAO = new ContaDAO();
        Conta retorno = contaDAO.findById(id);

        if (retorno == null) {
            throw new Exception("Não foi possível encontrar um país com o id: " + id + " informado");
        }

        return contaDAO.findById(id);
    }

    public void insert(Conta conta) throws SQLException, EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException, ValorInvalidoException, SaldoZeradoException {
        validar(conta);
        ContaDAO contaDAO = new ContaDAO();
        contaDAO.insert(conta);
    }

    public void update(Conta conta) throws SQLException, EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException, ValorInvalidoException, SaldoZeradoException {
        validarUpdate(conta);
        ContaDAO contaDAO = new ContaDAO();
        contaDAO.update(conta);
    }

    public void delete(int id) throws SQLException {
        ContaDAO contaDAO = new ContaDAO();
        contaDAO.delete(id);

    }
}
