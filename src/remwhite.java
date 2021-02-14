import java.util.Scanner;

public class remwhite {
    public static void main(String[] args) {
        String str;
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the String");
        str=data.nextLine();

        str=str.replaceAll("\\s+","");

        System.out.println("The String is==="+str);
    }
}
