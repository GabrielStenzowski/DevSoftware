import java.util.Iterator;
import java.util.Scanner;

public class programa {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		String[] m = new String[5];
		String[] n = new String[5];
		Double[] n1 = new Double[5];
		Double[] n2 = new Double[5];
		Double[] n3 = new Double[5];
		Double[] n4 = new Double[5];
		Double[] n5 = new Double[5];
		Double[] nf = new Double[5];
		
		
		for (int i = 0; i < 5; i++) {			
			System.out.println("Informe o nome do aluno: ");
			n[i] = leitor.nextLine();
			
			System.out.println("Informe a  matricula do aluno:");
			m[i] = leitor.nextLine();
			
			System.out.println("Informe a primeira nota do aluno:");
			n1[i] = leitor.nextDouble();
			if(n1[i] < 0 || n1[i] >10) 
			{
			System.out.println("ERRO!!!");
			break;
			}
			
			System.out.println("Informe a segunda nota do aluno:");
			n2[i] = leitor.nextDouble();
			if(n2[i] < 0 || n2[i] >10) 
			{
			System.out.println("ERRO!!!");
			break;
			}
			
			System.out.println("Informe a terceira nota do aluno:");
			n3[i] = leitor.nextDouble();
			if(n3[i] < 0 || n3[i] >10) 
			{
			System.out.println("ERRO!!!");
			break;
			}
			
			System.out.println("Informe a quarta nota do aluno:");
			n4[i] = leitor.nextDouble();
			if(n4[i] < 0 || n4[i] >10) 
			{
			System.out.println("ERRO!!!");
			break;
			}
			
			System.out.println("Informe a quinta nota do aluno:");
			n5[i] = leitor.nextDouble();
			if(n5[i] < 0 || n5[i] >10) 
				{
				System.out.println("ERRO!!!");
				break;
				}
			
			nf[i] = (n1[i] + n2[i] + n3[i] + n4[i] + n5[i]) / 5;
			
			System.out.println("Matricula: " + m[i]);
			System.out.println("Nome: " + n[i]);			
			if(nf[i] >= 6)
				{
				System.out.println("Nota Final do Aluno: " + nf[i]);
				System.out.println("Aprovado: Sim(X) N?o()");
				}
			if(nf[i] < 5)
			{
				System.out.println("Nota Final do Aluno: " + nf[i]);
				System.out.println("Aprovado: Sim() N?o(X)");
			}
			
			System.out.println();
			leitor.nextLine();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static int i(Double double1) {
		// TODO Auto-generated method stub
		return 0;
	}
}
