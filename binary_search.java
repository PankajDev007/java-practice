class binary_search{
    public static void main(String[] args) {
        int arr[]={23,42,52,78,93};
        System.out.println("Unsorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int mid,key=42;
        int start,end=arr.length-1;
        boolean found=false;
        for(start=arr[0];start<end;start++){
        mid=(start+end)/2;
        if(mid==key){
            found=true;
        }
        else if(mid<key){
            start=mid+1;
        }
        else if(mid>key){
            end=mid-1;
        }
    }
        
System.out.println(found);

    }
}