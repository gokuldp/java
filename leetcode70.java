public class leetcode70 {
      public int climbStairs(int n) {
       if(n<=2){
        return n;
       }
       int a=1; 
       int b=2;
       for(int i=3; i<=n; i++){
        int t=b;
        b=a+b;
        a=t;
       }
       return b;
    }
    public static void main(String[] args) {
        leetcode70 n=new leetcode70();
        int a=4;
        int r=n.climbStairs(a);
        System.out.println(r);
    }
}
