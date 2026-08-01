package DTO;

public class ResponseDTO {

	int status;
	String msg;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ResponseDTO(int status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	
	public ResponseDTO() {
		// TODO Auto-generated constructor stub
	}
	
}
