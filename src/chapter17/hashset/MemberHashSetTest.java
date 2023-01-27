package chapter17.hashset;

import chapter17.Member;
import chapter17.Member2;
import chapter17.linkedlist.MemberLinkedList;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// 순서 O,중복 O
		MemberHashSet memberHashSet = new MemberHashSet();

		// 팀원들의 정보
		Member2 memberKim = new Member2(1001, "김찬우");
		Member2 memberPark = new Member2(1002, "박범준");
		Member2 memberJung = new Member2(1003, "정세나");
		Member2 memberBeak = new Member2(1004, "백유기");
		Member2 memberPark2 = new Member2(1005, "박수연");
		Member2 memberKim2 = new Member2(1006, "김우태");
		// 회원가입
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberJung);
		memberHashSet.addMember(memberBeak);
		memberHashSet.addMember(memberPark2);
		memberHashSet.addMember(memberKim2);

		memberHashSet.showAllMember();
		//방법1
		//Member2 memberkim = new Member2(1006, "김우태");
		//방법2
		Member2 memberkim = new Member2(1006, "김진수");
		
		memberHashSet.addMember(memberKim);
		//memberHashSet.showAllMember();

	}
}
