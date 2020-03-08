package week7.CreationalPatternEg;
public class App 
{
    public static void main( String[] args )
    {
    	SportsFactory sf = new SportsFactory();     //Implementing "Factory Pattern" of Creational design pattern
        Sports obj =  sf.getInstance("");
        obj.type();
    }
}
