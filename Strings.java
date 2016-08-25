/**
 * 
 */

import java.util.Scanner;
/**
 * @author ËÎÓëçñ
 *
 */
public class Strings {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String phrase = new String ("This is a String test.");
        int phraseLength; 
        int middleIndex; 
        String firstHalf; 
        String secondHalf; 
        String switchedPhrase; 
        String middle3;
        String city;
        String state;
        String result;
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        switchedPhrase = secondHalf.concat(firstHalf);
        middle3= phrase.substring(middleIndex-1,middleIndex+2);
        switchedPhrase = switchedPhrase.replace(" ","*");
        System.out.println();
        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength +
        " characters");
        System.out.println ("Index of the middle: " + middleIndex);
        System.out.println ("Character at the middle index: " +
        phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println();
        System.out.println("The middle three characters are: "+ middle3);
        System.out.println("Please enter your hometomn-city and state");
        city = scan.nextLine();
        state = scan.nextLine();
        state= state.toUpperCase();
        city = city.toLowerCase();
        result=state.concat(city).concat(state);
        System.out.println("So the result is: "+result);
    }

}
