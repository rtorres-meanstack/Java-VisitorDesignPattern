
public interface Alert {
	public void alert(AlertVisitor alertVisitor);
	
	public static void main(String[] args) {
		// smartphone alert
		Alert smartphoneAlert = new Smartphone();
		smartphoneAlert.alert(new AlertDisplayVisitor());
		
		// tv alert
		Alert tvAlert = new TV();
		tvAlert.alert(new AlertDisplayVisitor());
		
		// radio alert
		Alert radioAlert = new Radio();
		radioAlert.alert(new AlertDisplayVisitor());
	}
}
