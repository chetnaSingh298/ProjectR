import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class mergeArray  
{  
	public static void main(String[] args)   
	{  
		int[] firstArray = {23,45,5,78,4,90,1};        //source array  
		int[] secondArray = {77,5,45,88,32,56,3};  //destination array  
		int fal = firstArray.length;        //determines length of firstArray  
		int sal = secondArray.length;   //determines length of secondArray  
		int[] result = new int[fal + sal];  //resultant array of size first array and second array 

		System.arraycopy(firstArray, 0, result, 0, fal);  
		System.arraycopy(secondArray, 0, result, fal, sal);
		System.out.println(Arrays.toString(result));

		int length = result.length;
		int count = (int) Arrays.stream(result).filter(x -> x == 5).count();//count with 5
	
		IntStream finalAraay =Arrays.stream(result).filter(x -> x != 5);
		List<Integer> ints = finalAraay.mapToObj(Integer::valueOf).collect(Collectors.toList());
		System.out.println(ints);
	
		while (count  > 0) 
		{
  
			ints.add(5);
			count -- ;
		}
	System.out.println("output is" + ints);
  }  
}  