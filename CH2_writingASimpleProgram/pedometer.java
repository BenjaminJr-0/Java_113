/*
    Assignment: You are assigned the task of designing a pedometer app that can track and display the number of steps the user has taken in a given number of days. 
    Assuming the value 115000 for steps and 10 for days, your app should display the corresponding value of the average number of steps taken per day. 
    Write a complete Java program with the main class Pedometer that implements the pedometer app.

Your program should use:

    an int variable steps to store the number of steps;
    an int variable days to store the number of days;
    a double variable stepsPerDay that stores the value of the average number of steps per day taken.

The output of your program should look like this, where X is the actual value for the average number of steps per day.
*/
public class pedometer {
    public static void main(String[] args){
        int steps;
        int days;
        double stepsPerDay;
        steps = 115000;
        days = 10;
        stepsPerDay = steps / days;
        System.out.print("Average number of steps per day: " + stepsPerDay);
    }
    
}
