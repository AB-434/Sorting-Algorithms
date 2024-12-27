public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[]={9,7,5,3,1};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
