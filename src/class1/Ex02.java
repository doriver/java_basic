package class1;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		
		rectangle.printRectangle(); // ���α���0, ���α���0
		System.out.println(rectangle.calculateArea()); // 0
		
		rectangle.width = 10;
		rectangle.height = 8;
	
		rectangle.printRectangle();
		System.out.println(rectangle.calculateArea());
		System.out.println(rectangle.calculateArea(5));

		Rectangle rect1 = rectangle;
		rect1.printRectangle(); // ���α���10, ���α���8
		rect1.width = 30;
		
		rect1.printRectangle(); // ���α���30, ���α���8
		rectangle.printRectangle(); // ���α���30, ���α���8   �̰� �ű�
		
		rect1 = new Rectangle();
		rect1.printRectangle(); // ���α���0, ���α���0
		rectangle.printRectangle(); // ���α���30, ���α���8
		
		
		Rectangle[] rectangles = new Rectangle[100];
		for(int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle();
		}
		
		rectangles[30].printRectangle(); // ���α���0, ���α���0

		System.out.println();
		
		//
		
		Goods shrimGgang = new Goods();
		shrimGgang.name = "�����";
		shrimGgang.price = 1300;
		shrimGgang.expiration = "2021-03-02";
		
		System.out.println("��ǰ 5���� ���� : " + shrimGgang.calculationPrice(5));
		
		if (shrimGgang.availableSale("2020-09-28")) {
			System.out.println("�ǸŰ���");
		} else {
			System.out.println("�ǸźҰ�");
		}
		
		//
		
		
	}

}
