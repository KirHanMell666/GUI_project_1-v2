import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

class ChildView extends JFrame {

    final ChildController childCtrl;

    int licznik;
    JTextField tf = new JTextField();
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();
    JScrollPane jsp = new JScrollPane(p);
    JButton bAdd = new JButton("Add Element");

    ChildView(ChildController logChildController) {
        this.childCtrl = logChildController;
        init();

    }

    void init() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    }

    void showLogs(List<Log> data) {
        setBackground(Color.DARK_GRAY);
        setTitle("Child Window");
        setSize(640, 480);

        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        for (Log log : data) {
            JLabel jLabel = new JLabel(log.toString());
            p.add(jLabel);
        }

        bAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                childCtrl.useButtonTextField(licznik);
            }
        });

        tf.setPreferredSize(new Dimension(300,25));

        p2.add(tf);
        p2.add(bAdd);
        add(jsp);
        add(p2);

        //validate();
        pack();
    }

    void create(String s)
    {
        p.add(new JLabel(s));
    }

    void start() {
        setVisible(true);
    }
}