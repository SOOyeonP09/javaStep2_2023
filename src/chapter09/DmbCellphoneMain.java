package chapter09;

public class DmbCellphoneMain {

	public static void main(String[] args) {
		
		DmbCellphone dmbCellphone=new DmbCellphone("Java폰", "검정", 10);
		
		//Cellphone으로부터 상속받은 필드
		System.out.println("모델 : "+dmbCellphone.model);
		System.out.println("색상 : "+dmbCellphone.color);
		
		
		
		//DmbCellphone의 필드
		System.out.println("채널 : "+dmbCellphone.channel);
		
		
		//Cellphone의 메소드를 사용하여 전화통화 구현
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoice("뭐해?");
		dmbCellphone.sendVoice("수업중");
		dmbCellphone.receiveVoice("오키");
		dmbCellphone.hangUp();
		dmbCellphone.powerOff();
		
				
		//DmbCellphone의 메소드를 사용하여 채널을 바꾸기
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(15);
		dmbCellphone.turnOffDmb();
	}

}
