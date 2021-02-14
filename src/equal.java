import java.util.Scanner;

public class equal {
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        String str;
        System.out.println("Enter the String");
        str=data.nextLine();
        System.out.println("Enter the number to split");
        int n=data.nextInt();

        int len=str.length();

        int chars=len/n;

        int temp=0;

        String[] split=new String[n];

        if(len%n==0){
            for (int i=0;i<len;i=i+chars){
                String part=str.substring(i,i+chars);
                System.out.print(" "+part+" ");
            }
        }
    }
}
