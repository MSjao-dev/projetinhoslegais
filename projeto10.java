import java.util.ArrayList;
public class projeto10 {
    public static void main(String[] args){
        int i=0;
        ArrayList<String> Animais = new ArrayList<>();
        Animais.add("Macaco");
        Animais.add("Girafa");
        Animais.add("Cachorro");
        Animais.add("Gato");
        Animais.add("Diabo da tasmãnia");
        Animais.add("Elefante");
        Animais.add("Gavião");
        for(String Animal: Animais){
            System.out.println(Animal);
        }
        System.out.println(" ");
        for(i=Animais.size()-1;i>=0;i--){
            if(Animais.get(i).length()>6){
                Animais.remove(i);
            }
        }
        for(String Animal: Animais){
            System.out.println(Animal);
        }
        
    }

}
