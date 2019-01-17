import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        boolean sol=false;
        //boolean igual=false;
        
        //System.out.println("String--->"+a);
        //System.out.println("String--->"+b);
        
        char arrA[] = a.toCharArray();
        ArrayList<Character> arrB=new ArrayList<Character>();//array de caracteres
        
        for(int p=0;p<b.length();p++){
            arrB.add(b.charAt(p));
            
        }
        System.out.print(""+arrB);
        
        if(a.length() != b.length()) {
            sol=false;
        }
        else {
            for (int i = 0; i < a.length(); i++) {
                String x = Character.toString(arrA[i]);
                for (int j = 0; j < b.length(); j++) {
                    String y = Character.toString(arrB.get(j));
                    if (arrA[i]==arrB.get(j)) {
                        System.out.print("---"+arrA[i]+"-----"+arrB.get(i));
                    //if (x.equalsIgnoreCase(y)) {
                        sol = true;
                        arrB.remove(j);
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
