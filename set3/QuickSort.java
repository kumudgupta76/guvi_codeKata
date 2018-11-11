import java.util.*;

public class QuickSort{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for ( int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        a=QuickSortA(a);
        for ( int i:a)
        System.out.println(i+" ");
    }
    public static int [] QuickSortA(int arr[])
    {
        int p=arr[0];
        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        List<Integer> equal=new ArrayList<>();
        int x=0,y=0,z=0;
        for (int i:arr){
            if (i<p)
                left.add(i);
            else if(i>p)
                right.add(i);
            else
                equal.add(i);
        }
        left.addAll(equal);
        left.addAll(right);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=left.get(i);
        }
        return arr;
    }
}