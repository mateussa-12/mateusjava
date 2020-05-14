import java.util.Scanner;

		public class ex2{

		public static void main(String [] args){
		Scanner entrada =  new Scanner (System.in);
		System.out.println("nome do(a) pestinha: ");		
		String nome = entrada.nextLine();
		System.out.println("nota 1: ");
		String um = entrada.nextLine();
		float n1 = Float.parseFloat(um);
		System.out.println("nota 2: ");
		String dois = entrada.nextLine();
		float n2 = Float.parseFloat(dois);
		System.out.println("nota3: ");
		String tres = entrada.nextLine();
		float n3 = Float.parseFloat(tres);
		System.out.println("nota4: ");
		String quatro = entrada.nextLine();
		float n4 = Float.parseFloat(quatro);
	    float n5=(n1+n2+n3+n4)/4;
		System.out.println( "O pestinha " + nome + " tem a media total :"+n5 );			
	}
}