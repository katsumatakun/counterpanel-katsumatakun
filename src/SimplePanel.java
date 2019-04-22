import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimplePanel extends JPanel {
	JButton b;
	JLabel l;
	int num;
	Thread t;

	public SimplePanel() {
		b = new JButton("Press Me");
		l = new JLabel("0");
		num = 0;

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t = new Thread(new Updator());
				t.start();

			}
		});

		add(b);
		add(l);

	}

	private class Updator implements Runnable {
		@Override
		public void run() {
			for (num = 0; num <= 10; num++) {
				l.setText(Integer.toString(num));
				l.repaint();

				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}

		}

	}
}
