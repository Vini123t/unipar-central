package br.unipar.central.executions;

import br.unipar.central.models.Pais;
import br.unipar.central.services.PaisService;
import java.util.List;
import java.util.Scanner;

public class PaisExecution {

    public String Insert() {
        try {
            Pais pais = new Pais();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o id de país: ");
            pais.setId(scanner.nextInt());
            scanner.nextLine();
            
            System.out.println("Informe o nome da país: ");
            pais.setNome(scanner.nextLine());
            
            System.out.println("Informe a sigla da país: ");
            pais.setSigla(scanner.nextLine());
            
            System.out.println("Informe o ra do aluno que está cadastrando esse país: ");
            pais.setRa(scanner.nextLine());
            
            PaisService paisService = new PaisService();
            paisService.insert(pais);
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
            PaisService paisService = new PaisService();
            List<Pais> procurarPorPais = paisService.findAll();
            Pais paisPOJO = new Pais();
            String msg = "Todos os itens encontrados " + procurarPorPais.toString();
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
            PaisService paisService = new PaisService();
            Pais pais = new Pais();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o ID de país para realizar a busca: ");
            int id = scanner.nextInt();
            pais.setId(id);
            Pais paisPOJO = new Pais();
            String msg = "Item encontrado: " + paisService.findById(pais.getId());
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

            PaisService paisService = new PaisService();
            Pais pais = new Pais();

            System.out.println("Informe o ID de pais: ");
            pais.setId(scanner.nextInt());
            paisService.delete(pais.getId());
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
            Pais pais = new Pais();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o id de pais: ");
            pais.setId(scanner.nextInt());
            scanner.nextLine();
            
            System.out.println("Informe o nome da pais: ");
            pais.setNome(scanner.nextLine());
            
            System.out.println("Informe a sigla da pais: ");
            pais.setSigla(scanner.nextLine());
            
            System.out.println("Informe o ra do aluno que está realizando updata nesse país: ");
            pais.setRa(scanner.nextLine());
            
            PaisService paisService = new PaisService();
            paisService.update(pais);
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
