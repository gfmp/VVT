/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package sachy;

/**
 *
 * @author Felix
 */
public class Tools {

    static int fromAlphabet(char a){
        return ((int) a)-97;
    }
    
    static char toAlphabet(int i){
        return (char) (i+97);
    }

}
