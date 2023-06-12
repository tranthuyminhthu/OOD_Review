package NoelTree;

public class Garland extends Ornament {

    Item item;

    public Garland(int id, String name, double price, String description, Item item) {
        super(id, name, price, description);
        this.item = item;
    }

    @Override
    public String getDescription() {
       return this.item.getDescription() + " + " + description;
    }

    @Override
    public double cost() {
      return this.getPrice() + this.item.cost();
    }
    
}