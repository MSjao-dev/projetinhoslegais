import java.util.Random;
import java.util.ArrayList;
public class projeto13 {
    public static void main (String[] args){
        ArrayList<Integer> numerospeaks = new ArrayList();
        Random gerador = new Random();
        int qtd=10;
        int vezes=0;
        for(int i =0;i<qtd;i++){
            numerospeaks.add(gerador.nextInt(6));
        }
        for(int i=2;i<numerospeaks.size();i++){
            if(numerospeaks.get(i)==numerospeaks.get(i-1)&&numerospeaks.get(i)==numerospeaks.get(i-2)){
                vezes++;
            }
    }
    for(int i=0;i<numerospeaks.size();i++){
            System.out.println(numerospeaks.get(i));
        }
        System.out.println("o número de vezes que o mesmo número foi repetido três vezes foi: "+vezes);
    }
}
