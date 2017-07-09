/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.utils;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JTable;

/**
 *
 * @author Yuri Lopam
 */
public class Pdf {
    
    private final JTable table;
    private final String arquivo;

    public Pdf(JTable table, String arquivo) {
        this.table = table;
        this.arquivo = arquivo;
        imprimir();
    }
    
    private void imprimir() {
        Document document = new Document(PageSize.A4.rotate());
        try {
            PdfWriter.getInstance(document, new FileOutputStream(Utils.recuperarPath("Relatorios")+"\\"+arquivo));
            document.open();
            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
            for (int i = 0; i < table.getColumnCount(); i++) {
                pdfTable.addCell(table.getColumnName(i));
            }
            for (int rows = 0; rows < table.getRowCount(); rows++) {
                for (int cols = 0; cols < table.getColumnCount(); cols++) {
                    pdfTable.addCell(table.getModel().getValueAt(rows, cols).toString());
                }
            }
            document.add(pdfTable);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        document.close();
    }
}
