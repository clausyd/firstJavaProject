package player;

public class NonEuPlayer extends Player {
	
	String workPermit;

	public NonEuPlayer(String fName,String lName, String dob,String ppsNum,String phoneNum, String salary,String town,String city,String county, String nationality, String team, String contract,  String workPermit) 
	{
		super(fName,lName,dob,ppsNum,phoneNum,salary,town,city,county, nationality,team, contract);
		this.workPermit = workPermit;
		if( workPermit.equals("") || workPermit == null)
		{
			throw new IllegalArgumentException();
		}
	}
	

	public String toString() 
	{
		return super.toString() + "WorkPermit:  " + workPermit + "\n";
	}
	
	public String toStringPlayers() 
	{
		return super.toString() + "WorkPermit:  " + " " + workPermit + " " + "\n";
	}


	public void setWorkPermit(String workPermit) {
		this.workPermit = workPermit;
	}
	
	}


