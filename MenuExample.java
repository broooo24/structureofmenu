package MenuExample;

import javax.swing.*;

class MenuExample {
	JMenu menu, submenu,menu2;
	JMenuItem a1, a2, a3, a4, a5, b1, b2, b3;

	MenuExample() {
		JFrame f = new JFrame("Menu and MenuItem Example");
		JMenuBar mb = new JMenuBar();
		menu = new JMenu("File");
		menu2 = new JMenu("Edit");
		submenu = new JMenu("Sub Menu");
		a1 = new JMenuItem("Open");
		a2 = new JMenuItem("Save");
		a3 = new JMenuItem("Close");
		a4 = new JMenuItem("Item 4");
		a5 = new JMenuItem("Item 5");
		b1 = new JMenuItem("Delete");
		b2 = new JMenuItem("Select");
		b3 = new JMenuItem("Find");

		menu.add(a1);
		menu.add(a2);
		menu.add(a3);
		menu2.add(b1);
		menu2.add(b2);
		menu2.add(b3);
		submenu.add(a4);
		submenu.add(a5);
		menu.add(submenu);
		mb.add(menu);
		mb.add(menu2);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new MenuExample();
	}
}