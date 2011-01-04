package no.magott.spring.batch.stepscope;

public class SimpleMessage implements Message{

	private String messageString;

	public SimpleMessage(String message) {
		this.messageString = message;
	}
	
	public String getMessage() {
		return messageString;
	}

}
