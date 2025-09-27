import java.util.Scanner;

public class projeto1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade = -1;
        int poder;
        String nome = "";

        System.out.print("Insira seu nome: ");
        nome = leia.nextLine();

        while (idade < 0) {
            System.out.print("Insira sua idade: ");
            if (leia.hasNextInt()) {
                idade = leia.nextInt();
                if (idade < 0) {
                    System.out.println("Idade não pode ser negativa, tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida, digite um número inteiro!");
                leia.next();
            }
        }

        if (idade >= 18) {
            System.out.println(nome + ", você pode dirigir!");
        } else {
            poder = 18 - idade;
            System.out.println(nome + ", você não pode dirigir e ainda faltam " + poder + " anos para poder!");
        }

        leia.close();
    }
}
