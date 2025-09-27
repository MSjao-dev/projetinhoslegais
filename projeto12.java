import java.util.ArrayList;
import java.util.Scanner;
public class projeto12 {
    public static void main(String[] args){
        ArrayList<Macaco> macacos=new ArrayList<>();
        Scanner leia=new Scanner (System.in);
        int i=0;
        int qtd=5;
        String nomeusu;
        System.out.print("qual seu nome?\n:");
        nomeusu=leia.nextLine();
        System.out.println("Olá "+nomeusu+" Neste programa você poderá inserir atributos a "+qtd+" macacos!!\n então vamos começar!!");
        for(i=0;i<qtd;i++){
            System.out.println("Macaco n° "+(i+1));
            System.out.print("Insira o nome do macaco: ");
            String nome=leia.nextLine();
            System.out.print("Insira a idade do macaco: ");
            int idade=leia.nextInt();
            leia.nextLine();
            System.out.print("Insira a cor do pelo do macaco: ");
            String cor=leia.nextLine();
            System.out.println(" ");
            macacos.add(new Macaco(nome,idade,cor));
        }
        System.out.println("Estas são as informações dos macacos que você criou: ");
        for(i=0;i<qtd;i++){
            macacos.get(i).info();
            macacos.get(i).barulho();
            System.out.println("");
        }
        for(i=macacos.size()-1;i>=0;i--){
            if(macacos.get(i).idade<3){
                macacos.remove(i);
            }
        }
        System.out.println("Os macacos com menos de 3 anos foram removidos da lista!!\nAqui está ela atualizada:");
        for(i=0;i<macacos.size();i++){
            macacos.get(i).info();
            macacos.get(i).barulho();
            System.out.println("");
        }
        leia.close();
    }
    public static class Macaco{
        String nome;
        int idade;
        String cordepelo;
        Macaco(String nome,int idade,String cordepelo){
            this.nome=nome;
            this.idade=idade;
            this.cordepelo=cordepelo;
        }
        public void info(){
            System.out.println("Estas são as informações do macaco: "+nome);
            System.out.println("Idade: "+idade);
            System.out.println("Cor do pelo: "+cordepelo);
        }
        public void barulho(){
            System.out.println(nome+" diz: UU AA!!");
        }
    }

}
