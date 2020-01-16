package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;




public class DeptDAO{
	
	public ArrayList<DeptDTO> getDeptList() {
		ArrayList<DeptDTO> deptli = new ArrayList<DeptDTO>();
		DeptDTO dept = null;
		String sql = "select * from mydept";
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			con = DBUtil.getConnect();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				dept = new DeptDTO(rs.getString(1), rs.getString(2)
				, rs.getString(3) , rs.getString(4) , rs.getString(5));
				deptli.add(dept);
			}

		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, con);
		}
		return deptli;
		

	}
	public int insert(DeptDTO dept) {
		
	Connection con = null;
	PreparedStatement ptmt = null;

	String sql = "insert into mydept values(?,?,?,?,?)";
	int result = 0; 
	try {
		con = DBUtil.getConnect();
		ptmt = con.prepareStatement(sql);
		ptmt.setString(1, dept.getDeptNo());
		ptmt.setString(2, dept.getDeptName());
		ptmt.setString(3, dept.getLoc());
		ptmt.setString(4, dept.getTel());
		ptmt.setString(5, dept.getMgr());
		result = ptmt.executeUpdate();
		System.out.println(result + "�� �� ���Լ���");
	} 
	 catch (SQLException e) {
		e.printStackTrace();
		System.out.println("���� ���� : " + e.getMessage());
	} finally {
		DBUtil.close(null,ptmt,con); 
	}
	return result;
	
	}
	public int delete(String deptno) {
		
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "delete from mydept where deptno = ?";
		int result = 0 ; //������� ������ ����
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1,deptno);
			result = stmt.executeUpdate();
			System.out.println(result + "�� �� ��������");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
		
	}
	
	
}
