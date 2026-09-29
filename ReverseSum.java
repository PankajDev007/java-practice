class ReverseSum {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
