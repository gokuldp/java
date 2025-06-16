public class leetcode28 {
        public int strStr(String haystack, String needle) {
            int i = haystack.indexOf(needle);
            return i; // return the index, don't just print it
        }
    
        public static void main(String[] args) {
            Solution sol = new Solution();
            int result = sol.strStr("sadbutsad", "sad");
            System.out.println(result); // Output: 0
        }
    }
    

