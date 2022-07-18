package com.company;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;


public class Supervisory extends DefaultMutableTreeNode{

    private String name;
    private String description;
    private String address;
    private String ip;

    private Port port1;
    private Port port2;


    private int[] realControllerCount = {0,0,0,0,0,0,0,0,0,0,0,0};
    private int realControllerTotal;

    private int[] expectedControllerCount = {0,0,0,0,0,0,0,0,0,0,0,0};
    private int expectedControllerTotal;

    private final String[] controllerTypes = {"D600","DCDR","DCM","DCM140","DSC","DSC8500","FIRE","FPU","LCD","LON","N2Open","XM"};

    public Supervisory(String name, String description, String address, String ip) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.ip = ip;
    }

    public void setPort1(String type, String baud) {
        port1 = new Port(type, baud);
        add(port1);
        port1.getN2Devices();
    }

    public void setPort2(String type, String baud) {
        port2 = new Port(type, baud);
        add(port2);
        port2.getN2Devices();
    }


    private void addToUNDCount(String p) {
        switch(p) {
            case "D600":
                realControllerCount[0]++;
                break;
            case "DCDR":
                realControllerCount[1]++;
                break;
            case "DCM":
                realControllerCount[2]++;
                break;
            case "DCM140":
                realControllerCount[3]++;
                break;
            case "DSC":
                realControllerCount[4]++;
                break;
            case "DSC8500":
                realControllerCount[5]++;
                break;
            case "FIRE":
                realControllerCount[6]++;
                break;
            case "FPU":
                realControllerCount[7]++;
                break;
            case "LCD":
                realControllerCount[8]++;
                break;
            case "LON":
                realControllerCount[9]++;
                break;
            case "N2OPEN":
                realControllerCount[10]++;
                break;
            case "XM":
                realControllerCount[11]++;
                break;
            default:
                break;
        }
    }


    public void getRealDeviceCounts() {
        for (int i = 0; i < 12; i++)
            System.out.println(controllerTypes[i] + ": " + realControllerCount[i]);
    }

    public void getExpectedDeviceCounts() {
        for (int i = 0; i < 12; i++)
            System.out.println(controllerTypes[i] + ": " + expectedControllerCount[i]);
    }

    public void compareDeviceCount() {
        for (int i = 0; i < 12; i++) {
            if (realControllerCount[i] != expectedControllerCount[i]) {
                System.out.println(controllerTypes[i] + " mismatch");
                System.out.println("Expected/Reality : " + expectedControllerCount[i] + "/" + realControllerCount[i]);
            }
        }
    }

    public String getDirPath() {
        PMI p = (PMI) getParent();
        return p.getDirPath() + name;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getIP() {
        return "null";
    }

    public String toString() {
        return name;
    }

    public JPanel getView() {
        JPanel supervisoryPanel = new JPanel();
        SpringLayout layout = new SpringLayout();
        supervisoryPanel.setLayout(layout);

        JLabel lblName = new JLabel("Name:");
        JLabel lblDescription = new JLabel("Description:");
        JLabel lblPath = new JLabel("Path:");
        JLabel lblAddress = new JLabel("Address:");
        JLabel lblIp = new JLabel("IP:");
        JLabel lblPort1protocol = new JLabel("");
        JLabel lblPort1baud = new JLabel("");
        JLabel lblPort1devicecount = new JLabel("");
        JLabel lblPort2protocol = new JLabel("");
        JLabel lblPort2baud = new JLabel("");
        JLabel lblPort2devicecount = new JLabel("");
        JLabel lblTotaldevicecount = new JLabel("");

        JTextField txtfldName = new JTextField(name);
        JTextField txtfldDescription = new JTextField(description);
        JTextField txtfldPath = new JTextField(getDirPath());
        JTextField txtfldAddress = new JTextField(address);
        JTextField txtfldIp = new JTextField(ip);
        JTextField txtfldPort1protocol = new JTextField("");
        JTextField txtfldPort1baud = new JTextField("");
        JTextField txtfldPort1devicecount = new JTextField("");
        JTextField txtfldPort2protocol = new JTextField("");
        JTextField txtfldPort2baud = new JTextField("");
        JTextField txtfldPort2devicecount = new JTextField("");
        JTextField txtfldTotaldevicecount = new JTextField("");

        supervisoryPanel.add(lblName);
        supervisoryPanel.add(lblDescription);
        supervisoryPanel.add(lblPath);
        supervisoryPanel.add(lblAddress);
        supervisoryPanel.add(lblIp);
        supervisoryPanel.add(lblPort1protocol);
        supervisoryPanel.add(lblPort1baud);
        supervisoryPanel.add(lblPort1devicecount);
        supervisoryPanel.add(lblPort2protocol);
        supervisoryPanel.add(lblPort2baud);
        supervisoryPanel.add(lblPort2devicecount);
        supervisoryPanel.add(lblTotaldevicecount);

        supervisoryPanel.add(txtfldName);
        supervisoryPanel.add(txtfldDescription);
        supervisoryPanel.add(txtfldPath);
        supervisoryPanel.add(txtfldAddress);
        supervisoryPanel.add(txtfldIp);
        supervisoryPanel.add(txtfldPort1protocol);
        supervisoryPanel.add(txtfldPort1baud);
        supervisoryPanel.add(txtfldPort1devicecount);
        supervisoryPanel.add(txtfldPort2protocol);
        supervisoryPanel.add(txtfldPort2baud);
        supervisoryPanel.add(txtfldPort2devicecount);
        supervisoryPanel.add(txtfldTotaldevicecount);

        layout.putConstraint(SpringLayout.NORTH, txtfldName, 5, SpringLayout.NORTH,supervisoryPanel);
        layout.putConstraint(SpringLayout.EAST, txtfldName, -5, SpringLayout.EAST,supervisoryPanel);
        layout.putConstraint(SpringLayout.WEST, txtfldName, 5, SpringLayout.HORIZONTAL_CENTER,supervisoryPanel);

        layout.putConstraint(SpringLayout.NORTH, lblName, 2, SpringLayout.NORTH,txtfldName);
        layout.putConstraint(SpringLayout.EAST, lblName, -5, SpringLayout.HORIZONTAL_CENTER,supervisoryPanel);

        layout.putConstraint(SpringLayout.NORTH, txtfldDescription, 5, SpringLayout.SOUTH,txtfldName);
        layout.putConstraint(SpringLayout.EAST, txtfldDescription, -5, SpringLayout.EAST,supervisoryPanel);
        layout.putConstraint(SpringLayout.WEST, txtfldDescription, 5, SpringLayout.HORIZONTAL_CENTER,supervisoryPanel);

        layout.putConstraint(SpringLayout.NORTH, lblDescription, 2, SpringLayout.NORTH,txtfldDescription);
        layout.putConstraint(SpringLayout.EAST, lblDescription, -5, SpringLayout.HORIZONTAL_CENTER,supervisoryPanel);

        layout.putConstraint(SpringLayout.NORTH, txtfldPath, 5, SpringLayout.SOUTH,txtfldDescription);
        layout.putConstraint(SpringLayout.EAST, txtfldPath, -5, SpringLayout.EAST,supervisoryPanel);
        layout.putConstraint(SpringLayout.WEST, txtfldPath, 5, SpringLayout.HORIZONTAL_CENTER,supervisoryPanel);

        layout.putConstraint(SpringLayout.NORTH, lblPath, 2, SpringLayout.NORTH,txtfldPath);
        layout.putConstraint(SpringLayout.EAST, lblPath, -5, SpringLayout.HORIZONTAL_CENTER,supervisoryPanel);

        layout.putConstraint(SpringLayout.NORTH, txtfldAddress, 5, SpringLayout.SOUTH,txtfldPath);
        layout.putConstraint(SpringLayout.EAST, txtfldAddress, -5, SpringLayout.EAST,supervisoryPanel);
        layout.putConstraint(SpringLayout.WEST, txtfldAddress, 5, SpringLayout.HORIZONTAL_CENTER,supervisoryPanel);

        layout.putConstraint(SpringLayout.NORTH, lblAddress, 2, SpringLayout.NORTH,txtfldAddress);
        layout.putConstraint(SpringLayout.EAST, lblAddress, -5, SpringLayout.HORIZONTAL_CENTER,supervisoryPanel);

        layout.putConstraint(SpringLayout.NORTH, txtfldIp, 5, SpringLayout.SOUTH,txtfldAddress);
        layout.putConstraint(SpringLayout.EAST, txtfldIp, -5, SpringLayout.EAST,supervisoryPanel);
        layout.putConstraint(SpringLayout.WEST, txtfldIp, 5, SpringLayout.HORIZONTAL_CENTER,supervisoryPanel);

        layout.putConstraint(SpringLayout.NORTH, lblIp, 2, SpringLayout.NORTH,txtfldIp);
        layout.putConstraint(SpringLayout.EAST, lblIp, -5, SpringLayout.HORIZONTAL_CENTER,supervisoryPanel);

        return supervisoryPanel;
    }
}
