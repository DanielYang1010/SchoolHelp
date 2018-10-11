package modle;

import java.sql.Timestamp;

public class Task {
	private String tsk_num;
	private String account;
	private String tsk_name;
	private String tsk_content;
	private String tas_img;
	private double tsk_money;
	private String tsk_state;
	private Timestamp tsk_begTime;
	private Timestamp tsk_oveTime;
	private String tsk_limTime;
	private String tsk_oveWay;
	private String tsk_rmk;
	private String tsk_chkstate;
	public Task(String tsk_num, String account, String tsk_name, String tsk_content, String tas_img, double tsk_money,
			String tsk_state, Timestamp tsk_begTime, Timestamp tsk_oveTime, String tsk_limTime, String tsk_oveWay,
			String tsk_rmk, String tsk_chkstate) {
		super();
		this.tsk_num = tsk_num;
		this.account = account;
		this.tsk_name = tsk_name;
		this.tsk_content = tsk_content;
		this.tas_img = tas_img;
		this.tsk_money = tsk_money;
		this.tsk_state = tsk_state;
		this.tsk_begTime = tsk_begTime;
		this.tsk_oveTime = tsk_oveTime;
		this.tsk_limTime = tsk_limTime;
		this.tsk_oveWay = tsk_oveWay;
		this.tsk_rmk = tsk_rmk;
		this.tsk_chkstate = tsk_chkstate;
	}
	public String getTsk_num() {
		return tsk_num;
	}
	public void setTsk_num(String tsk_num) {
		this.tsk_num = tsk_num;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getTsk_name() {
		return tsk_name;
	}
	public void setTsk_name(String tsk_name) {
		this.tsk_name = tsk_name;
	}
	public String getTsk_content() {
		return tsk_content;
	}
	public void setTsk_content(String tsk_content) {
		this.tsk_content = tsk_content;
	}
	public String getTas_img() {
		return tas_img;
	}
	public void setTas_img(String tas_img) {
		this.tas_img = tas_img;
	}
	public double getTsk_money() {
		return tsk_money;
	}
	public void setTsk_money(double tsk_money) {
		this.tsk_money = tsk_money;
	}
	public String getTsk_state() {
		return tsk_state;
	}
	public void setTsk_state(String tsk_state) {
		this.tsk_state = tsk_state;
	}
	public Timestamp getTsk_begTime() {
		return tsk_begTime;
	}
	public void setTsk_begTime(Timestamp tsk_begTime) {
		this.tsk_begTime = tsk_begTime;
	}
	public Timestamp getTsk_oveTime() {
		return tsk_oveTime;
	}
	public void setTsk_oveTime(Timestamp tsk_oveTime) {
		this.tsk_oveTime = tsk_oveTime;
	}
	public String getTsk_limTime() {
		return tsk_limTime;
	}
	public void setTsk_limTime(String tsk_limTime) {
		this.tsk_limTime = tsk_limTime;
	}
	public String getTsk_oveWay() {
		return tsk_oveWay;
	}
	public void setTsk_oveWay(String tsk_oveWay) {
		this.tsk_oveWay = tsk_oveWay;
	}
	public String getTsk_rmk() {
		return tsk_rmk;
	}
	public void setTsk_rmk(String tsk_rmk) {
		this.tsk_rmk = tsk_rmk;
	}
	public String getTsk_chkstate() {
		return tsk_chkstate;
	}
	public void setTsk_chkstate(String tsk_chkstate) {
		this.tsk_chkstate = tsk_chkstate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
