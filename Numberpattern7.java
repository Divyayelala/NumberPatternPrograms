
public class Numberpattern7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space= 8;
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=space;j++)
					{
						System.out.print(" ");
					}
					space = space-2;
					for(int k=1;k<=i;k++)
					{
						System.out.print(i+" ");
					}
					System.out.println();
				}
				System.out.println("-------------");
				int space1= 0;
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=space1;j++)
					{
						System.out.print(" ");
					}
					space1 = space1+2;
					for(int k=i;k<=5;k++)
					{
						System.out.print(i+" ");
					}
					System.out.println();
				}
				System.out.println("----------------");
				int space11= 8;
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=space11;j++)
					{
						System.out.print(" ");
					}
					space11 = space11-2;
					for(int k=1;k<=i;k++)
					{
						System.out.print(k+" ");
					}
					System.out.println();
				}
				System.out.println("-------------");
				int space111= 0;
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=space111;j++)
					{
						System.out.print(" ");
					}
					space111 = space111+2;
					for(int k=i;k<=5;k++)
					{
						System.out.print(k+" ");
					}
					System.out.println();
				}

	}
}
