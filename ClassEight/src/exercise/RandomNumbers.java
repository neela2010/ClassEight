package exercise;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomNumbers {

	public static void main(String[] args) {
	
		// How to get RandomNumbers
		
		//System.out.println(getRandomNumberInRange(100,999));
		
		Set<Integer> randomValue = new LinkedHashSet<Integer>();
		
		/*
		 * for (int i=0; i<=500; i++) {
		 * //System.out.println(getRandomNumberInRange(100,999));
		 * randomValue.add(getRandomNumberInRange(100,999)); }
		 */
		
		while(randomValue.size()!=500) {
			randomValue.add(getRandomNumberInRange(100,999));
		}
		System.out.println(randomValue);
		System.out.println(randomValue.size());

	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
