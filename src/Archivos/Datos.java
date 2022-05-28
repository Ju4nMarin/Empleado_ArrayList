package Archivos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN MARIN
 */
public class Datos {
String IdEmpleado,Nombres,Cargo;
float Salario,ValorHE,TotalHe,ValorSalud,ValorPension,NetoSalario;
int NumHE;

    public Datos(String IdEmpleado, String Nombres, String Cargo, float Salario,int NumHE) {
        this.IdEmpleado = IdEmpleado;
        this.Nombres = Nombres;
        this.Cargo = Cargo;
        this.Salario = Salario;
        this.NumHE = NumHE;
    }

    public Datos(float ValorHE, float TotalHe, float ValorSalud, float ValorPension, float NetoSalario) {
        this.ValorHE = ValorHE;
        this.TotalHe = TotalHe;
        this.ValorSalud = ValorSalud;
        this.ValorPension = ValorPension;
        this.NetoSalario = NetoSalario;
    }

    public void setValorHE(float ValorHE) {
        this.ValorHE = ValorHE;
    }

    public void setTotalHe(float TotalHe) {
        this.TotalHe = TotalHe;
    }

    public void setValorSalud(float ValorSalud) {
        this.ValorSalud = ValorSalud;
    }

    public void setValorPension(float ValorPension) {
        this.ValorPension = ValorPension;
    }

    public void setNetoSalario(float NetoSalario) {
        this.NetoSalario = NetoSalario;
    }

    public float getValorHE() {
      float VH=0;
      VH= getSalario()/120;
        return VH;
    }

    public float getTotalHe() {
        float TH=0;
        TH= getValorHE()*getNumHE();
        return TH;
    }
    
    public float getValorSalud() {
        float Salud=0;
        Salud = getSalario()*0.07f;
        return Salud;
    }

    public float getValorPension() {
        float Pension=0;
        Pension = getSalario()*0.03f;
        return Pension;
    }

    public float getNetoSalario() {
        float NetoS = 0;
        NetoS= getSalario() + getTotalHe()- getValorSalud() - getValorPension();
        return NetoS;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getCargo() {
        return Cargo;
    }

    public float getSalario() {
        return Salario;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public Datos(int NumHE) {
        this.NumHE = NumHE;
    }

    public int getNumHE() {
        return NumHE;
    }

    public void setNumHE(int NumHE) {
        this.NumHE = NumHE;
    }

  

}
