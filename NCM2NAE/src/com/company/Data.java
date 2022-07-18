package com.company;

public class Data {
    private DataType Type;
    private enum DataType {
        UNSIGNEDSHORT,
        ENUM,
        STRING,
        SET,
        UNSIGNEDBYTE,
        LONG,
        TIME,
        DATE,
        BOOLEAN,
        FLOAT,
        BITS,
        LISTOF,
        UNSIGNEDLONG;
    }
    private String enumset;
    private int value;






    public Data(String type, int value) {
        try {
            switch(type) {
                case "unsignedShort":
                    Type = DataType.UNSIGNEDSHORT;
                    break;
                case "enum":
                    //TODO: Fix enum exceptions
                    Type = DataType.ENUM;
                    break;
                case "string":
                    Type = DataType.STRING;
                    break;
                case "set":
                    Type = DataType.SET;
                    break;
                case "unsignedByte":
                    Type = DataType.UNSIGNEDBYTE;
                    break;
                case "long":
                    Type = DataType.LONG;
                    break;
                case "time":
                    Type = DataType.TIME;
                    break;
                case "date":
                    Type = DataType.DATE;
                    break;
                case "boolean":
                    Type = DataType.BOOLEAN;
                    break;
                case "float":
                    Type = DataType.FLOAT;
                    break;
                case "bits":
                    Type = DataType.BITS;
                    break;
                case "listof":
                    Type = DataType.LISTOF;
                    break;
                case "unsignedLong":
                    Type = DataType.UNSIGNEDLONG;
                    break;
                default:
                    throw new Exception();
            }
        }
        catch(Exception E) {
            System.out.println("Invalid Data Type");
        }
        this.value = value;
    }

    public void setEnumset(String enumset) {
        this.enumset = enumset;
    }

    public String getType() {
        switch(Type) {
            case UNSIGNEDSHORT:
                return "unsignedShort";
            case ENUM:
                return "enum";
            case STRING:
                return "string";
            case SET:
                return "set";
            case UNSIGNEDBYTE:
                return "unsignedByte";
            case LONG:
                return "long";
            case TIME:
                return "time";
            case DATE:
                return "date";
            case BOOLEAN:
                return "boolean";
            case FLOAT:
                return "float";
            case BITS:
                return "bits";
            case LISTOF:
                return "listof";
            case UNSIGNEDLONG:
                return "unsignedLong";
            default:
                return "null";
        }
    }

    public Data(String type, int i, int value) {
        try {
            switch(type) {
                case "unsignedShort":
                    Type = DataType.UNSIGNEDSHORT;
                    break;
                case "enum":
                    Type = DataType.ENUM;
                    enumset = String.valueOf(i);
                    break;
                case "string":
                    Type = DataType.STRING;
                    break;
                case "set":
                    Type = DataType.SET;
                    break;
                case "unsignedByte":
                    Type = DataType.UNSIGNEDBYTE;
                    break;
                case "long":
                    Type = DataType.LONG;
                    break;
                case "time":
                    Type = DataType.TIME;
                    break;
                case "date":
                    Type = DataType.DATE;
                    break;
                case "boolean":
                    Type = DataType.BOOLEAN;
                    break;
                case "float":
                    Type = DataType.FLOAT;
                    break;
                case "bits":
                    Type = DataType.BITS;
                    break;
                case "listof":
                    Type = DataType.LISTOF;
                    break;
                case "unsignedLong":
                    Type = DataType.UNSIGNEDLONG;
                    break;
                default:
                    throw new Exception();
            }
        }
        catch(Exception E) {
            System.out.println("Invalid Data Type");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getFormatted() {
        String type = Type == DataType.ENUM ? getType() + "\"" + enumset + "\"" : getType();
        return "\t\t\t<data>\n" +
                    "\t\t\t\t<" + type + ">" + value + "</" + getType() + ">\n" +
                "\t\t\t</data>\n";
    }
}

