package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	private String score;
	
	private int serverScore;
	private int receiverScore;
	

	
	public String getScore() {
		switch (this.serverScore) {
        case 0: 
        	if (this.receiverScore == 1)
        		this.score = "love - fifteen";
        	else
        		this.score = "fifteen - all";
        	break;
        case 1:
            if (this.receiverScore == 0)
            	this.score = "fifteen - love";
            else 
            	this.score = "fifteen - all";
            break;
           }
		 return this.score;	
	}

	public TennisGame() {
		this.score = "love - all";
		this.serverScore = 0;
		this.receiverScore = 0;
	}

	public void theServerScores() {
		this.serverScore += 1; //"fifteen - love";
	}

	public void theReceiverScores() {
		this.receiverScore += 1; //"love - fifteen";
		
	}

}
