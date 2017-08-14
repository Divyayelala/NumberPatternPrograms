
public class Numberpattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
		System.out.println("--------");
		int m = 1;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(m + " ");
				m++;
			}
			System.out.println();
		}
	}
}