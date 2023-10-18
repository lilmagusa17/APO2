package model;

import java.io.*;
import java.util.ArrayList;

public class InfrastructureDepartment {

    /**
     * constant to determine the path of the file
     */
    public static final String PATH = "data/";
    public static final String BILLBOARDS_OBJECTS_FILE_NAME = "billboards.db";

    public static final String BILLBOARDS_CSV_FILE_NAME = "BillboardDataExported.csv";

    public static final int DANGEROUS_BILLBOARD_AREA = 160;

    private ArrayList<Billboard> billboards;
    public int numBillboards;//implement in load
    public int numDangerous;
    public ArrayList<Billboard> dangerous;

    public InfrastructureDepartment(){
        billboards = new ArrayList<>();
        dangerous = new ArrayList<Billboard>();
        numDangerous=0;
        numBillboards=0;

    }

    public void addBillboard(String data) throws IOException {
        String[] bdata = data.split("\\+\\+");
        String w = bdata[0];
        String h = bdata[1];
        String inUse = bdata[2];
        billboards.add(new Billboard(Double.parseDouble(w), Double.parseDouble(h), Boolean.parseBoolean(inUse), bdata[3]));
        writeBillboardInCVS(Double.parseDouble(w), Double.parseDouble(h), Boolean.parseBoolean(inUse), bdata[3]);

    }

    public void saveBillboards() throws IOException {
        File file = new File(PATH+ BILLBOARDS_OBJECTS_FILE_NAME);

        ObjectOutputStream writer= new ObjectOutputStream(
                new FileOutputStream(file));
        writer.writeObject(billboards);
        writer.close();

    }

    public void loadBillboards() throws IOException, ClassNotFoundException{
        File salidaFile= new File(PATH+ BILLBOARDS_CSV_FILE_NAME);

        BufferedReader reader = new BufferedReader(new FileReader(salidaFile));
        String line = reader.readLine();
        line = reader.readLine();
        while (line != null) {
            String[] result = line.split("\\|");
            Billboard created=new Billboard(Double.parseDouble(result[0]),Double.parseDouble(result[1]),Boolean.parseBoolean(result[2]),result[3]);
            billboards.add(created);
            numBillboards++;
            if(created.area()>160) {
                dangerous.add(created);
                numDangerous++;
            }
            line = reader.readLine();
        }


        reader.close();


    }

    public void exportDangerousBillboardReport(){
        //a billboard is considered dangerous if the area is equal or higher than 160m^2
        StringBuilder sb = new StringBuilder();
        sb.append("===========================").append("DANGEROUS BILLBOARD REPORT\n").append("===========================\n");
        sb.append("The dangerous billboards are: \n");
        int count=1;
        for (Billboard b: billboards) {
            if(b.area() >= DANGEROUS_BILLBOARD_AREA){
                sb.append(count);
                sb.append(b.getBrand());
                sb.append("with area: ");
                sb.append(b.area());
            }
        }

    }

    public String allBillboardsReport(){
        StringBuilder sb = new StringBuilder();
        sb.append("w\th\tinUse\tBrand\n");
        for (Billboard b: billboards) {
            sb.append(b.toString() + "\n");
        }
        sb.append("\n");
        sb.append("TOTAL: ");
        sb.append(billboards.size());
        sb.append(" billboards");
        return sb.toString();
    }

    public void importData() throws IOException{
        File file = new File(PATH+ BILLBOARDS_CSV_FILE_NAME);

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line = reader.readLine();
        while((line = reader.readLine()) != null){
            String[] input = line.split("\\|");
            double w = Double.parseDouble(input[0]);
            double h = Double.parseDouble(input[1]);
            boolean iu = Boolean.parseBoolean(input[2]);
            billboards.add(new Billboard(w, h, iu, input[3]));
        }
        reader.close();
    }

    private void writeBillboardInCVS(double w, double h, boolean iu, String b ) throws  IOException{
        File file = new File(PATH+ BILLBOARDS_CSV_FILE_NAME);

        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

        writer.write("\n"+ w + "|" + h + "|" + iu + "|" + b);
        writer.flush();
        writer.close();
    }

    public String toString(){
        return "";
    }
}
