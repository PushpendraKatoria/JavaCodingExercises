import java.util.Arrays;
import java.util.PriorityQueue;

public class TestTest {

  /*
  * public static int max5( int[] array) {

<your code here>

}

  * */


    public static void main(String ar[]) {
        int arr[] = {1, 34, 3, 98, 9, 76, 45, 4, 42, 48};

        [1,........45........98]

        {........., 34,45,48,76,98}
        System.out.println(max5(arr));
    }

    // 5n---- nlog5

    public static int max5( int[] array) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            return a-b;
        });

        for(int i=0;i<5;i++) {
            pq.add(array[i]);
        }
        // {1, 34, 3, 98, 9, 76, 45, 4, 42, 48}
        // 48,98,42,76, 45 --> 42

        for(int i=5;i<array.length;i++) {
            if(array[i]>pq.peek()) {
                pq.poll();
                pq.add(array[i]);
            }
        }



        return pq.poll();


    }



//    public static int largestNum(int[] arr) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->comp(a,b));
//        for(int i=0;i<arr.length;i++) {
//            pq.add(arr[i]);
//        }
//        StringBuilder str = new StringBuilder();
//        while(!pq.isEmpty()) {
//            str.append(pq.poll()+"");
//        }
//        System.out.printf(str.toString());
//        return Integer.parseInt(str.toString());
//    }
//
//    public static int comp(int a, int b) {
//        StringBuilder num1 = new StringBuilder(a+"");
//        StringBuilder num2 = new StringBuilder(b+"");
//
//        int i=0, j=0;
//        while(i<num1.length() && j< num2.length()) {
//            if(num1.charAt(i)== num2.charAt(j)) {
//                i++;
//                j++;
//                continue;
//            }
//            else if(num1.charAt(i)< num2.charAt(j)) {
//                return 1;
//            } else {
//                return -1;
//            }
//        }
//
//        // 998, 9
//        //i=1, j=1
//
//        while(i<num1.length()) {
//            if(num1.charAt(i)== num2.charAt(j-1)) {
//                i++;
//                continue;
//            }
//
//            else if (num1.charAt(i)< num2.charAt(j-1))  {
//                return 1;
//            } else {
//                return -1;
//            }
//
//        }
//
//        while(j<num2.length()) {
//            if(num1.charAt(i-1)== num2.charAt(j)) {
//                j++;
//                continue;
//            }
//            else if (num1.charAt(i-1)< num2.charAt(j))  {
//                return 1;
//            } else {
//                return -1;
//            }
//        }
//
//        return 0;
//    }

}
