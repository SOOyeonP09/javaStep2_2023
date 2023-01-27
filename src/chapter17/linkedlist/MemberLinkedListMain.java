package chapter17.linkedlist;

import chapter17.Member;
import chapter17.Member2;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		// 순서 O,중복 O
		MemberLinkedList memberLinkedList = new MemberLinkedList();

		// 팀원들의 정보
		Member memberKim = new Member(1001, "김찬우");
		Member memberPark = new Member(1002, "박범준");
		Member memberJung = new Member(1003, "정세나");
		Member memberBeak = new Member(1004, "백유기");
		Member memberPark2 = new Member(1005, "박수연");
		Member memberKim2 = new Member(1006, "김우태");
		// 회원가입
		memberLinkedList.addMember(memberKim);
		memberLinkedList.addMember(memberPark);
		memberLinkedList.addMember(memberJung);
		memberLinkedList.addMember(memberBeak);
		memberLinkedList.addMember(memberPark2);
		memberLinkedList.addMember(memberKim2);

		memberLinkedList.showAllMember();
		Member memberkim = new Member(1006, "김우태");

		memberLinkedList.addMember(memberKim);
		memberLinkedList.showAllMember();

	}

}
