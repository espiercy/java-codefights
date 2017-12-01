/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author epiercy
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(prevPalindrome(11));
    }
    
    public static int prevPalindrome(int x){
        --x;
        boolean p = false;
        
        while(!p){
            //build char array
            char[] digitChars = Integer.toString(x).toCharArray();
            
            //length of the total char array
            int len = digitChars.length;
            //how far along we're checking
            int checklen = (len/2) + 1;
            
            for(int i = 0; i < checklen; i++){
                if(digitChars[i] != digitChars[len - 1 - i]){
                    --x;
                    break;
                }
                else if(i == (checklen - 1))
                    p = true;
            }   
        }
        return x;
    }
}
