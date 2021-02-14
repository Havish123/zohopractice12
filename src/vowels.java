import java.util.Locale;
import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        String str;
        int ccount=0,vcount=0;
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the String");
        str=data.nextLine();
        str=str.toLowerCase();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vcount++;
            }
            else if( str.charAt(i)>='a' && str.charAt(i)<='z'){
                ccount++;
            }
        }
        System.out.println("Total number of vowels="+vcount+" and consonants="+ccount);
    }
}
