package Arrays;

public class linearsearch{
    public static void main(String[] args) {
        int[] arr = {2,0,5,3,9,12};
        int target= 13;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target) {
                System.out.println("Target at index " + i);
            }
        }
    }
}
