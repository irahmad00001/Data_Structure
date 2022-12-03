#include "iostream"
#include "SLL.cpp"
using namespace std;

int main(){
    Node<int> a;
    Node<int> temp;
    temp.setContent(12);
    a.setContent(13);
    temp.setLink(a);
    cout << temp.getContact() << endl << a.getLink().getContact();

    return 0;
}
