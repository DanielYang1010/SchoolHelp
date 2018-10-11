package modle;

public class Administrator {


	   private String adm_account;
	   private String adm_pwd;
	   private String adm_name;
	   private String adm_img;
	   private String adm_jur;
	public Administrator(String adm_account, String adm_pwd, String adm_name, String adm_img, String adm_jur) {
		super();
		this.adm_account = adm_account;
		this.adm_pwd = adm_pwd;
		this.adm_name = adm_name;
		this.adm_img = adm_img;
		this.adm_jur = adm_jur;
	}
	public String getAdm_account() {
		return adm_account;
	}
	public void setAdm_account(String adm_account) {
		this.adm_account = adm_account;
	}
	public String getAdm_pwd() {
		return adm_pwd;
	}
	public void setAdm_pwd(String adm_pwd) {
		this.adm_pwd = adm_pwd;
	}
	public String getAdm_name() {
		return adm_name;
	}
	public void setAdm_name(String adm_name) {
		this.adm_name = adm_name;
	}
	public String getAdm_img() {
		return adm_img;
	}
	public void setAdm_img(String adm_img) {
		this.adm_img = adm_img;
	}
	public String getAdm_jur() {
		return adm_jur;
	}
	public void setAdm_jur(String adm_jur) {
		this.adm_jur = adm_jur;
	}
	  
	
	
	
	
	
}
