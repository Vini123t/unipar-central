package br.unipar.central.executions;

import br.unipar.central.models.PessoaJuridica;
import br.unipar.central.models.Pessoa;
import br.unipar.central.services.PessoaJuridicaService;
import java.util.List;
import java.util.Scanner;

public class PessoaJuridicaExecution {

    public String Insert() {
        try {
            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a razão social da pessoa jurídica: ");
            pessoaJuridica.setRazaoSocial(scanner.nextLine());
            System.out.println("Informe o cnpj de pessoa jurídica: ");
            pessoaJuridica.setCnpj(scanner.nextLine());
            System.out.println("Informe o cnae da pessoa jurídica: ");
            pessoaJuridica.setCnaePrincipal(scanner.nextLine());
            System.out.println("Informe o nome fantasia da pessoa jurídica: ");
            pessoaJuridica.setFantasia(scanner.nextLine());
            System.out.println("Informe o id da pessoa atrelada a essa pessoa jurídica: ");
            Pessoa pessoaPOJO = new Pessoa();
            pessoaPOJO.setId(scanner.nextInt());
            pessoaJuridica.setPessoa(pessoaPOJO);

            PessoaJuridicaService pessoaJuridicaService = new PessoaJuridicaService();
            pessoaJuridicaService.insert(pessoaJuridica);
            String msg = "Inserido com sucesso";
            System.out.println(msg);
            return msg;
        } catch (Exception ex) {
            String msg = ex.getMessage();
            System.out.println(msg);
            return msg;
        }
    }

    public String FindAll() {
        try {
            PessoaJuridicaService pessoaJuridicaService = new PessoaJuridicaService();
            List<PessoaJuridica> procurarPorPessoaJuridica = pessoaJuridicaService.findAll();
            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            String msg = "Todos os itens encontrados " + procurarPorPessoaJuridica.toString();
            System.out.println(msg);
            return msg;
        } catch (Exception ex) {
            String msg = ex.getMessage();
            System.out.println(msg);
            return msg;
        }
    }

    public String FindById() {
        try {
            PessoaJuridicaService pessoaJuridicaService = new PessoaJuridicaService();
            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o CNPJ de  : ");
            String cpf = scanner.nextLine();
            pessoaJuridica.setCnpj(cpf);
            
           
            String msg = "Item encontrado: " + pessoaJuridicaService.findById(pessoaJuridica.getCnpj());
            System.out.println(msg);
            return msg;
        } catch (Exception ex) {
            String msg = ex.getMessage();
            System.out.println(msg);
            return msg;
        }
    }

    public String DeleteById() {
        try {
            Scanner scanner = new Scanner(System.in);

            PessoaJuridicaService pessoaJuridicaService = new PessoaJuridicaService();
            PessoaJuridica pessoaJuridica = new PessoaJuridica();

            System.out.println("Informe o CNPJ de pessoaJuridica: ");
            pessoaJuridica.setCnpj(scanner.nextLine());
            pessoaJuridicaService.delete(pessoaJuridica.getCnpj());
            String msg = "Item deletado com sucesso";
            System.out.println(msg);
            return msg;
        } catch (Exception ex) {
            String msg = ex.getMessage();
            System.out.println(msg);
            return msg;
        }
    }

    public String Update() {
        try {
            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a razão social da pessoa jurídica: ");
            pessoaJuridica.setRazaoSocial(scanner.nextLine());
            
            System.out.println("Informe o cnpj de pessoa jurídica: ");
            pessoaJuridica.setCnpj(scanner.nextLine());
            
            System.out.println("Informe o cnae da pessoa jurídica: ");
            pessoaJuridica.setCnaePrincipal(scanner.nextLine());
            
            System.out.println("Informe o nome fantasia da pessoa jurídica: ");
            pessoaJuridica.setFantasia(scanner.nextLine());
            
            System.out.println("Informe o id da pessoa atrelada a essa pessoa jurídica: ");
            Pessoa pessoaPOJO = new Pessoa();
            pessoaPOJO.setId(scanner.nextInt());
            pessoaJuridica.setPessoa(pessoaPOJO);
            
            
            PessoaJuridicaService pessoaJuridicaService = new PessoaJuridicaService();
            pessoaJuridicaService.update(pessoaJuridica);
            String msg = "Update realizado com sucesso";
            System.out.println(msg);
            return msg;
        } catch (Exception ex) {
            String msg = ex.getMessage();
            System.out.println(msg);
            return msg;
        }
    }

}
