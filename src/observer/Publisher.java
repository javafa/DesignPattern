package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * ������
 * @author pc
 *
 */
public class Publisher {
	// Observer �����
	List<Observer> observers = new CopyOnWriteArrayList<>(); // <- ����ȭ�� ���������� �����ϴ� List
	
	// Observer �߰��ϱ�
	public void addObserver(Observer obs){
		observers.add(obs);
	}
	
	public void removeObserver(Observer obs){
		observers.remove(obs);
	}
	
	// ��ü ó���Լ�...
	public void process(){
		// ó��..
		// �̺�Ʈ �߻���...
		while(true){
			
			notice();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// ������� �˸���
	private void notice(){
		for(Observer observer : observers){
			observer.alarm();
		}
	}
}
