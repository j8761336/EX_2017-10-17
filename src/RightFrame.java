import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RightFrame extends JFrame {
        Container cp =new Container();
        JPanel JP =new JPanel(new GridLayout(3,3));
        JTextField JT =new JTextField();
        JButton jbtns[]=new JButton[9];

  public RightFrame(){
        imitComp();
    };
  public void imitComp(){
      this.addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              super.windowClosing(e);
          }
      });

        this.setBounds(300,300,400,500);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(5,5));
        cp.add(JT, BorderLayout.NORTH);
        cp.add(JP, BorderLayout.CENTER);

        JT.setEditable(false);
        for(int i=0;i<9;i++){
            jbtns[i]=new  JButton(Integer.toString(i));
            JP.add(jbtns[i]);
            jbtns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tmpButton = (JButton) e.getSource();
                    JT.setText(JT.getText() + tmpButton.getText());
                }
            });
        }
  }

}

