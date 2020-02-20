public class SpaceReplacement {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We are happy."); 
        System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(StringBuffer str) {
        int length = str.length();
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ') length += 2;
        int j = length - 1;
        StringBuffer ans = new StringBuffer(length);
        for (int i = 0; i < length; i++) ans.append("0");
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                ans.setCharAt(j, str.charAt(i));
                j--;
            } else {
                ans.replace(j - 2, j + 1, "%20");
                j -= 3;
            }
        }
    	return ans.toString();
    }
}