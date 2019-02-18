
public class AlertDisplayVisitor implements AlertVisitor{
	public void visit(Smartphone smartphone) {
		System.out.println("SMS: Weather conditions are rough in your area. Drive carefully.");
	}
	
	public void visit(TV tv) {
		System.out.println("Channel 3 says: Stay indoors. Weather conditions are rough in the area.");
	}
	
	public void visit(Radio radio) {
		System.out.println("WCME Radio says: stay indoors.");
	}
}
