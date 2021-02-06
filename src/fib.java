import java.util.Scanner;

public class fib {

    //normal loop method
    public static void fibo2(){
        int n1=0,n2=1,count,n3;
        System.out.println("Enter the number of fibonocci numbers print");
        Scanner data=new Scanner(System.in);
        count=data.nextInt();
        System.out.print(n1+" "+n2);
        for(int i=3;i<count+1;i++){
            n3=n1+n2;
            n1=n2;n2=n3;
            System.out.print(" "+n3);
        }

    }

    //Recursion method
    public static int fibo1(int n1,int n2,int count){
        int n3=n1+n2;
        System.out.print(" "+n3);
        if(count>0){
            fibo1(n2,n3,count-1);
        }

        return count;
    }

    //Main function
    public static void main(String[] args) {
        int n1=0,n2=1,count;
        Scanner data=new Scanner(System.in);
        System.out.println("Enter tha number");
        count=data.nextInt();
        System.out.print(n1+" "+n2);
        fibo1(n1,n2,count-3);

    }
}
