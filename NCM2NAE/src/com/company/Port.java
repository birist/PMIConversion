package com.company;

import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Port extends DefaultMutableTreeNode {
    private String type;
    private String baud;

    private int[] realControllerCount = {0,0,0,0,0,0,0,0,0,0,0,0};
    private int realControllerTotal;

    private int[] expectedControllerCount = {0,0,0,0,0,0,0,0,0,0,0,0};
    private int expectedControllerTotal;

    private final String[] controllerTypes = {"D600","DCDR","DCM","DCM140","DSC","DSC8500","FIRE","FPU","LCD","LON","N2Open","XM"};

    public Port(String type, String baud) {
        this.type = type;
        this.baud = baud;
    }

    public void getN2Devices(){
        Scanner x;
        String a = "";
        Supervisory s = (Supervisory) getParent();

        try{
            x = new Scanner(new File(s.getDirPath() + ".UND"));
            Pattern pName = Pattern.compile("(D600|DCDR|DCM|DCM140|DSC|DSC8500|FIRE|FPU|LCD|LON|N2OPEN|XM) \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\".*");
            Pattern pAddress = Pattern.compile("\\s*ADDRESS (\\d*), (\\d*), (\\d*), \"([^\"]*)\".*");

            Matcher matcher;

            while(x.hasNext()) {
                a = x.nextLine();
                matcher = pName.matcher(a);
                if (matcher.matches()) {
                    String protocol = matcher.group(1);
                    String dname = matcher.group(3);
                    String ddescription = matcher.group(4);

                    a = x.nextLine();
                    matcher = pAddress.matcher(a);
                    if (matcher.matches()) {
                        String daddress = matcher.group(1);
                        String dtype = matcher.group(4);
                        Controller tempDevice = new Controller(protocol, dname, ddescription, daddress, dtype);
                        add(tempDevice);
                        //tempDevice.getPoints();
                    }
                    else
                        add(new Controller(protocol, dname, ddescription, "0","0")); //TODO:Fix this shit.
                    //    //TODO:finish type



                }
                //TODO instance points

                matcher = Pattern.compile("\\*\\s*HARDWARE OBJECTS.*").matcher(a);
                if (matcher.matches()) {

                    x.nextLine();
                    a = x.nextLine();

                    matcher = Pattern.compile("\\*\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*).*").matcher(a);
                    if (matcher.matches()) {
                        expectedControllerCount[0] = Integer.valueOf(matcher.group(1));
                        expectedControllerCount[1] = Integer.valueOf(matcher.group(2));
                        expectedControllerCount[2] = Integer.valueOf(matcher.group(3));
                        expectedControllerCount[3] = Integer.valueOf(matcher.group(4));
                        a = x.nextLine();
                    }
                    matcher = Pattern.compile("\\*\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*).*").matcher(a);
                    if (matcher.matches()) {
                        expectedControllerCount[4] = Integer.valueOf(matcher.group(1));
                        expectedControllerCount[5] = Integer.valueOf(matcher.group(2));
                        expectedControllerCount[6] = Integer.valueOf(matcher.group(3));
                        expectedControllerCount[7] = Integer.valueOf(matcher.group(4));
                        a = x.nextLine();
                    }

                    matcher = Pattern.compile("\\*\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*).*").matcher(a);
                    if (matcher.matches()) {
                        expectedControllerCount[8] = Integer.valueOf(matcher.group(1));
                        expectedControllerCount[9] = Integer.valueOf(matcher.group(2));
                        expectedControllerCount[10] = Integer.valueOf(matcher.group(3));
                        expectedControllerCount[11] = Integer.valueOf(matcher.group(4));
                        a = x.nextLine();
                    }

                    //TODO: find a bettr way to do this, this looks like garbage and shit.
                    x.nextLine();
                    a = x.nextLine();

                    matcher = Pattern.compile("//\\*\\D*(\\d*).*").matcher(a);
                    if (matcher.matches()) {
                        expectedControllerTotal = Integer.valueOf((matcher.group(1)));
                    }

                }


            }

            x.close();

        }
        catch(Exception e){
            System.out.println("Error Instancing Device! on line " + a);
        }
    }



    public String toString() {
        return type;
    }
}
