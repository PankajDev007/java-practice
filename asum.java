class asum{
    public static void main(String[] args) {
        int arr[]={32,43,67,43,89};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum="+sum);
    }
}