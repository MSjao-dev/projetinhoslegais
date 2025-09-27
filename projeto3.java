import java.util.Scanner;
public class projeto3 {
    public static void main(String[] args){
        int numero =0;
        int multi=0;
        Scanner leia = new Scanner (System.in);
        while(numero!=999){
            System.out.print("Insira o número base da tabuada que quiser ou 999 para sair: ");
                if(leia.hasNextInt()){
                    numero=leia.nextInt();
                    if(numero==999){
                        System.out.println("Programa encerrado!");
                        break;
                    }else{
                        for(int i =1;i<=10;i++){
                            multi=numero*i;
                            System.out.println(numero+" x "+i+" = "+multi);
                        }
                    }
                }else{
                    System.out.println("Insira um número inteiro válido!!");
                    leia.next();
                } 
        }
        leia.close();
    }
}