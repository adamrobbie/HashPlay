// Only call in the necassary libraries.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HashTest {
	public static void main(String[] args) throws IOException	{
		//initialize our methods class
		HashTestMethods hashT = new HashTestMethods();
		//Have user input a string of characters
	      String key = "abcdefghijklmnopqrstuvwxyz1234567890";
	      
	      System.out.println("Key: " + key);
	      System.out.println(" 1. RS-Hash:   " + hashT.RSHash(key));
	      System.out.println(" 2. JS-Hash:   " + hashT.JSHash(key));
	      System.out.println(" 3. PJW-Hash:  " + hashT.PJWHash(key));
	      System.out.println(" 4. ELF-Hash:  " + hashT.ELFHash(key));
	      System.out.println(" 5. BKDR-Hash: " + hashT.BKDRHash(key));
	      System.out.println(" 6. SDBM-Hash: " + hashT.SDBMHash(key));
	      System.out.println(" 7. DJB-Hash:  " + hashT.DJBHash(key));
	      System.out.println("To quit press Enter");

	      BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in));
	      stdin.readLine();
	}

}
