/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_cadastro_veiculo.gestao;

import com.poo.prj_cadastro_veiculo.objetos.Carro;
import com.poo.prj_cadastro_veiculo.objetos.Moto;
import com.poo.prj_cadastro_veiculo.storage.LerArquivo;
import java.util.List;

/**
 *
 * @author Charles
 */
public class Consultar {
    private static final mostrarVeiculo mostrar = new mostrarVeiculo();

    
    public static void consultarCarros(String caminhoArquivo){
        LerArquivo ler = new LerArquivo(caminhoArquivo);
        List<String> linhas = ler.ler();
        
        for(String linha : linhas){
            String[] dados = linha.split(";");
            if (dados.length >= 10) {
                Carro carro = new Carro();
                carro.setMarca(dados[0]);
                carro.setModelo(dados[1]);
                carro.setAno(Integer.parseInt(dados[2]));
                carro.setCombustivel(dados[3]);
                carro.setCor(dados[4]);
                carro.setNum_chassi(dados[5]);
                carro.setLitrosbagageiro(Integer.parseInt(dados[6]));
                carro.setNum_passageiro(Integer.parseInt(dados[7]));
                carro.setPotencia(Integer.parseInt(dados[8]));
                carro.setQuantidadePortas(Integer.parseInt(dados[9]));

                mostrar.mostrar(carro);
            }
        }
    }
    
    // Consulta motos cadastradas em um arquivo
    public static void consultarMotos(String caminhoArquivo) {
        LerArquivo ler = new LerArquivo(caminhoArquivo);
        List<String> linhas = ler.ler();

        for (String linha : linhas) {
            // Supondo que os dados da moto estejam separados por ";"
            // Ex: marca;modelo;ano;cilindrada;cor;chassi;passageiros;partidaEletrica;potencia
            String[] dados = linha.split(";");
            if (dados.length >= 9) {
                Moto moto = new Moto();
                moto.setMarca(dados[0]);
                moto.setModelo(dados[1]);
                moto.setAno(Integer.parseInt(dados[2]));
                moto.setCilidrada(Integer.parseInt(dados[3]));
                moto.setCor(dados[4]);
                moto.setNum_chassi(dados[5]);
                moto.setNum_passageiro(Integer.parseInt(dados[6]));
                moto.setPartidaEletrica(Boolean.parseBoolean(dados[7]));
                moto.setPotencia(Integer.parseInt(dados[8]));

                mostrar.mostrar(moto);
            }
        }
    }
}
