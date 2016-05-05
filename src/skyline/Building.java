package skyline;

public class Building {
	public int left;
	public int right;
	public int height;
	public Building(int left,int right, int height)
	{
		this.left=left;
		this.right=right;
		this.height=height;
		if(left<=0 || right<=0 || height<=0 || left>= right)
		{
			throw new IllegalArgumentException(" Invalid building parameters: " + left + "," + right + "," + height);
		}
	}
	
	public String toString()
	{
		return "[" + left + "," + right + "] @" + height ;
	}
}
