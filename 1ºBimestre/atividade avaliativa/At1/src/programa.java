import java.util.Scanner;

public class programa {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int qtde = 2;
		
			String[] m = new String[qtde];
			String[] n = new String[qtde];
			double[] n1 = new double[qtde];
			double[] n2 = new double[qtde];
			double[] nf = new double[qtde];
			
			
			for (int i = 0; i < qtde; i++) {
				System.out.println("Informe os dados do aluno (" + (i + 1)+ ") ");
				
				System.out.println("Informe o nome do aluno: ");
				n[i] = leitor.nextLine();
				
				System.out.println("Informe a  matricula do aluno:");
				m[i] = leitor.nextLine();
				
				System.out.println("Informe a primeira nota do aluno:");
				n1[i] = leitor.nextDouble();
				
				System.out.println("Informe a segunda nota do aluno:");
				n2[i] = leitor.nextDouble();
				
				nf[i] = (n1[i] + n2[i]) / 2;
				
				System.out.println("Adicionar mais um aluno? ");
				System.out.println("Aperte 0 para sim || Aperte 1 para n�o");
				int interromper = leitor.nextInt();
				if (interromper == 1) 
				{
					break;
				}
				
				System.out.println("<------------><------------> ");
				leitor.nextLine();
				
			}
				
				for (int i = 0; i < qtde; i++) 
				{
					System.out.println("Nome: " + m[i]);
					System.out.println("Matricula: " + m[i]);
					if (nf[i] >= 6) 
					{						
						System.out.println("Aprovado");
					}
					else
					{
						System.out.println("Reprovado");
					}
					
					System.out.println("Nota Final: " + nf[i]);
					System.out.println();
				}
				
				leitor.close();
				
			}
		}
		
