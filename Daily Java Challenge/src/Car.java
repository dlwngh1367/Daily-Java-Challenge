
public class Car {

	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String coulour;
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("aventador") || validModel.equals("huracan") ) {
			this.model = model;
		} else {
			this.model = "Unknown";
		}
		
	}
	
	public String getModel() {
		return this.model;
	}
}
