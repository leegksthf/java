package comment;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommentsDAO extends DAO{
	private static CommentsDAO instance;
	
	public static CommentsDAO getInstance() {
		if(instance != null) {
			return instance;
		}
		return new CommentsDAO();
	}
	
	// 댓글목록
	public List<HashMap<String, Object>> selectAll() {
		connect();
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from comments order by id");
			while(rs.next()) {
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put("id", rs.getInt("id"));
				map.put("name", rs.getString("name"));
				map.put("content", rs.getString("content"));
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	
	//수정..
	public HashMap<String, Object> update(Comments comment){
		
	}
	
	// 입력.
	public HashMap<String, Object> insert(Comments comment) {
		// 현재 시퀀스번호 - 번호+1 - 입력 - 시퀀스+1
		connect();
		int currentId = 0;
		HashMap<String, Object> map = new HashMap<String, Object>();
		try {
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select value from id_repository where name = 'COMMENT'");
			if(rs.next()) {
				currentId = rs.getInt(1);
			}
			currentId++; // 새로운 시퀀스번호로..
			psmt = conn.prepareStatement("update id_repository set value=? where name = 'COMMENT'");
			psmt.setInt(1, currentId);
			psmt.executeUpdate();
			
			psmt = conn.prepareStatement("insert into comments(id, name, content) values(?,?,?)");
			psmt.setInt(1, currentId);
			psmt.setString(2, comment.getName());
			psmt.setString(3, comment.getContent());
			psmt.executeUpdate();
			conn.commit();// 실제..커밋.
			map.put("id", currentId);
			map.put("name", comment.getName());
			map.put("content", comment.getContent());
			map.put("code", "success");
			
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback(); //예외 발생 시 롤백..
			} catch(SQLException e1) {
				e1.printStackTrace();
			}
			map.put("code", "error");

		} finally {
				disconnect();
			}
			return map; // 처리된 결과를 변환.
		}
	}
		
		//HashMap<String, Object> cId = new HashMap<String, Object>();
		//Id.put("id", currentId);