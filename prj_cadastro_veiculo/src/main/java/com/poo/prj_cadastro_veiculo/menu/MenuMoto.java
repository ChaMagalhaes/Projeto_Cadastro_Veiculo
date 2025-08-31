/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_cadastro_veiculo.menu;

import com.poo.prj_cadastro_veiculo.gestao.Cadastro;
import com.poo.prj_cadastro_veiculo.gestao.Consultar;
import com.poo.prj_cadastro_veiculo.objetos.Moto;
import com.poo.prj_cadastro_veiculo.storage.SalvarDados;
import java.util.Scanner;

/**
 *
 * @author Charles
 */
public class MenuMoto {
    public static void executarMenuMoto(Scanner scanner){
        int opcao;
      
        do{
            System.out.println("====== MENU MOTO ======");
            System.out.println("1 - Salvar dados de uma nova moto");
            System.out.println("2 - Consultar a lista de motos salvas.");
            System.out.println("3 - Voltar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //Consumir o enter do úsuario.
            
            switch (opcao){
                case 1 -> {
                    Moto novaMoto = new Moto();
                    Cadastro cadastro = new Cadastro();           // cria o objeto Cadastro
                    cadastro.cadastro(novaMoto, scanner);         // preenche os dados da moto

                    // Converte os dados da moto em uma linha de texto separada por ";"
                    String linhaMoto = novaMoto.getMarca() + ";" +
                                       novaMoto.getModelo() + ";" +
                                       novaMoto.getAno() + ";" +
                                       novaMoto.getCilidrada() + ";" +
                                       novaMoto.getCor() + ";" +
                                       novaMoto.getNum_chassi() + ";" +
                                       novaMoto.getNum_passageiro() + ";" +
                                       novaMoto.getPartidaEletrica() + ";" +
                                       novaMoto.getPotencia();

                    // Salva no arquivo
                    SalvarDados salvar = new SalvarDados("c:\\motos.txt"); // caminho do arquivo
                    salvar.escrever(linhaMoto);

                    System.out.println("Moto cadastrada e salva com sucesso!");
                }
                case 2 -> {
                    Consultar.consultarMotos("c:\\motos.txt");
                }
                case 3 -> {
                    System.out.println("Voltando...");
                    MenuPrincipal.menuPrincipal();
                }
                case 0 -> {
                    System.out.println("Saindo...");
                    System.exit(0);
                }
                default -> System.out.println("Opcao invalida.");
                
            }
        }while(opcao != 0);
    }
}