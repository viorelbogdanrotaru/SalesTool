package ro.demo.salestool;

/**
 * First version on Sales Tool.
 * 
 * @author viorel.rotaru
 *
 */
public class Main {

	public static void main(String[] args) {

		SalesData sd = new SalesData();
		System.out.println("SalesData created: " + sd);

		
		System.out.println("Hello world !");
		System.out.println("Hello world TWO !");
		
		sd.displayData();
	}

}
