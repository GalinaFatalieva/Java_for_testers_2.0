package present;

public class Marshmallow extends Sweets{

    private String colour;

    public Marshmallow(){};

    public Marshmallow(String name, double weight, double price, String colour){
        super(name, weight, price);
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Marshmallow { " + super.toString() + ", цвет='" + colour + "' }";
    }
}
