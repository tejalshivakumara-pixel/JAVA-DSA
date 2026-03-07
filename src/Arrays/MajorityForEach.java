package Arrays;

public class MajorityForEach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int num : arr) {   // for-each loop
                if (arr[i] == num) {
                    count++;
                }
            }
            System.out.println("Majority" + count);
        }
    }
}
