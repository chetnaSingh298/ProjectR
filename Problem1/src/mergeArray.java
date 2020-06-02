import java.util.stream.Stream;   
import java.util.Arrays;   
import java.io.*;  
public class mergeArray {

	public static <T> Object[] mergeArray(T[] arr1, T[] arr2)   
	{   
	return Stream.of(arr1, arr2).flatMap(Stream::of).toArray();   
	}  
	
	static void pushfiveToEnd(Integer[] intArray, int n) 
    { 
        int count = 0;  // Count of non-zero elements 
  
        // Traverse the array. If element encountered is non-zero, then replace the element at index 'count' 
        // with this element 
        
        for (int i = 0; i < n; i++) 
            if (intArray[i] != 5) 
                intArray[count++] = intArray[i]; 
  
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < n) 
            intArray[count++] = 5; 
    } 
	
	public static void main(String[] args) {

		Integer[] sourceArray = new Integer[]{2,3,4,5,7,5,8,9,5}; //source   
		Integer[] destinationArray = new Integer[]{1,5,6}; //destination   
		Object[] mergedArray = mergeArray(sourceArray,destinationArray); //merged   
		
		System.out.println("Merged array: "+ Arrays.toString(mergedArray)); 

		Integer[] intArray =  Arrays.asList(mergedArray).toArray(new Integer[0]);
		
		int size = intArray.length;
		
		//code to push all 5 at end 	
		pushfiveToEnd(intArray, size); 
        System.out.println("Array after pushing 5 to the end: "); 
        for (int i=0; i<size; i++) 
            System.out.print(intArray[i]+" ");	
	}
}
