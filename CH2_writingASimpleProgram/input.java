import java.util.Scanner;

//This program find the average of three numbers you input

public class input {
    public static void main(String[] args){

        double num1;
        double num2;
        double num3;
        double average;
        
        System.out.println("This program will tell you the average of 3 numbers");
        System.out.println("Please enter 3 numbers");

        Scanner input = new Scanner(System.in);

        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        average = (num1 + num2 + num3)/ 3;

        System.out.println("You chose the nubmers: " + num1 + " " + num2 + " " + num3);
        System.out.println("The average of these three is: " + average);

    }
}
