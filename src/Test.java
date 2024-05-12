public class Test {
    public static void main(String[] args){
        int s=0;

        /**
         *    2 3 8
         *    4 1
         */
        int[][] nums={{2,3,8},{4,1}};
        ex: for(int i=0;i<nums.length;i++){
            for(int k=0;k<nums[i].length;k++){
                if(nums[i][k]<s){
                    continue ex;
                }else {
                    s+=nums[i][k];
                }
            }

        }
        System.out.println(s);
    }

}

