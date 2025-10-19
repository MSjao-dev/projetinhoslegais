import java.util.Scanner;

public class projeto7 {
    public static void main(String[] args) {
        int opc = 0;
        int n1 = 0;
        int n2 = 0;
        double res = 0;
        Scanner leia = new Scanner(System.in);
        boolean sair = false;

        do {
            System.out.println("Olá, esta é a calculadora wellington 2000, insira a opção que quiser para continuar!");
            System.out.println("");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Divisão");
            System.out.println("4- Multiplicação");
            System.out.println("5- Sair");
            System.out.print(": ");

            if (leia.hasNextInt()) {
                opc = leia.nextInt();
                if (opc == 5 || opc>4 || opc<1) {

                } else {
                    do {
                        System.out.print("Insira o primeiro número: ");
                        if (leia.hasNextInt()) {
                            n1 = leia.nextInt();
                            break;
                        } else {
                            System.out.println("Insira um número válido: ");
                            leia.next();
                        }
                    } while (true);

                    do {
                        System.out.print("Insira o segundo número: ");
                        if (leia.hasNextInt()) {
                            n2 = leia.nextInt();
                            break;
                        } else {
                            System.out.println("Insira um número válido: ");
                            leia.next();
                        }
                    } while (true);
                }

                switch (opc) {
                    case 1:
                        res = n1 + n2;
                        System.out.println("Este é o resultado da soma: " + res);
                        System.out.println(" ");
                        break;
                    case 2:
                        res = n1 - n2;
                        System.out.println("Este é o resultado da subtração: " + res);
                        System.out.println(" ");
                        break;
                    case 3:
                        if (n2 != 0) {
                            res = (double) n1 / n2;
                            System.out.println("Este é o resultado da divisão: " + res);
                            System.out.println(" ");
                        } else {
                            System.out.println("Não é possível divisão por Zero, tente novamente.");
                            System.out.println(" ");
                        }
                        break;
                    case 4:
                        res = n1 * n2;
                        System.out.println("Este é o resultado da multiplicação: " + res);
                        System.out.println(" ");
                        break;
                    case 5:
                        System.out.println("Programa Encerrado!!");
                        sair = true;
                        break;
                    default:
                        System.out.println("");
                        System.out.println("Insira uma opção válida!!");
                        System.out.println("");
                        break;
                }
            } else {
                System.out.println(" ");
                System.out.println("Insira uma opção válida!!!");
                System.out.println(" ");
                leia.next();
            }
        }while (sair == false);
        leia.close();
    }
}