public class Main {
    public static void main(String[] args) {
        Ornament noelTree = new Tree("1","Base Tree", 12,"Base Tree");

        noelTree = new Candy("2", "Candy", 12,"Candy", noelTree);
        noelTree = new Candy("2", "Candy", 12,"Candy", noelTree);
        noelTree = new Bulbs("2", "Candy", 11,"Bulbs", noelTree);
        noelTree = new Bulbs("2", "Candy", 11,"Bulbs", noelTree);
        noelTree = new Garland("2", "Candy", 11,"Garland", noelTree);
        System.out.println("Noel Tree: " + noelTree.show());
        System.out.println("Price: " + noelTree.cost());

    }
}