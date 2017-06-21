/**
 * �̱��� ������ �˾ƺ��ô�~
 * @author pc
 *
 */
public class Singleton {
	
	// 3. �ڱ� �ڽ��� ��Ƶδ� ��������� �����
	private static Singleton instance = new Singleton();
	
	// 1. �����ڸ� private ���� ����� �ܺο��� ������ �� ������ �����Ѵ�
	private Singleton(){
		
	}
	
	// 2. �ܺο��� ������ �� �����Ƿ�
	// ���ο��� ������ �� ����� �� �ֵ��� �������̽��� �����ϰ�,
	// �ܺο��� new�� �ȵǹǷ� �Լ��� static���� �����ؾ� �Ѵ�.
	public static Singleton getInstance(){
		// 4. ��������� instance �� ������ instance�� return�Ѵ�.
		return instance;
	}
}
