public class BinaryRecursiveSearch implements Practice03Search{

    //function returns the name of the search
    public String searchName(){
        return "Binary Recursive Search";
    }

    //can't change the call statement from how the interface
    //puts it so we make another function that takes more variables
    public int search(int [] arr, int target){
        return binary_recursion(arr,target,0,arr.length-1);
    }

    //binary search function with recursion 
    public int binary_recursion(int [] arr, int target, int start, int end){
        //if base case is hit 
        if(start>end){
            return -1;
        }
        //find midpoint of start and end
        int mid = start+end/2;

        //compare mid and target to see if they match
        if(arr[mid]==target){
            return mid;
        }
        else if(target<arr[mid]){
            //if target is less than mid, shift array to the left
            return binary_recursion(arr, target, start, mid-1);
        }
        else{
            //if target is more than mid, shift array to the right
            return binary_recursion(arr, target, mid+1, end);
        }
    }
}
