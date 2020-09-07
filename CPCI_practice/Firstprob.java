import java.util.*;
import java.io.*;
import java.math.*;
public class Firstprob{

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer strBuffer = new StringBuffer();
        String inputstr = sc.nextLine();
        strBuffer.append(inputstr);
        strBuffer.reverse();
        char [] ch = new char[6];
        strBuffer.getChars(0,strBuffer.length(),ch,0);
        //System.out.println(strBuffer);
        long result = 0;
        int hex = 1;
        for(int i=0; i<inputstr.length();i++){
           // System.out.println(ch[i]);
            if(ch[i]>='0' && ch[i]<='9'){
                int numbuffer = (int)ch[i];
                result = result + numbuffer*hex;
            }
            else if(ch[i] == 'A'){
                result = result + 10*hex;
            }
            else if(ch[i] == 'B'){
                result = result + 11*hex;

            }
            else if(ch[i] == 'C'){
                result = result + 12*hex;

            }
            else if(ch[i] == 'D'){
                result = result + 13*hex;

            }
            else if(ch[i] == 'E'){
                result = result + 14*hex;

            }
            else if(ch[i] == 'F'){
                result = result + 15*hex;

            }
            hex = hex*16;
        }
        System.out.println(result);
        //Integer changeHexInt = Integer.decode(inputstr);
        //byte hexByte = (byte)(changeHexInt & 0x0FF);
        //System.out.println(stringToHex(inputstr));
        //System.out.println(hexByte);

    }
/*
    import java.util.*;
 
class Main {
  public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      String a=sc.next();
      System.out.println(Integer.parseInt(a,16));
     
      }
      
}
*/
}

