package springAOP;

public class Cat implements AnimalType {
	private String myName;

	public void sound() {//jointpoint
		System.out.println("Cat name-" + myName + " : " + "Meow!");
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

}//target
