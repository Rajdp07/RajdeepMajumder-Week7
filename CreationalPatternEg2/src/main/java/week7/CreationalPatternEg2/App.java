package week7.CreationalPatternEg2;
//Builder Design pattern in java
public class App 
{
	private String Name;
    private String type;
    private int size;
    private String company;
    private double ratings;
	public App(String name, String type, int size, String company, double ratings) {
		super();
		Name = name;
		this.type = type;
		this.size = size;
		this.company = company;
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "App [Name=" + Name + ", type=" + type + ", size=" + size + ", company=" + company + ", ratings="
				+ ratings + "]";
	}
	
	
    
}
