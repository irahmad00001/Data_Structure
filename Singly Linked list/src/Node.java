public class Node <T>{
    private T elements;
    private Node<T> address;
    public Node(T elements ,Node<T> address){
        this.elements = elements;
        this.address = address;
    }
    public Node<T> getAddress() {
        return address;
    }
    public void setAddress(Node<T> address) {
        this.address = address;
    }
    public T getElements() {
        return elements;
    }
}
