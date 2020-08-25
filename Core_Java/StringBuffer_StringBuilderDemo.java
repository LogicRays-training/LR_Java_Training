package fundamentals;

public class StringBuffer_StringBuilderDemo {

	public static void main(String[] args) {
	//Using String
		String fname,updated_name;
        fname="Nivedita";
        System.out.println("\n String before concatination:"+fname);
        updated_name=fname.concat(" LogicRays");
        System.out.println("\n String after concatination:"+fname);
        System.out.println("\n String after concatination:"+updated_name);
      
    	//Using StringBuilder
		StringBuilder fname1=new StringBuilder("Nivedita");
        System.out.println("\n String before appending:"+fname1);
        fname1.append(" LogicRays");
        System.out.println("\n String after concatination:"+fname1);
        
    	//Using StringBuffer
        StringBuffer fname2=new StringBuffer("Nivedita");
        System.out.println("\n String before appending:"+fname2);
        fname2.append(" LogicRays");
        System.out.println("\n String after concatination:"+fname2);


	}

}
