package sales;

public class Main {

		public static void main(String[] args) {
			Sales  sales = new Sales("mario");
			Sales sales1 = new Sales("ciccio");
			Sales sales2 = new Sales("pasticcio");
			
			sales.print();
			sales1.print();
			sales2.print();
		}
}
