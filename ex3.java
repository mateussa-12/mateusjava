import java.util.Scanner;

		public class ex3{
		public static void main(String [] args){
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		String numero = entrada.nextLine();
		int n = Integer.parseInt(numero);
		for (int i = 0; i < 11;i++){
		int tab = n * i;
		System.out.println(tab);
		}  
	}
}