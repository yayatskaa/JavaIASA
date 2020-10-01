import java.text.NumberFormat;
import java.util.Locale;

public class Car {
 private int id;
 private String mark;
 private String model;
 private int year;
 private String color;
 private double price;
 private String number;
 private NumberFormat currFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);

    @Override
    public String toString() {
        return "Car: " +
                "id = " + id +
                ", mark = '" + mark + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                ", color = '" + color + '\'' +
                ", price = " + currFormat.format(price) +
                ", number = '" + number + '\'';
    }

    public Car(int id, String mark, String model, int year, String color, double price, String number) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getNumber() {
        return number;
    }

}
