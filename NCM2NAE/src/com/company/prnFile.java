package com.company;

import java.io.File;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prnFile {

    private String filePath;

    private ArrayList<Point> points;

    private Scanner x;
    private String a;

    public prnFile(String f) {
        filePath = f;
    }

    public ArrayList<Point> getPoints() {
        points = new ArrayList<Point>();
        try {
            x = new Scanner(new File(filePath));
        } catch (Exception e) {

        }
        a = "";

        getPointGroup("ANALOG INPUTS");
        getPointGroup("BINARY INPUTS");
        getPointGroup("ANALOG OUTPUTS");
        getPointGroup("BINARY OUTPUTS");
        getPointGroup("PARAMETERS");

        return points;
    }

    private int getPointGroup(String s) {
        Pattern pattern = Pattern.compile("(ANALOG INPUTS|BINARY INPUTS|ANALOG OUTPUTS|BINARY OUTPUTS|PARAMETERS).*");
        Matcher matcher;

        while (x.hasNext()) {
            a = x.nextLine();
            matcher = pattern.matcher(a);
            if (matcher.matches()) {
                while (x.hasNext()) {
                    a = x.nextLine();
                    matcher = pattern.matcher(a);
                    if (matcher.matches())
                        a = x.nextLine();
                    if (a.equals("--------------"))
                        a = x.nextLine();
                    if (a.equals("(NONE)"))
                        a = x.nextLine();
                    if (a.equals("  Point  Point")) {
                        x.nextLine();
                        x.nextLine();
                        a = x.nextLine();
                    }
                    while (a.equals(" ")) {
                        a = x.nextLine();
                        if (a.equals(" ")) {
                            return 0;
                        }
                    }
                    addPoint(a);
                }
            }
        }
        return 0;
    }

    private void addPoint(String s) {
        Pattern pattern = Pattern.compile("\\s+(AI|BI|AO|BO|ADF|ADI|BD|\\*ADF|\\*ADI|\\*BD)\\s*(\\d*)\\s*((?:\\S|\\s(?!\\s))+)\\s*(\\S*)\\s*(\\S*).*");
        Matcher matcher;
        matcher = pattern.matcher(s);
        if(matcher.matches()){
            points.add(new Point(matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4)));
        }
    }


    public String toString() {
        return filePath;
    }
}



