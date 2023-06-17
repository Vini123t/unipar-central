package br.unipar.central;


import br.unipar.central.executions.AgenciaExecution;
import br.unipar.central.executions.BancoExecution;
import br.unipar.central.executions.CidadeExecution;
import br.unipar.central.executions.ContaExecution;
import br.unipar.central.executions.EnderecoExecution;
import br.unipar.central.executions.EstadoExecution;
import br.unipar.central.executions.PaisExecution;
import br.unipar.central.executions.PessoaExecution;
import br.unipar.central.executions.PessoaFisicaExecution;
import br.unipar.central.executions.PessoaJuridicaExecution;
import br.unipar.central.executions.TelefoneExecution;
import br.unipar.central.executions.TransacaoExecution;
import java.util.Scanner;


public class UniparCentral {
    public static Scanner scanner;
    public static void main(String[] args) {

        AgenciaExecution agenciaExecution = new AgenciaExecution();
        BancoExecution bancoExecution = new BancoExecution();
        CidadeExecution cidadeExecution = new CidadeExecution();
        ContaExecution contaExecution = new ContaExecution();
        EnderecoExecution enderecoExecution = new EnderecoExecution();
        EstadoExecution estadoExecution = new EstadoExecution();
        PaisExecution paisExecution = new PaisExecution();
        PessoaExecution pessoaExecution = new PessoaExecution();
        PessoaFisicaExecution pessoaFisicaExecution = new PessoaFisicaExecution();
        PessoaJuridicaExecution pessoaJuridicaExecution = new PessoaJuridicaExecution();
        TelefoneExecution telefoneExecution = new TelefoneExecution();
        TransacaoExecution transacaoExecution = new TransacaoExecution();

        boolean sair = false;
        boolean sair2 = false;

       
       scanner = new Scanner(System.in);

        while (!sair) {
            System.out.println("----------MENU----------");
            System.out.println("1  - AGÊNCIA");
            System.out.println("2  - BANCO");
            System.out.println("3  - CIDADE");
            System.out.println("4  - CONTA");
            System.out.println("5  - ENDERECO");
            System.out.println("6  - ESTADO");
            System.out.println("7  - PAIS");
            System.out.println("8  - PESSOA");
            System.out.println("9  - PESSOA FÍSICA");
            System.out.println("10 - PESSOA JURÍDICA");
            System.out.println("11 - TELEFONE");
            System.out.println("12 - TRANSAÇÃO");
            System.out.println("13 - SAIR");

            int opcao = scanner.nextInt();
            sair2 = false;
            switch (opcao) {

                case 1:
                    while (!sair2) {
                        System.out.println("--------AGÊNCIA--------");
                        System.out.println("1 - INSERIR NOVA AGÊNCIA");
                        System.out.println("2 - VER TODAS AS AGÊNCIAS CADASTRADAS");
                        System.out.println("3 - VER A AGÊNCIA PELO ID");
                        System.out.println("4 - DELETAR UMAAGÊNCIA PELO ID");
                        System.out.println("5 - ATUALIZAR DADOS DA AGÊNCIA PELO ID");
                        System.out.println("6 - RETORNAR");

                        int opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                                
                                agenciaExecution.Insert();
                                break;
                            case 2:
                                       
                                agenciaExecution.FindAll();
                                break;
                            case 3:
                                agenciaExecution.FindById();
                                break;
                            case 4:
                                
                                agenciaExecution.DeleteById();
                                break;
                            case 5:
                               
                                agenciaExecution.Update();
                                break;
                            case 6:
                                sair2 = true;
                                break;
                            default:
                                System.out.println("Opção nválida");
                        }
                    }
                    break;
                case 2:
                    while (!sair2) {
                        System.out.println("--------BANCO--------");
                        System.out.println("1 - INSERIR NOVO BANCO");
                        System.out.println("2 - VER TODAS OS BANCOS CADASTRADOS");
                        System.out.println("3 - VER O BANCO PELO ID");
                        System.out.println("4 - DELETAR UM BANCO PELO ID");
                        System.out.println("5 - ATUALIZAR DADOS DO BANCO PELO ID");
                        System.out.println("6 - RETORNA");

                        int opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                              
                                bancoExecution.Insert();
                                break;
                            case 2:
                           
                                bancoExecution.FindAll();
                                break;
                            case 3:
                               
                                bancoExecution.FindById();
                                break;
                            case 4:
                                bancoExecution.DeleteById();
                                break;
                            case 5:
                                bancoExecution.Update();
                                break;
                            case 6:
                                sair2 = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 3:
                    while (!sair2) {
                        System.out.println("--------CIDADE--------");
                        System.out.println("1 - INSERIR NOVA CIDADE");
                        System.out.println("2 - VER TODAS AS CIDADES CADASTRADAS (CUIDADOOOOO... ISSO PODE DEMORAR MUITOOOOOOO, MAS MUITOOOOO MESMOOOOO!!");
                        System.out.println("3 - VER A CIDADE PELO ID");
                        System.out.println("4 - DELETAR UMA CIDADE PELO ID");
                        System.out.println("5 - ATUALIZAR DADOS DE UMA CIDADE PELO ID");
                        System.out.println("6 - RETORNAR");

                        int opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                                cidadeExecution.Insert();
                                break;
                            case 2:
                                cidadeExecution.FindAll();
                                break;
                            case 3:
                                cidadeExecution.FindById();
                                break;
                            case 4:
                                cidadeExecution.DeleteById();
                                break;
                            case 5:
                                cidadeExecution.Update();
                                break;
                            case 6:
                                sair2 = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 4:
                    while (!sair2) {
                        System.out.println("--------CONTA--------");
                        System.out.println("1 - INSERIR NOVA CONTA");
                        System.out.println("2 - VER TODAS AS CONTAS CADASTRADAS");
                        System.out.println("3 - VER A CONTA PELO ID");
                        System.out.println("4 - DELETAR UMA CONTA PELO ID");
                        System.out.println("5 - ATUALIZAR DADOS DE UMA CONTA PELO ID");
                        System.out.println("6 - RETORNAR");

                        int opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                                contaExecution.Insert();
                                break;
                            case 2:
                                contaExecution.FindAll();
                                break;
                            case 3:
                                contaExecution.FindById();
                                break;
                            case 4:
                                contaExecution.DeleteById();
                                break;
                            case 5:
                                contaExecution.Update();
                                break;
                            case 6:
                                sair2 = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 5:
                    while (!sair2) {
                        System.out.println("------ENDERECO------");
                        System.out.println("1 - INSERIR NOVO ENDEREÇO");
                        System.out.println("2 - VER TODAS OS ENDEREÇOS CADASTRADOS");
                        System.out.println("3 - VER O ENDEREÇO PELO ID");
                        System.out.println("4 - DELETAR UM ENDEREÇO PELO ID");
                        System.out.println("5 - ATUALIZAR DADOS DE UM ENDEREÇO PELO ID");
                        System.out.println("6 - RETORNAR");

                        int opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                             
                                enderecoExecution.Insert();
                                break;
                            case 2:
                                enderecoExecution.FindAll();
                                break;
                            case 3:
                                enderecoExecution.FindById();
                                break;
                            case 4:
                                enderecoExecution.DeleteById();
                                break;
                            case 5:
                                enderecoExecution.Update();
                                break;
                            case 6:
                                sair2 = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 6:
                    while (!sair2) {
                        System.out.println("-------ESTADO-------");
                        System.out.println("1 - INSERIR NOVO ESTADO");
                        System.out.println("2 - VER TODAS OS ESTADOS CADASTRADOS");
                        System.out.println("3 - VER O ESTADO PELO ID");
                        System.out.println("4 - DELETAR UM ESTADO PELO ID");
                        System.out.println("5 - ATUALIZAR DADOS DE UM ESTADO PELO ID");
                        System.out.println("6 - RETORNAR");

                        int opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                                estadoExecution.Insert();
                                break;
                            case 2:
                                estadoExecution.FindAll();
                                break;
                            case 3:
                                estadoExecution.FindById();
                                break;
                            case 4:
                                estadoExecution.DeleteById();
                                break;
                            case 5:
                                estadoExecution.Update();
                                break;
                            case 6:
                                sair2 = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 7:
                    while (!sair2) {
                        System.out.println("--------PAÍS--------");
                        System.out.println("1 - INSERIR NOVO PAÍS");
                        System.out.println("2 - VER TODAS OS PAÍSES CADASTRADOS");
                        System.out.println("3 - VER O PAÍS PELO ID");
                        System.out.println("4 - DELETAR UM PAÍS PELO ID");
                        System.out.println("5 - ATUALIZAR DADOS DE UM PAÍS PELO ID");
                        System.out.println("6 - RETORNAR");

                        int opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                                paisExecution.Insert();
                                break;
                            case 2:
                                paisExecution.FindAll();
                                break;
                            case 3:
                                paisExecution.FindById();
                                break;
                            case 4:
                                paisExecution.DeleteById();
                                break;
                            case 5:
                                paisExecution.Update();
                                break;
                            case 6:
                                sair2 = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 8:
                    while (!sair2) {
                        System.out.println("-------PESSOA-------");
                        System.out.println("1 - INSERIR NOVA PESSOA");
                        System.out.println("2 - VER TODAS AS PESSOAS CADASTRADAS");
                        System.out.println("3 - VER A PESSOA PELO ID");
                        System.out.println("4 - DELETAR UMA PESSOA PELO ID");
                        System.out.println("5 - ATUALIZAR DADOS DE UMA PESSOA PELO ID");
                        System.out.println("6 - RETORNAR");

                        int opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                                pessoaExecution.Insert();
                                break;
                            case 2:
                                pessoaExecution.FindAll();
                                break;
                            case 3:
                                pessoaExecution.FindById();
                                break;
                            case 4:
                                pessoaExecution.DeleteById();
                                break;
                            case 5:
                                pessoaExecution.Update();
                                break;
                            case 6:
                                sair2 = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 9:
                    while (!sair2) {
                        System.out.println("----PESSOA FÍSICA----");
                        System.out.println("1 - INSERIR NOVA PESSOA FÍSICA");
                        System.out.println("2 - VER TODAS AS PESSOAS FÍSICAS CADASTRADAS");
                        System.out.println("3 - VER A PESSOA FÍSICA PELO CPF");
                        System.out.println("4 - DELETAR UMA PESSOA FÍSICA PELO CPF");
                        System.out.println("5 - ATUALIZAR DADOS DE UMA PESSOA FÍSICA PELO CPF");
                        System.out.println("6 - RETORNAR");

                        int opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                                pessoaFisicaExecution.Insert();
                                break;
                            case 2:
                                pessoaFisicaExecution.FindAll();
                                break;
                            case 3:
                                pessoaFisicaExecution.FindById();
                                break;
                            case 4:
                                pessoaFisicaExecution.DeleteById();
                                break;
                            case 5:
                                pessoaFisicaExecution.Update();
                                break;
                            case 6:
                                sair2 = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 10:
                    while (!sair2) {
                        System.out.println("---PESSOA JURÍDICA---");
                        System.out.println("1 - INSERIR NOVA PESSOA JURÍDICA");
                        System.out.println("2 - VER TODAS AS PESSOAS JURÍDICA CADASTRADAS");
                        System.out.println("3 - VER A PESSOA JURÍDICA PELO CNPJ");
                        System.out.println("4 - DELETAR UMA PESSOA JURÍDICA PELO CNPJ");
                        System.out.println("5 - ATUALIZAR DADOS DE UMA PESSOA JURÍDICA PELO CNPJ");
                        System.out.println("6 - RETORNAR");

                        int opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                                pessoaJuridicaExecution.Insert();
                                break;
                            case 2:
                                pessoaJuridicaExecution.FindAll();
                                break;
                            case 3:
                                pessoaJuridicaExecution.FindById();
                                break;
                            case 4:
                                System.out.println("-------------------------------------Isso pode demorar mais do que o normal!-------------------------------------");
                                pessoaJuridicaExecution.DeleteById();
                                break;
                            case 5:
                                pessoaJuridicaExecution.Update();
                                break;
                            case 6:
                                sair2 = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 11:
                    while (!sair2) {
                        System.out.println("------TELEFONE------");
                        System.out.println("1 - INSERIR NOVO TELEFONE");
                        System.out.println("2 - VER TODAS OS TELEFONES CADASTRADAS");
                        System.out.println("3 - VER A TELEFONE PELO ID");
                        System.out.println("4 - DELETAR UM TELEFONE PELO ID");
                        System.out.println("5 - ATUALIZAR DADOS DE UM TELEFONE PELO ID");
                        System.out.println("6 - RETORNAR");

                        int opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                                telefoneExecution.Insert();
                                break;
                            case 2:
                                telefoneExecution.FindAll();
                                break;
                            case 3:
                                telefoneExecution.FindById();
                                break;
                            case 4:
                                telefoneExecution.DeleteById();
                                break;
                            case 5:
                                telefoneExecution.Update();
                                break;
                            case 6:
                                sair2 = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 12:
                    while (!sair2) {
                        System.out.println("----TRANSAÇÃO----");
                        System.out.println("1 - INSERIR NOVA TRANSAÇÃO");
                        System.out.println("2 - VER TODAS AS TRANSAÇÕES CADASTRADAS");
                        System.out.println("3 - VER A TRANSAÇÃO PELO ID");
                        System.out.println("4 - DELETAR UM TRANSAÇÃO PELO ID");
                        System.out.println("5 - ATUALIZAR DADOS DE UMA TRANSAÇÃO PELO ID");
                        System.out.println("6 - RETORNAR");

                        int opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                                transacaoExecution.Insert();
                                break;
                            case 2:
                                transacaoExecution.FindAll();
                                break;
                            case 3:
                                transacaoExecution.FindById();
                                break;
                            case 4:
                                transacaoExecution.DeleteById();
                                break;
                            case 5:
                                transacaoExecution.Update();
                                break;
                            case 6:
                                sair2 = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 13:
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }

    }
}
