import java.util.Arrays;;
public class leetcode27 {
        public int removeElement(int[] nums, int val) {
            int k=0;
            for(int i=0; i<nums.length; i++){
                if(nums[i]!=val){
                    nums[k]=nums[i];
                    k++;
                }
              
            }
               return k;
        }

        public static void main(String[] args) {
            leetcode27 n=new leetcode27();
            int[] nums={1,2,3,4,2};
            int val=2;
            int result=n.removeElement(nums,val);
            System.out.println("removed element array length:"+result);
            for(int k=0; k< result; k++){
                System.out.print(nums[k]+" ");
            }
        }
        }

