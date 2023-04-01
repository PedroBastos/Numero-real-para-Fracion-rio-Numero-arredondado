import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.println("Digite número abaixo:");
        double numero = ler.nextDouble();

        System.out.println("Escolha uma opções abaixo.");
        System.out.println("1 – Parte inteira de um número real");
        System.out.println("2 – Parte fracionária de um número real");
        System.out.println("3 – O número arredondado");
        int opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                double numeroreal = (int) numero;
                        System.out.print("O numero inteiro é:" + numero);
                break;

            case 2:
                double numerofracionado = numero - (int) numero;
                /*
                    numero - (int) numero realiza a subtração entre o valor original de numero e a
                    versão inteira do valor. Quando é feito este processo, realizamos o numero fracionado do valor.
                */
                System.out.println("O numero fracionado é:" +numerofracionado);
                break;

            case 3:
                double numeroarredondado = (int) Math.round(numero);
                System.out.println("O resultado arredondado é:" +numeroarredondado);
                break;


            default:
                System.out.println("Error");
                break;
        }
    }
}
