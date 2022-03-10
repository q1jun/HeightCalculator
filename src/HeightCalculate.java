import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeightCalculate extends JFrame {
    private JPanel contentPanel = null;
    private JTextField height = null;
    public HeightCalculate(){
        setTitle("身高计算器");
        setBounds(200,300,400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CardLayout cardLayout = new CardLayout();
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPanel);
        contentPanel.setLayout(cardLayout);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        contentPanel.add(jPanel);

        JLabel label = new JLabel("请输入你的身高：");
        label.setBounds(72,58,150,15);
        jPanel.add(label);

        height = new JTextField();
        height.setBounds(168,55,60,21);
        height.setColumns(10);
        jPanel.add(height);

        JLabel label1 = new JLabel("厘米（CM）。");
        label1.setBounds(240,58,100,15);
        jPanel.add(label1);

        JButton button =new JButton("开始计算");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateHeightActionPerformed(e);
            }
        });
        button.setBounds(72,120,93,23);
        jPanel.add(button);

        JButton button2 =new JButton("退出");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitActionPerformed(e);
            }
        });
        button2.setBounds(220,120,93,23);
        jPanel.add(button2);

        JLabel jLabel2 = new JLabel();
        jLabel2.setText("Design BY Q1JUN ");
        getContentPane().add(jLabel2, BorderLayout.PAGE_END);

    }

    private void exitActionPerformed(ActionEvent e) {
        this.setVisible(false);
        this.dispose();
    }

    private void calculateHeightActionPerformed(ActionEvent e) {
        float h = 0.00f;
        h = Float.parseFloat(height.getText());
        JOptionPane.showMessageDialog(this,"计算成功，你的身高是：" + h +
                "CM !","计算结果",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                HeightCalculate frame = new HeightCalculate();
                frame.setVisible(true);
            }
        });
    }
}
