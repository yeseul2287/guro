package challenge.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class DateClient {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("Ŭ���̾�Ʈ > ��¥ ������ IP �ּҴ� ? ");
		String serverAddress = in.nextLine();
		try (Socket client = new Socket(serverAddress, 9000);
				BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));) {
			String answer = input.readLine();
			System.out.println(answer);
		} catch (Exception e) {
		}
	}
}