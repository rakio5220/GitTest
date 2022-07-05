package polymorphism;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("lg")
public class LgTV implements TV{
	@Resource(name="sony")
	private Speaker speaker;
	private int price;
	
	public LgTV() {
		System.out.println("===> LgTV객체 생성");
	}
	public LgTV(Speaker speaker, int price) {
		System.out.println("LgTV생성자");
		this.speaker=speaker;
		this.price=price;
		
	}
	
	public void powerOn() {
		 System.out.printf("LgTV---전원 켠다. 가격 : %d",price);
	 }
	 
	 public void powerOff() {
		 System.out.println("LgTV---전원 끈다.");
	 }
	 
	 public void volumeUp() {
		 //System.out.println("LgTV---소리 올린다.");
		 speaker.volumeUp();
	 }
	 
	 public void volumeDown() {
		// System.out.println("LgTV---소리 내린다.");
		 speaker.volumeDown();
	 }

}
