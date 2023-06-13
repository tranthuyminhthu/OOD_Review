public class Garland extends ItemDecorator{
    private Ornament ornament;

    public Garland(String id, String name, double price, String description, Ornament ornament) {
        super(id, name, price, description);
        this.ornament = ornament;
    }


    @Override
    public double cost() {
        return ornament.cost() + getPrice();
    }

    @Override
    public String show() {
        return ornament.show() + " + " + getDescription();
    }
}
