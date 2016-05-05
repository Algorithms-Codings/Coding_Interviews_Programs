import java.util.LinkedList;
import java.util.List;

public class SubwayMatrix {
 public static void main(String[] args)
 {
	 SubwayMatrix sm=new SubwayMatrix(10);
     sm.addLine(new int[]{1,4,2,8,7,6});
	 sm.addLine(new int[]{3,5,4,2,8,9,10});
	 sm.addLine(new int[]{3,10});
	 for(int i=1; i<=10;i++)
	 {
		 for(int j=1;j<=10;j++)
		 {
			 System.out.println("[" + i + "," + j + "] =" + sm.matrix[i][j]);
		 }
	 }
	 int p=2;
	 sm.dfsSearch(p);
	for(int i=1;i<=10;i++)
	 {
		 System.out.println(p + "-" + i + ":" + sm.path(i) );
	 }
 }
 final static int white=0;
 final static int grey=1;
 final static int black=2;
  final int n;
  final boolean matrix[][];
  int src;
  final int color[];
  final int previous[];
  public SubwayMatrix(int numStations)
  {
	  n=numStations;
	  matrix=new boolean[n+1][n+1];
	  previous=new int[n+1];
	  color=new int[n+1];
  }
  public List<Integer> path(int d)
  {
	  LinkedList<Integer> path=new LinkedList<Integer>();
	  if(src!=0 && src!=d)
	  {
		  while(d!=0)
		  {
			  path.add(0,d);
			  d=previous[d];
		  }
	  }
	  return path;
  }
  public void addLine(int[] stations)
  {
	  for(int i=1;i<stations.length;i++)
	  {
		  matrix[stations[i-1]][stations[i]]=true;
		  matrix[stations[i]][stations[i-1]]=true;
	  }
  }
  
  public void dfsSearch(int s)
  {
	  for(int v=1; v<=n;v++)
	  {
		  previous[v]=0;
		  color[v]=white;
	  }
	  dfsVisit(s);
	  src=s;
  }
  void dfsVisit(int u)
  {
	  color[u]=grey;
	  for(int v=1;v<=n;v++)
	  {
		  System.out.println("v: " + v);
		  if(matrix[u][v] && color[v]==white)
		  {
			  previous[v]=u;
			  dfsVisit(v);
		  }
	  }
	  color[u]=black;
  }
}
