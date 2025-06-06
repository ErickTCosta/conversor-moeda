import service.ConversorService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorService service = new ConversorService();
        int opcao;

        do {
            System.out.println("*************************************");
            System.out.println(" Seja bem-vindo/a ao Conversor de Moeda =]");
            System.out.println("*************************************");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileiro");
            System.out.println("4) Real brasileiro => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Sair");
            System.out.println("*************************************");
            System.out.print("Escolha uma opção válida: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 6) {
                System.out.print("\nDigite o valor que deseja converter: ");
                double valor = scanner.nextDouble();

                String moedaOrigem = "", moedaDestino = "";

                switch (opcao) {
                    case 1 -> { moedaOrigem = "USD"; moedaDestino = "ARS"; }
                    case 2 -> { moedaOrigem = "ARS"; moedaDestino = "USD"; }
                    case 3 -> { moedaOrigem = "USD"; moedaDestino = "BRL"; }
                    case 4 -> { moedaOrigem = "BRL"; moedaDestino = "USD"; }
                    case 5 -> { moedaOrigem = "USD"; moedaDestino = "COP"; }
                    case 6 -> { moedaOrigem = "COP"; moedaDestino = "USD"; }
                }

                double convertido = service.converter(moedaOrigem, moedaDestino, valor);
                System.out.printf("\nValor %.2f [%s] corresponde ao valor final de >>> %.2f [%s]\n",
                        valor, moedaOrigem, convertido, moedaDestino);
            }

        } while (opcao != 7);

        System.out.println("Encerrando aplicação...");
    }
}
