class MergeSort {
    public static void main(String[] args) {
        int[] a ={8,4,3,2,1,9,16};
        int n=a.length;
        mergeSort(a,0,n-1)
        for(int k=0;k<n;k++)
            System.out.print(a[k]+"---");
    }
    public static void mergeSort(int[] a, int start, int end){
        if(start<end){
            int mid=(start+end)/2;
            mergeSort(a,start,mid);
            mergeSort(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }
    public static void merge(int[] a, int start, int mid, int end){
        int n1=mid-start+1;
        int n2=end-mid;
        int[] leftarr  = new int[n1];
        int[] rightarr = new int[n2];
        for(int i=0;i<n1;i++){
            leftarr[i]=a[start+i];
        }
        for(int i=0;i<n2;i++){
            rightarr[i]=a[mid+1+i];
        }
        int i=0; j=0;
        int k=start;
        while(i<n1 && j<n2){
            if(leftarr[i]>rightarr[j]){
                a[k++]=rightarr[j++];
            }
            else{
                a[k++]=leftarr[i++];
            }
        }
        while(i<n1){
            a[k++]=leftarr[i++];
        }
        while(j<n2){
            a[k++]=rightarr[j++];
        }
    }
}
