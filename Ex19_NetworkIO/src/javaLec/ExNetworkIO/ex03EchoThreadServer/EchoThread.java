package javaLec.ExNetworkIO.ex03EchoThreadServer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class EchoThread extends Thread {
	Socket sock;
	String name;
	static int num;

	public EchoThread(Socket sock) {
		this.sock = sock;
		this.num++;
		this.name = num + "번";
	}

	public void run() {
		try {
			InetAddress inetaddr = sock.getInetAddress();
			System.out.println(inetaddr.getHostAddress() + "로부터 접속했습니다.");
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(name + " 클라이언트(" + inetaddr.getHostAddress() + ")로부터 수신 : " + line);
				pw.println(line);
				pw.flush();
			}
			System.out.println(name + " 클라이언트(" + inetaddr.getHostAddress() +") 접속 종료");
			pw.close();
			br.close();
			sock.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
