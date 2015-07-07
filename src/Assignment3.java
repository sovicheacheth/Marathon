class Marathon {
	
	public static int fastestTime(int[] time){
		//Make the first runner the fastest time.
		int runTime = time[0];
		int location = 0;
		
		//Compare runner, if faster make that lowest.
		//If not do nothing.
		for(int i=0; i<time.length;i++){
			if(time[i]<runTime){
				runTime = time[i];
				location = i;
			}
		}
		return location;
	}
	public static int secondFastest(int[] time, int location){
		int runTime;
		int secondLocation;
		//If the fastest runner is first spot of array, start with second
		if(location==0){
			runTime = time[1];
			secondLocation = 1;
		}
		else{
			runTime = time[0];
			secondLocation = 0;
		}
		//Compare runner, if faster make that lowest.
		//If not do nothing.
		for(int i=0; i<time.length;i++){
			//When we get to fastest runner, bypass it
			if(i==location)
				continue;
			if(time[i]<runTime){
				runTime = time[i];
				secondLocation = i;
			}
		}
		
		return secondLocation;
	}
	
	public static void main (String[] arguments) {
		
		int firstTimeLocation;
		int secondTimeLocation;
		
		//String array of runners
		String[] names = {
				"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", 
				"Alex", "Emma", "John", "James", "Jane", "Emily",
				"Daniel", "Neda", "Aaron", "Kate" };
	
		//Int array of the times
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 
						334, 412, 393, 299, 343, 317, 265 };
		
		//Loop to combine names with their times
		System.out.println("List of Runners:");
		for (int i = 0; i < names.length; i++) {
				System.out.println(names[i] + ": " + times[i]);
		}
		//Method call and outputs
		System.out.println("\nThe fastest runner and time was:");
		firstTimeLocation=fastestTime(times);
		System.out.println(names[firstTimeLocation]+ ": " + times[firstTimeLocation]);
		System.out.println("\nThe second fastest runner and time was:");
		secondTimeLocation= secondFastest(times,firstTimeLocation);
		System.out.println(names[secondTimeLocation]+ ": " + times[secondTimeLocation]);
	}
}