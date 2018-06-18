package calculator;

import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        gui obj = new gui(); 
        obj.setTitle("Kalkulator");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(3); 
    }
    
}
