package taskNumber4present;

public class JellyBeans extends Sweets{

    private String taste;

    public JellyBeans(){};

    public JellyBeans(String name, double weight, double price, String taste){
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste(){
        return taste;
    }

    public void setTaste(String taste){
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "JellyBeans {" + super.toString() + ", вкус='" + taste + "' }";
    }
}

