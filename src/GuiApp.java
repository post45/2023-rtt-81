import javax.swing.*;

public class GuiApp {
    String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null,"Hello " + name);

    int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
		JOptionPane.showMessageDialog(null,"You are  " + age +" Years old");

    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null,"You are  " + height +" ft tall");
}
