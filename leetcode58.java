public class leetcode58 {
    public int lengthlaststring(String s){
        int length =0;
        for(int i= s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' ' ){
             length++;
            }
            else if(length>0){
                break;

            }
        }
        return length;
    }
public static void main (String [] args){
    leetcode58 n=new leetcode58();
    String s="hello world";
    int a= n.lengthlaststring(s);
    System.out.println(a);
}
}
