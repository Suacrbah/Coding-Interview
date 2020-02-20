public class JumpStairs {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++)
            System.out.println(JumpFloor(i));
    }

    public static int JumpFloor(int target) {
        if (target == 1) return 1;
        if (target == 2) return 2;
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}