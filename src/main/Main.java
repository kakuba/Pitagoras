package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		List<Integer> abcList = getThreePitagorasNumberWhicherSumIs(1000);
		System.out.printf("Those numbers are: a=%d, b=%d, c=%d\n", abcList.get(0), abcList.get(1), abcList.get(2));
	}
	public static List<Integer> getThreePitagorasNumberWhicherSumIs(int sum) {
		List<Integer> abcList = new ArrayList<>();
		Integer a;
		Integer b;
		Integer c;
		for(a = 1; a <= sum/3;a++){
			for (b = a + 1;b <= sum/2;b++){
				c = sum - a - b;
				if(c > 0 && (a*a + b*b == c*c)){
					abcList.add(a);
					abcList.add(b);
					abcList.add(c);
				}
			}
		}
		return abcList;
	}
}
