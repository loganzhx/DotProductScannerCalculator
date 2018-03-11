import java.util.Scanner; 

public class DotProduct {
  public static void main( String [ ] args ) {
    Scanner input = new Scanner(System.in);
    int[] a = new int[3];
    Scanner input2 = new Scanner(System.in);
    int[] b = new int[3];
    int n = a.length;
    
    for (int i = 0; i < n.length; i++){
      System.out.println("Please enter number");
      numbers[i] = input.nextInt();
    }
    
    int sum = 0;
    for (int k = 0; ik < a.length; i++) {
      sum += a[n] * b[n];    
    }
    
    System.out.println(sum);
    
  }
}