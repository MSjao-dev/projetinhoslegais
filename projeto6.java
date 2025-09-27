import java.util.Scanner;
public class projeto6{
    public static void main(String [] args){
        int numero=0;
        int qtd=0;
        int soma=0;
        double media =0;
        Scanner leia = new Scanner (System.in);
        do{
            System.out.print("Digite o número que quer ou 999 para sair e ver o resultado: ");
            if(leia.hasNextInt()){
                numero = leia.nextInt();
                if(numero==999){
                    System.out.println("Programa encerrado!!!");
                    break;
                }else{
                    qtd++;
                    soma=soma+numero;
                }
            }else{
                System.out.println("Insira um número inteiro!!");
                leia.next();
            }
        }while(numero!=999);
        if(qtd>0){
            media = (double) soma/qtd;
            System.out.println("A quantidade de números: "+qtd);
            System.out.println("A Soma dos números que você digitou é: "+soma);
            System.out.println("A média dos números é: "+media);
        }else{
            System.out.println("Nenhum número foi digitado!");
        }
        leia.close();
    }
}