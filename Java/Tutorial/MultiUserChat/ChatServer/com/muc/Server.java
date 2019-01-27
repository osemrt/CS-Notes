package com.muc;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server extends Thread {
	
	private int serverPort; 
	private ArrayList<ServerWorker> workerList = new ArrayList<ServerWorker>(); //
	
	public Server(int serverPort) {
		this.serverPort = serverPort;
	}
	
	public List<ServerWorker> getWorkerList(){
		return workerList;
	}

	
	@Override
	public void run() {
		
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(serverPort);
			while(true) {
				System.out.println("Server is waiting for a client connection...");


				Socket clientSocket = serverSocket.accept();
				System.out.println("Accepted connection from " + clientSocket);
				ServerWorker worker = new ServerWorker(this, clientSocket);
				workerList.add(worker);
				worker.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void removeWorker(ServerWorker serverWorker) {
		workerList.remove(serverWorker);
		
	}
}
