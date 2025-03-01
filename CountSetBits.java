
public class CountSetBits {
	static int countTotalSetBits(int n) {
		int count =0;
		for(int i =0; i<16;i++) {
			int blocksize = 1 << (i+1);
			int fullblock = (n+1)/blocksize;
			count += fullblock *(blocksize/2);
			
			int remainder = (n+1) % blocksize;
			
			if(remainder > blocksize/2) {
				count += remainder -(blocksize/2);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 15;
		int totalSetBits = countTotalSetBits(n);
		System.out.println("Total set bit of 1 to " + n + " is " +totalSetBits);		

	}

}
