package chapter3.B_ValueableMethod;



class Triangle {
	double underSide;
	double height;
	double diagonal;
	
	double area;
	double circumference;
}




class TriangleMath {
	
	//파라미터로 참조변수를 받는다면 메모리 주소가 복사되어 넘어오기 때문에
	//실제 작업도 해당 메모리 주소에서 작업을 진행함
	//실제 데이터가 변경됨
	//참조형 변수
	
	static void setArea(Triangle triangle) {
		double area = 0.5*triangle.underSide*triangle.height;
		triangle.area = area;
		
	}
	
	
	static void setDiagonal(Triangle triangle) {
		double squareDiagonal = Math.pow(triangle.underSide,2) + Math.pow(triangle.height, 2);
		double diagonal = Math.sqrt(squareDiagonal);
		triangle.diagonal = diagonal;
	}
	
	static void setCircumference(Triangle triangle) {
		triangle.circumference = triangle.underSide + triangle.height + 
				 triangle.diagonal;
	}
	
	
	static Triangle creatTriangle(double underSide, double height) {
		Triangle triangle = new Triangle();
		 triangle.underSide = underSide;
		 triangle.height = height;
		 setDiagonal(triangle);
		 setCircumference(triangle);
		 return triangle;
	}
		
	
	
	
	
}



public class Method2 {

	
	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		triangle1.diagonal = 5;
		triangle1.height = 4;
		triangle1.underSide =3;
		
		TriangleMath.setArea(triangle1);
		
		System.out.println(triangle1.area);
		
		//주소를 지정
		Triangle triangle2 = TriangleMath.creatTriangle(5, 5);
		System.out.println(triangle2.area);
		

	}

}
