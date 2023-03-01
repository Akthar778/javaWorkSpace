import java.util.jar.Attributes.Name;

public class schoolProject {
	static int studentstoall=100;
	int lectulars=100;
	
	
	static void welcome () {
		System.out.println("welcome");
	}
	static void adding(int add) {
		studentstoall=add+studentstoall;
	}
	int stored() {
		return studentstoall;
	}
	static void afteradding() {
		System.out.println("after adding "+studentstoall);
	}
	static void remove(int rem) {
		studentstoall=studentstoall-rem;
	}
	int afterremoving() {
		return studentstoall;
	}
	static void afterremovingReturnvalue() {
		System.out.println("after remvoing student"+studentstoall);
	}
	
	void totallec() {
		System.out.println(100);
	}
	void addinglec(int addlec) {
		lectulars=lectulars+addlec;
	}
	int returnintdatatype() {
		return lectulars;
	}
	void afterreturn() {
		System.out.println("after return "+lectulars);
	}

	
	
	public static void main(String[] args) {
		welcome(); adding(10); afteradding(); remove(20); afterremovingReturnvalue();
	    System.out.println(studentstoall);
	}
}
