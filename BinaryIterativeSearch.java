public class BinaryIterativeSearch implements Practice03Search {
    
    //function returns the name of the search
    public String searchName(){
        return "Binary Iterative Search";
    }

    //iterative binary search 
    public int search(int [] arr, int target){
        int end = arr.length-1;
        int start = 0;

        //loops until the start overlaps the end
        while(start<end){
            //take midpoint of each pass
            int mid= start + end / 2;

            //always check midpoint for target
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                //if target is less than mid then 
                //search shifts to the right section
                end = mid-1;
            }
            else{
                //if target is more than mid then 
                //search shifts to the left section
                start=mid+1;
            }
        }
        return -1;
    }

}
