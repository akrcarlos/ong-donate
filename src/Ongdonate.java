import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Ongdonate {
    public static void main(String[] args) {

        //Entrada de valores

        double valorDolar, valorReais;
        System.out.println("Informe o valor a ser doado em dólares: ");
        Scanner entrada = new Scanner(System.in);
        valorDolar = entrada.nextDouble();
        valorReais = valorDolar * 4.87;

        //Converter moeda

        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);
        String valorFormatado = formatoMoeda.format(valorReais);
        System.out.println("Doação realizada com sucesso no valor de " + valorFormatado);

        //Gerar comprovante

        System.out.println("Gostaria de fazer o download do comprovante?");
        Scanner leitor = new Scanner(System.in);
        String resposta;
        resposta = leitor.nextLine();
        if(resposta.equalsIgnoreCase("sim")) {
            System.out.println("Download realizado.");
        } else if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")) {
            System.out.println("Obrigado!");
        } else  System.out.println("Opção inválida. Por favor, digite 'sim' ou 'não'.");
    }
}
