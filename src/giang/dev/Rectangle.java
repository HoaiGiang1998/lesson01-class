package giang.dev;

public class Rectangle {
		//instance variable || instance attribute
	int width ;
	int height ;
	
	void setWidth(int w) {
		width = w;
	}
	
	int getWidth () {
		return width;	
	}
	
	void setHeight(int h) {
		height = h;	
	}
	
	int getHeight() {
		return height;
	}
	
	int chuVi() {
		return (width * height) * 2;			
	}
	
	int dienTich() {
		return width * height;
	}

}
