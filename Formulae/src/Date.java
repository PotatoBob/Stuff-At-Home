import javax.swing.JOptionPane;

public class Date {
	String MMDDYYYY = null;
	int dayOfMonth = 0;
	int monthOfYear = 0;
	int lastDigitsOfYear = 0;
	int firstDigitsOfYear = 0;
	int part1 = 0;
	int part2 = 0;
	int part3 = 0;
	int part4 = 0;
	int part5 = 0;
	int part6 = 0;
	int ans = 0;
	public static void main(String[] args) {
		Date D = new Date();
	}
	Date() {
		MMDDYYYY = JOptionPane.showInputDialog("Type your date in the format MM/DD/YYYY");
		Check();
	}
	String Check() {
		if (Character.isDigit(MMDDYYYY.charAt(0))&&
				Character.isDigit(MMDDYYYY.charAt(1))&&
				Character.isDigit(MMDDYYYY.charAt(3))&&
				Character.isDigit(MMDDYYYY.charAt(4))&&
				Character.isDigit(MMDDYYYY.charAt(6))&&
				Character.isDigit(MMDDYYYY.charAt(7))&&
				Character.isDigit(MMDDYYYY.charAt(8))&&
				Character.isDigit(MMDDYYYY.charAt(9))&&
				MMDDYYYY.charAt(2)=='/'&&MMDDYYYY.charAt(5)=='/') {
			return calDay(MMDDYYYY);
		} else {
			JOptionPane.showMessageDialog(null, "Oops! You have a mistake in your input!");
			System.exit(0);
			return "ERROR";
		}
	}
	String calDay(String s) {
		dayOfMonth = Integer.parseInt(MMDDYYYY.substring(3, 5));
		monthOfYear = Integer.parseInt(MMDDYYYY.substring(0, 2));
		lastDigitsOfYear = Integer.parseInt(MMDDYYYY.substring(8, 10));
		firstDigitsOfYear = Integer.parseInt(MMDDYYYY.substring(6, 8));
		part1 = dayOfMonth;
		part2 = (13*monthOfYear-1)/5;
		part3 = lastDigitsOfYear;
		part4 = lastDigitsOfYear/4;
		part5 = firstDigitsOfYear/4;
		part6 = 2*firstDigitsOfYear;
		ans = part1+part2+part3+part4+part5-part6;
		ans = ans+2;
		ans = ans%7;
		if(ans==0) {
			JOptionPane.showMessageDialog(null, "Sunday");
			return "Sunday";
		} else if(ans==1) {
			JOptionPane.showMessageDialog(null, "Monday");
			return "Monday";
		} else if(ans==2) {
			JOptionPane.showMessageDialog(null, "Tuesday");
			return "Tuesday";
		} else if(ans==3) {
			JOptionPane.showMessageDialog(null, "Wednesday");
			return "Wednesday";
		} else if(ans==4) {
			JOptionPane.showMessageDialog(null, "Thursday");
			return "Thursday";
		} else if(ans==5) {
			JOptionPane.showMessageDialog(null, "Friday");
			return "Friday";
		} else {
			JOptionPane.showMessageDialog(null, "Saturday");
			return "Saturday";
		}
	}
}

