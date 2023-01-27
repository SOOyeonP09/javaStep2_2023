package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		System.out.println("---------곰----------");
		Bear b=new Bear();
		System.out.println("특징 : "+b.woong);
		System.out.println("곰의 눈의 수 : "+b.getEye());
		System.out.println("곰의 다리의 수 : "+b.getLeg());
		
		System.out.println("---------사자---------");
		Lion l=new Lion();
		System.out.println("특징 : "+l.galgi);
		System.out.println("사자의 눈의 수 : "+l.getEye());
		System.out.println("사자의 다리 수 : "+l.getLeg());
		
		System.out.println("---------거미---------");
		Spider s=new Spider();
		System.out.println("특징 : "+s.web);
		System.out.println("거미의 눈의 수 : "+s.getEye());
		System.out.println("거미의 다리 수 : "+s.getLeg());
	}

}
