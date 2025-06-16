public class leetcode69 {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int l=1,r=x/2;
        int a=0;
        
        while (l<=r) {
           int mid =l+(r-l)/2;
           long s=(long)mid*mid; 

           if(s==x){
            return mid;
           }
           else if(s<x){
            a=mid;
            l=mid+1;
           }
           else {
            r=mid-1;

           }

        }

        return a;
    }
    public static void main (String [] args){
        int a = 30;
        leetcode69 n=new leetcode69();
        int r=n.mySqrt(a);
        System.out.println(r);

    }
}


