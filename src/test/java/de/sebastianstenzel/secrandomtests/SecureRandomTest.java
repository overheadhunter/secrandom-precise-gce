package de.sebastianstenzel.secrandomtests;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.junit.Test;

public class SecureRandomTest {

	@Test(timeout = 10000)
	public void testSecureRandomNumberGeneration() throws NoSuchAlgorithmException {
		// 1000 secure random bytes in 10 seconds
		byte[] bytes = new byte[1000];
		SecureRandom.getInstanceStrong().nextBytes(bytes);
	}

}
