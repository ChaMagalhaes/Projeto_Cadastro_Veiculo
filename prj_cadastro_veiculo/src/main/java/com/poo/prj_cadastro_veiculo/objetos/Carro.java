/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_cadastro_veiculo.objetos;

/**
 *
 * @author Charles
 */
public class Carro extends Veiculo{
    private int quantidadePortas, litrosbagageiro;

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getLitrosbagageiro() {
        return litrosbagageiro;
    }

    public void setLitrosbagageiro(int litrosbagageiro) {
        this.litrosbagageiro = litrosbagageiro;
    }
}
