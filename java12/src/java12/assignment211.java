package java12;

public class assignment211 {

	public static void main(String[] args) {
		
		System.out.println();
//	    double[] val = new double[4];  // an array of double 
//        // cells initialized to 0.0
//		val[0] = 0.12;
//		val[1] = 1.43;
//		val[2] = 2.98;
//		
//		int j = 3;
//		
//		System.out.println("cell 3: " + val[ j   ] );
//		System.out.println("cell 2: " + val[ j-1 ] );
//		j = j-2;
//		System.out.println("cell 1: " + val[ j   ] );
//		
		
//			int[] val = {2, 4, 6, 8};
//			int[] twice;
//			
//			
//			System.out.println("Original: "+ val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
//			
//			for (int i = 0; i < val.length; i++) {
//				System.out.println(val[i] * (int)Math.pow(val[i], 1));
//			}
//			System.out.println();
//			
//			for (int j = 0; j < val.length; j++) {
//				System.out.println(val[j] * val[j]);
//			}
		
			
		int[] ar1 =  { -20, 19, 1, 5, -1, 27, 19, 5 } ;

	    ArrayOps operate = new ArrayOps();     // create an ArrayOps object
	    int biggest = operate.findMax( ar1 );  // call the findMax() method with the array
	    System.out.println("The maximum is: " + biggest );
		   
		   
		 int findMax( int[] x )   //  this method is called with.                     
		  {
		    int max = x[0];

		    for ( int index=0; index <x.length; index++ )
		      if ( x[index] > max )
		        max = x[index] ;

		    return max ;
		

	
		    
		    qwepoO1233
		
		    
			
		
		
//		final int P = 1300;
//		int[] val = {13, -4, 82, 17};
//		int[] twice;
//		
//		//System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
//		
//		pause(P);
//		System.out.println("Once upon a time");
//		pause(P);
//		System.out.println("There lived a dragon");
//		pause(P);
//		System.out.println("The dragon liked food");
//		pause(P);
//		System.out.println("He feasted on the souls of the living");
//		pause(P);
//		System.out.println("And devoured the flesh of beasts");
//		pause(P);
//		System.out.println("There could only be one dragon");
//		pause(P);
//		System.out.println("The others faltered to his wrath");
//		pause(P);
//		
//		
//		
//} // end main
//	
//	public static void pause(int a) {
//		try {
//			Thread.sleep(a);
//			} catch (Exception e) {
//				
//			}
//	} //end method
//	
	
	
	
}
	
	 
}
