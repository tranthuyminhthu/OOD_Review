public class Tree extends Ornament {
    public Tree(String id, String name, double price, String description) {
        super(id, name, price, description);
    }

    @Override
    public double cost() {
        return getPrice();
    }

    @Override
    public String show() {
        return getDescription();
    }
}
