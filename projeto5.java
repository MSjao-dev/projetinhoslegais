import java.util.Scanner;
public class projeto5 {
    public static void main(String[] args){
        int qtd=0;
        Scanner leia = new Scanner (System.in);
        while(qtd!=999){
            int i=0;
            int maior=Integer.MIN_VALUE;
            int soma=0;
            double media=0;
            System.out.print("Insira o numero de números que quer colocar ou 999 para sair: ");
            if(leia.hasNextInt()){
                qtd=leia.nextInt();
                if(qtd==999){
                    System.out.println("O programa foi encerrado!!");
                    break;
                }else{
                    int vetor[]=new int[qtd];
                    for(i=0;i<qtd;i++){
                        System.out.print("Insira o "+(i+1)+" número: ");
                        vetor[i]=leia.nextInt();
                        soma=soma+vetor[i];
                        if(vetor[i]>maior){
                            maior=vetor[i];
                        }
                    }
                    media = (double) soma/qtd;
                    System.out.println("Esta é a média dos números que você digitou: "+media);
                    System.out.println("Este é o maior numero que você digitou: "+maior);
                }
            }else{
                System.out.println("Digite um número inteiro!!");
                leia.next();
            }
        }
        leia.close();
    }
}
