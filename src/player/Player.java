package player;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public  class Player implements Serializable {
	
	private String fName;
	private String lName;
	private String dob;
	private String ppsNum;
	private String phoneNum;
	private double salary;
	private String town;
	private String city;
	private String county;
	private String nationality;
	private String team;
	private int contract;
	

	
	
	


	public Player(String fName, String lName, String dob, String ppsNum, String phoneNum, String salary, String town,
			String city, String county, String nationality, String team, String contract) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.ppsNum = ppsNum;
		this.phoneNum = phoneNum;
		
		this.town = town;
		this.city = city;
		this.county = county;
		this.nationality = nationality;
		this.team = team;
		
		if(fName.equals("") || fName == null || lName.equals("") || lName == null || dob.equals("")|| dob == null 
				|| ppsNum.equals("") || ppsNum == null || phoneNum.equals("") || phoneNum == null || salary == "" || salary == null || 
				town.equals("")|| town == null || city.equals("") || city == null || county.equals("") || county == null || nationality.equals("") || nationality == null|| 
				team.equals("") || team == null || contract  == "" )
			
			throw new IllegalArgumentException( "Must Fill in Details Before You Add Player");
		this.salary = Double.parseDouble(salary);
		this.contract = Integer.parseInt(contract);
		
		}
	





	public String getTeam() {
		return team;
	}






	public void setTeam(String team) {
		this.team = team;
	}

	public int getContract() {
		return contract;
	}

	public void setContract(int contract) {
		this.contract = contract;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPpsNum() {
		return ppsNum;
	}

	public void setPpsNum(String ppsNum) {
		this.ppsNum = ppsNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}





	public String getCounty() {
		return county;
	}





	public void setCounty(String county) {
		this.county = county;
	}





	public String getNationality() {
		return nationality;
	}





	public void setNationality(String nationality) {
		this.nationality = nationality;
	}





	@Override
	public String toString() 
	{
		return "Player Name: " + fName +  "\n" + "Surname:  " + lName + "\n" + "D.O.B: " + dob + "\n" + "PPS Num:  " + ppsNum + "\n"+ "phone Number:  "
				+ phoneNum + "\n" + "Salary:  " + salary + "\n" + "Town:  " + town + "\n" +  "City:  " + city + "\n" + "County:  " + county
				+ "\n" + "Nationality:  " + nationality + "\n" + "Team: " + team + "\n" + "Contract: " + contract + "\n";
	}
	
	public String toStringPlayers()
	{
		
		return  
				"Name:  " + fName + " " + lName +  "    " + "D.O.B   " + dob +  "  "  + "PPS Number   " +ppsNum  + "  "+ "Phone Number   " + phoneNum + "  "  
				+ "Salary   " + salary +  "           " + "Address   " + town +" "  + city  + " " + county +" " +    nationality  +"     " + "Team   " + team +  "  "+"Contract   " + contract ;
	}

	
	

	
	




}

