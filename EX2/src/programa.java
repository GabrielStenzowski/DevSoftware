import java.util.Iterator;
import java.util.Scanner;

public class programa {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		String[] m = new String[5];
		String[] n = new String[5];
		Double[] n1 = new Double[5];
		Double[] n2 = new Double[5];
		Double[] nf = new Double[5];
		
		
		for (int i = 0; i < 5; i++) {			
			System.out.println("Informe o nome do aluno: ");
			n[i] = leitor.nextLine();
			
			System.out.println("Informe a  matricula do aluno:");
			m[i] = leitor.nextLine();
			
			System.out.println("Informe a primeira nota do aluno:");
			n1[i] = leitor.nextDouble();
			
			System.out.println("Informe a segunda nota do aluno:");
			n2[i] = leitor.nextDouble();
			
			nf[i] = (n1[i] + n2[i]) / 2;
			
			System.out.println("Matricula: " + m[i]);
			System.out.println("Nome: " + n[i]);			
			if(nf[i] >= 6)
				{
				System.out.println("Nota Final do Aluno: " + nf[i]);
				System.out.println("Aprovado: Sim(X) N�o()");
				}
			if(nf[i] < 5)
			{
				System.out.println("Nota Final do Aluno: " + nf[i]);
				System.out.println("Aprovado: Sim() N�o(X)");
			}
			
			System.out.println();
			leitor.nextLine();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
