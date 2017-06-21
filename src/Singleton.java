/**
 * 싱글턴 패턴을 알아봅시다~
 * @author pc
 *
 */
public class Singleton {
	
	// 3. 자기 자신을 담아두는 저장공간을 만들고
	private static Singleton instance = new Singleton();
	
	// 1. 생성자를 private 으로 만들어 외부에서 생성할 수 없도록 제한한다
	private Singleton(){
		
	}
	
	// 2. 외부에서 생성할 수 없으므로
	// 내부에서 생성한 후 사용할 수 있도록 인터페이스를 제공하고,
	// 외부에서 new가 안되므로 함수는 static으로 구성해야 한다.
	public static Singleton getInstance(){
		// 4. 저장공간에 instance 가 있으면 instance를 return한다.
		return instance;
	}
}
