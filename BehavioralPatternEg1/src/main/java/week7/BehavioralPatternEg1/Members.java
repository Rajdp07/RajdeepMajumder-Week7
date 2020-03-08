package week7.BehavioralPatternEg1;

public class Members {
	private String members;
	private Channel channel = new Channel();
	
	public Members(String members) {
		super();
		this.members = members;
	}
	public void update() {
		System.out.println("Hii " +members+" , App released");
	}
	public void MemberChannel(Channel ch) {
		channel=ch;
	}

}
