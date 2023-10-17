/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Java program to encrypt and decrypt a phrase using two similar approaches, the Caesar Cipher and Bellaso Cipher.
 * Due: 10/16/2023
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		boolean check = true;
		for(int i = 0; i < plainText.length(); i++)
		{
			if (plainText.charAt(i) > LOWER_RANGE && plainText.charAt(i) < UPPER_RANGE)
			{
				check = true;
			}
			else if (plainText.charAt(i) < LOWER_RANGE || plainText.charAt(i) > UPPER_RANGE)
			{
				check = false;
				return check;
			}
		}
		return check;
		
		//else
		//{
		//	return false;
		//}
		//throw new RuntimeException("method not implemented");
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		String encryption = new String();
		char offsetChar;
		for(int i = 0; i < plainText.length(); i++)
		{
			if(plainText.charAt(i) < LOWER_RANGE || plainText.charAt(i) > UPPER_RANGE)
			{
				return "The selected string is not in bounds, Try again.";
			}
			offsetChar = (char)(plainText.charAt(i) + key);
			while(offsetChar < LOWER_RANGE || offsetChar > UPPER_RANGE)
			{
				
				offsetChar -= RANGE;
			}
			encryption += offsetChar;
		}
		return encryption;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		String encryption = new String();
		int sum = 0;
		int j = 0;
		for(int i = 0; i < plainText.length(); i++)
		{
			if(i < bellasoStr.length())
			{
				sum = plainText.charAt(i) + bellasoStr.charAt(i);
				while (sum < LOWER_RANGE || sum > UPPER_RANGE)
				{
					sum -= RANGE;
				}
				encryption += (char)sum;
			}
			else if(i >= bellasoStr.length())
			{
				if(j == bellasoStr.length())
				{
					j = 0;
				}
				int sum2 = plainText.charAt(i) + bellasoStr.charAt(j);
				while (sum2 < LOWER_RANGE || sum2 > UPPER_RANGE)
				{
					sum2 -= RANGE;
				}
				encryption += (char)sum2;
				j++;
			}
		}
		return encryption;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		String decryption = new String();
		char offsetChar;
		for(int i = 0; i < encryptedText.length(); i++)
		{
			offsetChar = (char)(encryptedText.charAt(i) - key);
			while (offsetChar < LOWER_RANGE || offsetChar > UPPER_RANGE)
			{
				offsetChar += RANGE;
			}
			decryption += offsetChar;
		}
		return decryption;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		String decryption = new String();
		int reverse = 0;
		int j = 0;
		for(int i = 0; i < encryptedText.length(); i++)
		{
			if(i < bellasoStr.length())
			{
				reverse = encryptedText.charAt(i) + 64;
				while (reverse < UPPER_RANGE)
				{
					reverse += RANGE;
				}
				reverse -= bellasoStr.charAt(i);
				while (reverse < LOWER_RANGE || reverse > UPPER_RANGE)
				{
					reverse += RANGE;
				}
				decryption += (char)reverse;
			}
			else if(i >= bellasoStr.length())
			{
				if (j == bellasoStr.length())
				{
					j = 0;
				}
				int reverse2 = encryptedText.charAt(i) + 64;
				while (reverse2 < UPPER_RANGE)
				{
					reverse2 += RANGE;
				}
				reverse2 -= bellasoStr.charAt(j);
				while (reverse2 < LOWER_RANGE || reverse2 > UPPER_RANGE)
				{
					reverse2 += RANGE;
				}
				decryption += (char)reverse2;
				j++;
			}
		}
		return decryption;
	}
}
