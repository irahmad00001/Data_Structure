package cll;

public class Main {

	public static void main(String[] args) {
		CircularLinkedList<Integer> cll = new CircularLinkedList<Integer>();
		cll.addAtLeft(10);
		cll.addAtLeft(11);
		cll.addAtLeft(12);
		cll.addAtRight(13);
		cll.addAtRight(14);
		cll.addAtRight(15);
		cll.print();
	}

}
