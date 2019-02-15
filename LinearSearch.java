public class LinearSearch implements Practice03Search {
    public String searchName(){
        //returning name of search
        return "Linear Search";
    }

    public int search(int [] arr, int target){
        //loops through entire list to find if target is in array
        for( int i=0; i<arr.length; i++){
            //if target is found, returns index
            if(arr[i]==target){
                return i;
            }
        }
        //returns -1 if target is not found in array
        return -1;
    }
}