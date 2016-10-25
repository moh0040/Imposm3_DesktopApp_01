/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Main {
 
       public static void main(String args[]) {
           
          
     

            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyFrame m = new MyFrame();
                    
                    m.setVisible(true);
                    
                    //new MyFrame().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
            
        });
            
            
         
            
       
           
           
           
           
           
 
            /*try {
                Runtime rt = Runtime.getRuntime();
                //Process pr = rt.exec("cmd /c dir");
                
                
                Process pr = rt.exec("/home/saeed/Downloads/imposm3/imposm3 import -mapping /home/saeed/imposm/single_table_mapping.json -read /home/saeed/imposm/colombo.osm.pbf -overwritecache -write -connection postgis://osm:osm@localhost/osm");
 
                BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
 
                String line=null;
 
                while((line=input.readLine()) != null) {
                    System.out.println(line);
                }
 
                int exitVal = pr.waitFor();
                System.out.println("Exited with error code "+exitVal);
 
            } catch(Exception e) {
                System.out.println(e.toString());
                e.printStackTrace();
            }*/
        }
       
}