class binary_search{
    public static void main(String[] args) {
        int arr[]={23,42,52,78,93};
        int start=0,end=arr.length-1;
        int mid,key=52;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println("Found at "+mid);
                break;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }
}