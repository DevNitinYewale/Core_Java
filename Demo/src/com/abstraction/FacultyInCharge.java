package com.abstraction;

class FacultyInCharge extends PhdScholar{
	public int employee_id;
	public String cource_name;
	
	public FacultyInCharge(int employee_id, String cource_name) {
		super();
		this.employee_id = employee_id;
		this.cource_name = cource_name;
	}
	
	public void conductedLab() {
		labsAssign(cource_name);
		System.out.println("Employee Id: "+employee_id+" is Assigned the: "+cource_name+" lab");
	}
	@Override
	void help() {
		// TODO Auto-generated method stub
		System.out.println("phdScholar has helped the student to rectify errors:");
	}

}