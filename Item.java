public class Item {
    private String name;
    private double price;
    private int index;



    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly

    public Item(){}
    
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // GETTERS & SETTERS  - for name and price
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }

    public int getIndex() {
        return this.index;
    }
}
