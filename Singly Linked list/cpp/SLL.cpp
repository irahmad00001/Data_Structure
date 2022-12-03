#include <iostream>

using namespace std;


template<class T>
class Node{
private:
    T content ;
    Node<T> *Link;
public:
    T getContact(){
        return content;
    }
    void setContent(int c){
        content = c;
    }
    Node<T> getLink(){
        return Link;
    }
    void setLink(Node<T> L){
        Link = L;
    }
};
//
//template <class T>
//class SLL{
//private:
//    Node<T> *First = NULL;
//    Node<T> *Last = First;
//public:
//    void prepend(T value){
//        if(First == NULL){
//            First->setContent(value);
//            First->setLink(NULL);
//            First = Last;
//        }else{
//            Node<T> Temp = new Node<T>;
//            Temp = First;
//            First->setContent(value);
//            First->setLink(Temp);
//        }
//    }
//};

