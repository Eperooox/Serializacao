package br.com.newtonpaiva.exercicio;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        String path = "C:/Users/12117275/IdeaProjects/Serializacao/Nomes.txt";
        String path2 = "C:/Users/12117275/IdeaProjects/Serializacao/Sobrenomes.txt";
        ManipuladorArquivo.leitor(path);
        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path2);
        ManipuladorArquivo.escritor(path2);
    }
}
