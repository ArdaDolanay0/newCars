/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author ardol7945
 */
public class Car {
  private String model, type, make;
  private double price, year, number;
  
  
  public Car(){
      year = 0;
      price = 25000;
      model = "Kevrollet";
      make = "Port";
      type = "Normal";
  }
  
  public Car(String carType, String model, int year, int price){
      
  }
  public Car(int number1, int year1, int price1, String model1, String type1){
      year = year1;
      price = price1;
      number = number1;
      make = type1;
      model = model1;
      
  }
  public String toString(){
      String output = "Name: "+ model;
      output +=  "\n Type: "+ make;
      output += "\n Number: "+ number;
      output += "\n Year: "+ year;
      output += "\n Price: $"+ price;
      
      return output;
  }
  
  public void shine(){
      System.out.println("I am Shiney");
  }
  public void honk(){
      System.out.println("Bammmmmm");
  }
}
