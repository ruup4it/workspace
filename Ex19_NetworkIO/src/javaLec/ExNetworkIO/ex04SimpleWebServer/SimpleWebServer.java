package javaLec.ExNetworkIO.ex04SimpleWebServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
	public static void main(String[] args) {
		Socket sock = null;
		BufferedReader br = null;
		try {
			ServerSocket ss = new ServerSocket(80);
			System.out.println("서버 시작");
			sock = ss.accept();
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("서버 종료");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (br != null)
					br.close();
				if (sock != null)
					sock.close();
			} catch (Exception ex) {
				System.out.println(ex);
			}

		}
	}
}
