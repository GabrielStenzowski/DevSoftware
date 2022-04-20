
public class programa {
	
		public static void main(String[] args) {
			
			String matricula = "12345";
			String nome = "Joaozinho";
			Double nota1 = 9.0;
			Double nota2 = 0.0;
			
			Double notaFinal = (nota1 + nota2) / 2; 
			
			
			System.out.println("Matricula:" + matricula);
			System.out.println("Nome:" + nome);
			if(notaFinal >= 6) 
				{
					System.out.println("Aprovado: Sim(x) Não()");
				}
			if(notaFinal < 6)
				{
				System.out.println("Aprovado: Sim() Não(x)");
				}
			
			System.out.println("Nota Final:" +notaFinal);
			
			
		}
}
