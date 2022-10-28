// Implementing an array without using the ArrayList class and the default Java language array
//import java.util.*;
public class MyArray<T> {
	//Create a array of object
	private Object[] arr;
	//"cap" is capacity
	private int cap , base;
	MyArray(int Cap ,int Base){
		cap = Cap;
		base = Base;
		arr = new Object[cap];
	}
	MyArray(){
		cap = 100;
		base = 1;
		arr = new Object[cap];
	}
	public void Store(int index , T val) {
		if(index >= base && index <= cap + base) {
			arr[index - base] = val;
		}
	}
}