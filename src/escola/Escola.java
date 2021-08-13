
package escola;

//IMPORTAÇÃO DA CLASSE SCANNER
import java.util.Scanner;


public class Escola {

    
    public static void main(String[] args) {
        
       
       
        String nome;
        int idade;
        String curso;
        double nota;
        boolean status;
        
        //UTILIZAÇÃO DA CLASSE SCANNER
        Scanner ler = new Scanner (System.in, "ISO-8859-1");
         
        System.out.print("Digite o nome do(a) aluno(a): ");
        nome = ler.nextLine();
         
        System.out.print("Digite o curso do(a) aluno(a): ");
        curso = ler.nextLine();
         
        System.out.print("Digite a idade do(a) aluno(a): ");
        idade = ler.nextInt();
         
        System.out.print("Digite a nota do(a) aluno(a): ");
        nota = ler.nextDouble();
         
        System.out.print("Digite o status do(a) aluno(a): ");
        status = ler.nextBoolean();

     
        System.out.println("Aluno: "+ nome + "\n"   +  
                           "Idade: "+  idade + "\n" +  
                           "Curso: "+ curso + "\n"  +  
                           "Nota: " + nota + "\n"   +
                           "Status: " + status);
        
    }
    
}
        
   