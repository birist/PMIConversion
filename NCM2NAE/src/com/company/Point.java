package com.company;

import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import com.company.N2Enums;

public class Point extends DefaultMutableTreeNode {

    String ref;
    int classId;
    String classVersion = "1.0";
    String name;
    String itemReference;
    String userName;
    String description;
    String netPointType;
    int netPointAddress;
    ArrayList<Property> properties = new ArrayList<Property>();

    public Point(String type, String address, String longName, String shortName) {
        switch(type) {
            case "AI":
                classId = 147;
                name = "N2 Analog Input";
                break;
            case "BI":
                classId = 148;
                name = "N2 Binary Input";
                break;
            case "AO":
                classId = 149;
                name = "N2 Analog Output";
                break;
            case "BO":
                classId = 150;
                name = "N2 Binary Output";
                break;
            case "ADF":
                classId = 149;
                name = "N2 Analog Output";
                break;
            case "ADI":
                classId = 149;
                name = "N2 Analog Output";
                break;
            case "BD":
                classId = 150;
                name = "N2 Binary Output";
                break;
            case "*ADI":
                classId = 147;
                type = type.substring(1,type.length());
                name = "N2 Analog Input";
                break;
            case "*ADF":
                classId = 147;
                type = type.substring(1,type.length());
                name = "N2 Analog Input";
                break;
            case "*BD":
                classId = 148;
                type = type.substring(1,type.length());
                name = "N2 Binary Input";
                break;
            default:
                break;
        }
        this.netPointType = type;
        this.netPointAddress = Integer.valueOf(address);
        this.userName = shortName;
        this.description = longName;

    }

    public Point(String type, String address, String shortName) {
        switch(type) {
            case "AI":
                classId = 147;
                name = "N2 Analog Input";
                break;
            case "BI":
                classId = 148;
                name = "N2 Binary Input";
                break;
            case "AO":
                classId = 149;
                name = "N2 Analog Output";
                break;
            case "BO":
                classId = 150;
                name = "N2 Binary Output";
                break;
            case "ADF":
                classId = 149;
                name = "N2 Analog Output";
                break;
            case "ADI":
                classId = 149;
                name = "N2 Analog Output";
                break;
            case "BD":
                classId = 150;
                name = "N2 Binary Output";
                break;
            case "*ADI":
                classId = 147;
                type = type.substring(1,type.length());
                name = "N2 Analog Input";
                break;
            case "*ADF":
                classId = 147;
                type = type.substring(1,type.length());
                name = "N2 Analog Input";
                break;
            case "*BD":
                classId = 148;
                type = type.substring(1,type.length());
                name = "N2 Binary Input";
                break;
            default:
                break;
        }
        this.netPointType = type;
        this.netPointAddress = Integer.valueOf(address);
        this.userName = shortName;
    }

    public String getType() {
        return netPointType;
    }

    public String getAddress() {
        return Integer.toString(netPointAddress);
    }

    public String getName() {
        return userName;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return userName;
    }

    public void getProperties() {
        for (Property p : properties){
            System.out.println(p.getName() + " : " + p.getValue());
        }
    }


    public void setUnits(Property p) {
        if (p.getId() == 117)
            properties.add(p);
    }

    public Property getUnits() {
        for (Property P : properties) {
            if (P.getId() == 117)
                return P;
        }
        return null;
    }





}

