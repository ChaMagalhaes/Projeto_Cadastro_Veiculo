/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_cadastro_veiculo.gestao;

import com.poo.prj_cadastro_veiculo.objetos.Carro;
import com.poo.prj_cadastro_veiculo.objetos.Moto;

/**
 *
 * @author Charles
 */
public class mostrarVeiculo {
    
    // Mostra informações genéricas de um carro
    public void mostrar(Carro cr){
        System.out.println("=== CARRO ===");
        System.out.println("Marca: " + cr.getMarca());
        System.out.println("Modelo: " + cr.getModelo());
        System.out.println("Ano: " + cr.getAno());
        System.out.println("Combustível: " + cr.getCombustivel());
        System.out.println("Cor: " + cr.getCor());
        System.out.println("Chassi: " + cr.getNum_chassi());
        System.out.println("Bagageiro: " + cr.getLitrosbagageiro() + "L");
        System.out.println("Passageiros: " + cr.getNum_passageiro());
        System.out.println("Potência: " + cr.getPotencia() + "cv");
        System.out.println("Portas: " + cr.getQuantidadePortas());
    }
    
    // Mostra informações genéricas de uma moto
    public void mostrar(Moto mt){
        System.out.println("=== MOTO ===");
        System.out.println("Marca: " + mt.getMarca());
        System.out.println("Modelo: " + mt.getModelo());
        System.out.println("Ano: " + mt.getAno());
        System.out.println("Cilindrada: " + mt.getCilidrada());
        System.out.println("Cor: " + mt.getCor());
        System.out.println("Chassi: " + mt.getNum_chassi());
        System.out.println("Passageiros: " + mt.getNum_passageiro());
        System.out.println("Partida elétrica: " + (mt.getPartidaEletrica() ? "Sim" : "Não"));
        System.out.println("Potência: " + mt.getPotencia() + "cv");
    }
}
