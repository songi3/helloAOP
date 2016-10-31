package springAOP;

public class Dog implements AnimalType {

	private String myName;

	public void sound() {//jointpoint
		System.out.println("Dog name-" + myName + " : " + "Bow Wow");
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

}//target
