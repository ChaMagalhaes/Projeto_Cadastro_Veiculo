/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_cadastro_veiculo.storage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Charles
 */
public class SalvarDados {
    
    private final String caminho;
    
    // Construtor recebe o caminho do arquivo
    public SalvarDados(String caminho) {
        this.caminho = caminho;
    }
    
    public void escrever(String texto){
        try{
            /*Define o caminho do arquivo que será utilizado para leitura ou escrita*/
            File f = new File(caminho);
            /*Cria uma instância do arquivo para escrita*/
            FileWriter fw = new FileWriter(f, true);
            /*Cria o meio para escrever no arquivo instanciado na linha anterior*/
            PrintWriter pw = new PrintWriter(fw);
            //Escreve no arquivo
            pw.println(texto);
            //Conclui a escrita do arquivo
            fw.close();

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}