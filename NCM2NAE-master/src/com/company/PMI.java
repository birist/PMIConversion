package com.company;

import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PMI extends DefaultMutableTreeNode {

    private String path;
    private String name;
    private ArrayList<Controller> controllers;

    public PMI() {
        name = "PMI";
        setPath("C:\\swenson\\PMI\\Project\\30865018\\");
    }



    public void getControllers() {

        Scanner x;

        try{
            x = new Scanner(new File(path + "GLOBAL.UND"));
            Pattern pattern = Pattern.compile("NC .*\"(NCM\\S*)\", \"(.*)\", (\\d*), (\\d*), (\\d*).*");


            Matcher matcher;

            while(x.hasNext()) {
                String a = x.nextLine();

                matcher = pattern.matcher(a);
                if (matcher.matches()) {
                    Controller c = new Controller(matcher.group(1), matcher.group(2), Integer.valueOf(matcher.group(5)));
                    add(c);
                }
            }
            x.close();
        }
        catch(Exception e){
            System.out.println("Error Instancing Controller!");
        }
    }



    public void setPath(String p) {
        path = p + "DDL\\";
        Scanner x;

        try {
            x = new Scanner(new File(path + "NET.und"));
            Pattern pattern = Pattern.compile("NET.\"(\\S*)\".*");
            Matcher matcher;

            while(x.hasNext()) {
                String a = x.nextLine();
                matcher = pattern.matcher(a);
                if (matcher.matches()) {
                    path = path + matcher.group(1) + "\\";
                }
            }
            x.close();
        }
        catch (Exception e) {
            System.out.println("Error! Could not resolve NET file");
        }

    }

    public String getDirPath(){
        return path;
    }

    public String toString() {
        return name;
    }
}
