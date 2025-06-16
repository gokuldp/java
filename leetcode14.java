public class leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            System.out.println(c); // f 
            System.out.println(i); // 0
            for (int j = 1; j < strs.length; j++) {
                System.out.println(j); // 1 2
                System.out.println(strs[j].length()); // 6 4
                System.out.println(strs[j].charAt(i)); // f fl
                if (i == strs[j].length() || strs[j].charAt(i) != c) { // 0==strs[1].length(6) || strs[1].charAt()
                    return strs[0].substring(0, i); 
                }
            }
        }
        
        return strs[0];
    }
    public static void main(String[] args) {
        leetcode14 n =new leetcode14();
        String  [] a={"float","flower", "flat"};
        String result=n.longestCommonPrefix(a); 
        System.out.println("Longest Common Prefix: " + result);
    }
}