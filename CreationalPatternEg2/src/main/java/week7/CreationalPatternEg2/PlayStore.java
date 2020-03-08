package week7.CreationalPatternEg2;

public class PlayStore {
	public static void main(String args[]) {
	App a =new AppBuilder().setName("PUBG Mobile").setSize(2).setCompany("Tencent").getApp();
	System.out.println(a);
	

}
}
