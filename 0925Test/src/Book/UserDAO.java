package Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO extends DAO implements UserAccess {

	static PreparedStatement psmt;
	static ResultSet rs;

	@Override
	public boolean join(User user) {
		try {
			psmt = connect().prepareStatement("insert into user (name,pwd,birth,phone) values(?,?,?,?)");
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getPwd());
			psmt.setString(3, user.getBirth());
			psmt.setString(4, user.getPhone());
			int result = psmt.executeUpdate(); // 실행 -> 저장
			if (result > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public int login(String name, String pwd) {
		try {
			psmt = connect().prepareStatement("SELECT pwd from user where name = ?");
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			while (rs.next()) {
				// 패스워드 일치한다면 실행
				if (rs.getString("pwd").equals(pwd)) {
					return 1; // 라긴 성공
				} else
					return 0; // 비밀번호 불일치
			}
			return -1; // 아이디가 없음 오류
		} catch (Exception e) {
			e.printStackTrace();
		}

		return -2; // 데이터베이스 오류를 의미
	}

	@Override
	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String userSearch(String birth) {
		String userName = "";
		try {
			psmt = connect().prepareStatement("select name from user where birth = ?");
			psmt.setString(1, birth);
			rs = psmt.executeQuery();
			while (rs.next()) {
				userName = rs.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userName;
	}

	@Override
	public boolean userUpdate(User user) {
		try {
			psmt = connect().prepareStatement("update user set pwd=?, birth=?, phone=? where name = ?");
			psmt.setString(1, user.getPwd());
			psmt.setString(2, user.getBirth());
			psmt.setString(3, user.getPhone());
			psmt.setString(4, user.getName());
			int r = psmt.executeUpdate();
			
			if(r != 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean userDelete(String name, String pwd) {
		try {
			psmt = connect().prepareStatement("delete from user where name=? and pwd=?");
			psmt.setString(1, name);
			psmt.setString(2, pwd);
			int r = psmt.executeUpdate();
			if(r != 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
