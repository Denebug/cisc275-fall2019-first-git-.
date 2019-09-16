import java.util.*;

class Dog extends Animal{
		public Dog(String name, int numLegs){
			this.name = name;
			this.numLegs = numLegs;
		}
	public String toString(){
		String temp;
		temp = this.name + ""+ Integer.toString(numLegs);
		return temp;
	}
}
