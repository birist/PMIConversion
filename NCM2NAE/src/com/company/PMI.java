package com.company;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PMI extends DefaultMutableTreeNode {

    private String path;
    private String netpath;
    private String name;
    private int deviceCount;

    public PMI() {
        name = "PMI";
        path = "C:\\swenson\\PMI\\Project\\30865018\\";
        setPath("C:\\swenson\\PMI\\Project\\30865018\\");
        deviceCount = 0;
    }

    public void getControllers() {

        Scanner x;

        try{
            x = new Scanner(new File(netpath + "GLOBAL.UND"));
            Pattern pName = Pattern.compile("@GLOBAL \"(.*)\".*");
            Pattern pNCM = Pattern.compile("NC .*\"(NCM\\S*)\", \"(.*)\", (\\d*), (\\d*), (\\d*).*");
            Pattern pPort = Pattern.compile("\\s*\\d*, \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", (\\d*)(, (\\d*)|.*)");
            Pattern pIP = Pattern.compile(" IP \\s*(\\d*),\\s*(\\d*),\\s*(\\d*),\\s*(\\d*)\\s*");

            Matcher matcher;

            while(x.hasNext()) {
                String a = x.nextLine();

                matcher = pName.matcher(a);
                if (matcher.matches()) {
                    this.name = matcher.group(1);

                    while(x.hasNext()) {
                        a = x.nextLine();
                        matcher = pNCM.matcher(a);
                        if (matcher.matches()) {
                            String sName = matcher.group(1);
                            String sDescription = matcher.group(2);
                            String sAddress = matcher.group(5);

                            a = x.nextLine();
                            matcher = pPort.matcher(a);
                            matcher.matches();

                            String sPort1 = matcher.group(1);
                            String sPort2 = matcher.group(2);
                            String sBaud1 = matcher.group(4);
                            String sBaud2 = matcher.group(6);

                            a = x.nextLine();
                            matcher = pIP.matcher(a);
                            matcher.matches();

                            String sIP = matcher.group(1) + "." + matcher.group(2) + "." + matcher.group(3) + "." + matcher.group(4);


                            Supervisory s = new Supervisory(sName, sDescription, sAddress, sIP);
                            deviceCount++;
                            add(s);

                            if(sPort1.equals(" ") == false)
                                s.setPort1(sPort1, sBaud1);
                            if(sPort2.equals(" ") == false) {
                                if(sBaud2 == null)
                                    s.setPort2(sPort2, sBaud1);
                                else
                                    s.setPort2(sPort2,sBaud2);
                            }
                        }
                    }
                }
            }
            x.close();
        }
        catch(Exception e){
            System.out.println("Error Instancing Controller!");
        }
    }

    public void setPath(String p) {
        netpath = p + "DDL\\";
        Scanner x;

        try {
            x = new Scanner(new File(netpath + "NET.und"));
            Pattern pattern = Pattern.compile("NET.\"(\\S*)\".*");
            Matcher matcher;

            while(x.hasNext()) {
                String a = x.nextLine();
                matcher = pattern.matcher(a);
                if (matcher.matches()) {
                    netpath = netpath + matcher.group(1) + "\\";
                }
            }
            x.close();
        }
        catch (Exception e) {
            System.out.println("Error! Could not resolve NET file");
        }
    }

    public String getDirPath(){
        return netpath;
    }

    public String getMyPath() {
        return path;
    }

    public String toString() {
        return name;
    }

    public JPanel getView() {
        JPanel pmiPanel = new JPanel();
        SpringLayout layout = new SpringLayout();
        pmiPanel.setLayout(layout);

        JLabel lblName = new JLabel("Name: ");
        JLabel lblDir = new JLabel("Directory: ");
        JLabel lblDeviceCount = new JLabel("Device Count: ");

        JTextField txtfldName = new JTextField(name);
1        txtfldName.setEditable(false);
        JTextField txtfldDir = new JTextField(path);
        txtfldDir.setEditable(false);
        JTextField txtfldDeviceCount = new JTextField(String.valueOf(deviceCount));
        txtfldDeviceCount.setEditable(false);

        JButton btnChangeDir = new JButton(  "Change Directory");

        pmiPanel.add(lblName);
        pmiPanel.add(lblDir);
        pmiPanel.add(lblDeviceCount);

        pmiPanel.add(txtfldName);
        pmiPanel.add(txtfldDir);
        pmiPanel.add(txtfldDeviceCount);

        pmiPanel.add(btnChangeDir);

        //Name Placement
        layout.putConstraint(SpringLayout.NORTH, txtfldName, 5, SpringLayout.NORTH,pmiPanel);
        layout.putConstraint(SpringLayout.EAST, txtfldName, -5, SpringLayout.EAST,pmiPanel);
        layout.putConstraint(SpringLayout.WEST, txtfldName, 5, SpringLayout.HORIZONTAL_CENTER,pmiPanel);

        layout.putConstraint(SpringLayout.NORTH, lblName, 2, SpringLayout.NORTH,txtfldName);
        layout.putConstraint(SpringLayout.EAST, lblName, -5, SpringLayout.WEST,txtfldName);

        //Directory Placement
        layout.putConstraint(SpringLayout.NORTH, txtfldDir, 5, SpringLayout.SOUTH,txtfldName);
        layout.putConstraint(SpringLayout.EAST, txtfldDir, 0, SpringLayout.EAST,txtfldName);
        layout.putConstraint(SpringLayout.WEST, txtfldDir, 0, SpringLayout.WEST,txtfldName);

        layout.putConstraint(SpringLayout.NORTH, lblDir, 2, SpringLayout.NORTH,txtfldDir);
        layout.putConstraint(SpringLayout.EAST, lblDir, -5, SpringLayout.WEST,txtfldDir);

        //DeviceCount Placement
        layout.putConstraint(SpringLayout.NORTH, txtfldDeviceCount, 5, SpringLayout.SOUTH,txtfldDir);
        layout.putConstraint(SpringLayout.EAST, txtfldDeviceCount, 0, SpringLayout.EAST,txtfldDir);
        layout.putConstraint(SpringLayout.WEST, txtfldDeviceCount, 0, SpringLayout.WEST,txtfldDir);

        layout.putConstraint(SpringLayout.NORTH, lblDeviceCount, 2, SpringLayout.NORTH,txtfldDeviceCount);
        layout.putConstraint(SpringLayout.EAST, lblDeviceCount, -5, SpringLayout.WEST,txtfldDeviceCount);

        //ChangeDirBtn placement
        layout.putConstraint(SpringLayout.NORTH, btnChangeDir, 5, SpringLayout.SOUTH, txtfldDeviceCount);
        layout.putConstraint(SpringLayout.WEST, btnChangeDir, 0, SpringLayout.WEST, txtfldDeviceCount);

        return pmiPanel;
    }
}
