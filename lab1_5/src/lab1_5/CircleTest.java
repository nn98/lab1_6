package lab1_5;
/*
 * 파일명 :lab1_5
 * 작성자 :김윤서
 * 작성일 :18/09/04
 * 설명 : 없음
 */
import java.util.Random;
import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();	//랜덤 생성
		System.out.println("lab1_5 : 김윤서");	//이름
		
		Circle circle1=new Circle();	//(1)
		circle1.setRadius(2);			//(2)
		Circle circle2=new Circle(r.nextInt(4)+1);	//(3)

		System.out.println(circle1.toString());	//(4)
		System.out.println(circle2.toString());	//(5)
		
		System.out.println(circle1.equals(circle2));	//(6)
		System.out.println(circle1.hashCode());	//(7)
		System.out.println(circle2.hashCode());	//(8)
		System.out.println(circle1.value());	//(9)
		System.out.println(circle2.value());	//(10)
		
	}

}
