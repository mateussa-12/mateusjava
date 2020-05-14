import java.util.Scanner;

			public class ex4{
				public  static void main (String[]args){
				Scanner entrada = new Scanner (System.in);
				System.out.println("Digite uma dessas letras:t(triangulo) , q(quadrado) , i(I.M.C) ou (m) milhas ");
				String numero = entrada.nextLine();
				System.out.println(numero);

					if (numero.equals("q")){
					System.out.println("digite o primeiro valor: ");
					String n1 =entrada.nextLine();
					int um =Integer.parseInt(n1);
					
					System.out.println("digite o segundo valor: ");
					String n2 =entrada.nextLine();
					int dois = Integer.parseInt(n2);
					
					int n3 = um * dois;
					System.out.println("A area do quadrado e: "+n3);
				}
					else if (numero.equals("t")){
					System.out.println("digite o primeiro valor:");
					String n1 =entrada.nextLine();
					int um =Integer.parseInt(n1);
					
					System.out.println("digite o segundo valor: ");
					String n2 =entrada.nextLine();
					int dois = Integer.parseInt(n2);					
					int n3 =(um*dois)/2;
					System.out.println("A area do triangulo e: "+n3);	
					
					}
					
				else if (numero.equals("i")){
					System.out.println("Digite seu peso: ");
					String n1 = entrada.nextLine();
					float um = Float.parseFloat(n1);
					
					System.out.println("Digite sua altura: ");
					String n2 = entrada.nextLine();
					float dois =Float.parseFloat(n2);
					
					float tres = um/(dois*2);
					System.out.println("O seu I.M.C e :"+tres);
				}
					
				else  {					
					System.out.println("Digite quantidade de KM : ");
					String n1 = entrada.nextLine();
					double um =Double.parseDouble(n1);
					
					double dois = um/1.60934;
					System.out.println(n1+"KM em milhas fica igual a :"+dois+" milhas");
				}	
					
			}	
		}