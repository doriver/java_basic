package class1;

public class Rectangle {
	int width;
	int height;
	
	int calculateArea() {
		int area = width * height;
		return area;
	}

	int calculateArea(int count) {
		int area = width * height * count;
		return area;
	}
	
	void printRectangle() {
		System.out.println("���α���" + width + ", ���α���" + height);
	}
}
