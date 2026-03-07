package Arrays;

public class bouyermoore {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int candidate = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) { //if the next element is the same element then count increases
                count++;
            } else {
                count--;
            }
            if (count == 0) { //candidate updates after the count becomes zero.
                //so where ever i is pointing , that will become the next candidate
                candidate = arr[i];
                count = 1;
            }
        }
        System.out.println("majority" + candidate);
    }
}