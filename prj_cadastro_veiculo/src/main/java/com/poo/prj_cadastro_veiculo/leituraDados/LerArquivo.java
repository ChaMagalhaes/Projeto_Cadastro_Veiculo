/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_cadastro_veiculo.leituraDados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Charles
 */
public class LerArquivo {
    public List<String> ler(){
        List<String> dados = new ArrayList();
        try{
            /*Define o caminho do arquivo que será utilizado para leitura ou escrita*/
            File f = new File("c:\\ArquivoTeste.txt");
            /*Cria um instancia do arquivo que será lido*/
            FileReader fr = new FileReader(f);
            /*Armazena o conteúdo do arquivo para leitura*/
            BufferedReader br = new BufferedReader(fr);
            /*Lê todas as linhas que estão escritas no arquivo*/
            while(br.ready()){
                dados.add(br.readLine());
            }
            //Conclui a leitura do arquivo
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return dados;
    }
}