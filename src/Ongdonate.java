import java.util.Scanner;

public class Ongdonate {
    public static void main(String[] args) {
        double valorDolar;
        System.out.println("Informe o valor a ser doado em dólares: ");
        Scanner entrada = new Scanner(System.in);
        valorDolar = entrada.nextDouble();
        valorDolar = valorDolar * 4.87;
        System.out.println("Obrigado por colaborar com a nossa causa. O Valor realizado da doação após a conversão em reais é de R$ "+ valorDolar);

    }
}
