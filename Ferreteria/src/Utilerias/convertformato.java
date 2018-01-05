/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilerias;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author sistema
 */
public class convertformato {
    
    public static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");

    public static Date convertStringToDate(final String str){
        try{
            return DATE_FORMAT.parse(str);
        } catch(Exception ex){
            //TODO: Log exception
            return null;
        }
    }

    public static String convertDateToString(final Date date){
        try{
            return DATE_FORMAT.format(date);
        } catch(Exception ex){
            //TODO: Log exception
            return null;
        }
    }
    
    
     
     
}
