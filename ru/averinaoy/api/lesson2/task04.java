package ru.averinaoy.api.lesson2;
import java.util.Scanner;

public class task04 {
    
    public static void main(String[] args) throws Exception{
        System.out.print("Enter the string: ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        if ("".equals(str)){

            throw new Exception("You have entered an empty string");
        } else {
            System.out.println("You entered: " + str);
        }
     
            
            }
        }
