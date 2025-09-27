public class projeto9 {
    public static void main(String[] args){
        carro car1=new carro ("Civic",2010,40);
        carro car2= new carro ("Celta",2012,60);
        car1.acelerar();
        car2.acelerar();
        car1.exibirInfo();
        car2.exibirInfo();
        car2.frear();
        car1.exibirInfo();
        car2.exibirInfo();
    }
    public static class carro{
        String mod;
        int ano;
        int velo;
        carro(String mod, int ano, int velo){
            this.mod=mod;
            this.ano=ano;
            this.velo=velo;
        }
        public void acelerar(){
            velo=velo+10;
        }
        public void frear(){
            velo=velo-10;
        }
        public void exibirInfo(){
            System.out.println("Modelo: "+mod);
            System.out.println("Ano: "+ano);
            System.out.println("Velocidade: "+velo);
            System.out.println(" ");
        }
        
    }
    
}
