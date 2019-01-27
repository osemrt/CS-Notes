package com.muc;

/*
 * Commands:
 * ---------
 * quit, login <username> <password>, logoff
 * msg <username> text
 * #topic <- chat room / group chat
 * join #topic
 * leave #topic
 * msg #topic:<username> body
 * 
 * 
 */


public class ServerMain {
	
	public static void main(String[] args) throws Exception {
		
		int serverPort = 9632;
		Server server = new Server(serverPort);
		server.start();

		
	}
}
