package exam;

class A {
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends B{
	
}
class E extends B{
	
}
class F extends C{
	
}




public class Ex_ABCD {
	public static void main(String[] args) {
		
//		B bb = (B) new A();
//		System.out.println(bb);
		
		
		A a = new B(); // 업캐스팅 작은 걸 큰거에 담기
		System.out.println(a);
		
		B b = (B) a; // 다운캐스팅 
		System.out.println(b);
		
		
		
	}
}
