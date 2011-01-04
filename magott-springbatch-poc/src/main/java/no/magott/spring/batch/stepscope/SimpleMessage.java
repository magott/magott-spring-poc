package no.magott.spring.batch.stepscope;

public class SimpleMessage implements Message{

	private String messageString;
	private int count;

	public SimpleMessage(String message, int count) {
		this.messageString = message;
		this.count=count;
	}
	
	public String getMessage() {
		return messageString;
	}
	
	public int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		return String.format("%s count: %s", messageString, count);
	}

}
