package StringRelatedChallenges;
public class countOfJewelInStones {
	public int countOfJewelsInStone(String jewels, String stones) {
	   if(jewels == null || stones == null || jewels.isEmpty() || stones.isEmpty() ) {
	     return 0;
	   }
	   char[] jewelType = jewels.toCharArray();
	   char[] stoneType = stones.toCharArray();
	   int count =0;
	   for(char c : jewelType) {
	     for(int i=0;i<stoneType.length;i++) {
	       if(c==stoneType[i]) {
		count++;
	       } 	
	     }
	   }
	   return count;
	}
		
	public static void main(String[] args) {
	  countOfJewelInStones obj = new countOfJewelInStones();
	  System.out.println(obj.countOfJewelsInStone("z", "ZZ"));
	}
}
