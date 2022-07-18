package com.company;


import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

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

        JFrame frame = new JFrame();
        frame.add(new viewMain());
        frame.pack();
        frame.setVisible(true);

        //Configuration cfg = new Configuration("C:\\swenson\\PMI\\Project\\30865018\\HVACPRO\\","23VMA030");

        //cfg.getPoints();

        //cfgFile c = new cfgFile("");

        //prnFile p = new prnFile("C:\\swenson\\PMI\\Project\\30865018\\HVACPRO\\NCM-23\\23VMA030.prn");
        //prnFile d = new prnFile("C:\\swenson\\PMI\\Project\\30865018\\HVACPRO\\NCM-21\\21VAV056.prn");




        //ddlFile prn = new ddlFile();
        //Object object = new Object("$$parent.AHU-002 North Penthouse","278","name");
        //Property property = new Property("807","Net Point Type",new Data("unsignedShort","27"));
        //Property property2 = new Property("803","Net Point Type",new Data("unsignedShort","30"));//
        //object.addProperty(property);
        //object.addProperty(property2);

        //System.out.println(object.getFormatted());
//
        //System.out.println("test");

       //System.out.println(pmi.getPath());


        //C:\swenson\PMI\Project\30865018
	// write your code here
    }

}
