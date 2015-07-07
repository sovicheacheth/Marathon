class Marathon {
	
	public static int fastestTime(int[] time){
		int runTime = time[0];
		int location = 0;
		for(int i=0; i<time.length;i++){
			if(time[i]<runTime){
				runTime = time[i];
				location = i;
			}
		}
		return location;
	}
	
	public static void main (String[] arguments) {
		
		int timeLocation;
		
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
		System.out.println("\nThe fastest runner and time was:");
		timeLocation=fastestTime(times);
		System.out.println(names[timeLocation]+ ": " + times[timeLocation]);
	}
}