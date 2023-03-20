/**
 * 
 */
package GroupAssignment;

/**
 * @author Aditi
 *
 */
public class Main {

	public static void main(String[] args) {

		AdminDepartment admindept = new AdminDepartment();
		HrDepartment hrdept = new HrDepartment();
		TechDepartment techdept = new TechDepartment();

		System.out.println(admindept.departmentName());
		System.out.println(admindept.getTodaysWork());
		System.out.println(admindept.getWorkDeadline());
		System.out.println(admindept.isTodayaHoliday());
		System.out.println();

		System.out.println(hrdept.departmentName());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayaHoliday());
		System.out.println();

		System.out.println(techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.techStackInformation());
		System.out.println(techdept.isTodayaHoliday());

	}

}
