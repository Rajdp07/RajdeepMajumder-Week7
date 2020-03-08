package week7.StructuralPatternEg1;

public class PenAdapter implements Pen {
	GelPen gp = new GelPen();

	@Override
	public void write(String str) {
		gp.mark(str);
	
		
	}
	

}
