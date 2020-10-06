package taskNumber4present;

public class Lollypop extends Sweets{

    private String nameRus;

    public Lollypop(){};

    public Lollypop(String name, double weight, double price, String nameRus) {
        super(name, weight, price);
        this.nameRus = nameRus;
    }

    public String getNameRus() {
        return nameRus;
    }

    public void setNameRus(String nameRus) {
        this.nameRus = nameRus;
    }

    @Override
    public String toString() {
        return "Lollypop { " + super.toString() + ", русское название='" + nameRus + "' }";
    }
}
