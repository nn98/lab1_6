package lab1_5;
/*
 * ���ϸ� :lab1_5
 * �ۼ��� :������
 * �ۼ��� :18/09/04
 * ���� : ����
 */
import java.util.Random;
import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();	//���� ����
		System.out.println("lab1_5 : ������");	//�̸�
		
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
