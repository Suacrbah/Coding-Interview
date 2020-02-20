public class MinimumInArray {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2};
        System.out.println(minNumberInRotateArray(array));
    }

    public static int minNumberInRotateArray(int [] array) {
        if (array.length == 0) return 0;
        int ind1 = 0;
        int ind2 = array.length - 1;
        while (ind2 - ind1 > 1) {
            int mid = (ind1 + ind2) / 2;
            if (array[mid] >= array[ind1])
                ind1 = mid;
            else if (array[mid] <= array[ind2]) {
                ind2 = mid;
            }
        }
        return array[ind2];
    }
}