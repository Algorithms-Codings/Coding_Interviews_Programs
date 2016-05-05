import java.util.Arrays;

public class PoliticalPartiesEqual {
  public static String partiesEqual(Integer[] partyOne, Integer[] partyTwo,int states)
  {
	  if((partyOne.length!=states) || (partyTwo.length!=states))
	  {
		  return "Invalid";
	  }
	  Arrays.sort(partyOne);
	  Arrays.sort(partyTwo);
	  return Arrays.equals(partyOne,partyTwo)?"Equal":"un-Equal";
	}
  
}
