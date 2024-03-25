import java.util.Arrays;

public class AppleDistribution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int count = 0;
        for(int i=0; i<apple.length; i++){
            count += apple[i];
        }

        Arrays.sort(capacity);
        int out = 0;
        for(int i=capacity.length-1; i>=0; i--){
            if(count > 0){
                count -= capacity[i];
                out++;
            }else{
                break;
            }
        }
        return out;
    }
}
