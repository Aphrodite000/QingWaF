public class solution {
    public int JumpFloor(int target) {
        if(target==0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        //对于n级台阶，只能从n-1级台阶或者n-2级台阶上跳过来
        return JumpFloor(target-2)+JumpFloor(target-1);
    }
}
