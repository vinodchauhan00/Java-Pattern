package Pattern;

public class A7 {
    public static void main(String[] args) {
        int n = 5; 

        
        System.out.print("* ");
        for (int i = 1; i <= n - 1; i++) {
            System.out.print("*");
        }
        System.out.println();

       
        for (int i = 1; i < n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(" _");
            }
            for (int k = n - i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
    
