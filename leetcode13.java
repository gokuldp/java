public class leetcode13 {
    public int romanToInt(String s) {
              int ans = 0;
              int[] roman = new int[128];
              System.out.println(s.length());
          
              roman['I'] = 1;
              roman['V'] = 5;
              roman['X'] = 10;
              roman['L'] = 50;
              roman['C'] = 100;
              roman['D'] = 500;
              roman['M'] = 1000;
          
              for (int i = 0; i + 1 < s.length(); ++i) { // 1 < 7
                if (roman[s.charAt(i)] < roman[s.charAt(i + 1)]) //roman[M] < roman[c]
                  ans -= roman[s.charAt(i)];
                                                // ans=0-100
               
             else
                  ans += roman[s.charAt(i)];          // ans=0+1000
              }
          
              return ans + roman[s.charAt(s.length() - 1)];    
            }
          
            public static void main(String[] args) {
              leetcode13 obj = new leetcode13();
              String roman1 = "CMXCIV"; 
              System.out.println("Input: " + roman1);
              int result = obj.romanToInt(roman1);
              System.out.println("Output: " + result); 
            }
          }
        
          
    
