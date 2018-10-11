package modle;

public class LightingRecord {

	
	private String stu_num;
	 private String tsk_num;
	 private String rev_time;
	 private String rcd_state;
	 private String rec_rmk;
	 private String rcd_num;
	public LightingRecord(String stu_num, String tsk_num, String rev_time, String rcd_state, String rec_rmk,
			String rcd_num) {
		super();
		this.stu_num = stu_num;
		this.tsk_num = tsk_num;
		this.rev_time = rev_time;
		this.rcd_state = rcd_state;
		this.rec_rmk = rec_rmk;
		this.rcd_num = rcd_num;
	}
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}
	public String getTsk_num() {
		return tsk_num;
	}
	public void setTsk_num(String tsk_num) {
		this.tsk_num = tsk_num;
	}
	public String getRev_time() {
		return rev_time;
	}
	public void setRev_time(String rev_time) {
		this.rev_time = rev_time;
	}
	public String getRcd_state() {
		return rcd_state;
	}
	public void setRcd_state(String rcd_state) {
		this.rcd_state = rcd_state;
	}
	public String getRec_rmk() {
		return rec_rmk;
	}
	public void setRec_rmk(String rec_rmk) {
		this.rec_rmk = rec_rmk;
	}
	public String getRcd_num() {
		return rcd_num;
	}
	public void setRcd_num(String rcd_num) {
		this.rcd_num = rcd_num;
	}
	 
	 
	 
	 
	
}
