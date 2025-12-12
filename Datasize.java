
public class Datasize {
	public static void main(String args[]) {
				
		
//		Wrapper class  
//		Byte , Short , Integer , Float, Double , Character , Long , Boolean
		System.out.println("*The size of non-primitive datatypes in bytes as follows: ");
		System.out.println(" ");
		System.out.println("Size of Byte is: " + Byte.BYTES +" byte");
		System.out.println("Size of Short is: " +Short.BYTES+" byte");
		System.out.println("Size of Integer is: " +Integer.BYTES+" byte");
		System.out.println("Size of Float is: " +Float.BYTES+" byte");
		System.out.println("Size of Double is: " +Double.BYTES+" byte");
		System.out.println("Size of Long is: " +Long.BYTES+" byte");
		System.out.println("Size of Character is: " +Character.BYTES+" byte");
		System.out.println("The Boolean not found");
		System.out.println(" ");
		
		System.out.println("*The size of non-primitive datatypes in bits as follows:");
		System.out.println(" ");
		System.out.println("Byte size in bits: "+ Byte.SIZE+"bits");
		System.out.println("Short size in bits: "+ Short.SIZE+"bits");
		System.out.println("Integer size in bits: "+ Integer.SIZE+"bits");
		System.out.println("Float size in bits: "+ Float.SIZE+"bits");
		System.out.println("Double size in bits: "+ Double.SIZE+"bits");
		System.out.println("Long size in bits: "+ Long.SIZE+"bits");
		System.out.println("Character size in bits: "+ Character.SIZE+"bits");
		System.out.println("Boolean size not found!!");
		
		// Now lets find the range of non-primitive data types.
		System.out.println("");
		System.out.println("*The range of non-primitive data types is as follows:");
		System.out.println("");
		System.out.println("Byte range: "+ Byte.MIN_VALUE+ " to " + Byte.MAX_VALUE);
		System.out.println("Short range: "+ Short.MIN_VALUE+ " to " + Short.MAX_VALUE);
		System.out.println("Integer range: "+ Integer.MIN_VALUE+ " to " + Integer.MAX_VALUE);
		System.out.println("Float range: "+ Float.MIN_VALUE+ " to " + Float.MAX_VALUE);
		System.out.println("Double range: "+ Double.MIN_VALUE+ " to " + Double.MAX_VALUE);
		System.out.println("Long range: "+ Long.MIN_VALUE+ " to " + Long.MAX_VALUE);
		System.out.println("Character range: "+(int)Character.MIN_VALUE+ "to" + (int)Character.MAX_VALUE);
		System.out.println("Boolean not found");
		

		
	
		
	}

}
