
public class Main {
	public static void main(String[] args) {
		SinglyLinkedList<Integer>  SSL = new SinglyLinkedList<Integer>();
		SSL.addAtFirst(10);
		SSL.addAtFirst(11);
		SSL.addAtFirst(12);
		SSL.addAtLast(9);
		System.out.println(SSL.size());
		SSL.reverseSSL(SSL.getFirst());
		SSL.reversePrint(SSL.getFirst());
	}
}
