package step03;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 7.
 * Person을 출력해보는 예제.
 */
class PersonAppTest{
	public static void main(String[] args){
		// Person 클래스의 기능을 여기서 불러다 쓸 것이다.
		Person p = new Person();
		System.out.println("======= Person의 정보를 출력합니다. =======");
		System.out.println(" ");
		p.getDetails();	//	; = 문장의 종료, calling(호출)
	}
}