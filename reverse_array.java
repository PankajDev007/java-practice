class reverse_array{
    public static void main(String[] args) {
        int arr[]={21,34,56,23,67};
        int f=0,l=arr.length-1;
        for(int i=0;i<arr.length;i++){
        if(f<l){
                int temp=arr[l];
                arr[l]=arr[f];
                arr[f]=temp;
            f++;
            l--; 
        }
        
            System.out.println(arr[i]);
        }
        
    }
}