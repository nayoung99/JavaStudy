package com.test.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class MachineInfo { //DTO : Data Transfer Object
    private String machineName; //멤버변수
    private String managerName;
    private int temperature;
    private int power;
    private int runTime;

    public MachineInfo(String machineName, String managerName, //생성자
    int temperature, int power, int runTime){
        this.machineName = machineName;
        this.managerName = managerName;
        this.temperature = temperature;
        this.power = power;
        this.runTime = runTime;
    }

    //getter method
    public String getMachineName(){
        return this.machineName;
    }

    public String getManagerName(){
        return this.managerName;
    }

    public int getTemperature(){
        return this.temperature;
    }

    public int getPower(){
        return this.power;
    }

    public int getRuntime(){
        return this.runTime;
    } 
    //setter method도 생성해서 값 변경 가능
}

class FileManager {

    public static void fileReader() throws IOException, ClassNotFoundException, SQLException{

        BufferedReader reader 
        = new BufferedReader(new FileReader("C:\\Repository\\machine\\MachineLog.txt", Charset.forName("UTF-8")));

        String str;
        String query;
        String[] lineArray;
        while((str = reader.readLine()) != null){

            lineArray = str.split(","); //, --> 구분자
            query = ""; //== null
            query = "insert into tbl_machine (machinename, managername, temperature, power, runtime) "+
                    "values (\'" +lineArray[0] + "\',\'" + lineArray[1] + "\'," +
                    lineArray[2] + "," + lineArray[3] + "," + lineArray[4] + ")";
            // System.out.println("query = "+query);
            DBControl.insertDB(query);
        }

        reader.close();
    }
}

class DBControl {

    private static final String uri = "jdbc:mariadb://127.0.0.1:3306/webdev"; //고정
    private static final String userid = "webmaster";
    private static final String userpw = "12345";

    public static void insertDB(String query) throws ClassNotFoundException, SQLException{
        Connection con;
        Statement stmt;
        
        Class.forName("org.mariadb.jdbc.Driver");
        con = DriverManager.getConnection(uri, userid, userpw);
        stmt = con.createStatement();
        stmt.executeUpdate(query);

        if(stmt != null) stmt.close();
        if(con != null) con.close();

    }
}

public class FileExam01 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        FileManager.fileReader(); //파일에서 값을 읽어 온다.
    }

}
