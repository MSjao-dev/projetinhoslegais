import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class projeto14{
    public static void main (String[] args){
        Random maluco = new Random();
        ArrayList<String> Palavra = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
        int cont = 0; // Contador de tentativas
        int maxTentativas = 7;
        boolean ganhou = false;

        // Adicionando palavras ao jogo
        Palavra.add("Palio");
        Palavra.add("Corsa");
        Palavra.add("Fusca");

        // Escolhendo palavra aleatória
        int num = maluco.nextInt(Palavra.size());
        String palavrapeak = Palavra.get(num);

        // Criando array de underscores
        char[] estado = new char[palavrapeak.length()];
        for (int o = 0; o < estado.length; o++){
            estado[o] = '_';
        }

        // Loop principal do jogo
        do {
            // Mostra o estado atual da palavra
            for (int o = 0; o < estado.length; o++){
                System.out.print(estado[o] + " ");
            }
            System.out.println("");

            // Pede para o usuário chutar uma letra
            System.out.print("Adivinhe uma letra: ");
            String letra = leia.nextLine();

            // Pega apenas o primeiro caractere do input e converte para minúsculo
            char chute = Character.toLowerCase(letra.charAt(0));

            // Atualiza o estado da palavra caso a letra esteja correta
            for (int pos = 0; pos < palavrapeak.length(); pos++){
                if (Character.toLowerCase(palavrapeak.charAt(pos)) == chute){
                    estado[pos] = palavrapeak.charAt(pos); // Mantém maiúsculas/minúsculas originais
                }
            }

            // Verifica se ainda existem underscores (ou seja, se o usuário ainda não ganhou)
            ganhou = true; // assumimos que ganhou
            for (int o = 0; o < estado.length; o++){
                if (estado[o] == '_'){
                    ganhou = false;
                    break;
                }
            }

            cont++; // incrementa tentativa

        } while (!ganhou && cont < maxTentativas);

        // Resultado final
        if (ganhou){
            for (int o = 0; o < estado.length; o++){
                System.out.print(estado[o] + " ");
            }
            System.out.println("");
            System.out.println("Parabéns, Você acertou a palavra!!");
        } else{
            System.out.println("Perdeu playboy, a palavra era: " + palavrapeak);
        }
    }
}
