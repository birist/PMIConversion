package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cfgFile {
    private String filePath;

    private ArrayList<Point> points;

    public cfgFile(String fp) {
        filePath = fp;

        filePath = "C:\\swenson\\PMI\\Project\\30865018\\HVACPRO\\NCM-23\\23VMA030.cfg";
        getProperties();
    }

    private void getProperties() {
        try {
            points = new ArrayList<Point>();
            Scanner x = new Scanner(new File(filePath));
            String a = "";
            Pattern pComponent = Pattern.compile("\\((\\d*),(.*),(.*),(.*),(\\d*),(\\d*),(\\d*),(\\d*)\\).*");
            Matcher matcher;

            while (x.hasNext()) {
                a = x.nextLine();

                matcher = pComponent.matcher(a);

                if (matcher.matches()) {
                    if (matcher.group(4).equals("") == false) {
                        System.out.println(matcher.group(4));
                        System.out.println("ADDRESS: " + matcher.group(6));
                        x.nextLine();
                        x.nextLine();
                        a = x.nextLine();
                        matcher = Pattern.compile("\\s\\((.*),(.*),(.*),(.*)\\).*").matcher(a);
                        if (matcher.matches()) {
                            System.out.println("TYPE: " + matcher.group(2));
                            int j = Integer.valueOf(matcher.group(4));
                            for (int i = 0; i < j; i++) {
                                a = x.nextLine();
                                matcher = Pattern.compile("\\s*\\((\\d*),(.*),(\\d*),(\\d*),(.*)\\).*").matcher(a);
                                matcher.matches();
                                System.out.println("classid: " + matcher.group(1));
                                System.out.println("class name: " + matcher.group(2));
                                System.out.println("value: " + matcher.group(5));
                                System.out.println("-----------");
                            }
                        }

                    }
                }
            }

        }
        catch (Exception e) {

        }

    }
}
