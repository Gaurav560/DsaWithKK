package LinearSearchAlgo;

//search for a particular element in the given range of indexes in the array
public class SearchInRange {
static int searchWithinRange(int[] nums,int target,int startIndex, int endIndex){
    //-1 can never be an index so we are keeping the index -1.
    if (nums.length==0){
        return -1;
    }
    for (int i = startIndex; i <=endIndex; i++)
    {
        int element=nums[i];
if (element==target){
        return i;
}
    }
    return -1;
}
    public static void main(String[] args) {
int[] arr={3,5,3,2,5,6,7,5,3};
int target=5;
int startIndex=2;
int endIndex=4;
        System.out.println(searchWithinRange(arr,target,startIndex,endIndex));
    }
}
