import java.util.Scanner;
import java.util.ArrayList;
public class Boletins {
    public static void main(String[] args){
        Scanner leia=new Scanner (System.in);
        ArrayList<Professor> Professores=new ArrayList();
        ArrayList<Aluno> Alunos=new ArrayList();
        ArrayList<Turma> Turmas=new ArrayList();
        int opc;
        String Nome;
        String Materia;
        
        System.out.println("Olá, Bem vindo ao SUAP Baixa renda!!\nSelecione uma opção abaixo:");
        System.out.println("1 - cadastrar Professor");
        System.out.println("2 - cadastrar Aluno");
        System.out.println("3 - Lançar Nota");
        System.out.println("4 - Exibir Boletim");
        while(true){
            System.out.print(":");
            if(leia.hasNextInt()){
                opc=leia.nextInt();
                break;
            }else{
                System.out.println("Insira uma opção Válida!!");
            }
        }
        switch(opc){
            case 1:
            
            break;

            case 2:

            break;
            case 3:
            
            break;
            case 4:
            if(){

            }else{

            }
            break;

        }
        
    }
    public static class Professor{
        String Nome;
        String Materia;
        int Serie;
        char Turma;
        Professor(String Nome, int Serie, char Turma, String Materia){
            this.Nome=Nome;
            this.Materia=Materia;
        }

    }
    public static class Aluno{
        String Nome;
        int Idade;
        int Serie;
        char Turma;
        double Nota;
        Aluno(String Nome, int Idade, int Serie, char Turma,double Nota){
            this.Nome=Nome;
            this.Idade=Idade;
            this.Serie=Serie;
            this.Turma=Turma;
            this.Nota=Nota;
        }

    }
    public static class Turma{
        int QtdAluno;
        int Ano;
        char Turma;
        Turma(int QtdAluno, int Ano, char Turma){
            
        }

    }
}
