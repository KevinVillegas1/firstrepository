import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Create a JUnit test file, named CryptoManagerTestStudent to test every public method of the CryptoManager class, except setUp and tearDown methods.
 * Due: 10/16/2023
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class CryptoManagerTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("COMPUTER"));
		assertTrue(CryptoManager.isStringInBounds("\"COMPUTING IS GREAT\""));
		assertFalse(CryptoManager.isStringInBounds("computer"));
		assertFalse(CryptoManager.isStringInBounds("|COMPUTER"));
		assertFalse(CryptoManager.isStringInBounds("\"THIS EXPERIMENT SHOULD NOT WORK BECAUSE | IS NOT IN RANGE\""));
	}

	@Test
	void testCaesarEncryption() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("apple", 5));
		assertEquals("HIJ", CryptoManager.caesarEncryption("DEF", 4));
		assertEquals("*+,", CryptoManager.caesarEncryption("FGH", 100));
		assertEquals("]([[*_$])", CryptoManager.caesarEncryption("GREETINGS", 150));
		assertEquals("FYQFSJNFOU", CryptoManager.caesarEncryption("EXPERIMENT", 1));
		assertEquals("GJLNS%FSTYMJW%J]UJWNRJSY", CryptoManager.caesarEncryption("BEGIN ANOTHER EXPERIMENT", 5));
	}

	@Test
	void testBellasoEncryption() {
		assertEquals("Y U$]N&$]Z", CryptoManager.bellasoEncryption("EXPERIMENT", "THE_KEY_OF_THE_CIPHER_IS_LONGER"));
		assertEquals("OSUU-)VV_PVF^'", CryptoManager.bellasoEncryption("HAPPY HOLIDAYS", "GREETINGS"));
		assertEquals("ETTY#4F R#UU'4J*ST_Y\"YS&", CryptoManager.bellasoEncryption("BEGIN ANOTHER EXPERIMENT", "COMPUTER"));
	}

	@Test
	void testCaesarDecryption() {
		assertEquals("EXPERIMENT", CryptoManager.caesarDecryption("GZRGTKOGPV", 2));
		assertEquals("EXPERIMENT ANOTHER PHRASE", CryptoManager.caesarDecryption("M XMZQUMV\\(IVW\\PMZ(XPZI[M", 200));
		assertEquals("GREETINGS EARTH", CryptoManager.caesarDecryption("%0##2',%1>#_02&", 350));
		assertEquals("BEGIN ANOTHER EXPERIMENT", CryptoManager.caesarDecryption("HKMOT&GTUZNKX&K^VKXOSKTZ", 6));
	}

	@Test
	void testBellasoDecryption() {
		assertEquals("EXPERIMENT", CryptoManager.bellasoDecryption("H! MW[,N!3", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("HAPPY HOLIDAYS", CryptoManager.bellasoDecryption("OSUU-)VV_PVF^'", "GREETINGS"));
		assertEquals("BEGIN ANOTHER EXPERIMENT", CryptoManager.bellasoDecryption("ETTY#4F R#UU'4J*ST_Y\"YS&", "COMPUTER"));
	}

}
