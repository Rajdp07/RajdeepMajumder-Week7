package week7.BehavioralPatternEg2;
public class App                       //Implementing Template Design pattern
{
    public static void main( String[] args )
    {
        AppTemplate playstore = new PlayStore();
        playstore.buildApp();
        System.out.println("********server*********");
        AppTemplate server = new Server();
        server.buildApp();
        
    }
}
