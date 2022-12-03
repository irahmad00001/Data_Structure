#include <iostream>
#include "code.cpp"
using namespace std;
int main() {
    MyArray<int> arr (5,1);
    arr.Store(1,12);
    arr.Store(2,13);
    arr.Store(3,14);
    arr.Store(3,15);
    arr.Store(4,16);
    arr.Store(5,14);
    arr.Resize(6);
    arr.Store(6,34);
    return 0;
}
