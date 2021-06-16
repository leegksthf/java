package Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO extends DAO implements UserAccess {

	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;

	@Override
	public ArrayList<User> UserList() {
		connect();
		ArrayList<User> userList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from user");
			rs = psmt.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getString("id"));
				user.setPwd(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setBirth(rs.getString("birth"));
				user.setPhone(rs.getString("tel"));
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public void userUpdate(User user) {
		try {
			psmt = conn.prepareStatement("update user set id=?, name=?, birth=?, phone=? where pwd=?");
			psmt.setString(1, user.getId());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getBirth());
			psmt.setString(4, user.getPhone());
			psmt.setString(5, user.getPwd());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void join(User user) {
//	        boolean ok = false;
		try {
			psmt = conn.prepareStatement("insert into user values(?,?,?,?,?)");
			// rs = psmt.executeQuery();
			psmt.setString(1, user.getId());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getBirth());
			psmt.setString(4, user.getPhone());
			psmt.setString(5, user.getPwd());
			psmt.executeUpdate(); // 실행 -> 저장
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//	            if(r>0){
//	                System.out.println("가입 성공");   
//	              
//	            }else{
//	                System.out.println("가입 실패");
//	            }
//	          
//	        }catch(Exception e){
//	            e.printStackTrace();
//	        }
//	    }//insertMmeber
//	   
//		
//	}

//	    	public UserDAO() {
//	    		try {
//	    			String dbURL = "jdbc:mysql://localhost:3306/DAEHEE?serverTimezone=UTC";
//	    			String dbID = "root";
//	    			String dbPassword = "1234";
//	    			Class.forName("com.mysql.jdbc.Driver");
//	    			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
//	    		}catch (Exception e) {
//	    			e.printStackTrace();//오류 출력
//	    			}
//	        

	@Override
	public int login(String id, String pwd) {
		try {
			psmt = conn.prepareStatement("SELECT pwd from user where id = ?");
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			while (rs.next()) {
				// 패스워드 일치한다면 실행
				if (rs.getString(1).equals(pwd)) {
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

	public int userCheck(String id, String pwd) {

		int x = -1;
		String dbpasswd = "";

		try {
			psmt = conn.prepareStatement("SELECT pwd from user where id = ?");
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			if (rs.next()) {
				dbpasswd = rs.getString("passwd");
				if (dbpasswd.equals(pwd))
					x = 1; // 인증성공
				else
					x = 0; // 비밀번호 틀림
			} else
				x = -1; // 해당 아이디 없음
		} catch (Exception e) {
			e.printStackTrace();
		}
//		        }finally{
//		            execClose(rs,psmt,conn);
//		        }
		return x;
	}

	@Override
	public void logOut() {

	}

//	public int userCheck(String id, String passwd)throws Exception{
//		         
//		        Connection conn= null;
//		        PreparedStatement pstmt = null;
//		        ResultSet rs =null;
//		        String sql="";
//		        String dbpasswd="";
//		        int x = -1;
//		         
//		        try{
//		            conn =getConnection();
//		            sql ="select passwd from MEMBER where id = ?";
//		            pstmt =conn.prepareStatement(sql);
//		            pstmt.setString(1, id);
//		            rs=pstmt.executeQuery();
//		             
//		            if(rs.next()){
//		                dbpasswd =rs.getString("passwd");
//		                if(dbpasswd.equals(passwd))
//		                    x=1; //인증성공
//		                else
//		                    x=0; //비밀번호 틀림
//		            }else
//		                x=-1; //해당 아이디 없음
//		        }catch(Exception e){
//		            e.printStackTrace();
//		        }finally{
//		            execClose(rs,pstmt,conn);
//		        }
//		        return x;
//		    }

	@Override
	public User userSearch(String name) {
		ArrayList<User> userList = new ArrayList<>();
		User user = null;
		try {
			psmt = conn.prepareStatement("select * from user where name=?");
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setId(rs.getString("id"));
				user.setPwd(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setBirth(rs.getString("birth"));
				user.setPhone(rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void userDelete(String id, String pwd) {
		try {
			psmt = conn.prepareStatement("delete from user where id=?, pwd=?");
			psmt.setString(1, id);
			psmt.setString(2, pwd);
			int r = psmt.executeUpdate();
//			System.out.println("삭제할 아이디가 맞나요? [Y/N] ");
			System.out.println(r + "삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
