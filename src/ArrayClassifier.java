import java.util.Scanner;

public class ArrayClassifier {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int r=isEvenOdd(arr,n);
        if(r==1)
            System.out.println("Even");
        else if(r==2)
            System.out.println("Odd");
        else
            System.out.println("Mixed");
    }
    static int isEvenOdd(int[] arr,int n)
    {
        int flag;
        if(arr[0]%2==0)
            flag=1;
        else
            flag=2;
        for(int i=0;i<n;i++)
        {
            if(flag==1 && arr[i]%2!=0) {
                flag = 3;
                break;
            }
            else if(flag==2 && arr[i]%2==0) {
                flag = 3;
                break;
            }
        }
        return flag;
    }

}
