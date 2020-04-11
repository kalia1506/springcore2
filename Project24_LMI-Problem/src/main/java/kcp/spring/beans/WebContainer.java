package kcp.spring.beans;

public class WebContainer {
	private RequestHandler handler;

	public WebContainer(RequestHandler handler) {
		System.out.println("WebContainer.WebContainer()");
		this.handler = handler;
	}

	public void ProcessData(String data) {
		System.out.println("WebContainer.ProcessData()" + data);
		System.out.println(handler.handleRequest(data));
	}
}
