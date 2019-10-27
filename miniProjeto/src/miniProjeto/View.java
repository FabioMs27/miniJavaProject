package miniProjeto;

import javax.swing.JOptionPane;

public class View {
	public static String getString(String msg, String title) {
		return JOptionPane.showInputDialog(null, msg, title, JOptionPane.QUESTION_MESSAGE);
	}
	
	public static void getAfirmative(String msg, String title) {
		JOptionPane.showInputDialog(null, title, msg, JOptionPane.DEFAULT_OPTION);
	}
	
	public static void getError(String msg, String title) {
		JOptionPane.showInputDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
	}
	
	public static int getInteger(String msg, String title) {
		return Integer.parseInt(View.getString(title, msg));
	}
	
	public static double getDouble(String msg, String title) {
		return Double.parseDouble(View.getString(title, msg));
	}
	
	public static float getFloat(String msg, String title) {
		return Float.parseFloat(View.getString(title, msg));
	}
}
