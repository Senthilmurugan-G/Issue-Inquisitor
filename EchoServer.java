import java.util.*;
import java.io.*;
import java.net.*;
class EchoServer{
	public static void main(String args[])throws Exception{
		ServerSocket soc=new ServerSocket(5000);
		Socket s=soc.accept();
		DataInputStream input=new DataInputStream(s.getInputStream());
		DataOutputStream output=new DataOutputStream(s.getOutputStream());
		String client="";
		String server="";
		client=input.readUTF();
		System.out.println("Client says : "+client);
		server=client;
		output.writeUTF(server);
		String time=(new Date()).toString();
		output.writeUTF(time);
		soc.close();
	}
}