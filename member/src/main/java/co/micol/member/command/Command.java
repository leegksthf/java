package co.micol.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	//public 다른 패키지에서도 쓰려고. 실행하고 나서 결과를 스트링으로 돌려줌. 리퀘스트 객체와 리즈폰즈 객체를 받음.
	public String execute(HttpServletRequest request, HttpServletResponse response);
}
