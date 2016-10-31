package springAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {

	@Pointcut("execution(void springAOP.*.sound())") //expression
	
	private void selectSound(){//signature //xml 파일 안에 id에 해당
		
	}
	
	//런타임 시에 Before Advice가 실행 -> logging, security, tansaction을 본 애플리케이션의 기능에 영향을 주지않고 실행할수 있다
	//코드 깔끔 , 재사용성 높아짐
	
	@Before("selectSound()")
	public void aboutToSound() {
		System.out.println("before : about to sound");
	}// advice
}// aspect
