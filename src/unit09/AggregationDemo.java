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
		Lecture devopsUnit4 = new Lecture("Unit 4");
		Lecture devopsUnit5 = new Lecture("Unit 5");
		Lecture devopsUnit6 = new Lecture("Unit 6");
		Lecture devopsUnit7 = new Lecture("Unit 7");
		Lecture devopsUnit8 = new Lecture("Unit 8");
		Lecture devopsUnit9 = new Lecture("Unit 9");
		Lecture devopsUnit10 = new Lecture("Unit 10");
		Lecture devopsUnit11 = new Lecture("Unit 11");
		
		// Adding DevOps lectures
		devops.addLecture(devopsUnit1);
		devops.addLecture(devopsUnit2);
		devops.addLecture(devopsUnit3);
		devops.addLecture(devopsUnit4);
		devops.addLecture(devopsUnit5);
		devops.addLecture(devopsUnit6);
		devops.addLecture(devopsUnit7);
		devops.addLecture(devopsUnit8);
		devops.addLecture(devopsUnit9);
		devops.addLecture(devopsUnit10);
		devops.addLecture(devopsUnit11);
		
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
		devops.displayDetails();
		bscComputing.displayDetails();		

	}

}
