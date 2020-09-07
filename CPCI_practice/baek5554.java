import java.util.*;
import java.io.*;
import java.math.*;
public class baek5554{

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int timesec = 0;
        int min = 0;
        int remainsec = 0;
        for(int i=0; i<4;i++){
            int numbuffer = sc.nextInt();
            timesec = timesec + numbuffer;
        }
        min = timesec / 60 ;
        remainsec = timesec % 60;
        System.out.println(min);
        System.out.println(remainsec);

    }

}

