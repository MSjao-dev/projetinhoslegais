package Mokey_Tycoon;

public class Macacos {
    String Nome;
    int Idade;
    int Energia;
    int Felicidade;
    String Habilidade;
    int Fichas;
    Macacos(String Nome,String Habilidade){
        this.Nome=Nome;
        this.Idade=Func.gerarRandom(20);
        this.Energia=Func.gerarRandom(10);
        this.Felicidade=Func.gerarRandom(10);
        this.Habilidade=Habilidade;
    }
    void Apostar(){

    }
    void Treinar(){

    }
    void Comer(){

    }
    void Dormir(){

    }
    void InfoMacaco(){
        System.out.println("Nome: "+Nome);
        System.out.println("Idade: "+Idade);
        System.out.println("Energia: "+Energia);
        System.out.println("Felicidade: "+Felicidade);
        System.out.println("Habilidade: "+Habilidade);
        System.out.println("Fichas: "+Fichas);
        System.out.println();
    }
}
