import org.w3c.dom.ls.LSOutput;
import present.JellyBeans;
import present.Lollypop;
import present.Marshmallow;
import present.Sweets;

public class Base {

    public static void main(String[] args) {

        Lollypop candy = new Lollypop("Chupa-Chups", 12.1, 20, "Чупачупс");
        JellyBeans candy2 = new JellyBeans("Hubba-Bubba", 97.5, 50.5, "Клубника");
        Marshmallow candy3 = new Marshmallow("Haribo", 200, 70, "pink");

        Lollypop candy4 = new Lollypop();
        candy4.setName("Heart");
        candy4.setWeight(150);
        candy4.setPrice(63.7);
        candy4.setNameRus("Сердце");

        JellyBeans candy5 = new JellyBeans(){};
        candy5.setName("Orbit");
        candy5.setWeight(25);
        candy5.setPrice(12);
        candy5.setTaste("Ice");

        Marshmallow candy6 = new Marshmallow();
        candy6.setName("Rock Mountain");
        candy6.setWeight(400);
        candy6.setPrice(100);
        candy6.setColour("White");


        Sweets[] present = {candy, candy2, candy3, candy4, candy5, candy6};

        System.out.println();

        double sumPrice = 0;
        double sumWeight = 0;

        for (Sweets composition : present){

            double price = composition.getPrice();
            sumPrice += price;

            double weight = composition.getWeight();
            sumWeight += weight;

            System.out.println(composition.toString());
        }

        System.out.println();
        System.out.println("Общая цена подарка: " + sumPrice);
        System.out.println("Общий вес подарка: " + sumWeight);
    }
}
