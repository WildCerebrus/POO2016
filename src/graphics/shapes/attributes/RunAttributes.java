package graphics.shapes.attributes;

public class RunAttributes extends Attributes {

	public static final String ID="run";
	private boolean run;
	
	public RunAttributes() {
		this.run=true;
	}

	public void setRun(boolean run) {
		this.run=run;
	}
	public boolean getRun() {
		return this.run;
	}

}
