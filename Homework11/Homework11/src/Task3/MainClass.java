package Task3;

public class MainClass {

	public static void main(String[] args) {
		Generic<Integer> g1 = new Generic<Integer>("Generic 1");
		g1.put(5);
		Generic<Integer> g2 = new Generic<Integer>("Generic 2");
		g2.put(8);
		System.out.println("Преди размяна: ");
		g1.print();
		g2.print();
		g1.change(g2);
		System.out.println("След размяна: ");
		g1.print();
		g2.print();
		

	}

}
