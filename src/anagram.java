
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        String str1,str2;

        Scanner data=new Scanner(System.in);
        System.out.println("Enter the first String...");
        str1=data.nextLine();
        System.out.println("Enter the Second String..");
        str2=data.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char[] strar1=str1.toCharArray();
        char[] strar2=str2.toCharArray();

        Arrays.sort(strar1);
        Arrays.sort(strar2);

        if(Arrays.equals(strar1,strar2)==true){
            System.out.println("The String are anagram");
        }
        else {
            System.out.println("The Strings are not anagram");
        }

    }
}
