/*public class CardControllerSet1{
	
	//variables-instance
	String cardId;
	long cardNumber;
	String expiryDate;
	int CVV;
	String cardType;
}*/

	//methods

public class CardControllerSet1{


 	public static void main(String args[]){

		

	
		System.out.println("main method starts");

		CardSet1 c1 = new CardSet1();

		/*c1.setName = "xyz";
		c1.expiryDate = "dtf";
		c1.cardType = "master";
		c1.CVV = 43;
		c1.cardNumber = 367856785728l;*/

		
		c1.setCardId("xyz");
		c1.setExpiryDate("dtf");
		c1.setCardType("master");
		c1.setCVV(43);
		c1.setCardNumber(367856785728l);


		


		System.out.println(c1.cardNumber);
		System.out.println(c1.expiryDate);
		System.out.println(c1.CVV);
		System.out.println(c1.cardType);
		System.out.println(c1.cardId);
		

		System.out.println("============");

		CardSet1 c2 = new CardSet1();

		c2.setCardId("dfv");
		c2.setExpiryDate("lkh");
		c2.setCardType("visa");
		c2.setCVV(46);
		c2.setCardNumber(367848500l);
		

		System.out.println(c2.cardNumber);
		System.out.println(c2.expiryDate);
		System.out.println(c2.CVV);
		System.out.println(c2.cardType);
		System.out.println(c2.cardId); 

		System.out.println("main method ends");
		


	}
}
		
