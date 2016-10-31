package springAOP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"springAOPBeans/animal.xml");

		PetOwner person = (PetOwner) context.getBean("petOwner"); // 레퍼런스 얻어옴
		person.paly();

		context.close();

	}
}
