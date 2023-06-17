package br.unipar.central.executions;

import br.unipar.central.models.Cidade;
import br.unipar.central.models.Endereco;
import br.unipar.central.models.Pessoa;
import br.unipar.central.services.EnderecoService;
import java.util.List;
import java.util.Scanner;

public class EnderecoExecution {

    public String Insert() {
        try {
            Endereco endereco = new Endereco();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o id de endereco: ");
            endereco.setId(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Informe o nome da rua: ");
            endereco.setLogradouro(scanner.nextLine());

            System.out.println("Informe o número da casa: ");
            endereco.setNumero(scanner.nextLine());

            System.out.println("Informe o bairro: ");
            endereco.setBairro(scanner.nextLine());

            System.out.println("Informe o cep: ");
            endereco.setCep(scanner.nextLine());
            
            System.out.println("Informe o complemento: ");
            endereco.setComplemento(scanner.nextLine());

            System.out.println("Informe o ra do aluno que está inserindo nessa agêencia: ");
            endereco.setRa(scanner.nextLine());
            
            System.out.println("Informe o id de pessoa atrelada a esse endereço: ");
            Pessoa pessoa = new Pessoa();
            pessoa.setId(scanner.nextInt());
            endereco.setPessoa(pessoa);
            
            System.out.println("Informe o id da agencia atrelada a esse endereço: ");
            Cidade cidade = new Cidade();
            cidade.setId(scanner.nextInt());
            endereco.setCidade(cidade);

            EnderecoService enderecoService = new EnderecoService();
            enderecoService.insert(endereco);
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
            EnderecoService enderecoService = new EnderecoService();
            List<Endereco> procurarPorEndereco = enderecoService.findAll();
            Endereco endereco = new Endereco();
            endereco.message();
            String msg = "Todos os itens encontrados " + procurarPorEndereco.toString();
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
            EnderecoService enderecoService = new EnderecoService();
            Endereco endereco = new Endereco();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o ID de endereço para realizar a busca: ");
            int id = scanner.nextInt();
            endereco.setId(id);

            endereco.message();
            String msg = "Item encontrado: " + enderecoService.findById(endereco.getId());
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

            EnderecoService enderecoService = new EnderecoService();
            Endereco endereco = new Endereco();

            System.out.println("Informe o ID de endereco: ");
            endereco.setId(scanner.nextInt());
            enderecoService.delete(endereco.getId());
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
            Endereco endereco = new Endereco();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o id de endereco: ");
            endereco.setId(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Informe o nome da rua: ");
            endereco.setLogradouro(scanner.nextLine());

            System.out.println("Informe o número da casa: ");
            endereco.setNumero(scanner.nextLine());

            System.out.println("Informe o bairro: ");
            endereco.setBairro(scanner.nextLine());

            System.out.println("Informe o cep: ");
            endereco.setCep(scanner.nextLine());
            
            System.out.println("Informe o complemento: ");
            endereco.setComplemento(scanner.nextLine());

            System.out.println("Informe o ra do aluno que está dando update: ");
            endereco.setRa(scanner.nextLine());
            
            System.out.println("Informe o id de pessoa atrelada a esse endereço: ");
            Pessoa pessoaPOJO = new Pessoa();
            pessoaPOJO.setId(scanner.nextInt());
            endereco.setPessoa(pessoaPOJO);
            
            System.out.println("Informe o id da agencia atrelada a esse endereço: ");
            Cidade cidadePOJO = new Cidade();
            cidadePOJO.setId(scanner.nextInt());
            endereco.setCidade(cidadePOJO);
            
            EnderecoService enderecoService = new EnderecoService();
            enderecoService.update(endereco);
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


