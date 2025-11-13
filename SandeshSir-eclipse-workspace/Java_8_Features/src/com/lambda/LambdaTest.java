package com.lambda;

interface Message {
	void sendMessage();
}
interface Gift{
	void sendGift(String giftname);
}
public class LambdaTest {
		public static void main(String[] args) {
		Message whatapp=new Message() {
			@Override
			public void sendMessage() {
				System.out.println("Good Morning from WhatsApp");
			}
		};
	whatapp.sendMessage();
		Message insta=()->System.out.println("Good Morning from Instagram");
		insta.sendMessage();
		
	Gift gift1=(giftname)->{System.out.println("Sending:"+giftname);
};
        gift1.sendGift("Teddy Bear");
}
}