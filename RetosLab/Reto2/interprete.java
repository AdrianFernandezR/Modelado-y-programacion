import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class interprete{

    public static char[] convStringToChar(String operation){
        
        String s= operation;
        int lengthArr= s.length();
        char[] charString= new char[lengthArr]; 
        
        for(int i=0; i<s.length();i++){  
            
            char c = s.charAt(i);
            charString[i]= c;
        }

        return charString;
    }

    public static Stack toStack(char arrayChar[]){

        Stack stackString= new Stack();

        for(int i=0; i<arrayChar.length; i++) {
            
            char pushChar= arrayChar[i];
            stackString.push(pushChar);
        }

        return stackString;

    }

    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);
        
        String operetion= scan.nextLine();
        char[] toChar= convStringToChar(operetion);

        for(int j=1, i=0; i<operetion.length(); i++){

            char numAux= toChar[i];
            int aux= Character.getNumericValue(numAux);

            char 

            System.out.println(aux);
        }

    }


}