using namespace std;
template <typename T>
class MyArray{
    private:
        T* ptr;
        int cap;
        int base;
    public :
        MyArray(int S = 10 , int B = 1){
        ptr = new T[S];
        cap = S;
        base = B;
        }
        void Store(int index , T val) {
            if (index >= base && index < (base + cap)) {
                ptr[index - base] = val;
            }
        }

        void Resize(int newsize){
        T *p = new  T[newsize];
        for(int i = base ; min(cap , newsize) ; i++){
            cap = newsize;
            delete[] ptr;
            ptr = p;
        }
        }

};
