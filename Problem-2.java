import java.util.*;
 
public class Problem2{
 
    public static void main(String []args)
    {
        int n=0,i=0;
         
        Scanner X = new Scanner(System.in);
         
        System.out.print("Enter value n : ");
        n = X.nextInt();
         
        for(int i = 1; i <= n; i++) 
		{
			System.out.println(2 * i - 1);
		} 
        System.out.println();
         
    }
}
