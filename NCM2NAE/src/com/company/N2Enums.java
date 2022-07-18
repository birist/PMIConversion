package com.company;

public class N2Enums {

    public static String classid(int id) {
        switch(id) {
            case 0:
                return "BACnet Analog Input";
            case 1:
                return "BACnet Analog Output";
            case 2:
                return "BACnet Analog Value";
            case 3:
                return "BACnet Binary Input";
            case 4:
                return "BACnet Binary Output";
            case 5:
                return "BACnet Binary Value";
            case 6:
                return "BACnet Calendar";
            case 9:
                return "BACnet Event Enrollment";
            case 10:
                return "BACnet File";
            case 11:
                return "BACnet Group";
            case 12:
                return "BACnet Loop";
            case 13:
                return "BACnet Multistate Input";
            case 14:
                return "BACnet Multistate Output";
            case 15:
                return "BACnet Notification";
            case 16:
                return "BACnet Schedule";
            case 19:
                return "BACnet Multistate Value";
            case 23:
                return "BACnet Accumulator";
            case 129:
                return "BACnet PE";
            case 135:
                return "Subscription Server";
            case 137:
                return "DLLR";
            case 138:
                return "Load";
            case 141:
                return "JCI Multistate Value";
            case 144:
                return "Multiple Control";
            case 146:
                return "Interlock";
            case 147:
                return "N2 Analog Input";
            case 148:
                return "N2 Binary Input";
            case 149:
                return "N2 Analog Output";
            case 150:
                return "N2 Binary Output";
            case 151:
                return "N2 Multistate Input";
            case 153:
                return "N2 Program Control";
            case 155:
                return "Trend";
            case 156:
                return "Analog Alarm";
            case 161:
                return "JCI Calendar";
            case 165:
                return "JCI Analog Value";
            case 168:
                return "Binary Value";
            case 172:
                return "Multistate Alarm";
            case 174:
                return "Optimal Start";
            case 176:
                return "Container";
            case 177:
                return "Global Data";
            case 178:
                return "Signal Select";
            case 181:
                return "Pulse Meter";
            case 185:
                return "N50";
            case 186:
                return "Auto Shutdown";
            case 190:
                return "JCI Event Enrollment";
            case 191:
                return "JCI Group";
            case 192:
                return "NAE 45";
            case 193:
                return "NCE 35";
            case 195:
                return "Field Bus";
            case 197:
                return "Field Device";
            case 199:
                return "Fire Control Device";
            case 200:
                return "XL5K Integration";
            case 201:
                return "XL5K Controller";
            case 202:
                return "XL5K Analog Input";
            case 203:
                return "XL5K Analog Output";
            case 204:
                return "XL5K Binary Input";
            case 205:
                return "XL5K Binary Output";
            case 206:
                return "XL5K Multistate Input";
            case 207:
                return "XL5K Multistate Output";
            case 208:
                return "XL5K Program Control";
            case 209:
                return "Flex Accumulator";
            case 210:
                return "WRS Clas";
            case 211:
                return "Wireless Receiver";
            case 212:
                return "Wireless Sensor";
            case 213:
                return "Supervisor Status Primitive";
            case 214:
                return "IEIEJ Electric Demand Monitoring";
            case 215:
                return "IEIEJ Electric Demand Control";
            case 216:
                return "IEIEJ Generic Load Control";
            case 219:
                return "BACnet Router";
            case 220:
                return "BACnet Accumulator Mapper";
            case 221:
                return "BACnet Pulse Converter";
            case 224:
                return "BACnet Trend Log Multiple";
            case 225:
                return "BACnet Load Control";
            case 227:
                return "BACnet Electric Demand Monitoring";
            case 228:
                return "BACnet Electric Demand Control";
            case 245:
                return "N1 Program Control";
            case 249:
                return "Solar Clock";
            case 252:
                return "Proportional, Integral, and Derivative Loop";
            case 255:
                return "Diagnostic";
            case 263:
                return "JCI Schedule";
            case 264:
                return "JCI Loop";
            case 274:
                return "Analog Totalization";
            case 275:
                return "Runtime Totalization";
            case 276:
                return "Event Totalization";
            case 278:
                return "Controller";
            case 282:
                return "Gateway";
            case 283:
                return "ODS Workstation";
            case 284:
                return "Cloud Integration Engine";
            case 286:
                return "Site";
            case 290:
                return "N2 Integration";
            case 292:
                return "Ethernet IP";
            case 300:
                return "Trend Log Multiple";
            case 307:
                return "MSTP Integration";
            case 313:
                return "JCI Notification";
            case 319:
                return "Data Broadcast";
            case 336:
                return "System Class";
            case 343:
                return "BACnet Integration";
            case 344:
                return "Graphic";
            case 345:
                return "Trend Study";
            case 346:
                return "N1 Integration";
            case 347:
                return "NCM";
            case 348:
                return "Navigation Tree";
            case 349:
                return "LON Integration";
            case 350:
                return "LON Controller";
            case 351:
                return "Lon Analog Input";
            case 352:
                return "Lon Analog Output";
            case 353:
                return "Lon Binary Input";
            case 354:
                return "Lon Binary Output";
            case 355:
                return "LON Multistate Input";
            case 356:
                return "LON Mulstiate Output";
            case 357:
                return "Resource File";
            case 358:
                return "N50 Integration";
            case 377:
                return "P2000 Server";
            case 378:
                return "P2000 Panel";
            case 379:
                return "P2000 Portal";
            case 380:
                return "P2000 Door";
            case 417:
                return "N1 Analog Input";
            case 418:
                return "N1 Binary Input";
            case 419:
                return "N1 Analog Output";
            case 420:
                return "N1 Binary Output";
            case 421:
                return "N1 Multistate Input";
            case 422:
                return "N1 Mulstiate Output";
            case 423:
                return "N1 Calendar";
            case 425:
                return "ADS Workstation";
            case 427:
                return "VND Controller";
            case 428:
                return "VND Analog Input";
            case 429:
                return "VND Analog Output";
            case 430:
                return "VND Binary Input";
            case 431:
                return "VND Binary Output";
            case 432:
                return "VND Multistate Input";
            case 433:
                return "VND Multistate Output";
            case 500:
                return "BACnet Analog Input Mapper";
            case 501:
                return "BACnet Analog Output Mapper";
            case 502:
                return "BACnet Analog Value Mapper";
            case 503:
                return "BACnet Binary Input Mapper";
            case 504:
                return "BACnet Binary Output Mapper";
            case 505:
                return "BACnet Binary Value Mapper";
            case 507:
                return "BACnet Command";
            case 508:
                return "BACnet Device";
            case 509:
                return "BACnet Event Enrollment Mapper";
            case 510:
                return "BACnet File Mapper";
            case 511:
                return "BACnet Group Mapper";
            case 513:
                return "BACnet Multistate Input Mapper";
            case 514:
                return "BACnet Multistate Output Mapper";
            case 515:
                return "BACnet Notification Mapper";
            case 516:
                return "BACnet Program";
            case 517:
                return "BACnet Schedule Mapper";
            case 518:
                return "BACnet Averaging";
            case 519:
                return "BACnet Multistate Value Mapper";
            case 520:
                return "BACnet Trend Log";
            case 521:
                return "BACnet Life Safety Point";
            case 522:
                return "BACnet Life Safety Zone";
            case 526:
                return "Input Float Block";
            case 527:
                return "Output Float Block";
            case 528:
                return "Input Enumeration Block";
            case 529:
                return "Output Enumeration Block";
            case 530:
                return "Input Boolean Block";
            case 531:
                return "Output Boolean Block";
            case 532:
                return "Summer Winter Compensation Primitive";
            case 536:
                return "Control Activity";
            case 551:
                return "Float Constant";
            case 552:
                return "Boolean Constant";
            case 554:
                return "File";
            case 555:
                return "Control Point";
            case 556:
                return "Sensor Primitive";
            case 560:
                return "Comparison";
            case 561:
                return "Math Primitive";
            case 563:
                return "ABH Primitive";
            case 564:
                return "DP Primitive";
            case 565:
                return "Enth Primitive";
            case 566:
                return "RH Primitive";
            case 567:
                return "WB Primitive";
            case 568:
                return "Enumeration Constant";
            case 570:
                return "Flow";
            case 575:
                return "Sequence";
            case 585:
                return "Standards Table";
            case 597:
                return "REM Device";
            case 598:
                return "RIOM Device";
            case 599:
                return "Analog Input Mapper";
            case 600:
                return "Analog Output Mapper";
            case 601:
                return "Analog Value Mapper";
            case 602:
                return "Binary Input Mapper";
            case 603:
                return "Binary Output Mapper";
            case 605:
                return "JCI Multistate Input Mapper";
            case 606:
                return "JCI Multistate Mapper";
            case 613:
                return "NAE 35";
            case 627:
                return "Net Sensor Device";
            case 632:
                return "Variable Speed Drive";
            case 651:
                return "NCE";
            case 661:
                return "Subscription Client";
            case 677:
                return "Averaging";
            case 699:
                return "Summary Definition";
            case 717:
                return "Xaml Graphic";
            case 752:
                return "ADS Lite E";
            case 753:
                return "ADS Lite A";
            case 760:
                return "Trend Mapper";
            case 761:
                return "JCI Schedule Mapper";
            case 762:
                return "Calendar Mapper";
            case 763:
                return "JCI Notification Mapper";
            case 805:
                return "Legacy Equipment";
            case 806:
                return "Space";
            case 807:
                return "Equipment Definition";
            case 820:
                return "BACnet Character String";
            case 825:
                return "BACnet Integer";
            case 828:
                return "BACnet Positive Integer";
            case 2000:
                return "Archive Object";
            case 2004:
                return "Initial Device Configuration";
            case 2006:
                return "Controller Folder Template";
            case 2008:
                return "Controller Template";
            case 2010:
                return "SCT Summary Definition";
            case 2011:
                return "SCT Summary Definition Folder";
            default:
                return "null";
        }
    }

