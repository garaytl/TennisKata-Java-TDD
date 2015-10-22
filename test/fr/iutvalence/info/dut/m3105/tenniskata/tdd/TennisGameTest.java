package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void createATennisGameWithScoreNullTest()
	{
			TennisGame tennisGame = new TennisGame();
			Assert.assertEquals(tennisGame.getScore(),"love - all");
	}
	
	@Test
	public void thePlayerWhoServedScoresFirstTest()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.theServerScores();
		
		Assert.assertEquals(tennisGame.getScore(),"fifteen - love");
	}
	
	@Test
	public void thePlayerWhoSNotServingScoresFirstTest()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.theReceiverScores();
		Assert.assertEquals(tennisGame.getScore(), "love - fifteen");
	}
	
	@Test
	public void aPlayerEgalizesTest()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.theReceiverScores();
		tennisGame.theServerScores();
		Assert.assertEquals(tennisGame.getScore(), "fifteen - all");
	}
}
