package ArrayList;
import java.util.ArrayList;
public class ArralistDemo {

	public static void main(String[] args) {
		ArrayList<Integer>list1=new ArrayList<>();
		
	//here if we try to print the size we get 0 but the capacity is 10 by default
	//if it was new ArrayList<>(3);  instead, the capacity would have been 3
		System.out.println(list1.size());
		
//functions
		list1.add(10);
		list1.add(19);
		
		//this functions adds element to that particular index and shifts elements further 
		//like here 19 is at 2nd index and 10 is at 0th index
		list1.add(1, 23);
	//now the size of array will change
		System.out.println(list1.size());
		
		System.out.println(list1.get(2));
		
		//to remove an element
		list1.remove(1);
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		
		list1.add(1,23);
		
		//to overwrite a value in the array without increasing its size
		list1.set(2, 31);
		
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		
		//for quick traversal we use for each loop 
		for(int elem:list1) {
			System.out.print(elem+" ");
		}
		
	}

}
