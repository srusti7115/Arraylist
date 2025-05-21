import java.util.*;
public class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // here Integer is the name of integer class
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         System.out.println(list);
        int element= list.get(2);
        System.out.println(element);
        list.remove(2);
        System.out.println(list);
        list.set(2,10);
        System.out.println(list);
        System.out.println(list.contains(1));


        

         


        
    }
}