package java_projects;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserInfoApp {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(
                    "Введите данные (Фамилия Имя Отчество, дата рождения (dd.mm.yyyy), номер телефона (+7(999)999-99-99), пол):");
            String inputData = scanner.nextLine();
            scanner.close();

            String[] dataParts = inputData.split(", ");
            if (dataParts.length != 4) {
                throw new InvalidDataException("Неверное количество данных");
            }

            String fullName = dataParts[0];
            String birthDateStr = dataParts[1];
            String phoneNumberStr = dataParts[2];
            String genderStr = dataParts[3];
            char gender = genderStr.toLowerCase().charAt(0);
            String phoneNumberPattern = "^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$"; // Формат +7(926)123-12-23

            if (!phoneNumberStr.matches(phoneNumberPattern)) {
                throw new InvalidDataException("Неверный формат номера телефона");
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
            Date birthDate;
            try {
                birthDate = dateFormat.parse(birthDateStr);
            } catch (ParseException e) {
                throw new InvalidDataException("Неверный формат даты рождения");
            }

            if (gender != 'f' && gender != 'm') {
                throw new InvalidDataException("Неверное значение пола");
            }

            // Далее следует логика для обработки и записи данных в файл

            String[] nameParts = fullName.split(" ");
            String lastName = nameParts[0];

            String fileName = lastName + ".txt";
            String userInfo = fullName + ", " + birthDate + ", " + phoneNumberStr + ", " + gender;

            try (FileWriter fileWriter = new FileWriter(fileName)) {
                fileWriter.write(userInfo);
                System.out.println("Данные успешно записаны в файл: " + fileName);
            } catch (IOException e) {
                System.err.println("Ошибка при записи в файл: " + e.getMessage());
            }

        } catch (InvalidDataException e) {
            System.err.println("Ошибка в данных: " + e.getMessage());
        }
    }
}

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}
