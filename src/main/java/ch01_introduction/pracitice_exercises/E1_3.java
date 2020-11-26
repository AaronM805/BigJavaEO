package ch01_introduction.pracitice_exercises;

public class E1_3 {

	public long product() {
		long product = 1;
		
		for (int i = 1; i <= 10; i++) {
			product *= i;
		}
		return product;
	}
}
