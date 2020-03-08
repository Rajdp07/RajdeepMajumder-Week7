package week7.StructuralPatternEg1;

public class Assignment {
	private Pen p;
	
	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	public void writeAssignment(String str) {
		p.write(str);
		
	}

}
