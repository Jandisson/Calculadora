package com.jandisson;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testaSoma()
	{
		Calculadora calculadora = new Calculadora();
		assertEquals(calculadora.soma(15,30),45,0);

	}

}
