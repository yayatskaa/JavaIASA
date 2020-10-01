import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            cars.add(new Car(i,
                    "Mark "+ (int)(Math.random()*5),
                    "Model " + (int)(Math.random()*5),
                    2010+(int)(Math.random()*10),
                    "Color "+ (int)(Math.random()*10),
                    1000+Math.random()*1000,
                    "KA"+(int)(1000+i)+"KB"));
        }

        for (Car car: cars) System.out.println(car);
        System.out.println("\n");

        List<Car> carsWithMark = cars.stream().filter(car -> car.getMark().equals("Mark 3")).collect(Collectors.toList());
        for (Car car: carsWithMark) System.out.println(car);
        System.out.println();
        List<Car> carsWithModel = cars.stream().filter(car -> car.getModel().equals("Model 2") && 2020-car.getYear() > 5).collect(Collectors.toList());
        for (Car car: carsWithModel) System.out.println(car);
        System.out.println();
        List<Car> carsWithYear = cars.stream().filter(car -> car.getYear() == 2011 && car.getPrice() > 1100).collect(Collectors.toList());
        for (Car car: carsWithYear) System.out.println(car);

    }
}
