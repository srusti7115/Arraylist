import java.util.ArrayList;
public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int idx1 = 1;
        int idx2 = 3;
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
        


        
    }
    
}
