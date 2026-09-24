class array_funcs{
    public static void reverse(int arr[]){
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
    public static void pairs(int arr[]){
        int current;
        for(int i=arr[0];i<arr.length;i++){
            current=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+current+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void subarray(int arr[]){

    }
    public static void main(String[] args) {
        int arr[]={21,34,56,23,67};
        //reverse(arr);
        pairs(arr);
        
         
    }
}