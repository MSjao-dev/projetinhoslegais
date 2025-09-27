import java.util.ArrayList;
import java.util.Random;

public class Macacos1{
    public static void main(String[] args){
        ArrayList<Macaco> Lista = new ArrayList();
        ArrayList<Integer> Numeros = new ArrayList();
        Random rand= new Random();

        boolean vencedor=false;
        int cont=0;
        int venceu= 0;
        
        Lista.add(new Macaco(18,"Wilson",4));
        Lista.add(new Macaco(25,"Marcelo",6));
        Lista.add(new Macaco(45,"Adalberto",9));

        for(int i=0;i<Lista.size();i++){
            Lista.get(i).Infoinicial();
        }

        System.out.println("Que comecem os jogos!!");
        System.out.println(" ");
        int rodada=0;

        do{
            System.out.println((rodada+1)+"° Rodada!!");
            rodada++;
            Numeros.clear();

            for(int i=0;i<Lista.size();i++){
                    if(Lista.get(i).Fichas<=0){
                        System.out.println(Lista.get(i).Nome+" não tem mais fichas para apostar.");
                        Lista.get(i).Fichas=0;
                        Numeros.add(-1);
                        System.out.println("");
                    }else{
                        System.out.println("Vez do macaco "+Lista.get(i).Nome+"!!!");
                        Lista.get(i).InfoRodada();
                        Numeros.add(rand.nextInt(10));
                        System.out.println("Macaco "+Lista.get(i).Nome+" Apostou uma ficha no número "+Numeros.get(i)+"!");
                        Lista.get(i).Fichas--;
                        System.out.println("");
                    }
            }

            int numeromaluco=rand.nextInt(10);

            for(int i=0; i<Lista.size();i++){
                if(Numeros.get(i) == -1){
                    System.out.println("O macaco "+Lista.get(i).Nome+" não participou dessa rodada por falta de fichas.");
                    System.out.println(" ");
                } else if(Numeros.get(i) == numeromaluco){
                    System.out.println("O macaco "+Lista.get(i).Nome+" Acertou o número aleátorio, e ganhou uma ficha!!");
                    System.out.println(" ");
                    Lista.get(i).Fichas = Lista.get(i).Fichas + 2;
                } else {
                    System.out.println("O macaco "+Lista.get(i).Nome+" Errou o número aleátorio, e gastou uma ficha!!");
                    System.out.println(" ");
                }
            }


            cont=0;

            for(int i=0;i<Lista.size();i++){
                if(Lista.get(i).Fichas>0){
                    cont++;
                    venceu=i;
                }
            }
            
            if(cont==1){
                vencedor=true;
                break;
            }else{
                if(cont<1){
                    break;
                }
            }

        }while(vencedor!=true);

        for(int i=0;i<Lista.size();i++){
                Lista.get(i).InfoRodada();
            }

        if(vencedor==true){
            System.out.println("O vencedor foi: "+Lista.get(venceu).Nome+"!!!");
        }else{
            System.out.println("Ninguem ganhou nada, vocês perderam tudo seus bostas.");
        }

;    }

    public static class Macaco{
        int Idade;
        String Nome;
        int Fichas;
        Macaco(int Idade, String Nome, int Fichas){
            this.Idade=Idade;
            this.Nome=Nome;
            this.Fichas=Fichas;
        }
        void Infoinicial(){
            System.out.println("Informações do macaco: "+Nome);
            System.out.println("Idade: "+Idade);
            System.out.println("Fichas: "+Fichas);
        }
        void InfoRodada(){
            System.out.println("Fichas do macaco "+Nome+": "+Fichas);
        }
    }
}