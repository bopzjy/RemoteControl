package TestClient;
import java.io.*;
import java.net.*;
import MyPackage.Package;
public class testClient {

	public final static String address = "127.0.0.1";
	public final static int port = 8998;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			String userin;
			Socket connection = new Socket(address, port);			
	
			Package mypack = new Package(connection);
			mypack.setPackageType(Package.UPDATEFILE);
			mypack.sendPackageType();
			mypack.UpdateFile("d:\\my.txt");
			System.out.println("I am a test!!");
			if(mypack.receivePackageType()==Package.TransOK)
            	System.out.println("File has been sended!!");
            else
            	System.out.println(mypack.getPackageType());
			connection.close();			
		} catch (IOException ioe) {
			// TODO: handle exception
			System.out.println("IOException: " + ioe);
		}
		
		
	}
}
