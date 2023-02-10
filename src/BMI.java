import java.util.Scanner;
public class BMI {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in pounds");
        System.out.print("Enter height in inches");
        double weight_p = in.nextDouble();
        double height_in = in.nextDouble();
        double  wight_kg = weight_p * 0.4536;
        double height_m = height_in * 0.0254;
        double BMI = wight_kg / height_m * height_m;
        if (BMI < 18.5){
            System.out.println("Underweight");
        }
        if (18.5 <= BMI < 25.0){
            System.out.println("Normal");
        }
        else if (25.0 <= BMI < 30.0){

        }

    }








    }

