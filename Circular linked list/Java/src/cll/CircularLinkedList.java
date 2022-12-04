package cll;

public class CircularLinkedList<T> {
	private Node<T> first = null;

	public Node<T> getFirst(){
		return first;
	}




	public T deleteFirst() {
		if(first == null) {
			System.out.println("Error >> SSL is Empty");
			return null;
		 }else if(first.next == null) {
		 	T temp = first.data;
			first = null;
			return temp;
		}else {
			T temp = first.data;
			first = first.next;
			return temp;
		}
	}

	public T deleteLeft() {
		if(first == null) {
			System.out.println("Error >> SSL is Empty");
			return null;
		}else if(first.next == null) {
			T temp = first.data;
			first = null;
			return temp;
		}else {
			Node<T> tmp = first;
			while(tmp.next.next != first) {
				tmp = tmp.next;
			}
			T temp = tmp.next.data;
			tmp.next = first;
			return temp;
		}
	}

	public T deleteRight() {
		if(first == null) {
			System.out.println("Error >> SSL is Empty");
			return null;
		}else if(first.next == null) {
			T temp = first.data;
			first = null;
			return temp;
		}else {
			T temp = first.next.data;
			first.next = first.next.next;
			return temp;
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
			for(int i = 1 ; i < index - 1 ; i++) {
				temp = temp.next;
			}
			T tmp = temp.next.data;
			temp.next = temp.next.next;
			return tmp;
		}
	}


		public void reversePrint(Node<T> p){
			if(p.next != first) {
				reversePrint(p.next);
			}
			System.out.println(p.data);
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
		
		public void changeFirst(T input) {
			first.data = input;
		}
		
		public void addAtRight(T input) {
			if(first == null) {
				Node<T> node = new Node<T>();
				node.data = input;
				first = node;
			}else if(first.next == null) {
				Node<T> node = new Node<T>();
				node.data = input;
				first.next = node;
				node.next = first;
			}else {
				Node<T> node = new Node<T>();
				node.data = input;
				node.next = first.next;
				first.next = node;
			}
		}
		
		public void addAtLeft(T input) {
			if(first == null) {
				Node<T> node = new Node<T>();
				node.data = input;
				first = node;
			}else if(first.next == null) {
				Node<T> node = new Node<T>();
				node.data = input;
				node.next = first;
				first.next = node;
			}else {
				Node<T> node = new Node<T>();
				node.data = input;
				Node<T> temp = first;
				node.next = first;
				while(temp.next != first) {
					temp = temp.next;
				}
				temp.next = node;

			}
		}
		
		public void add(T input , int index) {
			if(index < 1) {
				System.out.println("Error >> Invalid index ");
			}else if(index == 1)
				addAtRight(input);
			else {
				Node<T> node = new Node<T>();
				Node<T> temp = first;
				node.data = input;
				for(int i = 1 ; i < index -1 ; i++ ) {
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;
			}
		}
		
		public int size() {
			if(first == null)return 0;
			Node<T> temp = first.next;
			int ans = 1;
			while(temp != first) {
				temp = temp.next;
				ans += 1;
			}
			return ans;
		}
		
		
		
		public void print() {
			Node<T> node = first;
			do {
				System.out.println(node.data);
				node = node.next;
			}while(node != first);
		}
		
		public void printFirst() {
			System.out.println(first.data);
		}
		
		
		
		
		
	}