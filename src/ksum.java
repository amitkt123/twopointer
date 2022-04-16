import java.util.HashMap;
import java.util.Map;

public class ksum {
    public static int solve(int[] a, int B)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i =0;i< a.length; i++)
        {
            hm.put(a[i], i);
        }
        int diff =0;
        for(int i=0; i< a.length; i++)
        {
            diff= a[i]-B;
            if(hm.containsKey(diff) && hm.get(diff) != i)
            {
                return 1;
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,1,2,3};
        System.out.println(solve(a,0));
    }
}
