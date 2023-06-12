package NoelTree;

public class NoelTree extends Item {

    public NoelTree(int id, String name, double price, String description) {
        super(id, name, price, description);
    }

    @Override
    public double cost() {
       return this.getPrice();
    }

  
}
