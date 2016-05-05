import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args)
	{
		System.out.print("Enter the Row Order: ");
		  Scanner in =new Scanner(System.in);
		  int RowNum=in.nextInt();
		  System.out.println();
		  System.out.print("Enter the Column Order: ");
		  int ColNum=in.nextInt();
		  if(RowNum!=ColNum)
		  {
			  System.out.println("Error");
			  System.exit(0);
		  }
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
		  System.out.println("*******************Rotate clockwise by 90 ************************");
		  rotateClockWiseby90Deg(matrix);
		  for(int i=0;i<RowNum;i++)
		  {
			  for(int j=0;j<ColNum;j++)
			  {
				   System.out.print(matrix[i][j] + " ");
			  }
			  System.out.println();
		  }
		  System.out.println("*******************Rotate clockwise by 90 ************************");
		  rotateClockWiseby90Deg(matrix);
		  for(int i=0;i<RowNum;i++)
		  {
			  for(int j=0;j<ColNum;j++)
			  {
				   System.out.print(matrix[i][j] + " ");
			  }
			  System.out.println();
		  }
		  System.out.println("*******************Rotate clockwise by 90 ************************");
		  rotateClockWiseby90Deg(matrix);
		  for(int i=0;i<RowNum;i++)
		  {
			  for(int j=0;j<ColNum;j++)
			  {
				   System.out.print(matrix[i][j] + " ");
			  }
			  System.out.println();
		  }
		  System.out.println("*******************Rotate clockwise by 90 ************************");
		  rotateClockWiseby90Deg(matrix);
		  for(int i=0;i<RowNum;i++)
		  {
			  for(int j=0;j<ColNum;j++)
			  {
				   System.out.print(matrix[i][j] + " ");
			  }
			  System.out.println();
		  }
		  System.out.println("*******************Rotate Anticlockwise by 90 ************************");
		  rotateAntiClockWiseby90Deg(matrix);
		  for(int i=0;i<RowNum;i++)
		  {
			  for(int j=0;j<ColNum;j++)
			  {
				   System.out.print(matrix[i][j] + " ");
			  }
			  System.out.println();
		  }
		  System.out.println("*******************Rotate Anticlockwise by 90 ************************");
		  rotateAntiClockWiseby90Deg(matrix);
		  for(int i=0;i<RowNum;i++)
		  {
			  for(int j=0;j<ColNum;j++)
			  {
				   System.out.print(matrix[i][j] + " ");
			  }
			  System.out.println();
		  }
		  System.out.println("*******************Rotate Anticlockwise by 90 ************************");
		  rotateAntiClockWiseby90Deg(matrix);
		  for(int i=0;i<RowNum;i++)
		  {
			  for(int j=0;j<ColNum;j++)
			  {
				   System.out.print(matrix[i][j] + " ");
			  }
			  System.out.println();
		  }
		  System.out.println("*******************Rotate Anticlockwise by 90 ************************");
		  rotateAntiClockWiseby90Deg(matrix);
		  for(int i=0;i<RowNum;i++)
		  {
			  for(int j=0;j<ColNum;j++)
			  {
				   System.out.print(matrix[i][j] + " ");
			  }
			  System.out.println();
		  }



	}
	
	public static void rotateClockWiseby90Deg(int[][] matrix)
	{
		int n=matrix.length;
		int cubeCount=n/2;
		int j=n-1;
		for(int i=0;i<cubeCount;i++)
		{
			int temp=matrix[i][i];
			matrix[i][i]=matrix[j][i];
			matrix[j][i]=matrix[j][j];
			matrix[j][j]=matrix[i][j];
			matrix[i][j]=temp;
			j=j-1;
		}
		j=n-1;
		for(int i=0;i<cubeCount;i++)
		{
			
			for(int x=1;x<=(j-i-1);x++)
			{
				int temp=matrix[i][i+x];
				matrix[i][i+x]=matrix[j-x][i];
				matrix[j-x][i]=matrix[j][j-x];
				matrix[j][j-x]=matrix[i+x][j];
				matrix[i+x][j]=temp;
			}
			j--;
		}
	}
	public static void rotateAntiClockWiseby90Deg(int[][] matrix)
	{
		int n=matrix.length;
		int cubeCount=n/2;
		int j=n-1;
		for(int i=0;i<cubeCount;i++)
		{
			int temp=matrix[i][i];
			matrix[i][i]=matrix[i][j];
			matrix[i][j]=matrix[j][j];
			matrix[j][j]=matrix[j][i];
			matrix[j][i]=temp;
			j=j-1;
		}
		j=n-1;
		for(int i=0;i<cubeCount;i++)
		{
			
			for(int x=1;x<=(j-i-1);x++)
			{
				int temp=matrix[i][i+x];
				matrix[i][i+x]=matrix[i+x][j];
				matrix[i+x][j]=matrix[j][j-x];
				matrix[j][j-x]=matrix[j-x][i];
				matrix[j-x][i]=temp;
				
			}
			j--;
		}
	}
}
