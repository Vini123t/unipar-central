package br.unipar.central.services;



import br.unipar.central.exceptions.CampoNaoInformadoException;
import br.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.unipar.central.exceptions.TamanhoCampoInvalidoException;
import br.unipar.central.models.PessoaJuridica;
import br.unipar.central.repositories.PessoaJuridicaDAO;
import java.sql.SQLException;
import java.util.List;

public class PessoaJuridicaService {

    public void validar(PessoaJuridica PJPJ) throws
            EntidadeOuClasseEmBrancoOuNaoInformadaException,
            CampoEspecificoNaoInformadoException,
            TamanhoMaximoDoCampoExcedidoException,
            ValorInvalidoException {

        if (PJPJ == null) {
            throw new EntidadeOuClasseEmBrancoOuNaoInformadaException("pais");
        }

        if (PJPJ.getRazaoSocial() == null
                || PJPJ.getRazaoSocial().isEmpty()
                || PJPJ.getRazaoSocial().isBlank()) {
            throw new CampoEspecificoNaoInformadoException("razão social");
        }

        if ((PJPJ.getRazaoSocial().length() > 60)) {
            throw new TamanhoMaximoDoCampoExcedidoException("razão social", 60);
        }
        
        if (PJPJ.getCnpj()== null
                || PJPJ.getCnpj().isEmpty()
                || PJPJ.getCnpj().isBlank()) {
            throw new CampoEspecificoNaoInformadoException("cpf");
        }

        if ((PJPJ.getCNPJ().length() > 18)) {
            throw new TamanhoMaximoDoCampoExcedidoException("cpf", 18);
        }

        if (PJPJ.getFantasia() == null
                || PJPJ.getFantasia().isEmpty()
                || PJPJ.getFantasia().isBlank()) {
            throw new CampoEspecificoNaoInformadoException("nome fantasia");
        }

        if ((PJPJ.getFantasia().length() > 60)) {
            throw new TamanhoMaximoDoCampoExcedidoException("nome fantasia", 60);
        }

        if (PJPJ.getCnaePrincipal() == null
                || PJPJ.getCnaePrincipal().isEmpty()
                || PJPJ.getCnaePrincipal().isBlank()) {
            throw new CampoEspecificoNaoInformadoException("cnae");
        }

        if ((PJPJ.getCnaePrincipal().length() > 100)) {
            throw new TamanhoMaximoDoCampoExcedidoException("cnae", 100);
        }

        if (PJPJ.getPessoa() == null) {
            throw new EntidadeOuClasseEmBrancoOuNaoInformadaException("pessoa");
        }

    }

    public List<PessoaJuridica> findAll() throws SQLException {

        PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
        List<PessoaJuridica> resultado = pessoaJuridicaDAO.findAll();

        return resultado;
    }

    public PessoaJuridica findById(String cnpj) throws SQLException, TamanhoMaximoDoCampoExcedidoException, Exception {

        if (cnpj.length() <= 0) {
            throw new TamanhoMaximoDoCampoExcedidoException("cnpj", 1);
        }

        PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
        PessoaJuridica retorno = pessoaJuridicaDAO.findById(cnpj);

        if (retorno == null) {
            throw new Exception("Não foi possível encontrar um país com o id: " + cnpj + " informado");
        }

        return pessoaJuridicaDAO.findById(cnpj);
    }

    public void insert(PessoaJuridica pessoaJuridica) throws SQLException, EntidadeOuClasseEmBrancoOuNaoInformadaException, CampoEspecificoNaoInformadoException, TamanhoMaximoDoCampoExcedidoException, ValorInvalidoException {
        validar(pessoaJuridica);
        PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
        pessoaJuridicaDAO.insert(pessoaJuridica);
    }

    public void update(PessoaJuridica pessoaJuridica) throws SQLException, EntidadeOuClasseEmBrancoOuNaoInformadaException, CampoEspecificoNaoInformadoException, TamanhoMaximoDoCampoExcedidoException, ValorInvalidoException {
        validar(pessoaJuridica);
        PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
        pessoaJuridicaDAO.update(pessoaJuridica);
    }

    public void delete(String cnpj) throws SQLException {
        PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
        pessoaJuridicaDAO.delete(cnpj);

    }
}

