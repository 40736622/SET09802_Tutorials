package unit09;

public class AggregationDemo {

	public static void main(String[] args) {
		// Post-Graduate Diploma I
		PostgraduateDiploma bscComputing = new PostgraduateDiploma("BSc Computing");
		
		// DevOps module
		Module devops = new Module("DevOps");
		
		// Initializing DevOps lectures
		Lecture devopsUnit1 = new Lecture("Unit 1");
		Lecture devopsUnit2 = new Lecture("Unit 2");
		Lecture devopsUnit3 = new Lecture("Unit 3");
		
		// Adding DevOps lectures
		devops.addLecture(devopsUnit1);
		devops.addLecture(devopsUnit2);
		devops.addLecture(devopsUnit3);
		
		// Software Development 1 module
		Module softwareDevelopment1 = new Module("Software Developement 1");
		
		// Initializing Software Development 1 lectures
		Lecture sdUnit1 = new Lecture("Unit 1 - Introduction to Programming");
		Lecture sdUnit2 = new Lecture("Unit 2 - Flow of Control");
		Lecture sdUnit3 = new Lecture("Unit 3 - Loops");
		
		// Adding Software Development 1 lectures
		softwareDevelopment1.addLecture(sdUnit1);
		softwareDevelopment1.addLecture(sdUnit2);
		softwareDevelopment1.addLecture(sdUnit3);
		
		// Adding BSc Computing Modules
		bscComputing.addModule(devops);
		bscComputing.addModule(softwareDevelopment1);
		
		// Display details
		sdUnit1.displayDetails();
		softwareDevelopment1.displayDetails();
		bscComputing.displayDetails();
		
		
		
		
		

	}

}
