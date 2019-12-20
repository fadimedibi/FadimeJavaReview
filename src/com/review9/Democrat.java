package com.review9;

public class Democrat {
	/*	Create three classes: Elections, Republican, Democratic
	Republican has some variables: voterName, nominee, totalVotes, totalContributions
	Democratic has some variables: voterName, nominee, totalVotes, totalContributions
	Both classes have a method called vote and a method called contribute which takes the amount as parameter.
	In the Elections class you create voters from each party, you set the voter name, and then you make him vote.
	 In the vote method, you print: voterName voted for nominee and also you increase the totalVotes. Some of the voters may want to contribute for their party. They call the method contribute and specify the amount of money they want to contribute. It will be added to the amount of totalContributions.
	At the end you should print the number of votes for each party and check who has more votes is the winner.
	Note: Nominee is the president candidate for each party.
	*/
	String voterName;
	static String nominee="Mrs.Brown";
	static int totalVotes;
	static int totalContributions;
	
	
	public void vote() {
		totalVotes++;
		System.out.print(voterName+ " voted for "+nominee);
	}
	public void contribute(int amount) {
		System.out.println(" and "+voterName+" is donated $ "+amount+" to "+nominee+" for elections." );
		totalContributions+=amount;
		
	}
	
	
}
