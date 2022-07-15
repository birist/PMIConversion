package com.company;


import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame  {

    private JTree tree;


    public Main() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        PMI pmi = new PMI();

        pmi.getControllers();

        root.add(pmi);

        tree = new JTree(root);

        add(new JScrollPane(tree));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTree Example");
        this.pack();
        this.setVisible(true);
    }
    public static void main(String[] args) {

        //SwingUtilities.invokeLater(new Runnable() {
        //    @Override
        //    public void run() {
        //        new Main();
        //    }
        //});



        //System.out.println("test");

       //System.out.println(pmi.getPath());


        //C:\swenson\PMI\Project\30865018
        //Structure: PMI->Controller->Device->Points
	// write your code here
    }

}
