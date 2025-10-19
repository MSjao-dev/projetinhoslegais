import java.util.Scanner;
public class projeto4 {
    public static void main (String[] args){
        int numero = 0;
        Scanner leia = new Scanner (System.in);
        while(numero!=999){
            int soma=0;
            System.out.print("Digite o número inteiro ou 999 para sair: ");
            if(leia.hasNextInt()){
                numero=leia.nextInt();
                if(numero<0){
                    System.out.println("Apenas numero inteiros positivos!!!");
                }else{
                    if(numero==999){
                        System.out.println("Programa Encerrado!");
                        break;
                    }else{
                        for(int i=0; i<=numero;i++){
                            if(i%2==0){
                              soma=soma+i;
                            }
                        }
                        System.out.println("A soma dos numeros pares até o numero que você digitou é: "+soma);
                    }
                }  
            }else{
                System.out.println("O número que você digitou é invalido, digite novamente!");
                leia.next();
            }
        }
        leia.close();
    }
}
