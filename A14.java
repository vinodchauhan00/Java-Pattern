package Pattern;

public class A14 {
    public static void main(String[] args) {
        int n = 10; 
        int num = 1;
        for (int i = 1; i <= 4; i++) { 
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println(); 
        }
    }
}
