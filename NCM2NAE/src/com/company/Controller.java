package com.company;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller extends DefaultMutableTreeNode{

    private String name;
    private String protocol;
    private String description;
    private String address;
    private String type;
    private Configuration cfg;
    private String dir;

    private ArrayList<Point> points;


    public Controller(String protocol, String name, String description, String address, String type) {
        this.protocol = protocol;
        this.name = name;
        this.description = description;
        this.address = address;
        this.type = type;

        points = new ArrayList<Point>();
    }

    public void getPoints() {
        if(type.equals("VND")) {
            System.out.println("vnd");
        }
        PMI p = (PMI) getRoot();
        Supervisory s = (Supervisory) getParent().getParent();
        dir = p.getMyPath() + "HVACPRO\\";

        try {
            cfg = new Configuration(dir,name);
            points = cfg.getPoints();
            for(Point x : points) {
                add(x);
            }
        }
        catch (Exception e){
            System.out.println("Error instancing points for " + name);
        }

    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public JPanel getView() {
        JPanel controllerPanel = new JPanel();
        SpringLayout layout = new SpringLayout();
        controllerPanel.setLayout(layout);

        JLabel lblName = new JLabel("Name: ");
        JLabel lblDescription = new JLabel("Description: ");
        JLabel lblProtocol = new JLabel("Protocol: ");
        JLabel lblAddress = new JLabel("Address: ");
        JLabel lblType = new JLabel("Type: ");
        JLabel lblPRNDir = new JLabel(".prn File: ");
        JLabel lblDDLdir = new JLabel(".ddl File: ");

        JTextField txtfldName = new JTextField(name);
        txtfldName.setEditable(false);
        JTextField txtfldDescription = new JTextField(description);
        txtfldDescription.setEditable(false);
        JTextField txtfldProtocol = new JTextField(protocol);
        txtfldProtocol.setEditable(false);
        JTextField txtfldAddress = new JTextField(address);
        txtfldAddress.setEditable(false);
        JTextField txtfldType = new JTextField(type);
        txtfldType.setEditable(false);
        JTextField txtfldPRNdir = new JTextField(dir + name + ".prn");
        JTextField txtfldDDLdir = new JTextField(dir + name + ".ddl");

        JButton btnChangePRN = new JButton("Change");
        JButton btnChangeDDL = new JButton("Change");
        JButton btnRefresh = new JButton("Refresh");

        JTable table;

        controllerPanel.add(txtfldName);
        controllerPanel.add(txtfldDescription);
        controllerPanel.add(txtfldProtocol);
        controllerPanel.add(txtfldAddress);
        controllerPanel.add(txtfldType);
        controllerPanel.add(txtfldPRNdir);
        controllerPanel.add(txtfldDDLdir);

        controllerPanel.add(lblName);
        controllerPanel.add(lblDescription);
        controllerPanel.add(lblProtocol);
        controllerPanel.add(lblAddress);
        controllerPanel.add(lblType);
        controllerPanel.add(lblPRNDir);
        controllerPanel.add(lblDDLdir);

        controllerPanel.add(btnChangePRN);
        controllerPanel.add(btnChangeDDL);
        controllerPanel.add(btnRefresh);


        int x = 100;

        //Name Placement
        layout.putConstraint(SpringLayout.NORTH, txtfldName, 5, SpringLayout.NORTH,controllerPanel);
        layout.putConstraint(SpringLayout.EAST, txtfldName, -5, SpringLayout.EAST,controllerPanel);
        layout.putConstraint(SpringLayout.WEST, txtfldName, x, SpringLayout.WEST,controllerPanel);

        layout.putConstraint(SpringLayout.NORTH, lblName, 2, SpringLayout.NORTH,txtfldName);
        layout.putConstraint(SpringLayout.EAST, lblName, -5, SpringLayout.WEST,txtfldName);

        //Description Placement
        layout.putConstraint(SpringLayout.NORTH, txtfldDescription, 5, SpringLayout.SOUTH,txtfldName);
        layout.putConstraint(SpringLayout.EAST, txtfldDescription, 0, SpringLayout.EAST,txtfldName);
        layout.putConstraint(SpringLayout.WEST, txtfldDescription, 0, SpringLayout.WEST,txtfldName);

        layout.putConstraint(SpringLayout.NORTH, lblDescription, 2, SpringLayout.NORTH,txtfldDescription);
        layout.putConstraint(SpringLayout.EAST, lblDescription, -5, SpringLayout.WEST,txtfldDescription);

        //Protocol Placement
        layout.putConstraint(SpringLayout.NORTH, txtfldProtocol, 5, SpringLayout.SOUTH,txtfldDescription);
        layout.putConstraint(SpringLayout.EAST, txtfldProtocol, 0, SpringLayout.EAST,txtfldName);
        layout.putConstraint(SpringLayout.WEST, txtfldProtocol, 0, SpringLayout.WEST,txtfldName);

        layout.putConstraint(SpringLayout.NORTH, lblProtocol, 2, SpringLayout.NORTH,txtfldProtocol);
        layout.putConstraint(SpringLayout.EAST, lblProtocol, -5, SpringLayout.WEST,txtfldProtocol);

        //Address Placement
        layout.putConstraint(SpringLayout.NORTH, txtfldAddress, 5, SpringLayout.SOUTH,txtfldProtocol);
        layout.putConstraint(SpringLayout.EAST, txtfldAddress, 0, SpringLayout.EAST,txtfldName);
        layout.putConstraint(SpringLayout.WEST, txtfldAddress, 0, SpringLayout.WEST,txtfldName);

        layout.putConstraint(SpringLayout.NORTH, lblAddress, 2, SpringLayout.NORTH,txtfldAddress);
        layout.putConstraint(SpringLayout.EAST, lblAddress, -5, SpringLayout.WEST,txtfldAddress);

        //Type Placement
        layout.putConstraint(SpringLayout.NORTH, txtfldType, 5, SpringLayout.SOUTH,txtfldAddress);
        layout.putConstraint(SpringLayout.EAST, txtfldType, 0, SpringLayout.EAST,txtfldName);
        layout.putConstraint(SpringLayout.WEST, txtfldType, 0, SpringLayout.WEST,txtfldName);

        layout.putConstraint(SpringLayout.NORTH, lblType, 2, SpringLayout.NORTH,txtfldType);
        layout.putConstraint(SpringLayout.EAST, lblType, -5, SpringLayout.WEST,txtfldType);

        //prnDIR Placement
        layout.putConstraint(SpringLayout.NORTH, txtfldPRNdir, 5, SpringLayout.SOUTH,txtfldType);
        layout.putConstraint(SpringLayout.EAST, txtfldPRNdir, 0, SpringLayout.EAST,txtfldName);
        layout.putConstraint(SpringLayout.WEST, txtfldPRNdir, 0, SpringLayout.WEST,txtfldName);

        layout.putConstraint(SpringLayout.NORTH, lblPRNDir, 2, SpringLayout.NORTH,txtfldPRNdir);
        layout.putConstraint(SpringLayout.EAST, lblPRNDir, -5, SpringLayout.WEST,txtfldPRNdir);

        layout.putConstraint(SpringLayout.NORTH, btnChangePRN, 5, SpringLayout.SOUTH,txtfldPRNdir);
        layout.putConstraint(SpringLayout.EAST, btnChangePRN, 0, SpringLayout.EAST,txtfldName);
        layout.putConstraint(SpringLayout.WEST, btnChangePRN, 200, SpringLayout.WEST,txtfldName);

        ////ddlDIR Placement
        layout.putConstraint(SpringLayout.NORTH, txtfldDDLdir, 5, SpringLayout.SOUTH,btnChangePRN);
        layout.putConstraint(SpringLayout.EAST, txtfldDDLdir, 0, SpringLayout.EAST,txtfldName);
        layout.putConstraint(SpringLayout.WEST, txtfldDDLdir, 0, SpringLayout.WEST,txtfldName);

        layout.putConstraint(SpringLayout.NORTH, lblDDLdir, 2, SpringLayout.NORTH,txtfldDDLdir);
        layout.putConstraint(SpringLayout.EAST, lblDDLdir, -5, SpringLayout.WEST,txtfldDDLdir);

        layout.putConstraint(SpringLayout.NORTH, btnChangeDDL, 5, SpringLayout.SOUTH,txtfldDDLdir);
        layout.putConstraint(SpringLayout.EAST, btnChangeDDL, 0, SpringLayout.EAST,txtfldName);
        layout.putConstraint(SpringLayout.WEST, btnChangeDDL, 200, SpringLayout.WEST,txtfldName);



        String[] columnNames = {"Type","Address","Name","Description"};


        Object[][] data = new Object[points.size()][4];

        for (int i = 0; i < points.size(); i++) {
            data[i][0] = points.get(i).getType();
            data[i][1] = points.get(i).getAddress();
            data[i][2] = points.get(i).getName();
            data[i][3] = points.get(i).getDescription();
        }

        table = new JTable(data, columnNames);

        table.setEnabled(false);
        JScrollPane scrollpane = new JScrollPane(table);

        controllerPanel.add(scrollpane);

        layout.putConstraint(SpringLayout.NORTH, scrollpane, 5, SpringLayout.SOUTH,btnChangeDDL);
        layout.putConstraint(SpringLayout.WEST, scrollpane, 5, SpringLayout.WEST,controllerPanel);
        layout.putConstraint(SpringLayout.EAST, scrollpane, -5, SpringLayout.EAST,controllerPanel);
        layout.putConstraint(SpringLayout.SOUTH, scrollpane, -5, SpringLayout.NORTH,btnRefresh);

        layout.putConstraint(SpringLayout.SOUTH, btnRefresh, -5, SpringLayout.SOUTH,scrollpane);
        layout.putConstraint(SpringLayout.EAST, btnRefresh, 0, SpringLayout.EAST,txtfldName);
        layout.putConstraint(SpringLayout.WEST, btnRefresh, 200, SpringLayout.WEST,txtfldName);
        layout.putConstraint(SpringLayout.SOUTH, btnRefresh, -5, SpringLayout.SOUTH,controllerPanel);

        return controllerPanel;
    }
}

