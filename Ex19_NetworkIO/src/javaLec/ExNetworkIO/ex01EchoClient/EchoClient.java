package javaLec.ExNetworkIO.ex01EchoClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/* 클라이언트 프로그램
 * 서버의 주소(ip address, port)를 가지고
 * 서버에 접속
 * 접속 후에 통신 가능
 * */
public class EchoClient {
	public static void main(String[] args) {
		// 127.0.0.1 : loop 주소, 현재 자기 자신 Host
		// Socket sock = new Socket("203.236.209.179", 10001);
		// 203.236.209.180
		try {
			// 생성자에서 해당 주소로 접속(connect)
			String name;
			System.out.println("이름을 입력하세요");
			Scanner scan = new Scanner(System.in);
			name = scan.nextLine();
			
			Socket sock = new Socket("203.236.209.179", 80);
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line;
			while ((line = keyboard.readLine()) != null) {
				if (line.equals("quit")) {
					System.out.println("클라이언트 종료");
					break;
				}
				//pw.write(name);
				pw.println(line);
				pw.flush();
				String echo = br.readLine();
				System.out.println(name + " : " + echo);

			}
			pw.close();
			br.close();
			sock.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
