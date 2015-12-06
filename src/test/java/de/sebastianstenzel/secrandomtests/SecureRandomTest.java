package de.sebastianstenzel.secrandomtests;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.junit.Test;

public class SecureRandomTest {

	@Test(timeout = 1000)
	public void testSecureRandomNumberGeneration() throws NoSuchAlgorithmException {
		byte[] bytes = new byte[10000];
		SecureRandom.getInstanceStrong().nextBytes(bytes);
	}

}
