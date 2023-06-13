public abstract class Ornament {
    private String id;
    private String name;
    private double price;
    private String description;

    public Ornament(String id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public abstract double cost();
    public abstract String show();

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
