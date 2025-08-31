/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_cadastro_veiculo.gestao;

import com.poo.prj_cadastro_veiculo.objetos.Carro;
import com.poo.prj_cadastro_veiculo.objetos.Moto;
import java.util.Scanner;

/**
 *
 * @author Charles
 */
public class Cadastro {
    
    public void cadastro(Carro cr, Scanner scanner){
        
        System.out.print("Marca do carro: ");
        cr.setMarca(scanner.nextLine());

        System.out.print("Modelo do carro: ");
        cr.setModelo(scanner.nextLine());

        System.out.print("Ano do carro: ");
        cr.setAno(scanner.nextInt());
        scanner.nextLine(); // consumir quebra de linha

        System.out.print("Tipo de combustível: ");
        cr.setCombustivel(scanner.nextLine());

        System.out.print("Cor: ");
        cr.setCor(scanner.nextLine());

        System.out.print("Número do chassi: ");
        cr.setNum_chassi(scanner.nextLine());

        System.out.print("Capacidade do bagageiro (litros): ");
        cr.setLitrosbagageiro(scanner.nextInt());

        System.out.print("Quantidade de passageiros: ");
        cr.setNum_passageiro(scanner.nextInt());

        System.out.print("Potência (cv): ");
        cr.setPotencia(scanner.nextInt());

        System.out.print("Quantidade de portas: ");
        cr.setQuantidadePortas(scanner.nextInt());

        scanner.nextLine(); // consumir quebra de linha final
    }

    public void cadastro(Moto mt, Scanner scanner) {
        
        System.out.print("Marca da moto: ");
        mt.setMarca(scanner.nextLine());

        System.out.print("Modelo da moto: ");
        mt.setModelo(scanner.nextLine());

        System.out.print("Ano da moto: ");
        mt.setAno(scanner.nextInt());
        scanner.nextLine(); // consumir quebra de linha final

        System.out.print("Cilindrada (cc): ");
        mt.setCilidrada(scanner.nextInt());
        scanner.nextLine(); // consumir quebra de linha final

        System.out.print("Cor: ");
        mt.setCor(scanner.nextLine());

        System.out.print("Número do chassi: ");
        mt.setNum_chassi(scanner.nextLine());

        System.out.print("Quantidade de passageiros: ");
        mt.setNum_passageiro(scanner.nextInt());

        System.out.print("Possui partida elétrica? (s/n): ");
        String partida = scanner.next();
        mt.setPartidaEletrica(partida.equalsIgnoreCase("s"));

        System.out.print("Potência (cv): ");
        mt.setPotencia(scanner.nextInt());
        scanner.nextLine(); // consumir quebra de linha final
    }
}
