import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ComplementaryPairs {

	 public int solution(int K, int[] A) {
		 int total = 0;
		 int index = 0;
		 Map <Integer, Integer> dict = new HashMap <Integer, Integer>();
		 for (Integer Value : A) {
			    if (dict.containsKey(Value)) {
	                dict.put(Value, dict.get(Value) + 1);
			    } 
			 else {
	                dict.put(Value, 1);
			    }
			}
 
			for(int i =index; i < dict.size(); i++) {
				Integer Value =(Integer) dict.keySet().toArray()[i];
				int secValue = (K -(Value));
				if(K==0 && Value ==-2147483648) {
					secValue = 0;
				}
				else if (dict.containsKey(secValue)) {			            
						total +=(dict.get(Value)+dict.get(secValue));
						dict.remove(Value);
						dict.remove(secValue);
			        }
					index++;
				}
			return total;
			}
	 

	public static void main(String[] args) {
//		int A[] = new int[30000];
		int A[] = {-2147483648, -2147483648};
//		Random random=new Random();
//		for(int i =0; i<30000; i++){
//			int randomNumber=(random.nextInt(1000+1000)-1000);
//			A[i] = randomNumber;
//		 }
//		System.out.println(-214748364+-214748364);
		ComplementaryPairs sol = new ComplementaryPairs();
		System.out.println("\n"+sol.solution (6, A));
	}

}