package Arrays;
public class BubbleSort {
    static void bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length - i-1;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
