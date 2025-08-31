package com.poo.prj_cadastro_veiculo.menu;

import com.poo.prj_cadastro_veiculo.gestao.Cadastro;
import com.poo.prj_cadastro_veiculo.gestao.Consultar;
import com.poo.prj_cadastro_veiculo.objetos.Carro;
import com.poo.prj_cadastro_veiculo.storage.SalvarDados;
import java.util.Scanner;

public class MenuCarro {
    public static void executarMenuCarro(Scanner scanner){
        int opcao;

        do {
            System.out.println("====== MENU CARRO ======");
            System.out.println("1 - Salvar dados de um novo carro");
            System.out.println("2 - Consultar a lista de carros salvos.");
            System.out.println("3 - Voltar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o enter do usuário.

            switch (opcao){
                case 1 -> {
                    Carro novoCarro = new Carro();
                    Cadastro cadastro = new Cadastro();           
                    cadastro.cadastro(novoCarro, scanner);         

                    String linhaCarro = novoCarro.getMarca() + ";" +
                                        novoCarro.getModelo() + ";" +
                                        novoCarro.getAno() + ";" +
                                        novoCarro.getCombustivel() + ";" +
                                        novoCarro.getCor() + ";" +
                                        novoCarro.getNum_chassi() + ";" +
                                        novoCarro.getLitrosbagageiro() + ";" +
                                        novoCarro.getNum_passageiro() + ";" +
                                        novoCarro.getPotencia() + ";" +
                                        novoCarro.getQuantidadePortas();

                    SalvarDados salvar = new SalvarDados("c:\\carros.txt");
                    salvar.escrever(linhaCarro);

                    System.out.println("Carro cadastrado e salvo com sucesso!");
                }
                case 2 -> Consultar.consultarCarros("c:\\carros.txt");
                case 3 -> {
                    System.out.println("Voltando...");
                    MenuPrincipal.menuPrincipal();
                }
                case 0 -> {
                    System.out.println("Saindo...");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida.");
            }

        } while(opcao != 0);
    }
}
