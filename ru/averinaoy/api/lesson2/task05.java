package ru.averinaoy.api.lesson2;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the data in the format \"Lastname Firstname Middlename date_of birth phone number gender (m or f)\": ");
            String input = scanner.nextLine();

            String[] data = input.split(" ");

            if (data.length != 6) {
                throw new IllegalArgumentException("Invalid amount of data");
            }

            String surname = data[0];
            String name = data[1];
            String patronymic = data[2];
            String birthDate = data[3];
            long phoneNumber = Long.parseLong(data[4]);
            char gender = data[5].charAt(0);

            if (!isValidDate(birthDate)) {
                throw new IllegalArgumentException("Invalid date of birth format");
            }

            if (!isValidGender(gender)) {
                throw new IllegalArgumentException("Wrong floor format");
            }

            String fileName = surname + ".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(surname + " " + name + " " + patronymic + " " + birthDate + " " + phoneNumber + " " + gender);
            writer.newLine();
            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static boolean isValidDate(String date) {
        return true;
    }

    private static boolean isValidGender(char gender) {
        return true;
    }
}
    

