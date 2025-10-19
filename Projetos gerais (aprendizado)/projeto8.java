public class projeto8{
    public static void main(String[] args){
        livro l1=new livro("As 48 leis do poder","Robert Grenee",1998);
        livro l2=new livro("Segredos da comédia stand-up","Léo Lins",2014);
        l1.exibirInfo();
        l2.exibirInfo();

    }
    public static class livro{
        String nome;
        String autor;
        int anopub;

        livro(String nome, String autor, int anopub){
            this.nome=nome;
            this.autor=autor;
            this.anopub=anopub;
        }
        public void exibirInfo(){
            System.out.println("Nome do livro: "+nome);
            System.out.println("Autor do livro: "+autor);
            System.out.println("Ano de publicação: "+anopub);
            System.out.println(" ");
        }
    } 
}