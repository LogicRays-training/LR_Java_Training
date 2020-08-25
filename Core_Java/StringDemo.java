package fundamentals;

public class StringDemo {

	public static void main(String[] args) {
		String fname,updated_name;
        fname="Nivedita";
        System.out.println("\n String before concatination:"+fname);
        updated_name=fname.concat(" LogicRays");
        System.out.println("\n String after concatination:"+fname);
        System.out.println("\n String after concatination:"+updated_name);
        
        //method of String class
        //charAt()
        System.out.println("\n Character at 3 index from Nivedita:"+fname.charAt(3));
	    
        //compareTo()
        String s1="hello";  
        String s2="hello";  
        String s3="meklo";  
        String s4="hemlo";  
        String s5="flag";  
        System.out.println(s1.compareTo(s2));//0 because both are equal  
        System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
        System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
        System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
	
	}

}
