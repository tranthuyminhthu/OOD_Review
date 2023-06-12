package NoelTree;

public abstract class Ornament extends Item {

    public Ornament(int id, String name, double price, String description) {
        super(id, name, price, description);
    }

    public abstract String getDescription();
}
