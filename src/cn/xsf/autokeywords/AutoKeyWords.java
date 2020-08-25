package cn.xsf.autokeywords;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImagingOpException;
import java.io.File;
import java.io.IOException;

public class AutoKeyWords extends JFrame {
    public static void main(final String[] args) {

        // 画出窗口
        final JFrame frame = new AutoKeyWords();
        frame.setLayout(null);
        frame.setTitle("AutoKeywords by XSF");
        frame.setSize(400, 200);

        // 添加按钮
        final JButton Write = new JButton("随机生成一个高质量Keywords");
        Write.setBounds(20, 120, 200, 30);
        Write.setVisible(true);
        frame.add(Write);

        // 设置字体
        final Font font = new Font("宋体", Font.BOLD, 11);
        Write.setFont(font);

        // 添加文本框&无用
        final JTextField textField = new JTextField();
        textField.setBounds(120, 20, 190, 22);
        textField.setVisible(false);
        frame.add(textField);
        frame.setVisible(true);

        Write.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AutoKeyWords autoKeyWords = new AutoKeyWords();
                File file = new File("C:\\keywords.txt");
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException d) {
                        d.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "<Keywords.txt>文件已创建于C盘", "Message",JOptionPane.INFORMATION_MESSAGE);
                    KeywordsWrite.main(null);
                    JOptionPane.showMessageDialog(null, "<Keywords.txt>写入成功 按下确定 打开文件", "Message",JOptionPane.INFORMATION_MESSAGE);
                    try {
                        Runtime.getRuntime().exec("C:\\WINDOWS\\system32\\notepad.exe C:\\keywords.txt");
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null, "<Keywords.txt>文件打开失败", "Message",JOptionPane.ERROR_MESSAGE);
                        e1.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "<Keywords.txt>文件已存在于C盘", "Message",JOptionPane.INFORMATION_MESSAGE);
                    KeywordsWrite.main(null);
                    JOptionPane.showMessageDialog(null, "<Keywords.txt>写入成功 按下确定 打开文件", "Message",JOptionPane.INFORMATION_MESSAGE);
                    try {
                        Runtime.getRuntime().exec("C:\\WINDOWS\\system32\\notepad.exe C:\\keywords.txt");
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null, "<Keywords.txt>文件打开失败", "Message",JOptionPane.ERROR_MESSAGE);
                        e1.printStackTrace();
                    }

                }

            }
        });
    }
}





