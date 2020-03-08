package week7.BehavioralPatternEg2;

public abstract class AppTemplate {
	public final void buildApp() {
		collectComponent();
		assembleComponents();
		releaseApp();
		System.out.println("App is released");
	}

	private void collectComponent() {
		System.out.println("App with minimum size but with great use to a user");
	}
	private void releaseApp() {
		System.out.println("App is being released");
	}
	public abstract void assembleComponents();
	

}
