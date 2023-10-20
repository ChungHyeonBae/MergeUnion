package project3;


public class PhoneS3{
	
	
	public String model;
	public String color;
	public String condition;
	public int channel;
	
	public PhoneS3(String model,String color,String condition,int channel) {
		this.model = model;
		this.color = color;
		this.condition = condition;
		this.channel = channel;
		
	}
	
	
	public void dmbOff() {
		System.out.println("전원이 꺼져있어 DMB 방송을 켤수가 없습니다.");
	}
	
	public void internetOff() {
		System.out.println("전원이 꺼져있어 인터넷 사용이 불가능합니다.");
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void hangon() {
		System.out.println("전화를 받습니다.");
	}
	
	public void me(String voice) {
		System.out.println("나 : " + voice);
	}
	
	public void internetOn() {
		System.out.println("인터넷을 켭니다.");
	}
	
	public void webtoonOn() {
		System.out.println("웹툰 앱을 켭니다.");
	}
	
	public void you(String voice2) {
		System.out.println("상대방 : " + voice2);
	}
	
	public void me1(String voice3) {
		System.out.println("나 : " + voice3);
	}
	
	public void hangout() {
		System.out.println("전화를 끊습니다.");
	}
}
