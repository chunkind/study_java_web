package step06;

class WhiteBoard{
	String company;
	double price;
	char color;
	boolean scratch;
	int size;  
	String material; 
	KostaEducation kosta;

	public String wirte(){
		return "잘써진다";
	}
	public String eraze(){
		return "잘 안지워진다";
	}
	public void setKosta(KostaEducation ko){
		kosta = ko;
	}
	public KostaEducation getKosta(){
		return kosta;
	}
	public void setDetails(String com, char co, boolean sc){
		company = com;
		color = co;
		scratch = sc;
	}
	public String getDetails(){
		return company + "\t" + price + "\t" + color + "\t" + scratch + "\t" + size +
				"\t" + material;
	}
}

class KostaEducation{
	String roomNumber;
	
	public void setRoomNumber(String number){
		roomNumber = number;
	}
	public String getRoomNumber(){
		return roomNumber;
	}
}

class WhiteBoardTest{
	public static void main(String[] args){
		WhiteBoard wb = new WhiteBoard();
		wb.setDetails("KOSTA", 'W', true);
		System.out.println(wb.getDetails());
	
		KostaEducation ke = new KostaEducation();
		ke.setRoomNumber("7 강의실");
		System.out.println(ke.getRoomNumber());
		ke.setRoomNumber("해당 화이트 보드는 '7 강의실'에 있습니다");
		String roomNum = ke.getRoomNumber();
		
		System.out.println("\n 위에서 출력된 WhiteBoard는 " + roomNum + " 에 있는 WhiteBoard는 입니다.");

		//ke 변수에 빈 객체를 초기화.
		ke = new KostaEducation();
		wb.setKosta(new KostaEducation());// 이 시점에서 WhiteBoard 와 KostaEducation이 관계성을 갖는다.
		
		ke = wb.getKosta();
		
		ke.setRoomNumber("7강의장");
		System.out.println("당신이 출력한 WhiteBoard는" + ke.getRoomNumber() + " 에 있는 Board입니다,");
	}
}