package common;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringTest {
	
	@Test
	public void test() {
		String message = "test\r\n\n\n\r\n\r\n\r\ntest";
		System.out.println(message);
		message = message.replaceAll("[(\n)|(\r\n)]{2,}", "@");
		System.out.println(message);
		assertEquals(message, "test@test");
	}
}
