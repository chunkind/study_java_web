import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;



public class IOProb1{
	public static void main(String[] args) throws Exception{
					BufferedReader br = new BufferedReader(new FileReader("src/data/score.txt"));
					String str = br.readLine();
					ArrayList<String> a1 = new ArrayList<String>();
					ArrayList<Integer> inA1 = new ArrayList<Integer>();
			
					do{
							String [ ] temp = str.split(" : ");
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
					System.out.println("모");
	}
	
}












