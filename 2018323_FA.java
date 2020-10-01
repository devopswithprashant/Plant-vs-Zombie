

import javafx.util.Pair;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Application {

    public static JPanel p_name;

    public static JLabel l_name;
    public static JTextField tf_name;


    public static void main(String[] args) {
        Runner r = new Runner();


        JFrame frame = new JFrame("Runner");


        JPanel p_main = new JPanel();
        p_main.setLayout(new BoxLayout(p_main, BoxLayout.Y_AXIS));

        p_name = new JPanel();
        p_name.setLayout(new FlowLayout(FlowLayout.CENTER));
        p_main.add(p_name);

        l_name = new JLabel("NUMBER OF PARTICIPANTS");
        tf_name = new JTextField();
        tf_name.setPreferredSize(new Dimension(50, 30));
        p_name.add(l_name);
        p_name.add(tf_name);


////////////////////////////////////
        JPanel p_name = new JPanel();
        p_name.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel l_name = new JLabel("NAME : ");
        JTextField tf_name = new JTextField();
        tf_name.setPreferredSize(new Dimension(250, 50));

        p_name.add(l_name);
        p_name.add(tf_name);

        p_main.add(p_name);

        ////////////////////////////////////////////////////

        JPanel p_GDRWINNER = new JPanel();
        p_GDRWINNER.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel l_GDRWINNER = new JLabel("GDR WINNER : ");
        JTextField tf_GDRWINNER = new JTextField();
        tf_GDRWINNER.setPreferredSize(new Dimension(150, 50));

        p_GDRWINNER.add(l_GDRWINNER);
        p_GDRWINNER.add(tf_GDRWINNER);
        p_main.add(p_GDRWINNER);

        ////////////////////////////////////////////////////////

        JPanel p_GDRRUNNER_UP = new JPanel();
        p_GDRRUNNER_UP.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel l_GDRRUNNER_UP = new JLabel("GDR RUNNER_UP : ");
        JTextField tf_GDRRUNNER_UP = new JTextField();
        tf_GDRRUNNER_UP.setPreferredSize(new Dimension(150, 50));

        p_GDRRUNNER_UP.add(l_GDRRUNNER_UP);
        p_GDRRUNNER_UP.add(tf_GDRRUNNER_UP);
        p_main.add(p_GDRRUNNER_UP);


////////////////////////////////////
        JPanel p_ORWINNER = new JPanel();
        p_ORWINNER.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel l_ORWINNER = new JLabel("OR WINNER : ");
        JTextField tf_ORWINNER = new JTextField();
        tf_ORWINNER.setPreferredSize(new Dimension(150, 50));

        p_ORWINNER.add(l_ORWINNER);
        p_ORWINNER.add(tf_ORWINNER);
        p_main.add(p_ORWINNER);

        ////////////////////////////////////////////////////////

        JPanel p_ORRUNNER_UP = new JPanel();
        p_ORRUNNER_UP.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel l_ORRUNNER_UP = new JLabel("OR RUNNER_UP : ");
        JTextField tf_ORRUNNER_UP = new JTextField();
        tf_ORRUNNER_UP.setPreferredSize(new Dimension(150, 50));

        p_ORRUNNER_UP.add(l_ORRUNNER_UP);
        p_ORRUNNER_UP.add(tf_ORRUNNER_UP);
        p_main.add(p_ORRUNNER_UP);

        ////////////////////////////////////////////////////////////////
        JPanel p_HMWINNER = new JPanel();
        p_HMWINNER.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel l_HMWINNER = new JLabel("HM WINNER : ");
        JTextField tf_HMWINNER = new JTextField();
        tf_HMWINNER.setPreferredSize(new Dimension(150, 50));

        p_HMWINNER.add(l_HMWINNER);
        p_HMWINNER.add(tf_HMWINNER);
        p_main.add(p_HMWINNER);

        ////////////////////////////////////////////////////////

        JPanel p_HMRUNNER_UP = new JPanel();
        p_HMRUNNER_UP.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel l_HMRUNNER_UP = new JLabel("HM RUNNER_UP : ");
        JTextField tf_HMRUNNER_UP = new JTextField();
        tf_HMRUNNER_UP.setPreferredSize(new Dimension(150, 50));

        p_HMRUNNER_UP.add(l_HMRUNNER_UP);
        p_HMRUNNER_UP.add(tf_HMRUNNER_UP);
        p_main.add(p_HMRUNNER_UP);

        ////////////////////////////////////////////////////










        JPanel p_time = new JPanel();
        p_time.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel l_time = new JLabel("TIME(in minutes) : ");
        JTextField tf_time = new JTextField();
        tf_time.setPreferredSize(new Dimension(70, 30));

        p_time.add(l_time);
        p_time.add(tf_time);

        p_main.add(p_time);

        //////////////////////////////////////////////

        JPanel p_type = new JPanel();
        p_type.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel l_type = new JLabel("CATEGORY OF MARATHON : ");

        p_type.add(l_type);

        p_main.add(p_type);

        /////////////////////////////////////////////////


        ButtonGroup bg_joined = new ButtonGroup();

        JRadioButton GDR = new JRadioButton("Great Delhi Run");
        JRadioButton OR = new JRadioButton("Open 10K Run");
        JRadioButton HM = new JRadioButton("Half Marathon");

        bg_joined.add(GDR);
        bg_joined.add(OR);
        bg_joined.add(HM);

        p_type.add(GDR);
        p_type.add(OR);
        p_type.add(HM);


        /////////////////////////////////////////////////

        JPanel p_buttons = new JPanel();
        p_buttons.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton b_Winner = new JButton("WINNER");

        b_Winner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pair<String,String> first = r.GDR_Winner(r.head,r.head);
                Pair<String,String> sec = r.OR_Winner(r.head,r.head);
                Pair<String,String> thir = r.HM_Winner(r.head,r.head);
                tf_GDRWINNER.setText(first.getKey()+" "+"1,35,000/-");
                tf_GDRRUNNER_UP.setText(first.getValue()+" "+"1,15,000/-");
                tf_ORWINNER.setText(sec.getKey()+" "+"1,90,000/-");
                tf_ORRUNNER_UP.setText(sec.getValue()+" "+"1,50,000/-");
                tf_HMWINNER.setText(thir.getKey()+" "+"2,80,000/-");
                tf_HMRUNNER_UP.setText(thir.getValue()+" "+"2,10,000/-");




            }
        });
        /////////////////////////////////////////////////


        JPanel p_sec = new JPanel();
        p_sec.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton b_cancel = new JButton("CANCEL");
        b_cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        ////////////////////////////////////////////////////

        JPanel p_third = new JPanel();
        p_third.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton b_next = new JButton("NEXT");
        b_next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = tf_name.getText();
                String t = tf_time.getText();
                boolean gdr = GDR.isSelected();
                boolean or = OR.isSelected();
                boolean hm = HM.isSelected();
                if (gdr) {

                    r.addFirst(n, t, "GDR");
                    tf_name.setText("");
                    tf_time.setText("");
                    bg_joined.clearSelection();
                } else if (or) {
                    r.addFirst(n, t, "OR");
                    tf_name.setText("");
                    tf_time.setText("");
                    bg_joined.clearSelection();

                } else {
                    r.addFirst(n, t, "HM");
                    tf_name.setText("");
                    tf_time.setText("");
                    bg_joined.clearSelection();

                }
            }
        });


        p_buttons.add(b_Winner);
        p_main.add(p_buttons);

        p_sec.add(b_cancel);
        p_main.add(p_sec);

        p_third.add(b_next);
        p_main.add(p_third);

