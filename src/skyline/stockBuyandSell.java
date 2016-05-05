package skyline;

public class stockBuyandSell {
public static void main(String[] args)
{
	int maxprice=0;
	int stockprice[]= {100, 180, 260, 310, 40, 535, 695,10,80,990,88};
	int startprice=0;
	int endprice=0;
	for(int i=0;i<stockprice.length-1;i++)
	{
		System.out.println(stockprice[i]);
		int j;
		startprice=stockprice[i];
		for(j=i+1;j<stockprice.length;j++)
		{
			
			if(maxprice<= (stockprice[j]-stockprice[i]))
			{
				maxprice=stockprice[j]-stockprice[i];
				endprice=stockprice[j];
			}
			else
			{
               
               i=j-1;  
               maxprice=0;
               break;
			}
		
		}
        System.out.println("Price List" + startprice + "," + endprice );

		if(j==stockprice.length)
		{
			break;
		}
	}
}
}
