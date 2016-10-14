/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ardol7945
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static Random rand = new Random();
    public static int number, year, price;
    public static Scanner input = new Scanner(System.in);
    public static String carType, model;
    public static String[] carTypeRan = {"Uvralet", "Mark and Jones", "Phills", "Revolla"};
    public static String[] carModelRan = {"Ogar", "Lambirginy", "Pual", "Jeeper", "Oftart"};

    public static void main(String[] args) {

        System.out.println("Making a car!" + "\n" + "1-Generate a random car" + "\n" + "2-Make your own car" + "\n" + "3-Make a Jerry car"); // TODO code application logic here
        number = input.nextInt();

        if (number == 1) {
            Car defultCar = new Car();
            System.out.println(defultCar.toString());
           defultCar.shine();
        } else if (number == 2) {
            settingCars();

            Car newCar = new Car(carType, model, year, price);
            System.out.println(newCar.toString());
             newCar.honk();
        } else if (number == 3) {

            int randomNumber = rand.nextInt(1000);
            int randomYear = rand.nextInt(20);
            int randomPrice = rand.nextInt(200000) + 500;
            int randomCar = rand.nextInt(3);
            int randomModel = rand.nextInt(4);
            Car generatingCar = new Car(randomNumber, randomYear, randomPrice, carTypeRan[randomCar], carModelRan[randomModel]);
            System.out.println(generatingCar.toString());
        }
        
        
        

    }

    public static void settingCars() {

        System.out.println("What type of car do you perfer?");
        carType = input.next();

        System.out.println("What type of model do you perfer?");
        model = input.next();
        boolean flag = false;
        while (!flag) {
            try {
                System.out.print("How old is the car?");

                year = input.nextInt();

                System.out.println("Price?");

                price = input.nextInt();
                System.out.println("What your favourate Number?");
                number = input.nextInt();
                flag = true;
            } catch (Exception e) {
                System.out.println("Not a valid input");
                input.nextLine();
            }
        }
    }

}
