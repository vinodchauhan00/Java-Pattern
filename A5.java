package Pattern;

public class A5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i+1; j++) {
                System.out.print("*___");
            }
            System.out.println("*");
        }
    }
    
}
