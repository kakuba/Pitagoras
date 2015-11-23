package test;

import org.junit.Assert;

import java.util.List;

import org.junit.Test;

import main.Main;

public class PiatgorasTest {

	@Test
	public void shouldReturntThreeCorrectValueForSum1000() {
		//given
		//when
		List<Integer> abcList = Main.getThreePitagorasNumberWhicherSumIs(1000);
		int a = abcList.get(0);
		int b = abcList.get(1);
		int c = abcList.get(2);
		//then
		Assert.assertEquals(200, a);
		Assert.assertEquals(375, b);
		Assert.assertEquals(425, c);
	}
	@Test
	public void shouldReturntThreeCorrectValueForSum12() {
		//given
		//when
		List<Integer> abcList = Main.getThreePitagorasNumberWhicherSumIs(12);
		int a = abcList.get(0);
		int b = abcList.get(1);
		int c = abcList.get(2);
		//then
		Assert.assertEquals(3, a);
		Assert.assertEquals(4, b);
		Assert.assertEquals(5, c);
	}

}
