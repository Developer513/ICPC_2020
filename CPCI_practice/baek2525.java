import java.util.Scanner;
import java.lang.*;
public class baek2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int inputime = sc.nextInt();
        while(inputime/60 > 0){
            if(hour>23||hour<0) hour = 0;
            else hour+=1;
            inputime-=60;
            System.out.print(hour+" ");    
            System.out.println(inputime);    
        }
        if(min+inputime>=60) {
            if(hour>23||hour<0) hour = 0;
            else hour+=1;
            min = (min+inputime)%60;
        }
        else min+=inputime;
        System.out.print(hour+" ");
        System.out.println(min);
        
        /*
        String inputime = sc.nextLine();
        String splitstr[] = inputime.split(" ");
        int cooktime = sc.nextInt();
        while()
        */
    }
}