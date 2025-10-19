import java.util.ArrayList;
import java.util.Scanner;
public class projeto11 {
    public static void main (String[] args){
        Scanner leia= new Scanner (System.in);
        int i=0;
        int qtd=5;
        ArrayList<String> Animais= new ArrayList<>();
        System.out.println("olá, por favor insira o nome de "+qtd+" animais!");
        for(i=0;i<qtd;i++){
            System.out.print("Insira o nome do "+(i+1)+"° Animal: ");
            Animais.add(leia.nextLine());
        }
        System.out.println("Lista original: ");
        for(String Animal: Animais){
            System.out.println(Animal);
        }
        for(i=Animais.size()-1;i>=0;i--){
            if(Animais.get(i).length()<=4){
                Animais.remove(i);
            }
        }  
        System.out.println(" ");
        System.out.println("Animais com 4 letras ou menos Removidos: ");
        for(String Animal: Animais){
            System.out.println(Animal);
        }
        leia.close();
    }
}
