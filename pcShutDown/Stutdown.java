package pcShutDown;
import java.io.*;
public class Stutdown {

	public static void main(String[] args) throws Exception {
		Runtime rn=Runtime.getRuntime();
		Process ps=rn.exec("shutdown -s -t 0");
		System.exit(0);
	}

}
