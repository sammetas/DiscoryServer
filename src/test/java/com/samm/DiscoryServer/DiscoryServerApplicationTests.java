package com.samm.DiscoryServer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DiscoryServerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void TestBranch2(){
		Assertions.assertThat(true);
		System.out.println("hello World!");
	}
	@Test
	void TestBranch2(){
		Assertions.assertThat(true);
		System.out.println("hello World!");
	}

	@Test
	void testExpectingTobeFailed(){
		System.out.println("Are you fail?");
	}
}
