package Arrays;

public class MajorityNumbers{
    public static void main(String[] args){
        int[] arr={2,2,1,2,3,2,2};
        int n= arr.length;
        int count = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if (count > n / 2) {
                System.out.println("Majority number:"+arr[i]);
            }
        }
        System.out.println("no majority elements found");
    }
}
