package javaClassesAndObjects;

public class Tea {
	private Integer numOfTeaBags;
	private Integer amountOfWater;
	private String sugar;
	


public Tea() {} 

public Tea(Integer numOfTeaBags,Integer amountOfWater,String sugar) {

this.numOfTeaBags=numOfTeaBags;
this.amountOfWater=amountOfWater;
this.sugar=sugar;


}

Integer getNumOfTeaBags() {
	
	return numOfTeaBags;
}

Integer getAmountOfWater() {
	return amountOfWater;
}

String getSugar() {
	return sugar;
}

Boolean addSugarToTea() {
	return true;
}
public static void main(String[] args) {
	
	System.out.println("Sweet tea is very tasty.");
}

}




