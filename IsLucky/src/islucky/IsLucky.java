/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package islucky;

/**
 *
 * @author epiercy
 */
public class IsLucky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean test = isLucky(101011);
        System.out.println(test);
    }
    
    static boolean isLucky(int n){
        //convert to string
        String inStr = Integer.toString(n);
        //take string length
        int inLen = inStr.length();

        //divide original string into 2
        String firstHalf = inStr.substring(0, inLen/2);
        String secondHalf = inStr.substring(inLen/2, inLen);
        
        if(total(firstHalf) == total(secondHalf))
            return true;
        return false;
    }
    
    static int total(String intString){
        int out = 0;
        for(int i = 0; i < intString.length(); i++)
            out += Integer.parseInt(intString.substring(i, i + 1));
        return out;
    }
}
