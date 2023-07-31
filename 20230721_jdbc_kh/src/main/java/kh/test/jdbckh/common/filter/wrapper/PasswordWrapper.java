package kh.test.jdbckh.common.filter.wrapper;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class PasswordWrapper extends HttpServletRequestWrapper{

	public PasswordWrapper(HttpServletRequest request) {
		super(request);
		
		
	}

	@Override
	public String getParameter(String name) {
		System.out.println("[암호화전]"+name.length()+","+name );
		if(name != null && name.equals("pwd")) { //request.getparameter("pwd")가 호출되면 
//			name = 
		}else { //request.getParameter("pwd와 다른 이름")가 호출되면 
			name = super.getParameter(name);
		}
		System.out.println("[암호화된 크기]"+name.length()+","+name );
		
		return name;
	}
	private String getSha512(String pwd) {
		String result = null;
		//SHA-512 암호화메소드 
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512"); //Singleton
			byte[] pwdbytes = pwd.getBytes(Charset.forName("UTF-8"));
			md.update(pwdbytes); //암호화함.
			//암호화된 byte[]를 다시 String형으로 변형
			result = Base64.getEncoder().encodeToString(pwdbytes);//88자 String형태 
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result;
	}
}
