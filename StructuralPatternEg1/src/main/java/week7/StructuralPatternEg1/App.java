package week7.StructuralPatternEg1;
//Adapter design pattern of Structural type
public class App 
{
    public static void main( String[] args )
    {
    	Pen p = new PenAdapter();
        Assignment a = new Assignment();
        a.setP(p);
        a.writeAssignment("Ready to write assignment");
    }
}
