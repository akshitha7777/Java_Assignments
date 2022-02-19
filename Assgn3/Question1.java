import java.util.HashMap;
import java.util.Iterator;

public class Question1 {
	
	private HashMap<Integer, String> hm = new HashMap<Integer, String>();
	private HashMap<String,String> map = new HashMap<String,String>();
	
	public void whileLoopImplementation() {
		hm.put(1,"Hello");  
		hm.put(2,"to");  
		hm.put(3,"the");    
		hm.put(4,"World");  
		Iterator <Integer> iterator = hm.keySet().iterator();         
		while(iterator.hasNext())  
		{  
		int key=(int)iterator.next();  
		System.out.println(key+" : "+hm.get(key));  
		}  
	   }  
	
	public void advForLoopImplementation() {
		map.put("Akshitha","Anil");
		 map.put("Basic","Hash");
		 map.forEach((k,v) -> System.out.println(k + " : "+v));
		 }
		
	public static void main(String args[])  
	{  
		Question1 q = new Question1();
		 System.out.println("While loop Implementation :");
		 q.whileLoopImplementation();
		 System.out.println("\nAdvanced for loop Implementation :");
		 q.advForLoopImplementation();
		 } 
	
    }  


