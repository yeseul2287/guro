package sec06;

public class Anonymous2Demo {
	public static void main(String[] args) {
		Bird b = new Bird() {
			public void move() {
				System.out.println("�������� ����~~~.");
			}
		};
		b.move();
	}
}