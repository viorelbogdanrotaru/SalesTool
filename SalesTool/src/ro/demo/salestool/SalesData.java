package ro.demo.salestool;

public class SalesData {

	int[] data = {0, 4, 9};
	
	public void displayData() {
		System.out.println("");
		for (int i : data) {
			System.out.println("Next value: " + i);
		}
	}
}
