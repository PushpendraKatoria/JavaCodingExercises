public class ADBTest {

    public static void main(String ar[]) {



    }

    public int minCost(int [][] costArray) {
        int cost1=Integer.MAX_VALUE, cost2 = Integer.MAX_VALUE, cost3=Integer.MAX_VALUE;
        int costArr[][] = new int[10][3];

        for(int i=1;i<costArr.length;i++) {
            cost1=costArr[i][0]+Math.min(costArr[i-1][1], costArr[i-1][2]);
            cost2=costArr[i][1]+Math.min(costArr[i-1][0], costArr[i-1][2]);
            cost3=costArr[i][2]+Math.min(costArr[i-1][0], costArr[i-1][1]);
        }

        return Math.min(cost1, Math.min(cost2,cost3));
    }
//
//    public int minCostUtil(int [][] costArray, int colors, int houses, int prevColor, int currMin, int houseNumber) {
//        if(houseNumber == houses-1) {
//            return currMin;
//        }
//
//        for(int i=0;i<colors;i++) {
//            if(prevColor!=i) {
//                minCostUtil(costArray, colors, houses, i, currMin+costArray[houseNumber][i], houseNumber+1);
//            }
//        }
//    }

    //0



}

/*
   n houses in a row. we want to paint these houses.

   2d n*3 matrix where 3 columns are for RGB
      0   1  2
   0  4   3  5
   1  10  1  2
   2  1   4  2
   3
   .
   .
   n-1

   minCostsofar = Y,
   []




*/
