import java.util.Scanner;

public class SetZeroInMatrix {
public static void main(String[] args)
{
  System.out.print("Enter the Row Order: ");
  Scanner in =new Scanner(System.in);
  int RowNum=in.nextInt();
  System.out.println();
  System.out.print("Enter the Column Order: ");
  int ColNum=in.nextInt();
  int[][] matrix=new int[RowNum][ColNum];
  for(int i=0;i<RowNum;i++)
  {
	  for(int j=0;j<ColNum;j++)
	  {
		  System.out.print("Enter the value matrix[" + (i+1) +"][" +  (j+1) +"]: ");
		  matrix[i][j]=in.nextInt();
	  }
  }
  for(int i=0;i<RowNum;i++)
  {
	  for(int j=0;j<ColNum;j++)
	  {
		   System.out.print(matrix[i][j] + " ");
	  }
	  System.out.println();
  }
  setZeros(matrix);
  System.out.println("**********************");
  for(int i=0;i<RowNum;i++)
  {
	  for(int j=0;j<ColNum;j++)
	  {
		   System.out.print(matrix[i][j] + " ");
	  }
	  System.out.println();
  }
}

public static void setZeros(int[][] matrix)
{
	int[] row=new int[matrix.length];
	int[] col=new int[matrix[0].length];
	for(int i=0;i<matrix.length;i++)
	{
		for(int j=0;j<matrix[0].length;j++)
		{
			if(matrix[i][j]==0)
			{ row[i]=1; col[j]=1;}
		}
	}
	for(int i=0;i<matrix.length;i++)
	{
		for(int j=0;j<matrix[0].length;j++)
		{
			if(row[i]==1 || col[j]==1)
			{
				matrix[i][j]=0;
			}
		}
	}
	
}
}
