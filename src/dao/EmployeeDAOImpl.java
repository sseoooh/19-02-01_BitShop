package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import domain.EmployeeDTO;
import enums.EmployeeSQL;
import enums.Vendor;
import factory.DatabaseFactory;

public class EmployeeDAOImpl implements EmployeeDAO{

	private static EmployeeDAOImpl instance = new EmployeeDAOImpl();
	private EmployeeDAOImpl() {dao = EmployeeDAOImpl.getInstance();}
	public static EmployeeDAOImpl getInstance() {return instance;}
	EmployeeDAOImpl dao;
	
	@Override
	public void insertEmployee(EmployeeDTO emp) {
		try {
			//입력순서 :  MANAGER, NAME, BIRTH_DATE, PHOTO, NOTES
			String sql = String.format(EmployeeSQL.REGISTER.toString(),
					emp.getManager(),emp.getName(),emp.getBirthDate(),emp.getPhoto(),emp.getNotes()
					);
			System.out.println("실행할쿼리:"+sql);
			Connection conn =
				DatabaseFactory
				.createDatabase(Vendor.ORACLE)
				.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  emp.getManager());
			pstmt.setString(2,  emp.getName());
			pstmt.setString(3,  emp.getBirthDate());
			pstmt.setString(4,  emp.getPhoto());
			pstmt.setString(5,  emp.getNotes());
			int rs = pstmt.executeUpdate();
			
			System.out.println((rs==1) ? "입력성공":"입력실패");
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<EmployeeDTO> selectEmployeeList() {

		return dao.selectEmployeeList();
	}

	@Override
	public List<EmployeeDTO> selectEmployeesByName(String SearchWord) {
		return dao.selectEmployeesByName(SearchWord);
	}

	@Override
	public EmployeeDTO selectEmployee(String SearchWord) {
		return dao.selectEmployee(SearchWord);
	}

	@Override
	public int countEmployees() {
		return dao.countEmployees();
	}

	@Override
	public void updateEmployee(EmployeeDTO emp) {
		
	}

	@Override
	public void deleteEmployee(EmployeeDTO emp) {
		
	}

}
