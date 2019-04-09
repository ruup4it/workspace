package exercise_190408;


import java.io.*;
import java.net.*;

/*클라이언트 프로그램
 * 서버의 주소(ip address, port)를 가지고 서버에 접속
 * 접속 후에 통신이 가능하다*/
public class EchoClient {
	public static void main(String[] args) {
		// 127.0.0.1 : loop 현재 주소, 현재 자기 자신의 Host
		try {
			Socket sock = new Socket("203.236.209.161", 10001);
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
				pw.println(line);
				pw.flush();
				String echo = br.readLine();
				System.out.println("서버로부터 전달받은 문자열: " + echo);
			}
			pw.close();
			br.close();
			sock.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class ReceiverThread extends Thread{
	Socket sock;
	ReceiverThread(Socket sock){
		this.sock = sock;
	}
	public void run() {	
		try {
			BufferedReader br;
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			// 서버로부터 수신된 메세지를 출력
			while(true) {
				String str = br.readLine();
				if(str == null)
					break;
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}