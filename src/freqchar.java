import java.util.Scanner;

public class freqchar {
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        String str;

        System.out.println("Enter the String:");
        str= data.nextLine();

        char[] string=str.toCharArray();

        int[] frequency=new int[str.length()];

        for (int i=0;i< str.length();i++){
            frequency[i]=1;
            for (int j=i+1;j<str.length();j++){
                if(string[i]==string[j]){
                    frequency[i]++;
                    string[j]='o';
                }

            }
        }
        for (int i=0;i<str.length();i++){
            if(string[i]!='o'){
                System.out.println(string[i]+"-"+frequency[i]);
            }
        }
    }
}
