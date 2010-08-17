package secure;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

public class MD5 {

	
	public static void main(String[] args) throws Exception {
		
		String str = "123456";
		String md5result = DigestUtils.md5Hex(str);;
		System.out.println(md5result.toUpperCase());
		
		
	}
	static MessageDigest md5;
	static {
		try {
			md5 = MessageDigest.getInstance("md5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		javax.crypto.Mac.
	}
	public static String md5(String data) {
		return new String(Hex.encodeHex(md5.digest(data.getBytes()))).toUpperCase();
	}
}
