package polymorphism;

import org.springframework.stereotype.Component;

@Component("samsungTV")
public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체생성");
	}
	
	/*
	 * public void setSpeaker(Speaker speaker) {
	 * System.out.println("===> setSpeaker() 호출"); this.speaker = speaker; }
	 */
	/*
	 * public void setPrice(int price) { System.out.println("===> setPrice() 호출");
	 * this.price = price; }
	 */

	
	/*
	 * public SamsungTV(Speaker speaker, int price) {
	 * System.out.println("===> SamsungTV 객체생성(2)"); this.speaker = speaker;
	 * this.price = price; }
	 */
	

	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다. (가격 : "+ price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");

	}

	public void volumeUp() {
		//speaker.volumeUp();
		System.out.println("SonySpeaker--소리 올린다.");
	}

	public void volumeDown() {
		//speaker.volumeDown();
		System.out.println("SonySpeaker--소리 내린다.");
	}
}
