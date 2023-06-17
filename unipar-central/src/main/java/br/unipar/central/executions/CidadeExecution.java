package br.unipar.central.executions;

import br.unipar.central.models.Cidade;
import br.unipar.central.models.Estado;
import br.unipar.central.services.CidadeService;
import java.util.List;
import java.util.Scanner;

public class CidadeExecution {

    public String Insert() {
        try {
            Cidade cidade = new Cidade();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o id de cidade: ");
            cidade.setId(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Informe o nome da cidade: ");
            cidade.setNome(scanner.nextLine());
            System.out.println("Informe o ra do aluno que está cadastrando essa cidade: ");
            cidade.setRa(scanner.nextLine());
            System.out.println("Informe o id do estado atrelado a esta cidade: ");
            Estado estadoPOJO = new Estado();
            estadoPOJO.setId(scanner.nextInt());
            cidade.setEstado(estadoPOJO);
            CidadeService cidadeService = new CidadeService();
            cidadeService.insert(cidade);
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
            CidadeService cidadeService = new CidadeService();
            List<Cidade> procurarPorCidade = cidadeService.findAll();
            Cidade cidade = new Cidade();
            cidade.message();
            String msg = "Todos os itens encontrados " + procurarPorCidade.toString();
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
            CidadeService cidadeService = new CidadeService();
            Cidade cidade = new Cidade();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o ID da cidade para realizar a busca: ");
            int id = scanner.nextInt();
            cidade.setId(id);
     
            cidade.message();
            String msg = "Item encontrado: " + cidadeService.findById(cidade.getId());
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

            CidadeService cidadeService = new CidadeService();
            Cidade cidade = new Cidade();

            System.out.println("Informe o ID de cidade: ");
            cidade.setId(scanner.nextInt());
            cidadeService.delete(cidade.getId());
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
            Cidade cidade = new Cidade();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o id de cidade: ");
            cidade.setId(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Informe o nome da cidade: ");
            cidade.setNome(scanner.nextLine());
            System.out.println("Informe o ra do aluno que está dando update nessa cidade: ");
            cidade.setRa(scanner.nextLine());
            System.out.println("Informe o id do estado atrelada a essa cidade: ");
            Estado estado = new Estado();
            estado.setId(scanner.nextInt());
            cidade.setEstado(estado);
            CidadeService cidadeService = new CidadeService();
            cidadeService.update(cidade);
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