import java.util.*;
import java.lang.*;

public class baek2588{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputnum1 = sc.nextInt();
        String inputnum2 = sc.next();
        int resultstr[] = new int[3];
        String str[] = inputnum2.split("");
        for(int i=0;i<str.length;i++){
            resultstr[i] = inputnum1 * Integer.parseInt(str[str.length-1-i]);
            System.out.println(resultstr[i]);
        }
        System.out.println(inputnum1 * Integer.parseInt(inputnum2));
        

    }
}