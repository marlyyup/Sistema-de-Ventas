/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.paneles;

import modelbd.AlmacenProducto;
import modelbd.Producto;
import modelgui.ModeloTablaApertura;
import java.util.ArrayList;

/**
 *
 * @author Ferz
 */
public class PanelListaProductosAlmacen extends javax.swing.JPanel {

    /**
     * Creates new form PanelListaProductosAlmacen
     */
    ModeloTablaApertura mta;
    public Integer total;
    public PanelListaProductosAlmacen(Producto prd) {
        initComponents();
        mta = new ModeloTablaApertura(prd);
        total = mta.getTotalProductos();
        this.tblAlmacenProductos.setModel(mta);
        this.lbAvisoInferior.setText("Producto: "+prd.getNombre());
        this.lbAviso.setText("Se Eliminaran: "+total+" de este producto");
    }
    
    public ArrayList<AlmacenProducto> getDatos()
    {
        return mta.getDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new elaprendiz.gui.panel.PanelImage();
        panelCurves1 = new elaprendiz.gui.panel.PanelCurves();
        jPanel1 = new javax.swing.JPanel();
        lbAviso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlmacenProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbAvisoInferior = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondoazulceleste.jpg"))); // NOI18N
        panelImage1.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);

        lbAviso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAviso.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lbAviso);

        panelCurves1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(391, 150));

        tblAlmacenProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAlmacenProductos.setEnabled(false);
        jScrollPane1.setViewportView(tblAlmacenProductos);

        panelCurves1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setOpaque(false);

        lbAvisoInferior.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAvisoInferior.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(lbAvisoInferior);

        panelCurves1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        panelImage1.add(panelCurves1, java.awt.BorderLayout.CENTER);

        add(panelImage1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JLabel lbAvisoInferior;
    private elaprendiz.gui.panel.PanelCurves panelCurves1;
    private elaprendiz.gui.panel.PanelImage panelImage1;
    private javax.swing.JTable tblAlmacenProductos;
    // End of variables declaration//GEN-END:variables
}