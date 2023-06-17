package br.unipar.central.executions;

import br.unipar.central.enums.OperadoraEnum;
import br.unipar.central.models.Agencia;
import br.unipar.central.models.Pessoa;
import br.unipar.central.models.Telefone;
import br.unipar.central.services.TelefoneService;
import java.util.List;
import java.util.Scanner;

public class TelefoneExecution {

    public String Insert() {
        try {
            Telefone telefone = new Telefone();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o id de telefone: ");
            telefone.setId(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Informe o numero de telefone: ");
            telefone.setNumero(scanner.nextLine());

            System.out.println("Informe a operadora (1 - TIM, 2 - CLARO, 3 - VIVO, 4 - OI, 5 - CORREIOS, 6 - LARICELL, 7 - TESLA, 8 - IPHONE, 9 - OUTROS): ");
            String tipoContaStr = scanner.next();
            OperadoraEnum tipoOp;

            switch (tipoContaStr) {
                case "1":
                    tipoOp = OperadoraEnum.TIM;
                    break;
                case "2":
                    tipoOp = OperadoraEnum.CLARO;
                    break;
                case "3":
                    tipoOp = OperadoraEnum.VIVO;
                    break;
                case "4":
                    tipoOp = OperadoraEnum.OI;
                    break;
                case "5":
                    tipoOp = OperadoraEnum.CORREIOS;
                    break;
                case "6":
                    tipoOp = OperadoraEnum.LARICELL;
                    break;
                case "7":
                    tipoOp = OperadoraEnum.TESLA;
                    break;
                case "8":
                    tipoOp = OperadoraEnum.IPHONE;
                    break;
                case "9":
                    tipoOp = OperadoraEnum.OUTROS;
                    break;
                case "44":
                    tipoOp = OperadoraEnum.VALOR44;
                    break;
                case "21":
                    tipoOp = OperadoraEnum.VALOR21;
                    break;
                case "45":
                    tipoOp = OperadoraEnum.VALOR45;
                    break;
                case "11":
                    tipoOp = OperadoraEnum.VALOR11;
                    break;
                case "34":
                    tipoOp = OperadoraEnum.VALOR34;
                    break;
                default:

                    tipoOp = null;
                    break;
            }
            telefone.setOperadoraEnum(tipoOp);
            scanner.nextLine();

            System.out.println("Informe o ra do aluno que está cadastrando esse telefone: ");
            telefone.setRa(scanner.nextLine());

            System.out.println("Informe o id de agencia atrelada a essa telefone: ");
            Agencia agenciaPOJO = new Agencia();
            agenciaPOJO.setId(scanner.nextInt());
            telefone.setAgencia(agenciaPOJO);

            System.out.println("Informe o id de pessoa atrelada a essa telefone: ");
            Pessoa pessoa = new Pessoa();
            pessoa.setId(scanner.nextInt());
            telefone.setPessoa(pessoa);

            TelefoneService telefoneService = new TelefoneService();
            telefoneService.insert(telefone);
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
            TelefoneService telefoneService = new TelefoneService();
            List<Telefone> procurarPorTelefone = telefoneService.findAll();

            String msg = "Todos os itens encontrados " + procurarPorTelefone.toString();
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
            TelefoneService telefoneService = new TelefoneService();
            Telefone telefone = new Telefone();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o ID de telefone para realizar a busca: ");
            int id = scanner.nextInt();
            telefone.setId(id);

            String msg = "Item encontrado: " + telefoneService.findById(telefone.getId());
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

            TelefoneService telefoneService = new TelefoneService();
            Telefone telefone = new Telefone();

            System.out.println("Informe o ID de telefone: ");
            telefone.setId(scanner.nextInt());
            telefoneService.delete(telefone.getId());
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
            Telefone telefone = new Telefone();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o id de telefone: ");
            telefone.setId(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Informe o numero da telefone: ");
            telefone.setNumero(scanner.nextLine());

            System.out.println("Informe a operadora (1 - TIM, 2 - CLARO, 3 - VIVO, 4 - OI, 5 - CORREIOS, 6 - LARICELL, 7 - TESLA, 8 - IPHONE, 9 - OUTROS): ");
            String tipoContaStr = scanner.next();
            OperadoraEnum tipoOp;

            switch (tipoContaStr) {
                case "1":
                    tipoOp = OperadoraEnum.TIM;
                    break;
                case "2":
                    tipoOp = OperadoraEnum.CLARO;
                    break;
                case "3":
                    tipoOp = OperadoraEnum.VIVO;
                    break;
                case "4":
                    tipoOp = OperadoraEnum.OI;
                    break;
                case "5":
                    tipoOp = OperadoraEnum.CORREIOS;
                    break;
                case "6":
                    tipoOp = OperadoraEnum.LARICELL;
                    break;
                case "7":
                    tipoOp = OperadoraEnum.TESLA;
                    break;
                case "8":
                    tipoOp = OperadoraEnum.IPHONE;
                    break;
                case "9":
                    tipoOp = OperadoraEnum.OUTROS;
                    break;
                case "44":
                    tipoOp = OperadoraEnum.VALOR44;
                    break;
                case "21":
                    tipoOp = OperadoraEnum.VALOR21;
                    break;
                case "45":
                    tipoOp = OperadoraEnum.VALOR45;
                    break;
                case "11":
                    tipoOp = OperadoraEnum.VALOR11;
                    break;
                case "34":
                    tipoOp = OperadoraEnum.VALOR34;
                    break;
                default:

                    tipoOp = null;
                    break;
            }
            telefone.setOperadoraEnum(tipoOp);
            scanner.nextLine();

            System.out.println("Informe o ra do aluno que está realizando update nesse telefone: ");
            telefone.setRa(scanner.nextLine());

            System.out.println("Informe o id de agencia atrelada a essa telefone: ");
            Agencia agencia = new Agencia();
            agencia.setId(scanner.nextInt());
            telefone.setAgencia(agencia);

            System.out.println("Informe o id de pessoa atrelada a essa telefone: ");
            Pessoa pessoa = new Pessoa();
            pessoa.setId(scanner.nextInt());
            telefone.setPessoa(pessoa);

            TelefoneService telefoneService = new TelefoneService();
            telefoneService.update(telefone);
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
