# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.
	Done

2. What five objects are created in the main?
	new ArrayList<Dog>
	new Dog("fido",4));
	new Dog("fido",3));
	new Dog("Alfie,4));
	new comparator <animal>()

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?
	
	Collections.sort(dogs, new Comparator<Animal>(){
	@Override
	public int compare(Animal a, Animal b){
		return a.getLegs() - b.getLegs();
	}
}
	System.out.println(dogs);
	}
cisc275-fall2019-first-git-.
