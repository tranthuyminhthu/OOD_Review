package NoelTree;

public class Test {
    public static void main(String[] args) {
        Item noelTree = new NoelTree(1,"Noel Tree",10, "Base tree");
        noelTree = new Candy(1, "Candy", 2.5, "Candy", noelTree);
        noelTree = new Candy(2, "Candy 2", 2.8, "Candy", noelTree);
        noelTree = new Bubble(1, "Bubble", 8.8, "Bubble", noelTree);
        noelTree = new Bubble(2, "Bubble 2", 8.8, "Bubble", noelTree);
        noelTree = new Garland(1, "Garland", 10.1, "Garland", noelTree);

        System.out.println(noelTree.getDescription());
        System.out.println(noelTree.cost());



    }
}
