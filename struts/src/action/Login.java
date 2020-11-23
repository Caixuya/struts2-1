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
		System.out.println("接收到登录请求:username:"+username+",password");
		if(!username.equals("")&&!password.equals("")) {
			String message="登录成功"+username;
			ActionContext.getContext().getValueStack().set("message", message);
			return "ok";
			
			}
		if(username.equals("")&&!password.equals("")) {
			String message="登录失败,用户名为空";
			ActionContext.getContext().getValueStack().set("message", message);
			return "error";
			
			}
		if(!username.equals("")&&password.equals("")) {
			String message="登录失败,密码为空";
			ActionContext.getContext().getValueStack().set("message", message);
			return "error";
			
			}
		else {
				String message="登录失败，用户名和密码为空";
				ActionContext.getContext().getValueStack().set("message", message);
				return "error";
			}
	}

}
