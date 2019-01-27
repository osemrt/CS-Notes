package com.muc;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;


public class ChatClient{
	
	
	private String serverName;
	private int serverPort;
	private Socket socket;
	private OutputStream serverOut;
	private InputStream serverIn;
	private BufferedReader bufferedIn;

	private ArrayList<UserStatusListener> userStatusListeners = new ArrayList<>();
	private ArrayList<MessageListener> messageListeners = new ArrayList<>();

	public ChatClient(String serverName, int serverPort) {
		this.serverName = serverName;
		this.serverPort = serverPort;
	}

	public static void main(String[] args) throws IOException {
		ChatClient client = new ChatClient("localhost", 9632);

		client.addUserStatusListener(new UserStatusListener() {
			@Override
			public void online(String username) {
				System.out.println("ONLINE " + username);
			}

			@Override
			public void offline(String username) {
				System.out.println("OFFLINE " + username);

			}
		});

		client.addMessageListener(new MessageListener() {
			@Override
			public void onMessage(String fromUser, String message) {
				System.out.println("You got a message from " + fromUser + " -> " + message);
			}
		});


		if(client.connect()) {
			System.out.println("Connected the server");
			if(client.login("bob", "pass")){
				System.out.println("Login successfully!");
				client.msg("osemrt", "Hello there!");


			}else{
				System.err.println("Login failed!\n");
			}

			//client.logoff();
			
		}else {
			System.err.println("Connection failed!");
		}
		
	}

	private void msg(String sendTo, String message) throws IOException {
		String cmd = "msg " + sendTo + " " + message + "\n";
		serverOut.write(cmd.getBytes());

	}

	private void logoff() throws IOException {
		String cmd = "logoff\n";
		serverOut.write(cmd.getBytes());
	}

	private boolean login(String username, String password) throws IOException {
		String cmd = "login " + username + " " + password + "\n";
		serverOut.write(cmd.getBytes());
		String response = bufferedIn.readLine();
		if("login ok".equals(response)){
			startMessageReader();
			return true;
		}else{
			return false;
		}

	}

	private void startMessageReader() {
		Thread t1 = new Thread(){
			@Override
			public void run() {
				readMessageLoop();
			}
		};
		t1.start();
	}

	private void readMessageLoop() {
		String line;
		try {
			while((line = bufferedIn.readLine())!=null){
				String tokens[] = StringUtils.split(line);
				if(tokens!=null){
					String cmd = tokens[0];
					if("online".equalsIgnoreCase(cmd)){
						handleOnline(tokens);
					}else if("offline".equalsIgnoreCase(cmd)){
						handleOffline(tokens);
					}else if("msg".equalsIgnoreCase(cmd)){
						String[] tokensMsg = StringUtils.split(line, " ", 3);
						handleMessage(tokensMsg);
					}

				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			try {
				socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

	private void handleMessage(String[] tokensMsg) {
		String sendTo = tokensMsg[1];
		String msg = tokensMsg[2];

		for( MessageListener listener : messageListeners){
			listener.onMessage(sendTo, msg);
		}
	}

	private void handleOffline(String[] tokens) {
		String username = tokens[1];
		for(UserStatusListener listener : userStatusListeners){
			listener.offline(username);
		}
	}

	private void handleOnline(String[] tokens) {
		String username = tokens[1];
		for(UserStatusListener listener : userStatusListeners){
			listener.online(username);
		}
	}

	private boolean connect() {
		try {
			this.socket = new Socket(serverName, serverPort);
			System.out.println("Client port is " + socket.getLocalPort());
			this.serverOut = socket.getOutputStream();
			this.serverIn = socket.getInputStream();

			InputStreamReader isr = new InputStreamReader(serverIn);
			this.bufferedIn = new BufferedReader(isr);
			
			return true;
		} catch (Exception e) {}
		
		return false;
	}

	public void addUserStatusListener(UserStatusListener listener){
		userStatusListeners.add(listener);
	}

	public void removeUserStatusListener(UserStatusListener listener){
		userStatusListeners.remove(listener);
	}

	public void addMessageListener(MessageListener listener){
		messageListeners.add(listener);
	}

	public void removeMessageListener(MessageListener listener){
		messageListeners.remove(listener);
	}
	
	
	
}