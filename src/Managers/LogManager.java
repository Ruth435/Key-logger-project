/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import Objects.DBLogs;
import Objects.Log;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruth2
 */
public class LogManager {   //Class Name
    private Log[] lArr = new Log[500];  //Components
    private int size = 0;
    DBLogs d = new DBLogs();
    DefaultTableModel model = new DefaultTableModel();
    
    public LogManager() throws SQLException //Constructor Method
    {
        String sql = "SELECT * FROM tblLog;";   //Select all from database and initialize the array with returned values from the database
        ResultSet s = d.queryDatabase(sql);
        while(s.next())
        {
           int n = s.getInt("DiveNumber");
           Date date = s.getDate("DiveDate");
           LocalDate localDate = date.toLocalDate();
           int ai = s.getInt("AirIn");
           int ao = s.getInt("AirOut");
           int w = s.getInt("Weight");
           int dep = s.getInt("Depth");
           int t = s.getInt("Time");
           int temp = s.getInt("Temp");
           int v = s.getInt("Visability");
           String we = s.getString("Weather");
           String bn = s.getString("NameOfBuddy");
           int bnum = s.getInt("BuddyCertNumber");
           boolean safe = s.getBoolean("SafetyStop");
           String c = s.getString("Comments");
           lArr[size] = new Log(n,localDate,t,dep,ai,ao,w,safe,temp,v,we,bn,bnum,c);
           size++;
        }
    }
    
    public void shiftLeft(int pos) //Recives a position from which elements will be moved to the left within the array, can be used to remove an element from the array
    {
        for (int i = pos; i < size -1; i++)
        {
           lArr[i] = lArr[i +1];
        }
        size--;
    }
    
    public void insertLog(Log f) throws SQLException //Recives an object and creates a query with all relevant details to enter it into the database
    {
        String sql = "INSERT INTO tblLog([DiveNumber], [DiveDate], [AirIn], [AirOut], [Weight], [Depth], [Time], [Temp], [Visability], [Weather], [NameOfBuddy], [BuddyCertNumber], [SafetyStop], [Comments]) VALUES ('" 
                + f.getDiveNum()+ "',#" + f.getDiveDate() + "#,'" + f.getAirIn() + "','" + f.getAirOut() + "','" + f.getWeight() + "','" 
                + f.getDepth() + "','" + f.getTime() + "','" + f.getTemperature()+ "','" + f.getVisability()+ "','" + f.getWeather()+ "','" + f.getBuddyName() + "','" 
                + f.getBuddyNum() + "','" + f.isSafety() + "','" + f.getComments() + "');";
        System.out.println(sql);
        try
        {
            d.updateQuery(sql);
            size++;
            System.out.println("Succesfull entry");;
        }
        catch(SQLException e)
        {
            System.out.println("Insert error: " + e);
        }      
    }
    
    public String deleteEntry(int row) //Recives a row number and deletes the corresponding entry in the database and the object array
    {
        String sql = "DELETE * FROM tblLog WHERE DiveNumber =" + row; //Deletes all columbs where the row number is equal to what the user has entered
        try{
            d.updateQuery(sql);
            for (int i =0; i < size; i++)
            {
                if(lArr[i].getDiveNum() == row)
                {
                    shiftLeft(row-1);
                    return "You have successfully deleted the record from the database";
                }
            }
        }
        catch(SQLException e)
        {
            return "Error: " + e;
        }
        return""; //Returnes a string to incicate success or failure
    }
   
    public String toString() //To String method returns all Logs in the array
    {
        String temp = "";
        for(int i = 0; i < size; i++)
        {
            temp = temp + lArr[i].toString() + "\n";
        }
        return temp;
    }
}
