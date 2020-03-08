package week7.CreationalPatternEg;

public class SportsFactory {
	public Sports getInstance(String str) {          //Instead of creating direct oject I am creating a factory of objects which will supply the objects to the class.
		if(str.contentEquals("Open"))
			return new Cricket();
		else if(str.contentEquals("Closed"))
			return new Football();
		else
			return new Rugby();
	}

}
