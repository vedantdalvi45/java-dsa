import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int a[] =twoSum(new int[]{11,0,2,7,9,3,5,2});
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(i+" "+j+"      ");
            }
            System.out.println();
        }
    }
    static int[] twoSum(int[] nums){
        int target = 9;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int more=target-nums[i];
            System.out.println(map);
            if(map.containsKey(more)){
                return  new int[]{map.get(more),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        throw new  IllegalArgumentException("Illegal arg");
    }
}
