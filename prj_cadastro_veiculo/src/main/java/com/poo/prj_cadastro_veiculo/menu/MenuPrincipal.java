/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_cadastro_veiculo.menu;

import java.util.Scanner;

/**
 *
 * @author Charles
 */
public class MenuPrincipal {
    
    public static void menuPrincipal(){
        
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        
        while(opcao != 0){
            System.out.println("====== MENU PRINCIPAL ======");
            System.out.println("1 - Gerenciar Motos");
            System.out.println("2 - Gerenciar Carros");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            
            switch (opcao){
                case 1 -> MenuMoto.executarMenuMoto(scanner);
                case 2 -> MenuCarro.executarMenuCarro(scanner);
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção invalida.");
            }
        }
        scanner.close();
    }
}