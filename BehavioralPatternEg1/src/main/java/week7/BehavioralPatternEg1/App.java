package week7.BehavioralPatternEg1;
public class App           //Implementing Observer design pattern
{
    public static void main( String[] args )
    {
    	Channel rajdeep = new Channel();
    	Members m1=new Members("Rajdeep");
    	Members m2=new Members("Roma");
    	Members m3=new Members("Raj");
    	Members m4=new Members("Deep");
    	Members m5=new Members("Rex");
    	
    	rajdeep.membership(m1);
    	rajdeep.membership(m2);
    	rajdeep.membership(m3);
    	rajdeep.membership(m4);
    	rajdeep.membership(m5);
    	rajdeep.Cancelmembership(m5);
    	
    	m1.MemberChannel(rajdeep);
    	m2.MemberChannel(rajdeep);
    	m3.MemberChannel(rajdeep);
    	m4.MemberChannel(rajdeep);
    	m5.MemberChannel(rajdeep);
    	
    	rajdeep.upload("App released");
    	
    	
        
    }
}
