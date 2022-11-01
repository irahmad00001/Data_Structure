public class SinglyLinkedList<T> {
private Node<T> first = null;
private Node <T> last = null;
private int size = 0;
public void prepend(T input){
    first = new Node<T>(input,first);
    if(size == 0){
        last = first;
    }
    size++;
}
public void append(T input){
    Node<T> node = new Node<>(input,null);
    if(size == 0){
        first = node;
        last = node;
    }else{
        last.setAddress(node);
    }
    size++;
}
}
