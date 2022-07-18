package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ddlFile {

    private String filePath;
    private Date date;

    private ArrayList<Point> points;

    private Scanner x;
    private String a;

    public ddlFile(String fp) {
        filePath = fp;
    }

    public ArrayList<Point> getPoints() {
        points = new ArrayList<Point>();


        Pattern pattern = Pattern.compile(".*CS..\\s*\"([A-z]*)([0-9]*)\",.,.,\"([A-z,0-9,\\s,-]*)\",\"([A-z,0-9,-,\\s,%]*).*");
        Matcher matcher;

        try {
            x = new Scanner(new File(filePath));
            a = "";
            while (x.hasNext()) {
                a = x.nextLine();
                matcher = pattern.matcher(a);
                if (matcher.matches()) {
                    Point p = new Point(matcher.group(1),matcher.group(2),matcher.group((3)));
                    p.setUnits(new Property(117,String.valueOf(units.getId(matcher.group(4)))));
                    points.add(p);
                }
            }
        } catch (Exception e) {
        }
        return points;
    }
}