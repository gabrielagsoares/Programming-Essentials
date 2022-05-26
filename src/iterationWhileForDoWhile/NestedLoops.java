package iterationWhileForDoWhile;

public class NestedLoops {

	public static void main(String[] args) {

		for (int hours = 0; hours < 24; hours++) { // outer loop is slowest
			for (int minutes = 0; minutes < 60; minutes++) {
				System.out.println(hours + ":" + minutes);
			}
		}
	}
}
