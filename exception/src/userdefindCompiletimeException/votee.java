package userdefindCompiletimeException;

public class votee {
	public static void main(String[] args) {
		int age=17;
		try {
			if (age<17) {
				throw new under_age_exception();
			}
		} catch (under_age_exception e) {
			e.printStackTrace();
		}
	}

}
