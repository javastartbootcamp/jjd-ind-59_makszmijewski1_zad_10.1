package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        String brand = "";
        int yearProduction;
        System.out.println("Podaj informację o trzech unikalnych samochodach");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < cars.length) {
            System.out.println("Podaj markę");
            brand = scanner.nextLine();
            System.out.println("Podaj rok produkcji");
            yearProduction = scanner.nextInt();
            scanner.nextLine();
            Car car = new Car(brand, yearProduction);
            if (car.isDuplicate(cars)) {
                System.out.println("Duplikat");
            } else {
                cars[counter] = car;
                counter++;
            }
        }

        System.out.println("Obiekty zapisane w tablicy: ");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
