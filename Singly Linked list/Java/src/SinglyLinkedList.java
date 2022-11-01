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
    }else{
        last.setAddress(node);
    }
    last = node;
    size++;
}
public T deleteFromFirst(){
    if(size == 0) {
        return null;
    }else if(size == 1){
        T temp = first.getElements();
        first = null;
        last = null;
        size--;
        return temp;
    }else{
        T temp = first.getElements();
        first = first.getAddress();
        size--;
        return temp;
    }
}
//public T deleteFromLast(){
//    if(size == 0) {
//        return null;
//    }else if(size == 1){
//        T temp = last.getElements();
//        first = null;
//        last = null;
//        return temp;
//    }else{
//        T temp = last.getElements();
//        while (first.getAddress().
//        return temp;
//    }
//}
}
