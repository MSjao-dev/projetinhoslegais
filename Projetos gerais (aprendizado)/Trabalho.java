import java.util.Scanner;
public class Trabalho {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        exercicio1(leia);
        System.out.println();
        exercicio2(leia);
        System.out.println();
        exercicio3(leia);
        System.out.println();
        exercicio4(leia);
        System.out.println();

    }
    /*
    Exercício 1 – Média da turma e alunos reprovados
    Pede quantidade de alunos, nome, média e frequência.
    Mostra média geral e nomes dos reprovados (média < 6 ou frequência < 75%).
    */
    static void exercicio1(Scanner leia) {
        System.out.println("Bem vindo ao Lançador de notas do Suap!!");
        System.out.println();
        System.out.print("Insira a quantidade de alunos: ");
        int aln=leia.nextInt();
        String[] vetNome=new String[aln];
        int[] vetMed=new int[aln];
        int[] vetFreq=new int[aln];
        int soma=0;
        leia.nextLine();
        for(int i=0;i<aln;i++){
            System.out.print("Insira o nome do "+(i+1)+ "° aluno: ");
            vetNome[i]=leia.nextLine();
            System.out.print("Insira a média final do "+(i+1)+ "° aluno: ");
            vetMed[i]=leia.nextInt();
            System.out.print("Insira a frequencia do "+(i+1)+ "° aluno: ");
            vetFreq[i]=leia.nextInt();
            leia.nextLine();
            soma=vetMed[i]+soma;
            System.out.println();
        }
        double media= (double)soma/aln;
        System.out.println("Esta é a média geral da turma: "+media);
        System.out.println();
        System.out.println("Este são os nomes dos alunos reprovados: ");
        for(int i=0;i<aln;i++){
            if(vetFreq[i]<75 || vetMed[i]<6){
                System.out.println(vetNome[i]);
            }
        }
    }

    /*
    Exercício 2 – Menu de cálculos
    Opções: 
    1) Potência de um número
    2) Área do círculo
    3) Fatorial
    Outro valor encerra o programa. 
    */
    static void exercicio2(Scanner leia){
        int opcao;

        do{
            System.out.println("Menu: ");
            System.out.println("1- Potência");
            System.out.println("2- Área do circulo");
            System.out.println("3- Fatorial");
            System.out.println("Outro valor - Sair");
            System.out.print("Escolha: ");
            opcao=leia.nextInt();
            switch(opcao) {
                case 1:
                    int base;
                    int exp;
                    int res=1;
                    System.out.print("Insira a base: ");
                    base=leia.nextInt();
                    System.out.print("Insira o expoente: ");
                    exp=leia.nextInt();
                    for(int i=0;i<exp;i++){
                        res=res*base;
                    }
                    System.out.println("Este é o resultado: "+res);
                    System.out.println();
                    break;
                case 2:
                    double r;
                    double pi=3.14;
                    double a;
                    System.out.print("Insira o raio do circulo: ");
                    r=leia.nextDouble();
                    a=pi*(r*r);
                    System.out.println("Esta é a área do circulo: %2.f\n "+a);
                    break;
                case 3:
                    int fat;
                    System.out.print("Insira o fatorial: ");
                    fat=leia.nextInt();
                    res=1;
                    for(int i=fat;i>0;i--){
                        res*=i;
                    }
                    System.out.println("O resultado é: "+res);
                    
                    break;
                default:
                    System.out.println("Saindo do programa...");
            }
        }while(opcao >= 1 && opcao <= 3);

    }
    /*
    Exercício 3 – Comparar pisos
    Piso A = R$100/m² fixo
    Piso B = R$150/m², diminui R$10 a cada 10m² até mínimo R$80
    Pede área e mostra custo total e mais vantajoso.
    */

    static void exercicio3(Scanner leia){
        System.out.print("Insira a área total: ");
        int at = leia.nextInt();

        int precoA = 100 * at;

        
        int blocos = at / 10;
        int precoB_m2 = 150 - (blocos * 10);
        if(precoB_m2 < 80) {
            precoB_m2 = 80;
        }
        int precoB = precoB_m2 * at;

        System.out.println("Preço total Piso A: " + precoA);
        System.out.println("Preço total Piso B: " + precoB);

        if(precoA < precoB) {
            System.out.println("Mais vantajoso: Piso A");
        } else if(precoB < precoA) {
            System.out.println("Mais vantajoso: Piso B");
        } else {
            System.out.println("Os dois pisos têm o mesmo preço");
        }
    }  
    /*
    Exercício 4 – Valor final da compra
    Pede valor, pagamento (PIX) e CPF.
    Descontos:
    - Cliente cadastrado: 10% (máx R$100)
    - Novo cliente: 5%
    - PIX: +5% desconto
    Mostra valor final.
    */
    static void exercicio4(Scanner leia){
        int[] clientes = {123456789, 987654321, 111222333};

        System.out.print("Insira o valor total dos produtos: ");
        double valor = leia.nextDouble();

        System.out.print("Pagamento por PIX? (digite 1 para sim, 0 para não): ");
        int pix = leia.nextInt();

        System.out.print("Insira seu CPF (somente números): ");
        int cpf = leia.nextInt();

        
        boolean cadastrado = false;
        for(int i = 0; i < clientes.length; i++){
            if(clientes[i] == cpf){
                cadastrado = true;
                break;
            }
        }

        
        double desconto = 0;

        if(cadastrado){
            desconto = 0.10 * valor;   
            if(desconto > 100){
                desconto = 100;        
            }
        } else {
            desconto = 0.05 * valor;   
        }

        if(pix == 1){
            desconto += 0.05 * valor;  
        }

        double valorFinal = valor - desconto;

        System.out.println("Valor final da compra: R$" + valorFinal);

    }
}
