package DLL;

public class Main {
	public static void main(String[] args) {
		DoublyLinkedList<Integer>  DLL = new DoublyLinkedList<Integer>();
		DLL.addAtFirst(10);
		DLL.addAtFirst(11);
		DLL.addAtFirst(13);
		DLL.addAtFirst(15);
		DLL.addAtFirst(16);
		DLL.addAtLast(9);
		DLL.addAtLast(7);
		DLL.addAtLast(6);
		DLL.add(8, 8);
		DLL.add(14, 3);
		System.out.println(DLL.getFirst().data);
		System.out.println(DLL.getLast().data);
		System.out.println("////////////////////////////////");
		DLL.print(DLL.getLast());
		System.out.println("////////////////////////////////");
		DLL.reversePrint(DLL.getFirst());
	
	}
}
