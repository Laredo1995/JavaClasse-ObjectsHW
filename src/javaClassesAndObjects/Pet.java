package javaClassesAndObjects;

public class Pet {
	private String name;
	private Integer age;
	private String location;
	private String type;


public Pet() {}

public Pet(String Name,Integer age,String location,String type) {
this.name=name;
this.age=age;
this.location=location;
this.type=type;
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public String getLocation() {
	return location;
}

public String getType() {
	return type;
}

public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age=age;
}
public void setLocation(String location) {
	this.location=location;
}

}