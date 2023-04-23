package Exception_Handlings;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
//import java.util.jar.JarFile;

public class checked {

	public static void main(String[] args) throws IOException {
		
        try {
        	File f = new File("c:/doc.resume");
    		System.out.println(f);
        }catch(NoSuchElementException Ns) {
        	System.out.println("checked excetions..");
        	Ns.fillInStackTrace();
        }finally {
        	System.out.println("Exception_Handlings..");
        }
	}
}
