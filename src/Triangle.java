/**
 * @class: Triangle
 * @author: Michael Blakey
 * @course: ITEC2148 - 05, Spring 2023
 * @version: 1.0
 * @date: February 9, 2023
 */
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter 3 edge numbers");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        if (a + b > c && c + b > a && c + a > b) {
            // && mean aand which means that they are all true statements.
            System.out.println("Valid");
        }
            else { //anything ELSE means that it is invalid
            System.out.println("Invalid");
        }


    }
}
