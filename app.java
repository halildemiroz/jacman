import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app{
	public static void main(String[] args){
		JFrame frame = new JFrame("hellooo");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar mb = new JMenuBar();
		JMenu fm = new JMenu("File");
		JMenuItem openitem = new JMenuItem("open");
		JMenuItem exititem = new JMenuItem("exit");
		fm.add(openitem);
		fm.addSeparator();
		fm.add(exititem);
		mb.add(fm);

		JPanel panel = new JPanel();
		JButton button = new JButton("click me");

		panel.setBounds(100,100,50,50);
		panel.add(button);

		frame.add(panel);
		frame.setJMenuBar(mb);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
