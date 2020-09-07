import java.util.*;
import java.lang.*;

public class baek10767 {
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in)       ;
        int[] inputnum = new int[5];
        int buffer = 0;
        int buffer2 = 0;
        for(int i=0;i<inputnum.length;i++){
            inputnum[i] =sc.nextInt();
        }
        for(int j=1;j<3;j++){
            if(inputnum[j-1]>inputnum[j]){
                buffer = inputnum[j];
            }
            else{
                buffer = inputnum[j-1];
            }
        }
        if(inputnum[3]>inputnum[4]){
            buffer2 = inputnum[4];
        }
        else{
            buffer2 = inputnum[3];
        }
        int sum = buffer+buffer2 - 50;
        System.out.println(sum);
        

    }
}