    public static int classid(String s) {
        switch(s) {
            case "BACnet Analog Input":
                return 0;
            case "BACnet Analog Output":
                return 1;
            case "BACnet Analog Value":
                return 2;
            case "BACnet Binary Input":
                return 3;
            case "BACnet Binary Output":
                return 4;
            case "BACnet Binary Value":
                return 5;
            case "BACnet Calendar":
                return 6;
            case "BACnet Event Enrollment":
                return 9;
            case "BACnet File":
                return 10;
            case "BACnet Group":
                return 11;
            case "BACnet Loop":
                return 12;
            case "BACnet Multistate Input":
                return 13;
            case "BACnet Multistate Output":
                return 14;
            case "BACnet Notification":
                return 15;
            case "BACnet Schedule":
                return 16;
            case "BACnet Multistate Value":
                return 19;
            case "BACnet Accumulator":
                return 23;
            case "BACnet PE":
                return 129;
            case "Subscription Server":
                return 135;
            case "DLLR":
                return 137;
            case "Load":
                return 138;
            case "JCI Multistate Value":
                return 141;
            case "Multiple Control":
                return 144;
            case "Interlock":
                return 146;
            case "N2 Analog Input":
                return 147;
            case "N2 Binary Input":
                return 148;
            case "N2 Analog Output":
                return 149;
            case "N2 Binary Output":
                return 150;
            case "N2 Multistate Input":
                return 151;
            case "N2 Program Control":
                return 153;
            case "Trend":
                return 155;
            case "Analog Alarm":
                return 156;
            case "JCI Calendar":
                return 161;
            case "JCI Analog Value":
                return 165;
            case "Binary Value":
                return 168;
            case "Multistate Alarm":
                return 172;
            case "Optimal Start":
                return 174;
            case "Reference":
                return 176;
            case "Global Data":
                return 177;
            case "Signal Select":
                return 178;
            case "Pulse Meter":
                return 181;
            case "N50":
                return 185;
            case "Auto Shutdown":
                return 186;
            case "JCI Event Enrollment":
                return 190;
            case "JCI Group":
                return 191;
            case "NAE 45":
                return 192;
            case "NCE 35":
                return 193;
            case "Field Bus":
                return 195;
            case "Field Device":
                return 197;
            case "Fire Control Device":
                return 199;
            case "XL5K Integration":
                return 200;
            case "XL5K Controller":
                return 201;
            case "XL5K Analog Input":
                return 202;
            case "XL5K Analog Output":
                return 203;
            case "XL5K Binary Input":
                return 204;
            case "XL5K Binary Output":
                return 205;
            case "XL5K Multistate Input":
                return 206;
            case "XL5K Multistate Output":
                return 207;
            case "XL5K Program Control":
                return 208;
            case "Flex Accumulator":
                return 209;
            case "WRS Clas":
                return 210;
            case "Wireless Receiver":
                return 211;
            case "Wireless Sensor":
                return 212;
            case "Supervisor Status Primitive":
                return 213;
            case "IEIEJ Electric Demand Monitoring":
                return 214;
            case "IEIEJ Electric Demand Control":
                return 215;
            case "IEIEJ Generic Load Control":
                return 216;
            case "BACnet Router":
                return 219;
            case "Site Director BACnet Router":
                return 219;
            case "BACnet Accumulator Mapper":
                return 220;
            case "BACnet Pulse Converter":
                return 221;
            case "BACnet Trend Log Multiple":
                return 224;
            case "BACnet Load Control":
                return 225;
            case "BACnet Electric Demand Monitoring":
                return 227;
            case "BACnet Electric Demand Control":
                return 228;
            case "N1 Program Control":
                return 245;
            case "BACnet Generic Load Control":
                return 245;
            case "Solar Clock":
                return 249;
            case "Proportional, Integral, and Derivative Loop":
                return 252;
            case "Diagnostic":
                return 255;
            case "JCI Schedule":
                return 263;
            case "JCI Loop":
                return 264;
            case "Analog Totalization":
                return 274;
            case "Runtime Totalization":
                return 275;
            case "Event Totalization":
                return 276;
            case "Controller":
                return 278;
            case "Gateway":
                return 282;
            case "Site Director Gateway":
                return 282;
            case "ODS Workstation":
                return 283;
            case "Site Director ODS Workstation":
                return 283;
            case "Cloud Integration Engine":
                return 284;
            case "Site":
                return 286;
            case "N2 Integration":
                return 290;
            case "Ethernet IP":
                return 292;
            case "Trend Log Multiple":
                return 300;
            case "MSTP Integration":
                return 307;
            case "JCI Notification":
                return 313;
            case "Data Broadcast":
                return 319;
            case "System Class":
                return 336;
            case "BACnet Integration":
                return 343;
            case "Graphic":
                return 344;
            case "Trend Study":
                return 345;
            case "N1 Integration":
                return 346;
            case "NCM":
                return 347;
            case "Navigation Tree":
                return 348;
            case "LON Integration":
                return 349;
            case "LON Controller":
                return 350;
            case "Lon Analog Input":
                return 351;
            case "Lon Analog Output":
                return 352;
            case "Lon Binary Input":
                return 353;
            case "Lon Binary Output":
                return 354;
            case "LON Multistate Input":
                return 355;
            case "LON Mulstiate Output":
                return 356;
            case "Resource File":
                return 357;
            case "N50 Integration":
                return 358;
            case "P2000 Server":
                return 377;
            case "P2000 Panel":
                return 378;
            case "P2000 Portal":
                return 379;
            case "P2000 Door":
                return 380;
            case "N1 Analog Input":
                return 417;
            case "N1 Binary Input":
                return 418;
            case "N1 Analog Output":
                return 419;
            case "N1 Binary Output":
                return 420;
            case "N1 Multistate Input":
                return 421;
            case "N1 Mulstiate Output":
                return 422;
            case "N1 Calendar":
                return 423;
            case "ADS Workstation":
                return 425;
            case "VND Controller":
                return 427;
            case "VND Analog Input":
                return 428;
            case "VND Analog Output":
                return 429;
            case "VND Binary Input":
                return 430;
            case "VND Binary Output":
                return 431;
            case "VND Multistate Input":
                return 432;
            case "VND Multistate Output":
                return 433;
            case "BACnet Analog Input Mapper":
                return 500;
            case "BACnet Analog Output Mapper":
                return 501;
            case "BACnet Analog Value Mapper":
                return 502;
            case "BACnet Binary Input Mapper":
                return 503;
            case "BACnet Binary Output Mapper":
                return 504;
            case "BACnet Binary Value Mapper":
                return 505;
            case "BACnet Command":
                return 507;
            case "BACnet Device":
                return 508;
            case "BACnet Event Enrollment Mapper":
                return 509;
            case "BACnet File Mapper":
                return 510;
            case "BACnet Group Mapper":
                return 511;
            case "BACnet Multistate Input Mapper":
                return 513;
            case "BACnet Multistate Output Mapper":
                return 514;
            case "BACnet Notification Mapper":
                return 515;
            case "BACnet Program":
                return 516;
            case "BACnet Schedule Mapper":
                return 517;
            case "BACnet Averaging":
                return 518;
            case "BACnet Multistate Value Mapper":
                return 519;
            case "BACnet Trend Log":
                return 520;
            case "BACnet Life Safety Point":
                return 521;
            case "BACnet Life Safety Zone":
                return 522;
            case "Input Float Block":
                return 526;
            case "Output Float Block":
                return 527;
            case "Input Enumeration Block":
                return 528;
            case "Output Enumeration Block":
                return 529;
            case "Input Boolean Block":
                return 530;
            case "Output Boolean Block":
                return 531;
            case "Summer Winter Compensation Primitive":
                return 532;
            case "Control Activity":
                return 536;
            case "Float Constant":
                return 551;
            case "Boolean Constant":
                return 552;
            case "File":
                return 554;
            case "Control Point":
                return 555;
            case "Sensor Primitive":
                return 556;
            case "Comparison":
                return 560;
            case "Math Primitive":
                return 561;
            case "ABH Primitive":
                return 563;
            case "DP Primitive":
                return 564;
            case "Enth Primitive":
                return 565;
            case "RH Primitive":
                return 566;
            case "WB Primitive":
                return 567;
            case "Enumeration Constant":
                return 568;
            case "Flow":
                return 570;
            case "Sequence":
                return 575;
            case "Standards Table":
                return 585;
            case "REM Device":
                return 597;
            case "RIOM Device":
                return 598;
            case "Analog Input Mapper":
                return 599;
            case "Analog Output Mapper":
                return 600;
            case "Analog Value Mapper":
                return 601;
            case "Binary Input Mapper":
                return 602;
            case "Binary Output Mapper":
                return 603;
            case "JCI Multistate Input Mapper":
                return 605;
            case "JCI Multistate Mapper":
                return 606;
            case "NAE 35":
                return 613;
            case "Site Director NAE 35":
                return 613;
            case "Net Sensor Device":
                return 627;
            case "Variable Speed Drive":
                return 632;
            case "NCE":
                return 651;
            case "Subscription Client":
                return 661;
            case "Averaging":
                return 677;
            case "Summary Definition":
                return 699;
            case "Xaml Graphic":
                return 717;
            case "ADS Lite E":
                return 752;
            case "ADS Lite A":
                return 753;
            case "Trend Mapper":
                return 760;
            case "JCI Schedule Mapper":
                return 761;
            case "Calendar Mapper":
                return 762;
            case "JCI Notification Mapper":
                return 763;
            case "Legacy Equipment":
                return 805;
            case "Space":
                return 806;
            case "Equipment Definition":
                return 807;
            case "BACnet Character String":
                return 820;
            case "BACnet Integer":
                return 825;
            case "BACnet Positive Integer":
                return 828;
            case "User View Folder":
                return 2000;
            case "Initial Device Configuration":
                return 2004;
            case "Controller Folder Template":
                return 2006;
            case "Controller Template":
                return 2008;
            case "SCT Summary Definition":
                return 2010;
            case "SCT Summary Definition Folder":
                return 2011;
            default:
                return 9999;
        }
    }



