import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        
        for(int i=0; i<a.length(); i++){
            
            String aSingle = a.substring(i,i+1);
            String aSingleUpper = aSingle.toUpperCase();
            
            if(aSingle == aSingleUpper){ //Upper
                System.out.print(aSingle.toLowerCase()); 
            }else{//Lower
                System.out.print(aSingle.toUpperCase());
            }
        }
        
        
    }
}