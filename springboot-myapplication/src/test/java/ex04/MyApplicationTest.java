package ex04;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import ex04.component.MyComponent;

/*
 * SpringBootApplication 메타 어노테이션
 * 
 * + @SpringBootConfiguration: cf) ex01, ex02
 * + @ComponentsScan: cf) ex04, 하부 패키지를 스캔한다.
 * + @EnableAutoConfiguration:
 * 		1. MVC, AOP, Security, JPA 등을 자동으로 설정한다.
 * 		2. 발견된 Starter Dependency(Library) 기반으로 설정(관례를 따르는 default 설정)
 * 		3. + application.prperties나 application.yml 안의 미세 설정 (필수)
 */
@SpringBootTest
public class MyApplicationTest {
	
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
