import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimplePanel extends JPanel {
	JButton b;
	JLabel l;
	int num;

	public SimplePanel() {
		b = new JButton("Press Me");
		l = new JLabel("0");
		num = 0;

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				for (num = 0; num <= 10; num++){
					l.setText(Integer.toString(num));
					l.repaint();

					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}

			}
		});

		add(b);
		add(l);

	}

}
