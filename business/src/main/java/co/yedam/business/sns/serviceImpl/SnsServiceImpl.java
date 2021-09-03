package co.yedam.business.sns.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.business.common.DAO;
import co.yedam.business.sns.service.SnsService;
import co.yedam.business.sns.vo.CommentsVO;
import co.yedam.business.sns.vo.SnsVO;

	public class SnsServiceImpl implements SnsService {

		private Connection conn;
		private PreparedStatement psmt;
		private ResultSet rs;

		@Override
		public List<SnsVO> snsSelectList() {
			// TODO sns 글 목록 조회
			List<SnsVO> list = new ArrayList<SnsVO>();
			SnsVO vo;
			String sql = "select * from sns";

			try {
				conn = DAO.getConnection();
				psmt = conn.prepareStatement(sql);
				rs = psmt.executeQuery();

				while (rs.next()) {
					vo = new SnsVO();
					vo.setsNo(rs.getInt("sno"));
					vo.setsWriter(rs.getString("swriter"));
					vo.setsDate(rs.getDate("sdate"));
					vo.setsTitle(rs.getString("stitle"));
					vo.setsAno(rs.getInt("sano"));
					vo.setsContents(rs.getString("scontents"));
					list.add(vo);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close();
			}

			return list;
		}

		@Override
		public List<SnsVO> snsSelect(int no) {
			// TODO 선택한 글 조회 (댓글 포함)
			List<SnsVO> list = new ArrayList<SnsVO>();
			SnsVO vo;
			boolean b = false;
			String sql = "select a.*, b.cname, b.csubject, b.cdate " + "from sns a, comments b "
					+ "where a.sno = ? and b.sno = ? order by b.cno asc";
			try {
				conn = DAO.getConnection();
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, no);
				psmt.setInt(2, no);
				rs = psmt.executeQuery();
				if (!rs.next()) {
					sql = "select * from sns where sno = ?";
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1, no);
					rs = psmt.executeQuery();

					vo = new SnsVO();
					vo.setsNo(rs.getInt("sno"));
					vo.setsWriter(rs.getString("swriter"));
					vo.setsDate(rs.getDate("sdate"));
					vo.setsTitle(rs.getString("stitle"));
					vo.setsContents(rs.getString("scontents"));
					vo.setsAno(rs.getInt("sano"));
					list.add(vo);

				} else {
					while (!b) {
						vo = new SnsVO();
						vo.setsNo(rs.getInt("sno"));
						vo.setsWriter(rs.getString("swriter"));
						vo.setsDate(rs.getDate("sdate"));
						vo.setsTitle(rs.getString("stitle"));
						vo.setsContents(rs.getString("scontents"));
						vo.setsAno(rs.getInt("sano"));
						vo.setcName(rs.getString("cname"));
						vo.setcSubject(rs.getString("csubject"));
						vo.setcDate(rs.getDate("cdate"));
						list.add(vo);
						if(rs.next()) {
							continue;
						} else {
							b = true;
						}
					}
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close();
			}

			return list;
		}

		@Override
		public int snsInsert(SnsVO vo) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int commentsInsert(CommentsVO vo) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int snsUpdate(SnsVO vo) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int commentsUpdate(CommentsVO vo) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int snsDelete(SnsVO vo) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int commentsDelete(CommentsVO vo) {
			// TODO Auto-generated method stub
			return 0;
		}

		private void close() {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
