import java.util.ArrayList;
public class multidimesional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        mainList.add(arr);
        ArrayList<Integer> arr2  = new ArrayList<>();
        arr2.add(3);
        arr2.add(4);
        mainList.add(arr2);
        System.out.println(mainList);
        System.out.println(mainList.get(0));
        for(int i = 0; i<mainList.size(); i++){
            System.out.print(mainList.get(i));
        }
        System.out.println();


        
    }
}
