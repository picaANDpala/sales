package sales;

public class Main {

		public static void main(String[] args) {
			Sales  sales = new Sales("mario");
			Sales sales1 = new Sales("ciccio");
			Sales sales2 = new Sales("tedesco");
			
			Sales team[] = new Sales[3];
			team[0] = sales;
			team[1] = sales1;
			team[2] = sales2;
			
			for(Sales s : team){
				s.print();
			}
		}
}
