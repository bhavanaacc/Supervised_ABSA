package semeval.arff.string;

import static semeval.arff.string.DTFTestarffstring.countID;
import master.DbconnSemeval;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class WeightedCCTestarffString {
    
    public static String getstr()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("{");
  try{
           DbconnSemeval db=new DbconnSemeval();
            Connection con = null;
            con = db.conn();
            Statement stat =con.createStatement();
            stat.executeQuery("select distinct(term) from dptrainmatrix");
            ResultSet rs = null;
            rs = stat.getResultSet();
             while (rs.next()) {
                 sb.append(rs.getString(1).toLowerCase()+",");
             }
             sb.append("}");
        }
        catch(Exception ex)
        {
        }
        System.out.println(sb.toString());
  return sb.toString();
    }
    
    
    public static void main(String[] str)
    {
        File file = new File("F:/arff1/WeightedCCTestarffString.arff");
        FileWriter writer=null;
     try {
         DbconnSemeval db=new DbconnSemeval();
            Connection con = null;
            con = db.conn();
            Statement stat =con.createStatement();
            stat.executeQuery("select * from reviewtest");
             writer = new FileWriter(file);
            ResultSet rs = null;
            rs = stat.getResultSet();
            int pj=0;
            writer.write("@relation 'Aspect'");
             writer.write("\n");
            writer.write("@attribute 'id' numeric");
            writer.write("\n");
            writer.write("@attribute 'term' string");
             writer.write("\n");
            writer.write("@attribute 'aspect' {ambiance,price,service,anecdotes/miscellaneous,food}");
             writer.write("\n");
            writer.write("@data");
             writer.write("\n");
             int kk=0;
             StringBuilder tokens=new StringBuilder();
           while (rs.next()) {
             String parts=rs.getString(4).toLowerCase();
               String p1=   parts.replace("\t", " ");
               String ss="";  
               ss=rs.getString(1)+",'"+parts+"',"+rs.getString(6);
                writer.write(ss);
               writer.write("\n");
               System.out.println(ss);
 
    }
        writer.close();
        } catch (Exception ex) {
            
            System.out.println(ex);
            
        }
    }
}
