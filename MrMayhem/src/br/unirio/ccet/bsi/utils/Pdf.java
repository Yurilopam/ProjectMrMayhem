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

    /**
     * Construtor da classe que recebe a tabela e o nome do arquivo que vai ser gerado
     * @param table Parametro correspondente a tabela que sera criada no pdf
     * @param arquivo Parametro correspondente ao nome do arquivo que vai ser gerado
     */
    public Pdf(JTable table, String arquivo) {
        this.table = table;
        this.arquivo = arquivo;
        imprimir();
    }
     /**
      * Metodo utilizado para imprimir uma tabela em um pdf
      */
    private void imprimir() {
        //Inicia um novo documento
        Document document = new Document(PageSize.A4.rotate());
        try {
            //Cria uma instancia de PDF
            PdfWriter.getInstance(document, new FileOutputStream(Utils.recuperarPath("Relatorios")+"\\"+arquivo));
            //Abre o documento criado
            document.open();
            //Pega o total de colunas da tabela e coloca no PDF
            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
            //Loop para adicionar as colunas
            for (int i = 0; i < table.getColumnCount(); i++) {
                pdfTable.addCell(table.getColumnName(i));
            }
            //Loop para adicinar as linhas
            for (int rows = 0; rows < table.getRowCount(); rows++) {
                for (int cols = 0; cols < table.getColumnCount(); cols++) {
                    pdfTable.addCell(table.getModel().getValueAt(rows, cols).toString());
                }
            }
            //Adiciona a tabela em pdf no documento
            document.add(pdfTable);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        //Fecha o documento
        document.close();
    }
}
