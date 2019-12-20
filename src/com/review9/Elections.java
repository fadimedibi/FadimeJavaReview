package com.review9;

public class Elections {
	/*	Create three classes: Elections, Republican, Democratic
	Republican has some variables: voterName, nominee, totalVotes, totalContributions
	Democratic has some variables: voterName, nominee, totalVotes, totalContributions
	Both classes have a method called vote and a method called contribute which takes the amount as parameter.
	In the Elections class you create voters from each party, you set the voter name, and then you make him vote. In the vote method, you print: voterName voted for nominee and also you increase the totalVotes. Some of the voters may want to contribute for their party. They call the method contribute and specify the amount of money they want to contribute. It will be added to the amount of totalContributions.
	At the end you should print the number of votes for each party and check who has more votes is the winner.
	Note: Nominee is the president candidate for each party.
	*/
		
	public static void main(String[] args) {
		Democrat d1=new Democrat();
	d1.voterName="Zeynep Dibi";
	d1.vote();
	d1.contribute(500);

	Democrat d2=new Democrat();
	d2.voterName="Ferhat Dibi";
	d2.vote();
	d2.contribute(1500);

	Democrat d3=new Democrat();
	d3.voterName="Sumeyye Dibi";
	d3.vote();
	d3.contribute(0);

	Republican r1=new Republican();
	r1.voterName="Murat Dibi";
	r1.vote();
	r1.contribute(1000);
	
	Republican r2=new Republican();
	r1.voterName="Fadime Dibi";
	r1.vote();
	r1.contribute(750);
	
	Republican r3=new Republican();
	r3.voterName="Mysterious Guy";
	r3.vote();
	r3.contribute(750);
	System.out.println();
	
	System.out.println("Total votes for Democrat Party: "+Democrat.totalVotes+ " and total donations for "+Democrat.nominee+ " is $ "+Democrat.totalContributions );
	System.out.println("Total votes for Republican Party: "+Republican.totalVotes+ " and total donations for "+Republican.nominee+ " is $ "+Republican.totalContributions );
	
	if(Democrat.totalVotes>Republican.totalVotes) {
		System.out.println("Democrat Party nominee, "+Democrat.nominee+" , won the elections of November 2019!Congratulations!");
	}else if(Democrat.totalVotes<Republican.totalVotes){
		System.out.println("Republican Party nominee, "+Republican.nominee+" , won the elections of November 2019!Congratulations!");
		
	}else {
		System.out.println("Since the votes are equal, reelection will take place in a later date!Just kidding!!!Let the best man win!:))");
	}
	}
	
	
	
}
