
public class GitTest {

	public static void main(String[] args) {
		
		//Added console logs, to see the sums!
		System.out.println(loneSum(1, 2, 3)); //expect: 6
		System.out.println(loneSum(3, 2, 3)); //expect: 2
		System.out.println(loneSum(3, 3, 3)); //expect: 0

	}
	
	public static int loneSum(int a, int b, int c) {
		
		//Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
		//it does not count towards the sum
		//If all values are the same, return 0
		  if (a == b && b == c){
			    return 0;
			  }//If either two are the same, return the last remaining
			  if (a == b){
			    return c;
			  }
			  if (b == c){
			    return a;
			  }
			  if (a == c){
			    return b;
			  }//Otherwise return all, as they should be different!
			  return a+b+c;
	}
}
