/**
 * @class: BMI
 * @author: Michael Blakey
 * @course: ITEC2148 - 05, Spring 2023
 * @version: 1.0
 * @date: February 9, 2023
 */
import java.util.Scanner;
public class BMI {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in pounds");
        System.out.print("\nEnter height in inches");
        double weight_p = in.nextDouble();
        double height_in = in.nextDouble();
        double  wight_kg = weight_p * 0.4536;
        double height_m = height_in * 0.0254;
        double bmi = wight_kg / height_m * height_m;
        //this is how you get the overall body mass
        if (bmi <= 18.5){
            System.out.println("Underweight");
        }
        else if (bmi <= 25.0){ //anthing else is another solution
            System.out.println("normal");
        }
        else if (bmi <= 30.0){
            System.out.println("overweight");
        }
        else if (bmi >= 30.0){
            System.out.println("obese");
        }
        System.out.println(bmi + "-Body mass index:");
//        if (18.5 <= bmi < 25.0){
//            System.out.println("Normal");
//        }
//        else if (25.0 <= BMI < 30.0){
//
//        }

    }








    }

