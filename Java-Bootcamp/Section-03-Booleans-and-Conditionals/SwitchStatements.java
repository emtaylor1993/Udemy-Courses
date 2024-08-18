/**
 * SWITCH STATEMENTS
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java switch statements.
 * 
 * @packages
 *    None
 */

public class SwitchStatements {
    public static void main(String[] args) {
        String weather = "sunny";
        switch(weather) {
            case "sunny": 
                System.out.println("You can wear a shirt.\n");
                break;
            case "cloudy": 
                System.out.println("You should wear a sweater.\n");
                break;
            case "rainy": 
                System.out.println("You should wear a raincoat.\n");
                break;
            case "snowy": 
                System.out.println("You should wear a jacket.\n");
                break;
            default: 
                System.out.println("You can wear whatever you want.\n");
        }

        int role = 2;
        switch(role) {
            case 1: 
                System.out.println("You are an admin.\n");
                break;
            case 2: 
                System.out.println("You are an editor.\n");
                break;
            case 3: 
                System.out.println("You are a user.\n");
                break;
            default: 
                System.out.println("Please contact HR.\n");
        }

        int temperature = 75;
        int humidity = 65;
        if (temperature >= 80 && humidity >= 60) {
            System.out.println("It's too hot and humid.\n");
        } else if (temperature >= 80) {
            System.out.println("It's too hot!\n");
        } else if (temperature <= 60 && humidity >= 60) {
            System.out.println("It's too cold and humid.\n");
        } else if (temperature <= 60) {
            System.out.println("It's too cold!\n");
        } else {
            System.out.println("It's comfortable.\n");
        }

        int age = 25;
        int income = 50000;
        if (age >= 18 && age <= 60 && income >= 30000) {
            System.out.println("Congratulations! You are eligible for the credit card.\n");
        } else {
            System.out.println("Sorry, you are not eligible for the credit card.\n");
        }

        String lightColor = "green";
        switch (lightColor) {
            case "green":
                System.out.println("Go!\n");
                break;
            case "red":
                System.out.println("Stop!\n");
                break;
            case "yellow":
                System.out.println("Slow down!\n");
                break;
            default:
                System.out.println("Power Outage!\n");
        }

        int grade = 85;
        if (grade >= 80) {
            System.out.println("You got an A!\n");
        } else if (grade >= 70) {
            System.out.println("You got a B!\n");
        } else if (grade >= 60) {
            System.out.println("You got a C.\n");
        } else if (grade >= 50) {
            System.out.println("You got a D.\n");
        } else {
            System.out.println("You failed :(\n");
        }

        String browser = "Chrome";
        switch (browser) {
            case "Chrome":
                System.out.println("Enjoy your chrome extensions!\n");
                break;
            case "Firefox":
                System.out.println("The best non-profit browser!\n");
                break;
            case "Safari":
                System.out.println("I see you're a proud Apple user!\n");
                break;
            default:
                System.out.println("Curious? What browser do you use?\n");
        }
    }
}