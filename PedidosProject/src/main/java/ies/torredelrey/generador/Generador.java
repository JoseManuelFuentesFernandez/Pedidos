/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.torredelrey.generador;

import java.util.Collection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author usuario
 */
public class Generador {
    //////////////////////////////  PLANTILLA NO TOCAR  //////////////////////////////
    /*public static void leerInforme(List<> lista, String rutaInforme, String nombreInformeSalida){
<<<<<<< HEAD
        try {
            JasperPrint print;
            HashMap param = new HashMap();
            param.put("fecha", LocalDate.now().toString());

            JRDataSource datasource = new JRBeanArrayDataSource(lista.toArray());
            print = JasperFillManager.fillReport(rutaInforme, param,datasource);
            JasperExportManager.exportReportToPdfFile(print,nombreInformeSalida);
            JasperViewer.viewReport(print);
        } catch (JRException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    ///////////////////////////////////////////////////////////////////////////////////
    // ****************** CODIFICAR AQUI ABAJO ******************
     public static void leerInformeProductos(Collection listaProductos,String rutaInforme,String nombreInformeSalida){
        try {
            
            JasperPrint print;
            HashMap param = new HashMap();
            param.put("categoriaid", 100);
            param.put("total", listaProductos.size());
            JRDataSource datasource = new JRBeanArrayDataSource(listaProductos.toArray());
            print = JasperFillManager.fillReport(rutaInforme, param,datasource);
            JasperExportManager.exportReportToPdfFile(print,nombreInformeSalida);
            JasperViewer.viewReport(print);
        } catch (JRException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public static void leerInformeEmpleados(Collection listaEmpleados,String rutaInforme,String nombreInformeSalida){
        try {
            
            JasperPrint print;
            HashMap param = new HashMap();
            param.put("categoriaid", 100);
            param.put("total", listaEmpleados.size());
            JRDataSource datasource = new JRBeanArrayDataSource(listaEmpleados.toArray());
            print = JasperFillManager.fillReport(rutaInforme, param,datasource);
            JasperExportManager.exportReportToPdfFile(print,nombreInformeSalida);
            JasperViewer.viewReport(print);
        } catch (JRException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
    
}
