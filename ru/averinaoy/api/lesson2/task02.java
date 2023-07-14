 package ru.averinaoy.api.lesson2;
 public class task02 {
   public static void main(String[] args) {
      
   
    try {
         int[] intArray = {5,3,5,8,4,6,8,5,4}; 
         int d = 1;
         double catchedRes1 = intArray[8] / d;
         System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
         System.out.println("Catching exception: " + e);
      }
 }
}