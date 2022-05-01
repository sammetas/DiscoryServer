package com.samm.DiscoryServer;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
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
}
