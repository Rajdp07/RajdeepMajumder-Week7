package week7.CreationalPatternEg2;

public class AppBuilder {
	private String Name;
    private String type;
    private int size;
    private String company;
    private double ratings;
    
	public AppBuilder setName(String name) {
		Name = name;
		return this;
	}
	public AppBuilder setType(String type) {
		this.type = type;
		return this;
	}
	public AppBuilder setSize(int size) {
		this.size = size;
		return this;
	}
	public AppBuilder setCompany(String company) {
		this.company = company;
		return this;
	}
	public AppBuilder setRatings(double ratings) {
		this.ratings = ratings;
		return this;
	}
	
	public App getApp() {
		return new App(Name, type, size, company, ratings);
	}
    

}
