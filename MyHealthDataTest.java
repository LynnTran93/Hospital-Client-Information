/**
 * Assessment: Lab 4
 * Student Name: Lynn Tran
 * Due Date: February 11, 2024
 * Description: This program asks for patient information and outputs all of
 * the patient's information as well as the final calculations for their age, 
 * maximum heart rate, minimum target heart rate, maximum target heart rate and BMI.
 * Professor Name: Sandra Iroakazi
 */
package HealthData;

import java.util.Scanner;

/**
 * This class is named MyHealthDataTest.
 */
public class MyHealthDataTest {

    /**
     * The main method prompts for patient information, creates a MyHealthData
     * object with the provided data, and displays the patient's health data.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter patient's information:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Birth Year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Current Year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Height (in inches): ");
        double height = scanner.nextDouble();
        System.out.print("Weight (in lbs): ");
        double weight = scanner.nextDouble();

        MyHealthData patientData = new MyHealthData(firstName, lastName, gender, birthYear, currentYear, height, weight);

        System.out.println("\nPatient's Health Data:");
        System.out.println("=====================");
        patientData.displayMyHealthData();

        scanner.close();
    }
}