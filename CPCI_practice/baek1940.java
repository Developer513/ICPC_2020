import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class baek1940 {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //int input = Integer.parseInt(br.readLine());
        int[] nums = new int[5];
        long ans = 0;
        long exception = 0;
        String num = br.readLine();
        StringTokenizer str = new StringTokenizer(num," ");
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(str.nextToken());
        }
        if(nums[0]+nums[1] <= 2*nums[2]){
            ans = nums[0]*nums[3] + nums[1]*nums[4];
        }
        if(nums[0]+nums[1] > 2*nums[2]){
            if(nums[3]>nums[4]){
                ans = nums[4]*2*nums[2] + (nums[3]-nums[4])*nums[0];
            }
            else{
                ans = nums[3]*2*nums[2] + (nums[4]-nums[3])*nums[1];
            }
        }
        if(nums[3]>nums[4]){
            exception = 2*nums[2] * nums[3];
        }
        else{
            exception = 2*nums[2] * nums[4];
        }
        System.out.println(Math.min(ans, exception));
        bw.flush();
        bw.close();
    }
}