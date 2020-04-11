package kcp.spring.beans;

public class RequestHandler {
	private int count = 0;

	public RequestHandler() {
		count++;
		System.out.println("RequestHandler.RequestHandler()" + count);
	}

	public String handleRequest(String data) {
		System.out.println("RequestHandler.handleRequest()");
		return " i am a HandleResguest method"+data;

	}
}
