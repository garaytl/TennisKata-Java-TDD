package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	private String score;

	
	public String getScore() {
		return this.score;
	}

	public TennisGame() {
		this.score = "love - all";
	}

	public void theServerScores() {
		this.score = "fifteen - love";	
	}

	public void thePlayerWhoSNotServingScores() {
		this.score = "love - fifteen";
		
	}

}
