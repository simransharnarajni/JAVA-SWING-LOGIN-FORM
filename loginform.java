import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class loginform {
    public static void main (String[] args) {
        JFrame jFrame =new JFrame ("LOGIN FORM");
        JLabel jLabel=new JLabel ("Username:");
        jLabel.setBounds ( 80,80,200,100 );
        jFrame.add ( jLabel );

        JTextField jTextField=new JTextField ();
        jTextField.setBounds ( 230,120,150,20 );
        jFrame.add ( jTextField );

        JLabel jLabel1 =new JLabel ("Password:");
        jLabel1.setBounds ( 80,120,200,100 );
        JPasswordField jPasswordField=new JPasswordField ();
        jPasswordField.setBounds (230,160,150,20  );
        jFrame.add(jLabel1);
        jFrame.add ( jPasswordField );

        JButton jButton=new JButton ("Login");
        jButton.setBounds (180,200,100,30  );
        jButton.addActionListener ( new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                System.out.println("Username: "+ jTextField.getText ());
                System.out.println("Password: "+ jPasswordField.getText ());
            }
        } );
        jFrame.add(jButton);

        jFrame.setLayout ( null );
        jFrame.setSize ( 500, 400 );
        jFrame.setVisible ( true );
        jFrame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
    }
}
