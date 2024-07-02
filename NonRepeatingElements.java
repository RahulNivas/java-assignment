public class NonRepeatingElements {

	public static void findNonRepeating(int[] arr) {
		int xor= 0;
		for(int num: arr) {
			xor ^=num;
			
		}
		int setBit =xor & -xor;
		int x=0, y=0;
		
		for(int num : arr) {
			if((num & setBit)==0) {
				x ^=num;
			} else {
				y ^=num;
			}
		}
		
		System.out.println("The non repeating element are: " + x + " and " +y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,1,2,1,2,3,4,5};
		findNonRepeating(arr);
	}

}
