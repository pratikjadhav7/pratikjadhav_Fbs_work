package DTO;

public class BatchDTO {

	String batchId;
	String batchName;
	
	  public BatchDTO(){
		
	}

	
	public BatchDTO(String batchId, String batchName) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;
	}


	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	
	
}
