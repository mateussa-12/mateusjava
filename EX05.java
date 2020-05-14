import java.util.Scanner;
public class EX05 {
    public static void main(String[] args) {
      System.out.println("Digite o número de meses: ");
      Scanner x = new Scanner(System.in);
      int meses = x.nextInt();
      int dias = meses * 30;
      System.out.println(meses+" meses equivalem a "+dias+" dias.");
    }
    
}
