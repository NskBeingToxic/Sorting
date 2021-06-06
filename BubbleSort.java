class BubbleSort {
    public static void main(String[] args) {
        int[] a ={8,4,3,2,1};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            System.out.println((i+1)+" pass");
            for(int j=0;j<n-i-1;j++){
                System.out.println(a[j]+"--->"+a[j+1]);
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        for(int k=0;k<n;k++)
            System.out.println(a[k]+"---");
    }
}
