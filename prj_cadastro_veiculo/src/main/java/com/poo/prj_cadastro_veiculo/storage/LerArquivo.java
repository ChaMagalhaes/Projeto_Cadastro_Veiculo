/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_cadastro_veiculo.storage;

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
    
    private final String caminho;
    
    // Construtor recebe o caminho do arquivo
    public LerArquivo(String caminho) {
        this.caminho = caminho;
    }
    
    // Método que lê o arquivo e retorna uma lista de Strings, uma linha por item
    public List<String> ler(){
        // Lista que vai armazenar cada linha do arquivo
        List<String> dados = new ArrayList();
        
        /*Define o caminho do arquivo que será utilizado para leitura ou escrita*/
        File f = new File(caminho);
        
        // Verifica se o arquivo existe antes de tentar ler
        if (!f.exists()) {
            System.out.println("Arquivo não encontrado: " + caminho);
            return dados; // retorna lista vazia se o arquivo não existir
        }
        
        // Try-with-resources: garante que o BufferedReader seja fechado automaticamente
        try(BufferedReader br = new BufferedReader(new FileReader(f))){
            /*Armazena o conteúdo do arquivo para leitura
            new BufferedReader*/
            
            /*Cria um instancia do arquivo que será lido
            new FileReader(f)*/
  
            // Lê cada linha do arquivo até o final
            String linha;
            while((linha = br.readLine()) != null){
                dados.add(linha); //adiciona a linha lida à lista
            }
            
        } catch (IOException ex){ // Captura erros de leitura
            ex.printStackTrace(); // Mostra o erro no console
        }
        // Retorna a lista de linhas lidas do arquivo
        return dados;
    }
}