package co.friend.access;
//FriendAccess.java, FriendList.java

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import co.friend.model.Friend;
import co.friend.util.DAO;

public class FriendDAO extends DAO implements FriendAccess {

	PreparedStatement psmt;
	ResultSet rs;
	String sql;
	
	// name, tel 값을 담아주는 컬렉션 
	public Map<String, String> getNameTel(){
		Map<String, String> friends = new HashMap<>();
		try {
			psmt = conn.prepareStatement("select name, tel from friend");
			rs = psmt.executeQuery();
			if (rs.next()) {
				friends.put(rs.getString("name"),rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return friends;
	}
	
	@Override
	public void insert(Friend friend) {
		// 입력쿼리 만들고 executeUpdate()메소드 호출해서 한건 입력완성해보세요.
		try {
			psmt = conn.prepareStatement("insert into friend values(?,?,?)");
			psmt.setString(1, friend.getGubun());
			psmt.setString(2, friend.getName());
			psmt.setString(3, friend.getTel());
			int r = psmt.executeUpdate(); // insert, update, delete 할 때 사용.
			System.out.println(r + "건 입력.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Friend friend) {
		// 구분, 이름, 전화
		// 동일한 이름은 없다는 전제
		// where name=?
		try {
			psmt = conn.prepareStatement("update friend set tel=? where name=?");
			psmt.setString(1, friend.getTel());
			psmt.setString(2, friend.getName());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String name) {
		try {
			psmt = conn.prepareStatement("delete from friend where name = ?");
			psmt.setString(1, name);
			int r = psmt.executeUpdate();
			System.out.println(r + "삭제되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Friend> selectAll() {
		ArrayList<Friend> fList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from friend");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Friend friend = new Friend();
				friend.setGubun(rs.getString("gubun"));
				friend.setName(rs.getString("name"));
				friend.setTel(rs.getString("tel"));
				fList.add(friend); // 데이터건수만큼 ArrayList에 담아서 반환.
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fList;
	}

	@Override
	public Friend selectOne(String name) {
		ArrayList<Friend> fList = new ArrayList<>();
		Friend f = null;
		try {
			psmt = conn.prepareStatement("select * from friend where name = ?");
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			if (rs.next()) {
				f = new Friend();
				f.setGubun(rs.getString("gubun"));
				f.setName(rs.getString("name"));
				f.setTel(rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public Friend findTel(String tel) {

	
		return null;
	}

}
