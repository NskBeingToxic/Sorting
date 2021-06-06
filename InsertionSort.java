class InsertionSort {
    public static void main(String[] args) {
        int[] a ={8,4,3,2,1,9,16};
        int n=a.length;
        for(int i=0;i<n;i++){
            int index=i-1;
            int currentEl=a[i];
            while(index>=0 && currentEl<a[index]){
                int temp = a[index];
                a[index] = currentEl;
                a[index+1]=temp;
                index--;
            }
        }
        for(int k=0;k<n;k++)
            System.out.print(a[k]+"---");
    }
}
