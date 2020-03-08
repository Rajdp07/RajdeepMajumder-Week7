package week7.BehavioralPatternEg1;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	List<Members> mems = new ArrayList<>();
	private String title;
	public void membership(Members mem) {
		mems.add(mem);
	}
	public void Cancelmembership(Members mem)
	{
		mems.remove(mem);
	}
	public void notifyMembers()
	{
		for (Members mem: mems){
			mem.update();
			
		}
	}
	public void upload(String title) {
		this.title=title;
		notifyMembers();
	}

}
