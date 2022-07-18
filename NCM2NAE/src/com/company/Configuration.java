package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Configuration {


    private File filePath;
    private String name;
    private cfgFile cfg;
    private prnFile prn;
    private ddlFile ddl;
    private Date date;

    private ArrayList<Point> points;

    public Configuration(String fp,String name) {
        this.filePath = new File(fp);
        this.name = name;
        date = new Date(1950,1,1);
        points = new ArrayList<Point>();
        findConfigurations(name + ".prn",filePath);
        ddl = new ddlFile(filePath + "\\" + name + ".ddl");
        //cfgFile = new cfgFile(name + ".CFG");
    }

    public ArrayList<Point> getPoints() {
        points = prn.getPoints();
        ArrayList<Point> ddlPoints = ddl.getPoints();


        for (Point prnP : points) {
            for (Point ddlP : ddlPoints) {
                if (prnP.toString().equals(ddlP.toString())){
                    if (Integer.valueOf(ddlP.getUnits().getValue()) != -1)
                        prnP.setUnits(ddlP.getUnits());
                }
            }
        }

        return points;
    }



    public void findConfigurations(String name,File file)
    {
        Pattern pattern = Pattern.compile("\\s+Configuration date\\s+:.(\\d\\d).(\\d\\d).(\\d\\d).*");
        Matcher matcher;
        File[] list = file.listFiles();
        if(list!=null)
            for (File fil : list)
            {
                if (fil.isDirectory())
                {
                    findConfigurations(name,fil);
                }
                else if (name.equalsIgnoreCase(fil.getName()))
                {
                    try {
                            matcher = pattern.matcher(Files.readAllLines(Paths.get(fil.toString())).get(6));
                            if (matcher.matches()) {
                                int year = Integer.valueOf(matcher.group(3)) < 50 ? 2000 + Integer.valueOf(matcher.group(3)) : 1900 + Integer.valueOf(matcher.group(3));
                                Date tempDate = new Date(year,Integer.valueOf(matcher.group(1))-1,Integer.valueOf(matcher.group(2)));
                                if (tempDate.after(date)) {
                                    date = tempDate;
                                    prn = new prnFile(fil.toString());
                                    filePath = new File(fil.getParent());
                                }
                            }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
    }
}
