import java.util.*;
public class baek2480 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int triangle[] = new int[3];
        int anglesum = 0;
        int anglequls = 0;
        for(int i=0;i<3;i++){
            triangle[i] = sc.nextInt();
            anglesum += triangle[i];
            if(i>0 && triangle[i-1] == triangle[i]){
                anglequls++;
            }            
        }
        if(anglesum == 180 && anglequls == 2) System.out.println("Equilateral");
        else if(anglesum == 180 && anglequls == 1) System.out.println("Isosceles");
        else if(anglesum == 180) System.out.println("Scalene");
        else System.out.println("Error");
    }

}                