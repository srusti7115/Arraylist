import java.util.ArrayList;
public class pairsum1 {
    // brute force Approach
    public static boolean pairsum(ArrayList<Integer> sums, int target){
        for(int i = 0; i< sums.size(); i++){
            for(int j = i+1; j<sums.size(); j++){
                if(sums.get(i)+sums.get(j)  == target){
                   return true;
                }

            }
        }
        return false;

    }
    public static boolean pairsumpointer(ArrayList<Integer> sums, int target){
        // 1- pointer Approach
        int lp = 0;
        int rp = sums.size()-1;
        while(lp != rp){
            // case1
            if(sums.get(lp) + sums.get(rp) == target){
                return true;
            }

            // case 2
            if(sums.get(lp) + sums.get(rp) < target){
                lp++;
                
            }else{
                rp--;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {

        ArrayList<Integer> sums = new ArrayList<>();
        sums.add(2);
        sums.add(5);
        sums.add(7);
        sums.add(11);
        int target= 18;
       System.out.println( pairsum(sums, target));
       System.out.println(pairsumpointer(sums,target));



        
    }
}
