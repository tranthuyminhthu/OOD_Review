package NoelTree;

public class Test {
	
	public static void main(String[] args) {
		Decorator t = new Tree();
		Candy d = new Candy(t);
		Candy d1 = new Candy(d);
		
		Bubble b = new Bubble(d1);
		Bubble b1 = new Bubble(b);
		
		Garland g = new Garland(b1);
		System.out.println("Price: "+g.cost());
		System.out.println("Noel Tree: "+g.show());
	}

}
