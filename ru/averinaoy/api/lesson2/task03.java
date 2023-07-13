package ru.averinaoy.api.lesson2;
public class task03 {
    public static void main(String[] args) throws Exception {
            int a = 90;
            int b = 3;
            if (b!=0){
                System.out.println(a / b);
            }
            
            printSum(23, 234);
            int[] abc = { 1, 2 };
            if (3 < abc.length) abc[3]=9;
        }
        

    private static void printSum(int a, int b) {
        System.out.println(a+b);
    }
}
