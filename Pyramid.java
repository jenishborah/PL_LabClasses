import java.util.Scanner;
public class Pyramid
{	
    public static void main(String args[])
	{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int n = input.nextInt();
        	for (int i=0; i<=n; i++)
		{
			for (int j=2*(n-i); j>1; j--)
			{
				System.out.print(" ");
			}

			for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
			System.out.println();
		}
		
	}
}
