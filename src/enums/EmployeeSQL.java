package enums;

/*employeeID,
manager,
name,
birthDate,
photo;*/

public enum EmployeeSQL {
	REGISTER;
	@Override
	public String toString() {
		String query= "";
		
		
		switch (this) {
		case REGISTER:
			query =	"INSERT INTO EMPLOYEES(EMPLOYEE_ID, MANAGER, NAME, BIRTH_DATE, PHOTO, NOTES)"
					+ " VALUES("
					+ " EMP_SEQ.NEXTVAL, ?, ?, ?, ?, ?)";
			
			break;

		default:
			break;
			
		}
		return query;
	}
}
