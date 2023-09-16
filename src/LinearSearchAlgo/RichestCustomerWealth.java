package LinearSearchAlgo;
//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth
{
    public static int maximumWealth(int[][] accounts)
    {
        int maxWealth=Integer.MIN_VALUE;
        for (int i = 0; i <accounts.length ; i++) {
            int count = 0;
            for (int j = 0; j <accounts[i].length ; j++) {
                count=count+accounts[i][j];
            }
            if (count>maxWealth){
                maxWealth=count;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args)
    {
        int[][] arr={{3,2,1},{1,2,3},{7,4},{33,1,34,2,4,2}};
        System.out.println(maximumWealth(arr));

    }
}
