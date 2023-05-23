Selection sort 
class Arrays{
    public static void Insertion_Sort(int[] arr){
    int temp=0,j;
    for(int i=1;i<arr.length;i++){
        temp=arr[i];
        j=i;
        while(j>0&&arr[j-1]>temp){
            arr[j]=arr[j-1];
            j=j-1;
        }
        arr[j]=temp;
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
    public static void main(String[] args) {
        int[] arr={3,6,9,4,7,1,5,8,2};
        Insertion_Sort(arr);
    }
}