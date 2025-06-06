package service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HistoricoService {

    private final String NOME_ARQUIVO = "historico.txt";

    public void salvarConversao(double valorOriginal, String origem, double convertido, String destino) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(NOME_ARQUIVO, true))) {
            writer.printf("%.2f %s => %.2f %s%n", valorOriginal, origem, convertido, destino);
        } catch (IOException e) {
            System.out.println("Erro ao salvar no histórico: " + e.getMessage());
        }
    }
}