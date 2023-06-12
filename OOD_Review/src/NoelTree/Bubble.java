package NoelTree;

public class Bubble extends Ornament {
      Item item;

    public Bubble(int id, String name, double price, String description, Item item) {
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
