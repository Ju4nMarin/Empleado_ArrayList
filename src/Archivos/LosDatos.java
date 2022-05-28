/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author JUAN MARIN
 */
public class LosDatos {
    public ArrayList ListaDatos;
    
    public LosDatos(){
        ListaDatos = new ArrayList();
    }
    

    public int getBuscarID(String ID){
        int i;
        Datos aux=null;
        for(i=0; i<ListaDatos.size(); i++){
            aux = (Datos) ListaDatos.get(i);             
            if(ID.equals(aux.getIdEmpleado())==true)
                return i;
        }
        return -1;
    }
    
    public void setAddEmpleados(String ID, 
    String Nom,String Cargo, float Salario, int NumHE){
        int pos=getBuscarID(ID);
        if(pos!=-1)
            JOptionPane.showMessageDialog(null, 
            "Error: Ya Hay un empleado con ese ID");
        else{
            Datos info=new Datos(ID, Nom, Cargo,Salario,NumHE);
            ListaDatos.add(info);
            JOptionPane.showMessageDialog(null, 
            "Empleado regristrado con extio");
        }
    }
    
    public void setDelProducto(String cod){
        int pos=getBuscarID(cod);
        if(pos==-1)
            JOptionPane.showMessageDialog(null, 
            "Error: El ID NO SE ENCUENTRA REGISTRADO");
        else{
            ListaDatos.remove(pos);
            JOptionPane.showMessageDialog(null, 
            "Dato eliminado");
        }
        
    }

    public void setmostrarDatos(JTable jTable1) {
        int i;        
        Datos temp=null;               
        setagregarFilas(jTable1, 0);
        for(i=0; i<ListaDatos.size(); i++){
            temp=(Datos) ListaDatos.get(i);
            setagregarFilas(jTable1, jTable1.getRowCount()+1);
            jTable1.setValueAt(temp.getIdEmpleado(), i, 0);
            jTable1.setValueAt(temp.getNombres(), i, 1);
            jTable1.setValueAt(temp.getCargo(), i, 2);
            jTable1.setValueAt(temp.getSalario(), i, 3);
            jTable1.setValueAt(temp.getValorHE(), i, 4);
            jTable1.setValueAt(temp.getNumHE(), i, 5);
            jTable1.setValueAt(temp.getTotalHe(), i, 6);
            jTable1.setValueAt(temp.getValorPension(), i, 7);
            jTable1.setValueAt(temp.getValorSalud(), i, 8);
            jTable1.setValueAt(temp.getNetoSalario(), i, 9);
            
            
            
            
        }
    }
    
    public void setagregarFilas(JTable jTable1, int filas){
        DefaultTableModel modelData = (DefaultTableModel) jTable1.getModel();
        modelData.setRowCount(filas);
    }    
    
}
