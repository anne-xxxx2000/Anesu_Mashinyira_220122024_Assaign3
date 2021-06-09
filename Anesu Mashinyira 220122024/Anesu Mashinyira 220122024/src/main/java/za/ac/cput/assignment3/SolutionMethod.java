/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3;

/**
 *
 * @author @author Anesu Mashinyira 220122024
 */
public class SolutionMethod {
    public static void main(String[] args) {
        ReaderMethod ReaderMethod = new ReaderMethod();
        ReaderMethod.readFromSerFile();
        ReaderMethod.sortCustomersList();
        ReaderMethod.formatDob();
        ReaderMethod.printCustomers();
        ReaderMethod.sortSuppliersList();
        ReaderMethod.printSuppliers();
    }
}
