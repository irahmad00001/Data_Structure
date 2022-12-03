import java.util.*;


public class SinglyLinkedList<T> {
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
	 	T temp = first.elements;
		first = null;
		last = null;
		return temp;
	}else {
		T temp = first.elements;
		first = first.next;
		return temp;
	}
}

public T deleteLast() {
	if(first == null) {
		System.out.println("Error >> SSL is Empty");
		return null;
	}else if(first.next == null) {
		T temp = first.elements;
		first = null;
		last = null;
		return temp;
	}else {
		Node<T> temp = first;
		while(temp.next != last) {
			temp = temp.next;
		}
		T tmp = last.elements;
		temp.next = null;
		last = temp;
		return tmp;
	}
}

public T delete(int index) {
	if(index < 1) {
		System.out.println("Error >> Invalid index ");
		return null;
	}
	else if(index == 1) {
		return deleteFirst();
	}else{
		Node<T> temp = first;
		for(int i = 1 ; i < index ; i++) {
			temp = temp.next;
		}
		T tmp = temp.elements;
		temp = temp.next;
		return tmp;
	}
}


	public void reversePrint(Node<T> p){
		if(p.next != null) {
			reversePrint(p.next);
		}
		System.out.println(p.elements);
	}
	
	public Node<T> reverseSSL(Node<T> p) {
		if(p.next.next == null) {
			first = p.next;
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
		node.elements = input;
		node.next = first;
		first = node;
		if(first.next == null) {
			last = first;
		}
	}
	
	public void addAtLast(T input) {
		Node<T> node = new Node<T>();
		node.elements = input;
		node.next = null;
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
			node.elements = input;
			for(int i = 1 ; i < index -1 ; i++ ) {
				temp = temp.next;
			}
			node.next = temp.next;
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
	
	
	
	public void print() {
		Node<T> node = first;
		while(node != null) {
			System.out.println(node.elements);
			node = node.next;
		}
	}
	
}
