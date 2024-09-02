package com.simple.basic.util.aop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.simple.basic.service.score.ScoreServiceImpl;

@Aspect //AOP클래스
@Component //이 클래스는 component-scan에 읽혀서 bean으로 생성됨

public class LogAdvice {
	
		public static final Logger log = LoggerFactory.getLogger(ScoreServiceImpl.class);
		//advice : 공통기능
		//point cut - 내가 적용할 메서드에 advice 부착하는 행위
		//맨앞 *는 모든 접근제어자에
		//맨 마지막 *(..)는 모든 메서드에
		//	@Before("execution(* com.simple.basic.controller.*Controller.*(..))")
//		@Before("execution(* com.simple.basic.service.score.*ScoreServiceImpl.*(..))")
		public void beforeLog() {
			System.out.println("---메서드 실행 전 동작---");
		}
		
//		@After("execution(* com.simple.basic.service.score.*ScoreServiceImpl.*(..))")
		public void afterLog() {
			System.out.println("---메서드 실행 후 동작---");
		}
		
//		@AfterThrowing(pointcut = "execution(* com.simple.basic.service.score.*ScoreServiceImpl.*(..))",
//								throwing = "e" //에러를 처리할 변수명
//								)
		public void exceptionLog(Exception e) {
			System.out.println("advice에러로그:" + e);
		}
		
		//@Around - after, before, afterThrowing 세가지를 결합해서 처리할 수 있게 해주는 annotation
		//규칙: 반환은 object으로 만들고, 매개변수로 실행시점을 결정지어줄 수 있는 proceedingJoinPoint를 선언한다
		@Around("execution(* com.simple.basic.service.score.*ScoreServiceImpl.*(..))")
		public Object arroundLog(ProceedingJoinPoint jp) {
			/*
			 * 메서드로 넘어오는 매개변수 확인가능
			 * 메서드 실행되는 target 확인 가능
			 * 이런 결과를 수집해서 전체 log로 찍어주거나 FileOutput을 이용해서 실행로그 출력을 해줄 수 있다.
			 * */
			
			Long start = System.currentTimeMillis();
			
			log.info("실행클래스:" + jp.getTarget() );
			log.info("실행메서드:" + jp.getSignature().toString() );
			log.info("매개변수:" + Arrays.toString(jp.getArgs()) );
			
			Object result = null;
			
			try {
				//before
				result = jp.proceed(); //타겟 메서드의 실행
				//after
				
				long end = System.currentTimeMillis();
				log.info( "실행시간:" + (end - start) * 0.001 );
				
				String path = "C:\\Users\\user\\Desktop\\course\\Spring\\spring_log\\오늘날짜_log.txt";
				BufferedWriter bos = new BufferedWriter( new FileWriter (path, true) );
				bos.write("실행클래스:" + jp.getTarget() + "\n" ); //파일을 쓴다
				bos.write("실행메서드:" + jp.getSignature().toString() + "\n" );
				bos.write("매개변수:" + Arrays.toString(jp.getArgs()) + "\n" );
				bos.write("실행시간:" + (end - start) * 0.001 );
				bos.flush();
				bos.close();
				
			} catch (Throwable e) {
				e.printStackTrace(); //해당 메서드에서 에러가 발생하면 이 친구가 로그를 같이 찍는다
			}
			return result;
			
		}
}