    public static String DisplayPrecision(String s) {
        switch(s) {
            case "0":
                return "1000000ths";
            case "1":
                return "100000ths";
            case "2":
                return "10000ths";
            case "3":
                return "1000ths";
            case "4":
                return "100ths";
            case "5":
                return "10ths";
            case "6":
                return "1s";
            case "7":
                return "10s";
            case "8":
                return "100s";
            case "9":
                return "0000s";
            case "10":
                return "10000s";
            case "11":
                return "100000s";
            case "12":
                return "1000000s";
            case "1000000ths":
                return "0";
            case "100000ths":
                return "1";
            case "10000ths":
                return "2";
            case "1000ths":
                return "3";
            case "100ths":
                return "4";
            case "10ths":
                return "5";
            case "1s":
                return "6";
            case "10s":
                return "7";
            case "100s":
                return "8";
            case "1000s":
                return "9";
            case "10000s":
                return "10";
            case "100000s":
                return "11";
            case "1000000s":
                return "12";
            default:
                return s;
        }
    }
    //enum set 507 units


    public static String getPropertyName(int i) {

        return "";
    }

    public static String getPropertyDataType(int i) {
        return "";
    }

    //enum set 40 Controller type
    public static String translateController(String s) {
        switch(s) {
            case "1":
                return "AHU";
            case "2":
                return "VAV";
            case "3":
                return "UNT";
            case "4":
                return "PHX";
            case "5":
                return "VND";
            case "6":
                return "MIG";
            case "7":
                return "VMA";
            case "8":
                return "DX-9100";
            case "9":
                return "TC-9100";
            case "10":
                return "XTM";
            case "11":
                return "LCP";
            case "12":
                return "ILC";
            case "13":
                return "IFC";
            case "AHU":
                return "1";
            case "VAV":
                return "2";
            case "UNT":
                return "3";
            case "PHX":
                return "4";
            case "VND":
                return "5";
            case "MIG":
                return "6";
            case "VMA":
                return "7";
            case "DX-9100":
                return "8";
            case "TC-9100":
                return "9";
            case "XTM":
                return "10";
            case "LCP":
                return "11";
            case "ILC":
                return "12";
            case "IFC":
                return "13";
            default:
                return s;
        }
    }
}

