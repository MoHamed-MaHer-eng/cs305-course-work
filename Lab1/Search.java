package Lab1;

public class Search {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6} ;
        System.out.println(linearSearch(nums , 4));
       // System.out.println(binarySearch(nums, 4));
    }


    public static int linearSearch(int [] nums , int x){
        for(int i =0 ; i< nums.length ; i++){
            if(nums[i] == x) return i ;
        }
        return -1 ;
    }


    public static int binarySearch(int [] nums , int x){
        int low = 0 , high = nums.length-1 ;
        while (low<= high ){
            int mid = low+ (high-low)/2 ;
            if(nums[mid]==x)return mid ;
            else if(x>nums[mid]) low= mid+1 ;
            else high = mid-1 ;
        }
        return -1;
    }
}
