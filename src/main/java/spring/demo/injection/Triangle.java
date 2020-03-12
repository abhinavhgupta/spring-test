package spring.demo.injection;

public class Triangle {

	private String type;
	private int height;

	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public Triangle(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void check() {
		System.out.println("Type of triangle '"+type+"' whose height is "+ height );
		
	}

}
