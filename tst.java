class tst {
    public static void main(String[] args) {
        int n=4,m=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=(n-1);j++) {
                System.out.print(" ");
                
            }
            for(int j=1;j<=(m+2);j++) {
                System.out.print("*");
                
            }
            for(int j=1;j<=(n-1);j++) {
                System.out.print(" ");
                
            }
            System.out.println();
        }
        
    }
}