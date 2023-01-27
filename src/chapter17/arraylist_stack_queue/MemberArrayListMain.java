package chapter17.arraylist_stack_queue;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		// 팀원들의 정보
		Member memberKim = new Member(1001, "김찬우");
		Member memberPark = new Member(1002, "박범준");
		Member memberJung = new Member(1003, "정세나");
		Member memberBeak = new Member(1004, "백유기");
		Member memberPark2 = new Member(1005, "박수연");
		Member memberKim2 = new Member(1006, "김우태");
		// 회원가입
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberJung);
		memberArrayList.addMember(memberBeak);
		memberArrayList.addMember(memberPark2);
		memberArrayList.addMember(memberKim2);

		memberArrayList.showAllMember();

		memberArrayList.removeMember(memberKim.getMemberId());
		//System.out.println(memberKim.getMemberName()+"님의 회원정보가 삭제되었습니다.");
		//System.out.println();
		memberArrayList.showAllMember();

	}

}
