public class SearchMatrix {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12},
                         {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(Find(7, array));
    }

    public static boolean Find(int target, int[][] array) {
        int i = 0, j = array[0].length - 1;
        while (i < array.length && j >= 0) {
            if (array[i][j] == target)
                return true;
            else if (target < array[i][j]) {
                j--; continue;
            } else {
                i++; continue;
            }
        }
        return false;
    }
}