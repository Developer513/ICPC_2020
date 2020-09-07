import java.util.*;
import java.io.*;
public class baek2003 {
    public static void main(String[] args)throws IOException{
        //Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        int casenum = 0;
        //int sequencenum = sc.nextInt();
        //int sequencesum = sc.nextInt();
        int[] inputnum = new int[2];
        String inputstr  = bf.readLine();
        StringTokenizer st = new StringTokenizer(inputstr," ");
        for(int i=0;i<2;i++){
            inputnum[i] = Integer.parseInt(st.nextToken());
        }
        inputstr = bf.readLine();
        StringTokenizer st1 = new StringTokenizer(inputstr," ");
        int[] sequencemember = new int[st1.countTokens()];
        for(int i=0;i<sequencemember.length;i++){
            sequencemember[i] = Integer.parseInt(st1.nextToken());
        }    
        int idx = 0;
        while(idx<inputnum[0]){
            sum += sequencemember[idx];
            if(sum == inputnum[1]){
                sum=sequencemember[idx];
                casenum++;
            }
            if(sum > inputnum[1]){
                sum=0;
                --idx;
                System.out.println("????");
            }
            else if(sum < inputnum[1]){
                ++idx;
            }            
        }
        System.out.println(casenum);
    }
}