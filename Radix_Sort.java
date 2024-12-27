public class Radix_Sort {
    static int findMax(int arr[]){
                int max=Integer.MIN_VALUE;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]>max){
                        max=arr[i];
                    }
                }
                return max;
            }
            static void basicCountSort(int arr[],int place){
                int output[]=new int[arr.length];
                int max=findMax(arr);
                int count[]=new int[max+1];
                for(int i=0;i<arr.length;i++){
                    count[(arr[i]/place)%10]++;
                }
                for(int i=1;i<count.length;i++){
                    count[i]+=count[i-1];
                }
                for(int i=arr.length-1;i>=0;i--){
                    int idx=count[(arr[i]/place)%10]-1;
                    output[idx]=arr[i];
                    count[(arr[i]/place)%10]--;
                }
                for(int i=0;i<arr.length;i++){
                    arr[i]=output[i];
                }
                /*int k=0;
                for(int i=0;i<count.length;i++){
                    for(int j=0;j<count[i];j++){
                        arr[k++]=i;
                    }
                }*/
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]);
                }
            }
            static void radixSort(int arr[]){
                int max=findMax(arr);
                for(int place=1;max/place>0;place+=10){
                    basicCountSort(arr,place);
                }
            }
            public static void main(String[] args) {
                int arr[]={1,4,5,2,2,5};
                radixSort(arr);
            }
}
        
    

