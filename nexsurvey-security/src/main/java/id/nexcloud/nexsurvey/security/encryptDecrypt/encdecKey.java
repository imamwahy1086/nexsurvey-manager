package id.nexcloud.nexsurvey.security.encryptDecrypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class encdecKey {
     public static String encrypt(String value){
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("nexsoft");        
        String encryptedText = encryptor.encrypt(value);
        System.out.println("Encrypted text is: " + encryptedText);

        return encryptedText;
    }
    public static String dencrypt(String a){
    	String decryptedText = "";
    	try {
        StandardPBEStringEncryptor decryptor = new StandardPBEStringEncryptor();
        decryptor.setPassword("nexsoft");  
        a = a.replace("ENC-", "");
        decryptedText = decryptor.decrypt(a);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return decryptedText;        
    }

}
