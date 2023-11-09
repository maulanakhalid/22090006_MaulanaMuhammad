/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.komputer;

/**
 *
 * @author LENOVO
 */
public interface AppInterface {
    final int ADD_DATA_KOMPUTER = 1;
    final int SEARCH_BY_BRAND = 2;
    final int SEARCH_BY_MODEL = 3;
    final int EXIT = 4;
    
    public int PilihanMenu();
    public void add();
    public String keyword(String type);
    public Komputer SearchByBrand(String brand);
    public Komputer SearchByModel (String Model);
    public void viewData(Komputer k);
    public void viewTable(Komputer k);
    public void exit();
}
