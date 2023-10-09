package TcsNqtStriverSheet.Array;

public class FrequencyOfAnElementInAnArrayBruteForce {
    //time complexity =O(N*N)
    //sc=O(N) as on extra array is used
    public static void main(String[] args) {
        int[] arr={2,2,3,3,3,1,1,55,33,2,2,0,5};
        visited(arr);
    }
    public static void visited(int[] arr){
        int[] frequency=new int[arr.length];
        int visited=-1;
        for (int i = 0; i < arr.length; i++) {
            //for every new element visited count will be 1
            int count=1;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                    frequency[j]=visited;
                }

            }if (frequency[i]!=visited){
            frequency[i]=count;}
        }
        System.out.println("the frequency of each elements are ::");
        for (int k = 0; k < frequency.length ; k++) {
            if (frequency[k]!=visited){
                System.out.println(arr[k]+" :"+frequency[k]);
            }

        }

    }
}
