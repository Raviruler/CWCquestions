import java.util.Scanner;
class BinaryMatrix{
	static void BinaryMat(int N)
	{
	int mat[][] = new int[N][N];
	for (int i = 0; i < N; i++) 
	{
		mat[i][i] = 1;
	}
	for (int i = 0; i < N; i++) 
	{
		mat[i][N - i - 1] = 1;
	}
	if (N % 2 != 0)
	{
		mat[N / 2][0] = 1;
		mat[0][N / 2] = 1;
	}

	for (int i = 0; i < N; i++) 
	{
		for (int j = 0; j < N; j++)
		{
		System.out.print(mat[i][j] + " ");
		}
		System.out.println();
	}
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter N");
		int N = scan.nextInt();
		BinaryMat(N);
	}
}