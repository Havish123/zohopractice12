import java.util.Scanner;

public class charcount {
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        String str;
        int count=0;
        System.out.println("Enter the String");
        str=data.nextLine();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Total number of characters:"+count);
    }
}
