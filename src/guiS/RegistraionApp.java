package guiS;

import java.awt.EventQueue;

/**
	 * Launch the application.
	 */public class RegistraionApp
	 {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegApp window = new RegApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
//"Stack Overflow". Stackoverflow.com. N.p., 2016. Web. (Accessed 30/09/2016).
//	 "Stack Overflow". Stackoverflow.com. N.p., 2016. Web. (Accessed 25/09/2016.