package ufes.pss.projetoOrdenacao.presenter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {

    public static ArrayList<Double> Read(String Caminho) {
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            ArrayList<Double> list = new ArrayList<>();
            try {
                lerArq.readLine();
                while (true) {
                    if (linha != null) {
                        if (!linha.isEmpty()) {
                            list.add(Double.valueOf(linha));
                        }
                    } else {
                        break;
                    }
                    linha = lerArq.readLine();
                }
                arq.close();
                return list;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return new ArrayList<>();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return new ArrayList<>();
        }
    }
}
