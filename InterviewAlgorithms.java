
public class InterviewAlgorithms {

	public static void main(String[] args) {
		int stockMarket[] = {-10,-100,-1000,-1400};
		maximumProfit(stockMarket);
		stringReversal("testing string reversal");
		stringReversalHard("testing string reversal");
		alternativeStringReversal("testing string reversal");
		fizzBuzz();
		int integerArray[] = {2,4,1,7,5,8,10,25,-10,26};
		maximumSumSubArray(integerArray);
	}
	
	/* Algorithm to solve the Buyer Seller problem
	 * O(n) solution
	 */
	public static void maximumProfit(int array[]){
		
		int buyIndex = 0;
		int sellIndex = 0;
		int cheapestIndex = 0;
		int profit = 0;
		
		for( int i = 0; i < array.length; i++ ){
			if( array[i] < array[cheapestIndex] ){
				cheapestIndex = i;
			}
			if( array[i] - array[cheapestIndex] > profit ){
				buyIndex = cheapestIndex;
				sellIndex = i;
				profit = array[i] - array[cheapestIndex];
			}
		}
		System.out.println("Buy at: " + array[buyIndex] + " index: " + buyIndex);
		System.out.println("Sell at: " + array[sellIndex] + " index: " + sellIndex);
		System.out.println("Profit: " + profit);
	}
	
	/*
	 * String reversal
	 */
	public static void stringReversal(String input){
		
		System.out.println(new StringBuilder(input).reverse().toString());
	}
	
	/*
	 * String reversal without StringBuilder or similar "cheats"
	 */
	public static void stringReversalHard(String input){
		
		String result = "";
		
		for( int i = input.length()-1; i >= 0; i-- ){
			result = result + input.charAt(i);
		}
		System.out.println(result);
	}
	
	/*
	 * String reversal while keeping the words themselves in regular order
	 */
	public static void alternativeStringReversal(String sentence){
		StringBuilder reversedSentence = new StringBuilder();
		String[] temp = sentence.split(" ");

		for (int i = temp.length - 1 ; i >= 0; i--){
			reversedSentence.append(temp[i]);
			reversedSentence.append(" ");
		}
		System.out.println(reversedSentence);
	}
	/*
	 * Implementation of the fizzBuzz problem
	 */
	public static void fizzBuzz(){
		
		String a =  "fizz"; 
		String b = "Buzz";
			
		for (int i = 1; i <= 100; i++){
			if (i % 15 == 0){
				System.out.println(a + b);
			}
			else if (i % 3  == 0 ){
				System.out.println(a);
			}
			else if (i % 5== 0){
				System.out.println(b);
			}else{
				System.out.println(i);
			}
		}
	}
	
	/*
	 * Algorithm finding the maximum subarray
	 * O(n)
	 */
	public static void maximumSumSubArray(int[] array) {
		
		int currentSum = array[0];
		int maxSubArray = array[0];
		
		for(int i=1;i<array.length;i++){
			currentSum = Math.max(currentSum + array[i], array[i]);
			maxSubArray = Math.max(maxSubArray, currentSum);
		}
		System.out.println("Maximum Sum of a SubArray :" + maxSubArray);
	}
}
