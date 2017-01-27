import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		
			  HashMap<Integer,String> HM=new HashMap<Integer,String>();  
			  HM.put(1001,"Sam");  
			  HM.put(1002,"Tom");  
			  HM.put(1003,"John");  
			  HM.put(1004,"Mac");  
			  for(Map.Entry m:HM.entrySet()){  
			   System.out.println(m.getValue());  
			  }  
			 }  
			

	}


