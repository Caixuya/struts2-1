package action;

import com.opensymphony.xwork2.ActionContext;

public class Login {

	private String username;
	private String password;
	public void setUsername(String username) {
		this.username=username;
	}	
	public void setPassword(String password) {
		this.password=password;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String check(){
		System.out.println("���յ���¼����:username:"+username+",password");
		if(!username.equals("")&&!password.equals("")) {
			String message="��¼�ɹ�"+username;
			ActionContext.getContext().getValueStack().set("message", message);
			return "ok";
			
			}
		if(username.equals("")&&!password.equals("")) {
			String message="��¼ʧ��,�û���Ϊ��";
			ActionContext.getContext().getValueStack().set("message", message);
			return "error";
			
			}
		if(!username.equals("")&&password.equals("")) {
			String message="��¼ʧ��,����Ϊ��";
			ActionContext.getContext().getValueStack().set("message", message);
			return "error";
			
			}
		else {
				String message="��¼ʧ�ܣ��û���������Ϊ��";
				ActionContext.getContext().getValueStack().set("message", message);
				return "error";
			}
	}

}
