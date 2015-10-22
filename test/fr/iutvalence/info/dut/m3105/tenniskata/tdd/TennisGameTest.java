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
	public void thePlayerWhoServedMakeTheFirstPointTest()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.theServerScores();
		
		Assert.assertEquals(tennisGame.getScore(),"fifteen - love");
	}
	
	@Test
	public void thePlayerWhoSNotServingScoresTest()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.thePlayerWhoSNotServingScores();
		Assert.assertEquals(tennisGame.getScore(), "love - fifteen");
	}
	
}
