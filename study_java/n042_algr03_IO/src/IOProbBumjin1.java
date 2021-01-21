import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
/*
 * score.txt 파일을 읽어서 
 * score.txt 파일로 출력하는데 
 * 이때 총점과 평균이 맨 아래에 이어 붙여서 출력이 되도록 로직을 작성 
 */


public class IOProbBumjin1{
	public static void main(String[] args) throws Exception{
					/*BufferedReader br = new BufferedReader(new FileReader("src/data/score.txt"));
					String str = br.readLine();
					ArrayList<String> a1 = new ArrayList<String>();
					ArrayList<Integer> inA1 = new ArrayList<Integer>();
			
					do{
							String [ ] temp = str.split(":");
							a1.add(temp[0]);
							inA1.add(Integer.parseInt(temp[1])); //100
							str = br.readLine();
					}while(str != null);
					
					int sum = 0;
					int avg = 0;
					for(int score : inA1){
						sum += score;
					}
					avg = sum/inA1.size();
					
					for(String name : a1){
						System.out.println(name + "의 점수는  "+ inA1+ "입니다" );
					}
					System.out.println("모든 점수의 총점은 "+ sum+ "입니다 " );
					System.out.println("모");*/
		String inputFile = "src/data/score.txt"; // 입력파일 경로
		String outputFile = "src/data/scoreResult.txt"; // 출력파일 경로
		String line = null; // 가져올 라인을 저장할 문자형 변수
		String[] splitLine = null; // 쪼갤 라인을 저장할 배열형 변수
		int total = 0; // 총점을 위한 변수
		
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		// 파일을 읽어올 기본스트림과 보조스트림을 선언해주고, 인자값으로 파일명을 입력합니다.
		PrintWriter pw = new PrintWriter(new FileWriter(outputFile, true), true);
		// 파일을 작성할 기본스트림과 보조스트림을 선언해주고, 인자값으로 파일명을 입력하는데,
		// 그 때, 기존의 파일의 내용을 손상시키지 않고, 덧붙여주기 위해서 2번째 인자값으로 true를 줍니다.
		
		while((line = br.readLine()) != null){ // br.readLine()으로 값이 존재하는지 체크하면서 라인에 읽은 줄을 입력.
			splitLine = line.split(":"); // 구분자로 : 을 갖고 한 문장을 쪼개서, 각 쪼갠 값을 String형 배열에 입력. 
			total += Integer.parseInt(splitLine[1]); // 배열의 가장 마지막에 저장된 부분인 인덱스 1의 값을 int 형 변환 후, total에 추가.
			pw.println(line); // 읽어온 line을 위에서 선언한 outputFile의 위치에 써준다.
		}
		pw.println("총점:"+total); // println의 안쪽에 있는 데이터를 읽어서 위와 같은 경로에 써준다.
		pw.println("평균:"+(double)total/5); // println의 안쪽에 있는 데이터를 읽어서 위와 같은 경로에 써준다.
	}
}












