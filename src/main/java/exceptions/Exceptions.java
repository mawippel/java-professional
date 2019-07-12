package exceptions;

import java.time.DateTimeException;

import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Checked Exceptions: require try-catch. Extends Exception
 * Unchecked Exceptions: doesnt require try-catch. Extends RuntimeException
 */
public class Exceptions {

	private void multiCatch(Integer x) {
		try {
			if (x == 2) {
				throw new UnsupportedAudioFileException();
			} else {
				throw new DateTimeException("aaaahhhh");
			}
		} catch (UnsupportedAudioFileException | DateTimeException e) { // valid multicatch
//			e = new RuntimeException(); it's not valid, as the exception in a multicatch is effectvily final
		}
	}
	
}
