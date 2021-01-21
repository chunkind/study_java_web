package step07;

class WhiteBoardTest{
	public static void main(String[] args){
		// 1.WhiteBoard의 정보를 전부다 출력
		WhiteBoard wb = new WhiteBoard();
		wb.setInfo(10000.0, 250, 'w');
		wb.getInfo();

		//2. 7강의장에서 위의 Board를 사용하는 강사는
		//하승현 강사 입니다. 를 출력
		//이때 WhiteBoard 클래스에서 KostaEducation 클래스와
		//Has a Relation 관계가 되도록 코드를 추가 하세요.
		Education ke = new Education();
		ke.setInfo(7, "하승현", "JAVA");
		System.out.println(ke.getInfo());
		wb.setKosta(new Education());	// 여기서 주입이 이뤄진다.
		Education kosta=wb.getKosta();

		kosta.setInfo(7, "하승현", "자바");
		System.out.println(kosta.getclassNumber() + "강의장에서 위의 Board를 사용하는 강사는 " + kosta.getteacherName() + " 강사 입니다.");
	}
}