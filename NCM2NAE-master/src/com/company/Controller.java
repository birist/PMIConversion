package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller extends PMI {

    private String name;
    private String description;
    private int address;

    private int[] RealDeviceCount = {0,0,0,0,0,0,0,0,0,0,0,0};
    private int RealDeviceTotal;

    private int[] ExpectedDeviceCount = {0,0,0,0,0,0,0,0,0,0,0,0};
    private int ExpectedDeviceTotal;


    private String[] DeviceTypes = {"D600","DCDR","DCM","DCM140","DSC","DSC8500","FIRE","FPU","LCD","LON","N2Open","XM"};
    private ArrayList<Device> DeviceList;

    //TODO: D600
    //TODO: DCDR
    //TODO: DCM
    //TODO: DCM140
    //TODO: DSC
    //TODO: DSC8500
    //TODO: FIRE
    //TODO: FPU
    //TODO: LCD
    //TODO: LON
    //TODO: N2OPEN
    //TODO: XM


    public Controller (){

    }

    public Controller(String name, String description, int address) {
        this.name = name;
        this.description = description;
        this.address = address;
        DeviceList = new ArrayList<Device>();
        getN2Devices();

        //System.out.println(name);
        for (Device d: DeviceList) {
            System.out.println(d);
        }
        //System.out.println("REAL");
        //getRealDeviceCounts();
        //System.out.println("---");
        //System.out.println("EXPECTED");
        //getExpectedDeviceCounts();
        //System.out.println("---");

    }

    public void getN2Devices() {

        Scanner x;
        String a = "";

        try{
            x = new Scanner(new File(getFilePath()));
            Pattern pName = Pattern.compile("(D600|DCDR|DCM|DCM140|DSC|DSC8500|FIRE|FPU|LCD|LON|N2OPEN|XM) \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\".*");
            Pattern pAddress = Pattern.compile("\\s*ADDRESS (\\d*), (\\d*), (\\d*), \"([^\"]*)\".*");

            Matcher matcher;

            while(x.hasNext()) {
                a = x.nextLine();
                matcher = pName.matcher(a);
                if (matcher.matches()) {
                    String protocol = matcher.group(1);
                    String dname = matcher.group(3);
                    String description = matcher.group(4);
                    a = x.nextLine();
                    //matcher = pAddress.matcher(a);
                    //if (matcher.matches()){
                    //    int address = Integer.valueOf(matcher.group(1));
                    //    String type = matcher.group(4);
                        DeviceList.add(new Device(protocol, dname, description, 0, "later"));
                        //TODO:finish type
                    //    System.out.println(d.toString());
                    //}


                }
                //TODO instance points

                matcher = Pattern.compile("\\*\\s*HARDWARE OBJECTS.*").matcher(a);
                if (matcher.matches()) {

                    x.nextLine();
                    a = x.nextLine();

                    matcher = Pattern.compile("\\*\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*).*").matcher(a);
                    if (matcher.matches()) {
                        ExpectedDeviceCount[0] = Integer.valueOf(matcher.group(1));
                        ExpectedDeviceCount[1] = Integer.valueOf(matcher.group(2));
                        ExpectedDeviceCount[2] = Integer.valueOf(matcher.group(3));
                        ExpectedDeviceCount[3] = Integer.valueOf(matcher.group(4));
                        a = x.nextLine();
                    }
                    matcher = Pattern.compile("\\*\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*).*").matcher(a);
                    if (matcher.matches()) {
                        ExpectedDeviceCount[4] = Integer.valueOf(matcher.group(1));
                        ExpectedDeviceCount[5] = Integer.valueOf(matcher.group(2));
                        ExpectedDeviceCount[6] = Integer.valueOf(matcher.group(3));
                        ExpectedDeviceCount[7] = Integer.valueOf(matcher.group(4));
                        a = x.nextLine();
                    }

                    matcher = Pattern.compile("\\*\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*)\\s*\\S*\\s*(\\d*).*").matcher(a);
                    if (matcher.matches()) {
                        ExpectedDeviceCount[8] = Integer.valueOf(matcher.group(1));
                        ExpectedDeviceCount[9] = Integer.valueOf(matcher.group(2));
                        ExpectedDeviceCount[10] = Integer.valueOf(matcher.group(3));
                        ExpectedDeviceCount[11] = Integer.valueOf(matcher.group(4));
                        a = x.nextLine();
                    }

                    //TODO: find a bettr way to do this, this looks like garbage and shit.
                    x.nextLine();
                    a = x.nextLine();

                    matcher = Pattern.compile("//\\*\\D*(\\d*).*").matcher(a);
                    if (matcher.matches()) {
                        ExpectedDeviceTotal = Integer.valueOf((matcher.group(1)));
                    }


                }


            }
            for (Device d : DeviceList)
                add(d);
            x.close();

        }
        catch(Exception e){
            System.out.println("Error Instancing Device! on line " + a);
        }
    }


    public String getFilePath() {
        return super.getDirPath() + name + ".UND";
    }

    private void addToUNDCount(String p) {
        switch(p) {
            case "D600":
                RealDeviceCount[0]++;
                break;
            case "DCDR":
                RealDeviceCount[1]++;
                break;
            case "DCM":
                RealDeviceCount[2]++;
                break;
            case "DCM140":
                RealDeviceCount[3]++;
                break;
            case "DSC":
                RealDeviceCount[4]++;
                break;
            case "DSC8500":
                RealDeviceCount[5]++;
                break;
            case "FIRE":
                RealDeviceCount[6]++;
                break;
            case "FPU":
                RealDeviceCount[7]++;
                break;
            case "LCD":
                RealDeviceCount[8]++;
                break;
            case "LON":
                RealDeviceCount[9]++;
                break;
            case "N2OPEN":
                RealDeviceCount[10]++;
                break;
            case "XM":
                RealDeviceCount[11]++;
                break;
            default:
                break;
        }
    }


    public void getRealDeviceCounts() {
        for (int i = 0; i < 12; i++)
            System.out.println(DeviceTypes[i] + ": " + RealDeviceCount[i]);
    }

    public void getExpectedDeviceCounts() {
        for (int i = 0; i < 12; i++)
            System.out.println(DeviceTypes[i] + ": " + ExpectedDeviceCount[i]);
    }

    public void compareDeviceCount() {
        for (int i = 0; i < 12; i++) {
            if (RealDeviceCount[i] != ExpectedDeviceCount[i]) {
                System.out.println(DeviceTypes[i] + " mismatch");
                System.out.println("Expected/Reality : " + ExpectedDeviceCount[i] + "/" + RealDeviceCount[i]);
            }
        }
    }

    public String toString() {
        return name;
    }
}
