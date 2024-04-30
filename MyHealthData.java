/**
 * Assessment: Assignment 1
 * Student Name: Lynn Tran
 * Due Date: February 18, 2024
 * Description: This program receives input about the patient and calculates their
 * age, maximum heart rate, minimum target heart rate, maximum target heart rate and BMI.
 * Professor Name: Sandra Iroakazi
 */

package HealthData;
/**
 * This class receives input about the patient and calculates their
 * age, maximum heart rate, minimum target heart rate, maximum target heart rate 
 * and BMI.
 * @author Lynn Tran
 */
public class MyHealthData {
	/**
	 * Attributes and their types
	 */
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private int currentYear;
    private double height;
    private double weight;
    
    /**
     * @param firstName patient's first name
     * @param lastName patient's last name
     * @param gender patient's gender
     * @param birthYear patient's birth year
     * @param currentYear current year
     * @param height patient's height
     * @param weight patient's weight
     */
    public MyHealthData(String firstName, String lastName, String gender, int birthYear, int currentYear, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.currentYear = currentYear;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Getter
     * @return patient's first name
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * sets patient's first name
     * @param firstName patient's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter
     * @return patient's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * sets patient's last name
     * @param lastName patient's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Getter
     * @return patient's gender
     */
    public String getGender() {
        return gender;
    }

    /** 
     * sets patient's gender
     * @param gender patient's gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter
     * @return patient's birth year
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * sets patient's birth year
     * @param birthYear patient's birth year
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * Getter
     * @return current year
     */
    public int getCurrentYear() {
        return currentYear;
    }

    /**
     * sets current year
     * @param currentYear current year
     */
    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }
    
    /**
     * Getter
     * @return patient's height
     */
    public double getHeight() {
        return height;
    }

    /**
     * sets patient's height
     * @param height patient's height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Getter
     * @return patient's weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * sets patient's weight
     * @param weight  patient's weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Calculate age
     * @return patient's age
     */
    public int calculateAge() {
        return currentYear - birthYear;
    }

    /**
     * Calculate maximum heart rate
     * @return maximum heart rate
     */
    public int calculateMaximumHeartRate() {
        return 180 - calculateAge();
    }

    /**
     * Calculate minimum target heart rate
     * @return minimum target heart rate
     */
    public double calculateMinimumTargetHeartRate() {
        return 0.3 * calculateMaximumHeartRate();
    }

    /**
     * Calculate maximum target heart rate
     * @return maximum target heart rate
     */
    public double calculateMaximumTargetHeartRate() {
        return 0.45 * calculateMaximumHeartRate();
    }
    
    /**
     * Calculate BMI
     * @return patient's BMI
     */
    public double calculateBMI() {
        return (weight / (height * height)) * 703;
    }
    
    /**
     * Display all patient information, calculations, BMI values and 
     * student information.
     */
    public void displayMyHealthData() {
        System.out.printf("First Name: %s\n", firstName);
        System.out.printf("Last Name: %s\n", lastName);
        System.out.printf("Gender: %s\n", gender);
        System.out.printf("Birth Year: %d\n", birthYear);
        System.out.printf("Current Year: %d\n", currentYear);
        System.out.printf("Height: %.2f inches\n", height);
        System.out.printf("Weight: %.2f lbs\n", weight);
        System.out.printf("Age: %d\n", calculateAge());
        System.out.printf("Maximum Heart Rate: %d\n", calculateMaximumHeartRate());
        System.out.printf("Minimum Target Heart Rate: %.2f\n", calculateMinimumTargetHeartRate());
        System.out.printf("Maximum Target Heart Rate: %.2f\n", calculateMaximumTargetHeartRate());
        System.out.printf("BMI: %.2f\n", calculateBMI());
        System.out.println(" ");
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
        System.out.println(" ");
        System.out.println("Lynn Tran 041102082 Lab3 Section 321");
    }
}