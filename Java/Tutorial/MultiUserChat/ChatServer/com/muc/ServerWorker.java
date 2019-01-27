package com.muc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class ServerWorker extends Thread {
	
	private Socket clientSocket;
	private Server server;
	private OutputStream outputStream;
	private String username = null;
	private HashSet<String> topicSet = new HashSet<>();

	public ServerWorker(Server server, Socket clientSocket) {
		this.server = server;
		this.clientSocket = clientSocket;
	}
	
	public String getUsername() {
		return this.username;
	}

	@Override
	public void run() {
		try {
			handleClient();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void handleClient() {
		try {
			this.outputStream = clientSocket.getOutputStream();
			InputStream inputStream = clientSocket.getInputStream();

			InputStreamReader isr = new InputStreamReader(inputStream);
			BufferedReader br = new BufferedReader(isr);
			String line;

			while ((line = br.readLine()) != null) {
				String tokens[] = StringUtils.split(line, " ", 3);
				if (tokens != null && tokens.length > 0) {
					String cmd = tokens[0];

					if ("quit".equalsIgnoreCase(cmd) || "logoff".equalsIgnoreCase(cmd)) {
						handleLogoff();
						break;
					} else if ("msg".equalsIgnoreCase(cmd)) {
						handleMessage(tokens);
					} else if ("join".equalsIgnoreCase(cmd)) {
						handleJoin(tokens);
					} else if ("leave".equalsIgnoreCase(cmd)) {
						handleLeave(tokens);
					} else if ("login".equalsIgnoreCase(cmd)) {
						handleLogin(tokens, outputStream);
					} else {

						String msg = "unknown " + cmd + "\n";
						outputStream.write(msg.getBytes());
					}
				}

			}

			clientSocket.close();
			outputStream.close();
		}catch (Exception e){

		}
	}

	private void handleLeave(String[] tokens) throws IOException {
		String topic = tokens[1];
		topicSet.remove(topic);
		String msg = "You left " + topic + "\n";
		send(msg);
		
	}

	private void handleJoin(String[] tokens) throws IOException {
		String topic = tokens[1];
		topicSet.add(topic);
		String msg = "You joined to " + topic + "\n";
		send(msg);
		
	}
	
	public boolean isMemberOfTopic(String topic) {
		return topicSet.contains(topic);
	}
	
	//format: msg <username> <message>
	//format: msg <topic_name>:<sender_name> <message>
	private void handleMessage(String[] tokens) throws IOException {
		String sendTo = tokens[1];
		String msg = tokens[2];
		
		boolean isTopic = tokens[1].charAt(0) == '#';
		List<ServerWorker> workerList = server.getWorkerList();
		
		if(isTopic) {
			for(ServerWorker worker : workerList) {
				if(worker.isMemberOfTopic(tokens[1])) {
					String outMessage = "msg " + sendTo + " : " + getUsername() + " " + msg + "\n";
					worker.send(outMessage);
					
				}
			}
			}else {
			
			
			for(ServerWorker worker : workerList) {
				if(worker.getUsername().equalsIgnoreCase(sendTo)) {
					String outMessage = "msg " + getUsername() + " " +msg + "\n";
					worker.send(outMessage);
				}
			}
			
		}
		
		
		
	}

	private void handleLogoff() throws IOException {
		server.removeWorker(this);
		List<ServerWorker> workerList = server.getWorkerList();
		for(ServerWorker worker : workerList) {
			if(!getUsername().equals(worker.getUsername())) {
				String onlineMsg = "offline " + getUsername() + "\n";
				worker.send(onlineMsg);
			}
			
		}

	}

	private void handleLogin(String[] tokens, OutputStream outputStream) throws IOException {
		if(tokens.length == 3) {
			username = tokens[1];
			String password = tokens[2];
			
			if(("osemrt".equalsIgnoreCase(username) && "123".equalsIgnoreCase(password)) ||
			  (("kevin".equalsIgnoreCase(username) && "abc".equalsIgnoreCase(password))) ||
			  (("bob".equalsIgnoreCase(username) && "pass".equalsIgnoreCase(password))))
			{
				String msg = "login ok\n";
				outputStream.write(msg.getBytes());
				System.out.println("User logged in successfully: " + username);

				List<ServerWorker> workerList = server.getWorkerList();
				
				for(ServerWorker worker : workerList) {
					if(worker.getUsername()!=getUsername()) {
						if(worker.getUsername()!=null) {
							String onlineUsers = "online " + worker.getUsername() + "\n";
							send(onlineUsers);	
						}					
					}
					
				}
				
				for(ServerWorker worker : workerList) {
					if(worker.getUsername() != null) {
						if(!worker.getUsername().equalsIgnoreCase(getUsername())) {
							String onlineMsg = "online " + getUsername() + "\n";
							worker.send(onlineMsg);
						}
					}
					
				}
				
				
				
			}else {
				String msg = "check your credentials!\n";
				outputStream.write(msg.getBytes());
				System.err.println("Login failed for " + username);
			}		
		}
		
	}

	private void send(String message) throws IOException {
		this.outputStream.write(message.getBytes());
		
	}
	
	
	
	

}
