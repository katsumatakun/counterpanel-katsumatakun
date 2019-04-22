import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	JFrame frame = new JFrame();

	SimplePanel sp = new SimplePanel();

	frame.getContentPane().add(sp);
	frame.pack();
	frame.setVisible(true);


    }
}
