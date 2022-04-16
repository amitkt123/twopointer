import java.util.Arrays;

public class ksumcont {
        public static int[] solve(int[] A, int B)
        {
            int left =0;
            int right =0;
            int sum =0;
            for(int i =left; i<= right; i++)
            {
                sum += A[i];
                System.out.println(sum);
                if(sum == B)
                {
                    break;
                }
                else
                if(sum<B)
                    right++;
                else if (sum>B)
                {   left++;
                    sum = sum- A[left-1];
                    System.out.println(sum);
                }
            }
            if(right>=A.length)
            {
                int arrs[]= {-1};
                return arrs;
            }
            int arr[] = new int[right-left+1];
            System.out.println(right);
            int j =0;
            for(int i= left; i<= right; i++)
            {
                arr[j] = A[i];
                j++;
            }

            return arr;
        }
        public static void main(String[] args)
        {
            int A[] = {5,10,20,100,105};

            int B = 110;
            System.out.println(Arrays.toString(solve(A,B)));

    }


}
