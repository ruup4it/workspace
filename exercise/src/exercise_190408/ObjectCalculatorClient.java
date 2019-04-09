﻿package exercise_190408;

import java.net.*;			
import java.io.*;			
			
public class ObjectCalculatorClient {			
			
	public static void main(String[] args) {		
		if(args.length != 1){	
			System.out.println("사용법 : java ObjectCalculatorClient ip");
			System.exit(0);
		}	
		Socket sock = null;	
		ObjectOutputStream oos = null;	
		ObjectInputStream ois = null;	
		try{	
			sock = new Socket(args[0], 10005);
			
			oos = new ObjectOutputStream(sock.getOutputStream());		
			ois = new ObjectInputStream(sock.getInputStream());		
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));		
			String line = null;		
			while(true){		
				System.out.println("첫번째 숫자를 입력하여 주세요.(잘못 입력된 숫자는 0으로 처리합니다.)");	
				line = keyboard.readLine();	
				int op1 = 0;	
				try{	
					op1 = Integer.parseInt(line);
				}catch(NumberFormatException nfe){	
					op1 = 0;
				}	
				System.out.println("두번째 숫자를 입력하여 주세요. (잘못 입력된 숫자는 0으로 처리합니다.)");	
				line = keyboard.readLine();	
				int op2 = 0;	
				try{	
					op2 = Integer.parseInt(line);
				}catch(NumberFormatException nfe){	
					op2 = 0;
				}	
				System.out.println("+, -, *, / 중에 하나를 입력하여 주세요. ( 잘못입력하면 + 로 처리합니다.)");	
				line = keyboard.readLine();	
				String opcode = "+";	
				if(line.equals("+") || line.equals("-") || line.equals("*") || line.equals("/"))	
					opcode = line;
				else	
					opcode = "+";
				SendData s = new SendData(op1, op2, opcode);	
				oos.writeObject(s);	
				oos.flush();	
				String msg = (String)ois.readObject();	
				System.out.println(msg);
				System.out.println("계속 계산하시겠습니까?(Y/n)");
				line = keyboard.readLine();
				if(line.equals("n")) break;
				System.out.println("다시 계산을 시작합니다.");
			} // while	
			System.out.println("프로그램을 종료합니다.");	
				
				
		}catch(Exception ex){		
			System.out.println(ex);	
		}finally{		
			try{	
				if(oos != null) oos.close();
			}catch(Exception ex){}	
			try{	
				if(ois != null) ois.close();
			}catch(Exception ex){}	
			try{	
				if(sock != null) sock.close();
			}catch(Exception ex){}	
		} // finally		
	} // main			
}				
