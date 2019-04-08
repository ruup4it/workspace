package javaLec.ExNetworkIO.ex03EchoThreadServer;

import java.net.ServerSocket;
import java.net.Socket;

/* echo : 클라이언트가 보내온 메시지를 그대로 돌려보낸다
 * thread : 여러 클라이언트가 접속 시 클라이언트 당 1개 쓰레드가 전담한다
 * 			그러면 동시에 서비스가 가능하다
 * 
 * */
public class EchoThreadServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("접속을 기다립니다...");
			while (true) {
				// 1. 클라이언트가 접속
				Socket sock = server.accept();
				// 2. 클라이언트 담당 쓰레드 생성하여 전담시킴
				EchoThread echothread = new EchoThread(sock);
				echothread.start();
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
