class reverse_array{
    public static void main(String[] args) {
        int arr[]={21,34,56,23,67};
        int f=0,l=arr.length-1;
        while(f<l){
                int temp=arr[l];
                arr[l]=arr[f];
                arr[f]=temp;
            f++;
            l--; 
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        } 
    }
}