class units {

    public static int getId(String s) {
        switch(s) {
            case "sq meters":
                return 0;
            case "sq ft":
                return 1;
            case "mA":
                return 2;
            case "A":
                return 3;
            case "ohms":
                return 4;
            case "V":
                return 5;
            case "kV":
                return 6;
            case "MV":
                return 7;
            case "VA":
                return 8;
            case "kVA":
                return 9;
            case "MVA":
                return 10;
            case "VAR":
                return 11;
            case "kVAR":
                return 12;
            case "MVAR":
                return 13;
            case "deg-phase":
                return 14;
            case "PF":
                return 15;
            case "J":
                return 16;
            case "kJ":
                return 17;
            case "Wh":
                return 18;
            case "kWh":
                return 19;
            case "Btu":
                return 20;
            case "Therms":
                return 21;
            case "ton-hrs":
                return 22;
            case "J/kg":
                return 23;
            case "Btu/lb":
                return 24;
            case "cph":
                return 25;
            case "cpm":
                return 26;
            case "Hz":
                return 27;
            case "gram water/kg":
                return 28;
            case "%RH":
                return 29;
            case "mm":
                return 30;
            case "m":
                return 31;
            case "in.":
                return 32;
            case "ft":
                return 33;
            case "W/sq ft":
                return 34;
            case "W/sq m":
                return 35;
            case "Lumens":
                return 36;
            case "Luxes":
                return 37;
            case "ft candles":
                return 38;
            case "kg":
                return 39;
            case "Lbm":
                return 40;
            case "Tons":
                return 41;
            case "kg/s":
                return 42;
            case "kg/min":
                return 43;
            case "kg/h":
                return 44;
            case "lbm/min":
                return 45;
            case "lbm/h":
                return 46;
            case "W":
                return 47;
            case "kW":
                return 48;
            case "MW":
                return 49;
            case "Btuh":
                return 50;
            case "hp":
                return 51;
            case "tons refrigeration":
                return 52;
            case "Pa Pascals":
                return 53;
            case "kpa Kilopascals":
                return 54;
            case "bars":
                return 55;
            case "psi":
                return 56;
            case "cm WC":
                return 57;
            case "in WC":
                return 58;
            case "mm Hg":
                return 59;
            case "cm Hg":
                return 60;
            case "in Hg":
                return 61;
            case "deg C":
                return 62;
            case "K":
                return 63;
            case "deg F":
                return 64;
            case "degree days C":
                return 65;
            case "degree days F":
                return 66;
            case "yr":
                return 67;
            case "mo":
                return 68;
            case "wk":
                return 69;
            case "days":
                return 70;
            case "hr":
                return 71;
            case "min":
                return 72;
            case "sec or s":
                return 73;
            case "m/s":
                return 74;
            case "km/h":
                return 75;
            case "ft/s":
                return 76;
            case "ft/min":
                return 77;
            case "mph":
                return 78;
            case "cu ft":
                return 79;
            case "cu m":
                return 80;
            case "imp gal":
                return 81;
            case "l":
                return 82;
            case "gallons":
                return 83;
            case "cfm":
                return 84;
            case "cu meters/sec":
                return 85;
            case "imp gpm":
                return 86;
            case "l/s":
                return 87;
            case "l/min":
                return 88;
            case "gpm":
                return 89;
            case "deg-angular":
                return 90;
            case "deg C/h":
                return 91;
            case "deg C/min":
                return 92;
            case "deg F/h":
                return 93;
            case "deg F/min":
                return 94;
            case "ppm":
                return 96;
            case "ppb":
                return 97;
            case "%":
                return 98;
            case "percent/sec":
                return 99;
            case "per min":
                return 100;
            case "per sec":
                return 101;
            case "psi/deg F":
                return 102;
            case "radians":
                return 103;
            case "RPM":
                return 104;
            case "sq in":
                return 115;
            case "sq cm":
                return 116;
            case "Btus/lb":
                return 117;
            case "cm":
                return 118;
            case "lbs mass/sec":
                return 119;
            case "delta deg F":
                return 120;
            case "delta deg K":
                return 121;
            case "kOhms":
                return 122;
            case "MOhms":
                return 123;
            case "mV":
                return 124;
            case "kJ/kg":
                return 125;
            case "MJ":
                return 126;
            case "J/K":
                return 127;
            case "J/kg-K":
                return 128;
            case "kHz":
                return 129;
            case "MHz":
                return 130;
            case "per":
                return 131;
            case "mW":
                return 132;
            case "hPa":
                return 133;
            case "mBar":
                return 134;
            case "cu meters/h":
                return 135;
            case "l/h":
                return 136;
            case "kWh/sq meter":
                return 137;
            case "kWh/sq ft":
                return 138;
            case "MJ/sq meter":
                return 139;
            case "MJ/sq ft":
                return 140;
            case "W/sq meter-K":
                return 141;
            case "cu ft/sec":
                return 142;
            case "% obscuration/ft":
                return 143;
            case "% obscuration/m":
                return 144;
            case "bytes":
                return 256;
            case "msec":
                return 257;
            case "counts":
                return 258;
            case "people":
                return 259;
            case "cfm/person":
                return 260;
            case "l/person":
                return 261;
            case "min/deg sq":
                return 262;
            case "kW/min":
                return 263;
            case "% open":
                return 264;
            case "% closed":
                return 265;
            case "flowC cfm":
                return 266;
            case "flowC m/h":
                return 267;
            case "flowC l/s":
                return 268;
            default:
                return -1;
        }
    }

