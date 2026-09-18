class patterns {
    public static void hollow_rectangle(int rows,int cols) {
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=cols;j++) {
                if(i==1||i==rows||j==1||j==cols) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void inv_rot_half_pyra(int n){
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=(n-i);j++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }

        public static void inv_rot_half_pyra_with_no(int n){
            int counter=1;
            for(int i=1;i<=n;i++) {
                for(int j=1;j<=(n-i);j++) {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=counter;j++) {
                        System.out.print(counter);
                        counter++;
                    }
                    System.out.println();
                }
                
            }
    
    public static void main(String[] args) {
        //hollow_rectangle(4,5);
        //inv_rot_half_pyra(4);
        inv_rot_half_pyra_with_no(4);
        
    }
}
