package co.yedam.emp;

public class Employee {
	int employeeId; // 사번
	String name; // 이름
	int departmentID;// 부서번호 10:인사 20:개발 30:영업(기본)
	String departmentName; // 부서명
	int salary; // 급여
	String email; // 이메일

	public Employee(int employeeId, String name) {
		this(employeeId, name, 0, 0, "");
	}

	public Employee(int employeeId, String name, String email) {
		this(employeeId, name, 0, 0, email);
	}

	public Employee(int employeeId, String name, int salary) {
		this(employeeId, name, 0, salary, "");
	}
	
	public Employee() {
		this(1004, "이한솔", 0, 5000, "leecldy@naver.com");
	}

	
	public Employee(int employeeId, String name, int departmentID, int salary, String email) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.email = email;
		
		if (this.departmentID == 0)
			this.departmentID = 30;
		
		this.departmentID = departmentID;			//초기화
		
		if (this.departmentID == 10) {
			this.departmentName = "인사";
		} else if (this.departmentID == 20) {
			this.departmentName = "개발";
		} else {
			this.departmentName = "영업";
		}
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", departmentID=" + departmentID
				+ ", departmentName=" + departmentName + ", salary=" + salary + ", email=" + email + "]";
	}

}
