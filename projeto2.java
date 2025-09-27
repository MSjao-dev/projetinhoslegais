import java.util.Scanner;
public class projeto2 {
    public static void main(String[] args){
        int numero = 0;
        Scanner leia = new Scanner(System.in);

        while (numero != 999) {
            System.out.print("Insira um número ou 999 para sair: ");

            if (leia.hasNextInt()) {
                numero = leia.nextInt();

                if (numero == 999) {
                    System.out.println("Programa encerrado.");
                } else if (numero == 0) {
                    System.out.println("é zero!");
                } else if (numero < 0) {
                    if (numero % 2 == 0) {
                        System.out.println("O número que você digitou é negativo e par!");
                    } else {
                        System.out.println("O número que você digitou é negativo e impar!");
                    }
                } else {
                    if (numero % 2 == 0) {
                        System.out.println("O número que você digitou é positivo e par!");
                    } else {
                        System.out.println("O número que você digitou é positivo e impar!");
                    }
                }
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                leia.next();
            }
        }

        leia.close();
    }
}
