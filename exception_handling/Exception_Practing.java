//Exception handling practice
package exception_handling;

import java.io.FileReader;
import java.lang.*;

public class Exception_Practing {

	public static void main(String args[])
	{
		try {
			FileReader ob=new FileReader("ada.tss");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
