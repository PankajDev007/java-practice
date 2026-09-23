class binary_search{
    public static void main(String[] args) {
        int arr[]={23,42,12,18,93};
        System.out.println("Unsorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int mid,key=42;
        int start=arr[0],end=arr.length-1;
        mid=(start+end)/2;
        if(mid==key){
            System.out.println("Found");
        }
        else if(mid<key){
            mid=mid+1;
        }
        


    }
}