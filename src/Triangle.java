import java.util.Scanner;

public class Triangle {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter 3 edge numbers");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        if (a + b > c || c + b > a || c + a > b ) {
            System.out.println("Valid");
        }
        if (a + b < c || c + b < a || c + a < b) {
            System.out.println("not valid");
        }
        }
}
