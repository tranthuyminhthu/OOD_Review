package NoelTree;

public class Candy extends Ornament {

    Item item;

    public Candy(int id, String name, double price, String description, Item item) {
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
