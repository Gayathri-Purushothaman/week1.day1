package week1.day1;

public class Mobile {
	String mobileModel="S1234";
	float mobileWeight=23F;
	boolean isFullCharged=true;
	int mobileCost=15000;
	public void makeCall() {
		//mobileModel="S1234Local";
		System.out.println(mobileModel);
		
		System.out.println("Making call");
		
	}
	public void sendMsg() {
		System.out.println("Sending message");
	}
public static void main(String[] args)
{
	System.out.println("Calling main first");
	Mobile myMobile=new Mobile();
	myMobile.makeCall();
	myMobile.sendMsg();
	System.out.println(myMobile.mobileModel);
System.out.println(myMobile.mobileWeight);
System.out.println(myMobile.mobileCost);
System.out.println(myMobile.isFullCharged);
}

}

