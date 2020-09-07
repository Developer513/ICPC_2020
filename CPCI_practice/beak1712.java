import java.util.*;
import java.lang.*;
public class beak1712 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long inputnum1 = sc.nextInt();
        long inputnum2 = sc.nextInt();
        long inputnum3 = sc.nextInt();
        long count = 1;
        if(inputnum2>=inputnum3){
            System.out.println(-1);
        }
        else{
            while(true){
                if(inputnum1+inputnum2*count < inputnum3*count) break;
                else count++;
            }
            System.out.println(count);
        }
    }
}
