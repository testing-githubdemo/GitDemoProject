package Interface;

public class implements_clsBank implements RBI_Bank,US_Bank,Brazil_Bank{

	public static void main(String[] args) {
  implements_clsBank im=new implements_clsBank();
  im.bike_loan();
  im.credit();
  im.debit();
  im.loan();
  im.mutual_fund();
  im.credit(100);
  System.out.println(x);
	}



	@Override
	public void bike_loan() {
		// TODO Auto-generated method stub
		System.out.println("Bike loan");
	}

	@Override
	public void personal_Loan() {
		// TODO Auto-generated method stub
		System.out.println("Presonl loan ");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan");
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Credit card");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Debit Card");
	}

	@Override
	public void credit(int a) {
		// TODO Auto-generated method stub
		System.out.println("Brazil_credit");
	}



	@Override
	public void mutual_fund() {
		// TODO Auto-generated method stub
		System.out.println("Brazil_Bank funds");
	}

}
