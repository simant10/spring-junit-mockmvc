package sp.brother.mokitodemo.exception;

public class CustomException extends RuntimeException{
	private int messageCode;
	private String message;
	private String messageType;
	
	protected CustomException() {};
	public CustomException(int messageCode,String messageType,String message) {
		this.messageCode=messageCode;
		this.message=message;
		this.messageType=messageType;
	}
	public int getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(int messageCode) {
		this.messageCode = messageCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	
}
