package pkgCore;
//branches missed all over after running tests couldnt resolve this with roundtest
import java.util.LinkedList;

public class Round 
{

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() 
	{
		
		rolls.add(new Roll());
	
		if (isNatural(rolls.getLast().getScore()))
		{
			eGameResult = eGameResult.NATURAL;
		}
		
		else if (isCraps(rolls.getLast().getScore()))
		{
			eGameResult = eGameResult.CRAPS;
		}
		else 
		{
			do
			{
				rolls.add(new Roll());
			} while (((rolls.getLast().getScore() != 7)) 
					&& (rolls.getLast().getScore() != (rolls.getFirst().getScore())));
			
			if (rolls.getLast().getScore() == 7)
			{
				eGameResult = eGameResult.SEVEN_OUT;
			}
			else if ((rolls.getLast().getScore() != rolls.getFirst().getScore()))
			{
				eGameResult = pkgCore.eGameResult.POINT;
			}
			
		}
		
	}

	public int RollCount() 
	{
		return rolls.size();
	}
	
	private boolean isNatural(int iScore)
	{
		return  ((iScore == 7) || (iScore == 11));

	}
	
	private boolean isCraps(int iScore)
	{
		return  ((iScore == 2) || (iScore == 3) || (iScore == 12));
	}
	
	public String ListRolls()
	{
		String strRolls = new String();
		for (Roll r: rolls)
		{
			strRolls = strRolls + r.getScore() + '-';
		}
		return strRolls;
	}
	public int GetFirstRoll()
	{
		return rolls.getFirst().getScore();
	}
	
	
	public int GetLastRollScore() 
	{
		return rolls.getLast().getScore();
	}
	

}
