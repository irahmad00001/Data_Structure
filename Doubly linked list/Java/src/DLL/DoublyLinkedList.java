
package DLL;

public class DoublyLinkedList<T> {
	private Node<T> first = null;
	private Node<T> last = null;
	
	public Node<T> getFirst(){
		return first;
	}
	public Node<T> getLast(){
		return last;
	}
	
	public T deleteFirst() {
		if(first == null) {
			System.out.println("Error >> SSL is Empty");
			return null;
		}else if(first.next == null) {
			T temp = first.data;
			first = null;
			last = null;
			return temp;
		}else {
			T temp = first.data;
			first = first.next;
			first.previous = null;
			return temp;
		}
	}
	
	public T deleteLast() {
		if(first == null) {
			System.out.println("Error >> SSL is Empty");
			return null;
		}else if(first.next == null) {
			T temp = first.data;
			first = null;
			last = null;
			return temp;
		}else if(first.next == last) {
			T temp = first.data;
			last = first;
			first.next = null;
			return temp;
		}else {
			T temp = last.data;
			last = last.previous;
			last.next = null;
			return temp;
		}
	}
	
	public T delete(int index) {
		if(index < 1) {
			System.out.println("Error >> Invalid index ");
			return null;
		}else if(index == 1) {
			return deleteFirst();
		}else{
			Node<T> temp = first;
			for(int i = 1 ; i < index - 1 ; i++) {
				temp = temp.next;
			}
			T tmp = temp.next.data;
			temp.next = temp.next.next;
			temp.next.previous = temp;
			return tmp;
		}
	}
	
	public void reversePrint(Node<T> p){
		if(p.next != null) {
			reversePrint(p.next);
		}
		System.out.println(p.data);
	}
	
	public void print(Node<T> p) {
		if(p.previous != null) {
			print(p.previous);
		}
		System.out.println(p.data);
	}
	
	public Node<T> reverseSSL(Node<T> p) {
		if(p.next.next == null) {
			first = p.next;
			first.previous = null;
		}
		else {
			first = reverseSSL(p.next);
		}
		p.next.next = p;
		p.next = null;
		return first;
	}
	
	public void addAtFirst(T input) {
		Node<T> node = new Node<T>();
		node.data = input;
		if(first == null) {
			first = node;
		}else if(first.next == null){
			node.next = first;
			first.previous = node;
			last = first;
			first = node;
		}else {
			node.next = first;
			first.previous = node;
			first = node;
		}
	}
	
	public void addAtLast(T input) {
		Node<T> node = new Node<T>();
		node.data = input;
		node.next = null;
		node.previous = last;
		if(last == null) {
			first = node;
			last = node;
		}else {
			last.next = node;
			last = node;
		}
	}
	
	public void add(T input , int index) {
		if(index < 1) {
			System.out.println("Error >> Invalid index ");
		}else if(index == 1)
			addAtFirst(input);
		else {
			Node<T> node = new Node<T>();
			Node<T> temp = first;
			node.data = input;
			for(int i = 1 ; i < index -1 ; i++ ) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next.previous = node;
			node.previous = temp;
			temp.next = node;
		}
	}
	
	
	public int size() {
		if(first == null)return 0;
		Node<T> temp = first;
		int ans = 1;
		while(temp != last) {
			temp = temp.next;
			ans += 1;
		}
		return ans;
	}
}
