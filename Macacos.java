import java.util.ArrayList;
import java.util.Scanner;
public class Macacos {
    public static void main(String[] args){
        ArrayList<Macaco> Lista = new ArrayList();
        Scanner leia = new Scanner(System.in);
        int QTDMacaco=3;
        int cont=0;
        boolean vencedor=false;
        for(int i = 0;i<QTDMacaco;i++ ){
            System.out.println("Macaco n°"+(i+1));
            System.out.print("Insira a idade do macaco: ");
            int idade=leia.nextInt();
            leia.nextLine();
            System.out.print("Insira o Nome do macaco: ");
            String nome=leia.nextLine();
            System.out.print("Insira o número de fichas do macaco: ");
            int fichas=leia.nextInt();
            Lista.add(new Macaco(idade, nome, fichas));
            System.out.println("");
        }
        System.out.println("Que comecem os jogos");
        int rodada=0;
        do{
            System.out.println((rodada+1)+"° Rodada!!");
            for(int i=0;i<Lista.size();i++){
                System.out.println("Vez do macaco "+Lista.get(i).Nome+"!!!");
                Lista.get(i).InfoRodada();
                System.out.print("Quanto deseja apostar?\n: ");

            }
            for(int i=0;i<Lista.size();i++){
                if(Lista.get(i).Fichas==0);{
                    cont++;
                }
                if(cont==2){
                    vencedor=true;
                    break;
                }
            }
        }while(vencedor=false);
        
    }
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
