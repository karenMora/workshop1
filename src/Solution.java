
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        boolean sol=false;
        String x=a.toLowerCase();
        String y=b.toLowerCase();
        StringBuilder z = new StringBuilder(b);
        
        if(x.length()== y.length()){
            for (int i = 0; i < x.length(); i++) {
                for (int j = 0; j < z.length(); j++) {
                    if (x.charAt(i) == z.charAt(j)) {
                        z.deleteCharAt(j);
                        if(i == x.length() - 1 && z.length() == 0){
                            sol=true;
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return sol;
    }
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
