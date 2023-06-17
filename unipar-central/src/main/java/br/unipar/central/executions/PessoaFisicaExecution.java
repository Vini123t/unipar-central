package br.unipar.central.executions;

import br.unipar.central.models.PessoaFisica;
import br.unipar.central.models.Pessoa;
import br.unipar.central.services.PessoaFisicaService;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class PessoaFisicaExecution {

    public String Insert() {
        try {
            PessoaFisica pessoaFisica = new PessoaFisica();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o nome da pessoa fisica: ");
            pessoaFisica.setNome(scanner.nextLine());
            System.out.println("Informe o cpf de pessoa fisica: ");
            pessoaFisica.setCpf(scanner.nextLine());
            System.out.println("Informe a rg da pessoa fisica: ");
            pessoaFisica.setRg(scanner.nextLine());
            System.out.println("Informe a data de nascimento da pessoa fisica: ");
            System.out.println("Informe dia:");
            int day = scanner.nextInt();
            System.out.println("Informe mês:");
            int month = scanner.nextInt();
            System.out.println("Informe ano:");
            int year = scanner.nextInt();
            Date dataNascimento = new Date(year - 1900, month - 1, day);
            pessoaFisica.setDataNascimento(dataNascimento);

            System.out.println("Informe o id da pessoa atrelada a essa pessoa física: ");
            Pessoa pessoaPOJO = new Pessoa();
            pessoaFisica.setPessoa(pessoaPOJO);

            PessoaFisicaService pessoaFisicaService = new PessoaFisicaService();
            pessoaFisicaService.insert(pessoaFisica);
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
            PessoaFisicaService pessoaFisicaService = new PessoaFisicaService();
            List<PessoaFisica> procurarPorPessoaFisica = pessoaFisicaService.findAll();
            PessoaFisica pessoaFisicaPOJO = new PessoaFisica();
            String msg = "Todos os itens encontrados " + procurarPorPessoaFisica.toString();
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
            PessoaFisicaService pessoaFisicaService = new PessoaFisicaService();
            PessoaFisica pessoaFisica = new PessoaFisica();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o CPF da pessoa física para realizar a busca: ");
            String cpf = scanner.nextLine();
            pessoaFisica.setCpf(cpf);
            PessoaFisica pessoaFisicaPOJO = new PessoaFisica();
            String msg = "Item encontrado: " + pessoaFisicaService.findById(pessoaFisica.getCpf());
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

            PessoaFisicaService pessoaFisicaService = new PessoaFisicaService();
            PessoaFisica pessoaFisica = new PessoaFisica();

            System.out.println("Informe o CPF de pessoa física: ");
            pessoaFisica.setCpf(scanner.nextLine());
            pessoaFisicaService.delete(pessoaFisica.getCpf());
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
            PessoaFisica pessoaFisica = new PessoaFisica();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o nome da pessoa física: ");
            pessoaFisica.setNome(scanner.nextLine());
            System.out.println("Informe o cpf de pessoa física: ");
            pessoaFisica.setCpf(scanner.nextLine());
            System.out.println("Informe a rg da pessoa física: ");
            pessoaFisica.setRg(scanner.nextLine());
            System.out.println("Informe a data de nascimento da pessoa física: ");
            System.out.println("Informe dia:");
            int day = scanner.nextInt();
            System.out.println("Informe mês:");
            int month = scanner.nextInt();
            System.out.println("Informe ano:");
            int year = scanner.nextInt();
            Date dataNascimento = new Date(year - 1900, month - 1, day);
            pessoaFisica.setDataNascimento(dataNascimento);

            System.out.println("Informe o id da pessoa atrelada a essa pessoa física: ");
            Pessoa pessoaPOJO = new Pessoa();
            pessoaPOJO.setId(scanner.nextInt());
            pessoaFisica.setPessoa(pessoaPOJO);
            PessoaFisicaService pessoaFisicaService = new PessoaFisicaService();
            pessoaFisicaService.update(pessoaFisica);
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
