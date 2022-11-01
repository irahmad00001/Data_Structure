template <typename T>
class MyArray{
    private:
        T* ptr;
        int cap;
        int base;
    public :
        MyArray(int S = 10 , int B = 1){
        ptr = new T[S];f
        cap = s;
        base = b;
        }
        void Store(int index , T val){
            if(index >= base && index < (base + cap)){
                 ptr[index - base] = val;
            }
//        void Resize(int newsize){
//        T *p = new arr [newsize];
//        for(int i = cap ; min(cap , newsize)){
//            cap = newsize;
//            delete[] ptr;
//            ptr = p;
//        }
//        }
        }








};