    public static String getName(int i) {
        switch(i) {
            case 0:
                return "sq meters";
            case 1:
                return "sq ft";
            case 2:
                return "mA";
            case 3:
                return "A";
            case 4:
                return "ohms";
            case 5:
                return "V";
            case 6:
                return "kV";
            case 7:
                return "MV";
            case 8:
                return "VA";
            case 9:
                return "kVA";
            case 10:
                return "MVA";
            case 11:
                return "VAR";
            case 12:
                return "kVAR";
            case 13:
                return "MVAR";
            case 14:
                return "deg-phase";
            case 15:
                return "PF";
            case 16:
                return "J";
            case 17:
                return "kJ";
            case 18:
                return "Wh";
            case 19:
                return "kWh";
            case 20:
                return "Btu";
            case 21:
                return "Therms";
            case 22:
                return "ton-hrs";
            case 23:
                return "J/kg";
            case 24:
                return "Btu/lb";
            case 25:
                return "cph";
            case 26:
                return "cpm";
            case 27:
                return "Hz";
            case 28:
                return "gram water/kg";
            case 29:
                return "%RH";
            case 30:
                return "mm";
            case 31:
                return "m";
            case 32:
                return "in.";
            case 33:
                return "ft";
            case 34:
                return "W/sq ft";
            case 35:
                return "W/sq m";
            case 36:
                return "Lumens";
            case 37:
                return "Luxes";
            case 38:
                return "ft candles";
            case 39:
                return "kg";
            case 40:
                return "Lbm";
            case 41:
                return "Tons";
            case 42:
                return "kg/s";
            case 43:
                return "kg/min";
            case 44:
                return "kg/h";
            case 45:
                return "lbm/min";
            case 46:
                return "lbm/h";
            case 47:
                return "W";
            case 48:
                return "kW";
            case 49:
                return "MW";
            case 50:
                return "Btuh";
            case 51:
                return "hp";
            case 52:
                return "tons refrigeration";
            case 53:
                return "Pa Pascals";
            case 54:
                return "kpa Kilopascals";
            case 55:
                return "bars";
            case 56:
                return "psi";
            case 57:
                return "cm WC";
            case 58:
                return "in WC";
            case 59:
                return "mm Hg";
            case 60:
                return "cm Hg";
            case 61:
                return "in Hg";
            case 62:
                return "deg C";
            case 63:
                return "K";
            case 64:
                return "deg F";
            case 65:
                return "degree days C";
            case 66:
                return "degree days F";
            case 67:
                return "yr";
            case 68:
                return "mo";
            case 69:
                return "wk";
            case 70:
                return "days";
            case 71:
                return "hr";
            case 72:
                return "min";
            case 73:
                return "sec or s";
            case 74:
                return "m/s";
            case 75:
                return "km/h";
            case 76:
                return "ft/s";
            case 77:
                return "ft/min";
            case 78:
                return "mph";
            case 79:
                return "cu ft";
            case 80:
                return "cu m";
            case 81:
                return "imp gal";
            case 82:
                return "l";
            case 83:
                return "gallons";
            case 84:
                return "cfm";
            case 85:
                return "cu meters/sec";
            case 86:
                return "imp gpm";
            case 87:
                return "l/s";
            case 88:
                return "l/min";
            case 89:
                return "gpm";
            case 90:
                return "deg-angular";
            case 91:
                return "deg C/h";
            case 92:
                return "deg C/min";
            case 93:
                return "deg F/h";
            case 94:
                return "deg F/min";
            case 96:
                return "ppm";
            case 97:
                return "ppb";
            case 98:
                return "%";
            case 99:
                return "percent/sec";
            case 100:
                return "per min";
            case 101:
                return "per sec";
            case 102:
                return "psi/deg F";
            case 103:
                return "radians";
            case 104:
                return "RPM";
            case 115:
                return "sq in";
            case 116:
                return "sq cm";
            case 117:
                return "Btus/lb";
            case 118:
                return "cm";
            case 119:
                return "lbs mass/sec";
            case 120:
                return "delta deg F";
            case 121:
                return "delta deg K";
            case 122:
                return "kOhms";
            case 123:
                return "MOhms";
            case 124:
                return "mV";
            case 125:
                return "kJ/kg";
            case 126:
                return "MJ";
            case 127:
                return "J/K";
            case 128:
                return "J/kg-K";
            case 129:
                return "kHz";
            case 130:
                return "MHz";
            case 131:
                return "per";
            case 132:
                return "mW";
            case 133:
                return "hPa";
            case 134:
                return "mBar";
            case 135:
                return "cu meters/h";
            case 136:
                return "l/h";
            case 137:
                return "kWh/sq meter";
            case 138:
                return "kWh/sq ft";
            case 139:
                return "MJ/sq meter";
            case 140:
                return "MJ/sq ft";
            case 141:
                return "W/sq meter-K";
            case 142:
                return "cu ft/sec";
            case 143:
                return "% obscuration/ft";
            case 144:
                return "% obscuration/m";
            case 256:
                return "bytes";
            case 257:
                return "msec";
            case 258:
                return "counts";
            case 259:
                return "people";
            case 260:
                return "cfm/person";
            case 261:
                return "l/person";
            case 262:
                return "min/deg sq";
            case 263:
                return "kW/min";
            case 264:
                return "% open";
            case 265:
                return "% closed";
            case 266:
                return "flowC cfm";
            case 267:
                return "flowC m/h";
            case 268:
                return "flowC l/s";
            default:
                return null;
        }
    }
}
//enum set 23 Net Point Type





//enum set 33?

//0 - display precision?
//1 - command priorities?
//6 - relinquish default
//23 - net point type

//33 - object category
//40 - controller type
//102 - normal state
//507 - units
//801 - states text
//802 - states text
