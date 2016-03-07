package Task5;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList<String> sll = new SingleLinkedList<String>();
		sll.addLast("Иван");
		sll.addLast("Мария");
		sll.printAll();
		System.out.println(sll.removeLast());
		sll.addLast("Георги");
		sll.printAll();
		
		SingleLinkedList<Integer> sll2 = new SingleLinkedList<Integer>();
		sll2.addLast(1);
		sll2.addLast(2);
		sll2.printAll();
		System.out.println(sll2.removeLast());
		sll2.addLast(3);
		sll2.printAll();

	}

}
