package br.unipar.central.executions;

import br.unipar.central.models.Banco;
import br.unipar.central.services.BancoService;
import java.util.List;
import java.util.Scanner;

public class BancoExecution {

    public String Insert() {
        try {
            Banco banco = new Banco();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o id de banco: ");
            banco.setId(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Informe o nome da banco: ");
            banco.setNome(scanner.nextLine());
            System.out.println("Informe o ra de aluno que está cadastrando esse banco: : ");
            banco.setRa(scanner.nextLine());
            BancoService bancoService = new BancoService();
            bancoService.insert(banco);
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
            BancoService bancoService = new BancoService();
            List<Banco> procurarPorBanco = bancoService.findAll();
            Banco bancoPOJO = new Banco();
            bancoPOJO.message();
            String msg = "Todos os itens encontrados " + procurarPorBanco.toString();
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
            BancoService bancoService = new BancoService();
            Banco banco = new Banco();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o ID do banco para realizar a busca: ");
            int id = scanner.nextInt();
            banco.setId(id);
            Banco bancoPOJO = new Banco();
            bancoPOJO.message();
            String msg = "Item encontrado: " + bancoService.findById(banco.getId());
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

            BancoService bancoService = new BancoService();
            Banco banco = new Banco();

            System.out.println("Informe o ID de banco: ");
            banco.setId(scanner.nextInt());
            bancoService.delete(banco.getId());
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
            Banco banco = new Banco();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o id de banco: ");
            banco.setId(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Informe o nome da banco: ");
            banco.setNome(scanner.nextLine());
            System.out.println("Informe o ra de aluno que está dando update nesse banco: ");
            banco.setRa(scanner.nextLine());
            BancoService bancoService = new BancoService();
            bancoService.update(banco);
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