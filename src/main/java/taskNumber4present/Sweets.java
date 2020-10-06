package present;

/* Формируется новогодний подарок.
Он может включать в себя разные сладости (Candy, Jellybean, etc.)
У каждой сладости есть название, вес, цена и свой уникальный параметр.
Необходимо собрать подарок из сладостей.
Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке. */

public class Sweets {

    private String name;
    private double weight;
    private double price;

    public Sweets(){};

    public Sweets(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "название='" + name + "', вес=" + weight + ", цена=" + price;
    }
}
