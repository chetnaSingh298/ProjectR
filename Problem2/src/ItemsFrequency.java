
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemsFrequency {

	public static void main(String[] args) {
			
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        //Create one list
        List<String> valSetOne = new ArrayList<String>();
        valSetOne.add("item_1");
        valSetOne.add("item_2");
        map.put("Order_1", valSetOne);
        
        //Create Two list
        List<String> valSetTwo = new ArrayList<String>();
        valSetTwo.add("item_3");
        map.put("Order_2", valSetTwo);
        
        //Create Third list
        List<String> valSetThree = new ArrayList<String>();
        valSetThree.add("item_2");
        map.put("Order_3", valSetThree);
        
        //Create Fourth list
        List<String> valSetFour = new ArrayList<String>();
        valSetFour.add("item_1");
        valSetFour.add("item_2");
        map.put("Order_4", valSetFour);

       
       Map<String, List<String>> item_map = new HashMap<String, List<String>>();
        
       //Traverse and print keys and Values
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
	        String key = entry.getKey();
	        List<String> values = entry.getValue();
	        
	        String[] arr = values.stream().toArray(String[]:: new);
	        for (String x : arr)
	        {	  
	        	if(item_map.containsKey(x)) {
	        		List<String> temp = item_map.get(x);
	        		temp.add(key);
	        		item_map.put(x, temp);
	        	}else {
	        		List<String> temp = new ArrayList<String>();
	        		temp.add(key);
	        		item_map.put(x, temp);
	        	}
	        	
            }     
	        
        }
        
        int temp = 0;
        int temp2 = 0;
        
        String s1 = "";
        String s2 = "";
        
        //To find the frequency
        for (Map.Entry<String, List<String>> finalentry : item_map.entrySet()) {
            String Orders = finalentry.getKey();
            List<String> Items = finalentry.getValue();
        
            if(Items.size() > temp) {
            	temp =  Items.size();
            	s1 = Orders + " frequency is : " + temp + " and occur in " + Items;
            }else if(Items.size() > temp2) {
            	temp2 =  Items.size();
            	s2 = Orders + " frequency is : " + temp2 + " and occur in " + Items;
            }
        }
        
        System.out.println(s1 );
        System.out.println(s2 );
        
		/*
		 * for(String items:list) System.out.println("List are " + items);
		 * 
		 * Map<String, Long> frequencyMap =
		 * list.stream().collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting()));
		 * 
		 * for (Map.Entry<String, Long> entry : frequencyMap.entrySet()) { int count =
		 * 2; if(entry.getValue() > count) { System.out.println(entry.getKey() + ": " +
		 * entry.getValue()); } }
		 */
	}
	
}
