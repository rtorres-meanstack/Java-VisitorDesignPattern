
public class TV implements Alert{
	public void alert(AlertVisitor alertVisitor) {
		alertVisitor.visit(this);
	}
}
