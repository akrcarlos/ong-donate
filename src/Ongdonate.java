import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;


public class Ongdonate {
    public static void main(String[] args) {
        double valorDolar, valorReais;
        System.out.println("Informe o valor a ser doado em dólares: ");
        Scanner entrada = new Scanner(System.in);
        valorDolar = entrada.nextDouble();
        valorReais = valorDolar * 4.87;
        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);
        String valorFormatado = formatoMoeda.format(valorReais);
        System.out.println("Obrigado por colaborar com a nossa causa. O Valor realizado da doação após a conversão em reais é de "+ valorFormatado);
    }
}
