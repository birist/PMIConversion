package com.company;

public class Property {

    private int id;
    private String value;

    public Property(int classid, String data) {
        this.id = classid;
        value = data;
    }

    private String getDataType() {
        switch(id) {
            case 520: case 525: case 530: case 561: case 569: case 2038: case 2549: case 3807: case 3930: case 32608:
                return "boolean";
            case 822: case 830: case 2037:
                return "double";
            case 45:case 59: case 65: case 69: case 104: case 631: case 632: case 637: case 799: case 912:
                return "float";
            case 42:
                return "long";
            case 28: case 31: case 2390: case 32527:
                return "string";
            case 74: case 516: case 806: case 1135:
                return "unsignedByte";
            case 15: case 33: case 66: case 67: case 611: case 2566:
                return "unsignedLong";
            case 126: case 549: case 796: case 808: case 2294: case 2550:
                return "unsignedShort";
            case 40: case 117: case 646: case 661: case 807: case 908: case 931: case 1020: case 1357:
                return "enum set=\"" + getEnumSet() + "\"";
            default:
                return "deny";
        }
    }

    private String getEnumSet() {
        switch(id) {
            case 40:
                return "83";
            case 117:
                return "507";
            case 646:
                return "102";
            case 661:
                return "0";
            case 807:
                return "23";
            case 908:
                return "33";
            case 931:
                return "801";
            case 1020:
                return "1";
            case 1357:
                return "40";
            default:
                return "deny";
        }
    }

    public String getName() {
        switch(id) {
            case 15:
                return "COS Count";
            case 28:
                return "Description";
            case 31:
                return "Device Type";
            case 33:
                return "Elapsed Active Time";
            case 40:
                return "Feedback Value";
            case 42:
                return "File Size";
            case 45:
                return "High Limit";
            case 59:
                return "Low Limit";
            case 65:
                return "Max Value";
            case 66:
                return "Min Off Time";
            case 67:
                return "Min On Time";
            case 69:
                return "Min Value";
            case 74:
                return "Number Of States";
            case 104:
                return "Relinquish Default";
            case 117:
                return "Units";
            case 126:
                return "Buffer Size";
            case 516:
                return "Heavy Equip Delay";
            case 520:
                return "Warning Ack Required";
            case 525:
                return "Normal Ack Required";
            case 530:
                return "Alarm Ack Required";
            case 549:
                return "Trunk Number";
            case 561:
                return "Auto Restore";
            case 569:
                return "Intrinsic Alarming Defined";
            case 611:
                return "Sample Time";
            case 631:
                return "High Alarm Limit";
            case 632:
                return "Low Alarm Limit";
            case 637:
                return "Differential";
            case 646:
                return "Normal State";
            case 661:
                return "Display Precision";
            case 796:
                return "Object Order";
            case 799:
                return "Scale Factor";
            case 806:
                return "Net N2 Address";
            case 807:
                return "Net Point Type";
            case 808:
                return "Net Point Addr";
            case 822:
                return "Rate Constant";
            case 830:
                return "Pulse Consumption";
            case 908:
                return "Authorization Category";
            case 912:
                return "Low Cutoff Value";
            case 931:
                return "States Text";
            case 1020:
                return "Commands Priority";
            case 1135:
                return "IP Address";
            case 1357:
                return "Controller Type";
            case 2037:
                return "Totalize Limit";
            case 2038:
                return "Rollover";
            case 2294:
                return "Report Delay";
            case 2390:
                return "Name";
            case 2549:
                return "Repository Enabled";
            case 2550:
                return "Transfer Setpoint";
            case 2566:
                return "Sample Interval";
            case 3807:
                return "BACnet Exposed";
            case 3930:
                return "Use COV Min Send Time";
            case 32527:
                return "Item Reference";
            case 32608:
                return "Local Control";
            default:
                return "deny";
        }
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public String getExportObject() {
        return  "    <property id=\"" + id + "\" name=\"" + getName() + "\">\n" +
                "       <data>\n" +
                "           <" + getDataType() + ">" + value + "</" + getDataType() + ">\n" +
                "       </data>\n" +
                "   </property>";
    }

}