////////////////////////////////////


        frame.add(p_main);
        frame.setSize(1000, 900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


////////////////////////////////////

    }


    static class Runner {
        private class Node {
            String name;
            String time;
            String type;
            Node next;

            public Node(String name, String time, String type, Node next) {
                this.name = name;
                this.time = time;
                this.type = type;
                this.next = next;
            }
        }

        public Node head;
        public Node tail;
        public int size;

        public void addFirst(String name, String time, String type) {
            Node nn = new Node(name, time, type, null);
            nn.next = this.head;
            if (size == 0) {
                this.head = nn;
                this.tail = nn;
                this.size++;
            } else {
                this.head = nn;
                this.size++;
            }
        }

        public static Pair GDR_Winner(Node n, Node f){
            int i, first, second;

            first = second = Integer.MAX_VALUE;

            Node temp = n;

            while (temp != null)
            {
                int local = Integer.parseInt(temp.time);
                if (local < first && temp.type=="GDR")
                {
                    second = first;
                    first = local;

                }


                else if (local < second && local != first && temp.type=="GDR")
                    second = local;


                temp = temp.next;
            }
            String fir = "";
            String sec = "";
            while (f.next!=null){
                int te = Integer.parseInt(f.time);
                if(te==first){
                    fir = f.name;
                }
                if(te==second){
                    sec = f.name;
                }
                f = f.next;

            }


            Pair<String,String> win = new Pair<>(fir,sec);
            return win;

        }

        public static Pair OR_Winner(Node n, Node f){
            int i, first, second;

            first = second = Integer.MAX_VALUE;

            Node temp = n;

            while (temp != null)
            {
                int local = Integer.parseInt(temp.time);
                if (local < first && temp.type=="OR")
                {
                    second = first;
                    first = local;

                }


                else if (local < second && local != first&&temp.type=="OR")
                    second = local;


                temp = temp.next;
            }
            String fir = "";
            String sec = "";
            while (f.next!=null){
                int te = Integer.parseInt(f.time);
                if(te==first){
                    fir = f.name;
                }
                if(te==second){
                    sec = f.name;
                }
                f = f.next;

            }


            Pair<String,String> win = new Pair<>(fir,sec);
            return win;

        }

        public static Pair HM_Winner(Node n, Node f){
            int i, first, second;

            first = second = Integer.MAX_VALUE;

            Node temp = n;

            while (temp != null)
            {
                int local = Integer.parseInt(temp.time);
                if (local < first && temp.type=="HM")
                {
                    second = first;
                    first = local;

                }


                else if (local < second && local != first && temp.type=="HM")
                    second = local;


                temp = temp.next;
            }
            String fir = "";
            String sec = "";
            while (f.next!=null){
                int te = Integer.parseInt(f.time);
                if(te==first){
                    fir = f.name;
                }
                if(te==second){
                    sec = f.name;
                }
                f = f.next;

            }


            Pair<String,String> win = new Pair<>(fir,sec);
            return win;

        }

    }
}

