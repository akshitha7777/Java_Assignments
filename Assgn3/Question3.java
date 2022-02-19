import java.util.*;

class ArrayListIteration {
	
 List<Integer>listNumber = Arrays.asList(1, 2, 3, 4, 5);
 
 //For Loop
 public void usingForLoop() {
 System.out.println("Using For Loop:");
 for (int i = 0; i < listNumber.size(); i++)
 System.out.print(listNumber.get(i) + " ");
 }
 
 //While Loop
 public void usingWhileLoop() {
 System.out.println("\nUsing While Loop:");
 int val = 0;
 while (listNumber.size() > val) {
 System.out.print(listNumber.get(val) + " ");
 val++ ;
 }
 }
 
 //Advance For Loop
 public void usingAdvanceForLoop() {
 System.out.println("\nUsing Advance For Loop:");
 for(int i:listNumber) System.out.print(i+" ");
 }
}

//Main
public class Question3 {
 public static void main(String[] args) {
 ArrayListIteration a = new ArrayListIteration();
 a.usingForLoop();
 a.usingWhileLoop();
 a.usingAdvanceForLoop();
 }
}

