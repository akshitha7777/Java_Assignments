import java.util.*;
public class Question5 {
 public static int getSecondLargest(Integer[] x, int total){
 List<Integer> list=Arrays.asList(x);
 Collections.sort(list);
 int number=list.get(total-2);
 return number;
 }
 public static void main(String args[]){
 Integer arr[]={10,20,30,40,50};
 System.out.println("Second highest number in given array is : "+ getSecondLargest(arr,arr.length));
 }
}
