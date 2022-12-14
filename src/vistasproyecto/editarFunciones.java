/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasproyecto;

import Controladores.ControlFunciones;
import DAO.DAOFunciones;
import DAO.DAOObras;
import Dominio.Funciones;
import Dominio.Obra;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import vistasproyecto.AGREGARfunciones;
import vistasproyecto.menu;

/**
 *
 * @author Lenovo
 */
public class editarFunciones extends javax.swing.JFrame {

    /**
     * Creates new form inicio2
     */
    public editarFunciones() {
        initComponents();
        llenarFunciones();
        llenarObras();
        llenarHorario();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EF_Guardar = new javax.swing.JButton();
        EF_SeleccionarFuncion = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        EF_Eliminar = new javax.swing.JButton();
        EF_Fecha = new javax.swing.JTextField();
        EF_Regresar = new javax.swing.JButton();
        EF_Obra = new javax.swing.JComboBox<>();
        EF_Horario = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FONDOIMAGEN = new javax.swing.JLabel();
        FONDOIMAGEN1 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("ADMINISTRADOR:  ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 230, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Editar Funci??n");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        EF_Guardar.setBackground(new java.awt.Color(220, 225, 221));
        EF_Guardar.setText("Guardar");
        EF_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EF_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(EF_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 130, 40));

        EF_SeleccionarFuncion.setBackground(new java.awt.Color(220, 225, 221));
        EF_SeleccionarFuncion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EF_SeleccionarFuncionItemStateChanged(evt);
            }
        });
        EF_SeleccionarFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EF_SeleccionarFuncionActionPerformed(evt);
            }
        });
        jPanel1.add(EF_SeleccionarFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 200, -1));

        jButton1.setText("Agregar Funci??n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 130, -1, -1));

        EF_Eliminar.setText("Eliminar");
        EF_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EF_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(EF_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 100, -1));

        EF_Fecha.setBackground(new java.awt.Color(220, 225, 221));
        EF_Fecha.setForeground(new java.awt.Color(51, 51, 51));
        EF_Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EF_FechaActionPerformed(evt);
            }
        });
        jPanel1.add(EF_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 150, 30));

        EF_Regresar.setBackground(new java.awt.Color(220, 225, 221));
        EF_Regresar.setText("Regresar");
        EF_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EF_RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(EF_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 120, 40));

        jPanel1.add(EF_Obra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 160, -1));

        EF_Horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EF_HorarioActionPerformed(evt);
            }
        });
        jPanel1.add(EF_Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 150, -1));

        jLabel6.setText("Horario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, 20));

        jLabel3.setText("Fecha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, 30));

        jLabel4.setText("Obra:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, 20));

        FONDOIMAGEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo interfaz.jpg"))); // NOI18N
        jPanel1.add(FONDOIMAGEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        FONDOIMAGEN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo interfaz.jpg"))); // NOI18N
        jPanel1.add(FONDOIMAGEN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        jTextField8.setBackground(new java.awt.Color(220, 225, 221));
        jTextField8.setForeground(new java.awt.Color(51, 51, 51));
        jTextField8.setText("NOMBRE****");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EF_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EF_GuardarActionPerformed
     SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Funciones funcion = new Funciones();
        funcion.setObra((String) EF_Obra.getSelectedItem());
            int id = Integer.parseInt(EF_SeleccionarFuncion.getSelectedItem().toString());
            funcion.setId(id);
            try {
                funcion.setFecha(formato.parse(EF_Fecha.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(ControlFunciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            funcion.setHora((String) EF_Horario.getSelectedItem());
            DAOFunciones dao = new DAOFunciones();
            try{
                dao.modificarFuncion(funcion);
            }catch(Exception e){
                e.printStackTrace();
            }
            EF_Fecha.setText(null);
    }//GEN-LAST:event_EF_GuardarActionPerformed
private void llenarFunciones(){
        DAOFunciones dao = new DAOFunciones();

       for (int i = 0; i< dao.getfunciones().size(); i++){
           EF_SeleccionarFuncion.addItem(String.valueOf(dao.getfunciones().get(i).getId()));
    }
    }
    private void EF_SeleccionarFuncionItemStateChanged(java.awt.event.ItemEvent evt) {
        DAOFunciones dao = new DAOFunciones();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        for(int i = 0; i< dao.getfunciones().size(); i++){
           if(EF_SeleccionarFuncion.getSelectedItem().toString().equals(String.valueOf(dao.getfunciones().get(i).getId()))){
               EF_Obra.setSelectedItem(dao.getfunciones().get(i).getObra());
           //    EF_Horario.setSelectedItem(String.valueOf(dao.getfunciones().get(i).getHora()));
           EF_Horario.setSelectedItem(dao.getfunciones().get(i).getHora());
               EF_Fecha.setText(formato.format(dao.getfunciones().get(i).getFecha()));
       }
    }
    }
    
     private void llenarObras(){
        DAOObras dao = new DAOObras();
       
       
       for (int i = 0; i< dao.getobras().size(); i++){
           EF_Obra.addItem(dao.getobras().get(i).getNombre());
    }
    }
     
    private void llenarHorario(){
        DAOFunciones dao = new DAOFunciones();
       
       
       
           EF_Horario.addItem("6:30");
           EF_Horario.addItem("9:30");
           
    
    }
     
    private void EF_FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EF_FechaActionPerformed
     
    }//GEN-LAST:event_EF_FechaActionPerformed

    private void EF_SeleccionarFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EF_SeleccionarFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EF_SeleccionarFuncionActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AGREGARfunciones m = new AGREGARfunciones();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EF_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EF_EliminarActionPerformed
      Funciones funcion = new Funciones();
        int id = Integer.parseInt(EF_SeleccionarFuncion.getSelectedItem().toString());
            funcion.setId(id);
            DAOFunciones dao = new DAOFunciones();
            try {
                dao.EliminarFuncion(funcion);
                
            }catch(Exception e){
           e.printStackTrace();
             
       }
    }//GEN-LAST:event_EF_EliminarActionPerformed
/*
    
    private void EF_SeleccionarFuncionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EF_SeleccionarFuncionItemStateChanged
        
    
    }//GEN-LAST:event_EF_SeleccionarFuncionItemStateChanged
*/
    private void EF_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EF_RegresarActionPerformed
        menu m = new menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EF_RegresarActionPerformed

    private void EF_HorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EF_HorarioActionPerformed
        
    }//GEN-LAST:event_EF_HorarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editarFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarFunciones().setVisible(true);
            }
        });
    }

    public JComboBox<String> getCOMBOSELECCIONAR() {
        return EF_SeleccionarFuncion;
    }

    public void setCOMBOSELECCIONAR(JComboBox<String> COMBOSELECCIONAR) {
        this.EF_SeleccionarFuncion = COMBOSELECCIONAR;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EF_Eliminar;
    private javax.swing.JTextField EF_Fecha;
    private javax.swing.JButton EF_Guardar;
    private javax.swing.JComboBox<String> EF_Horario;
    private javax.swing.JComboBox<String> EF_Obra;
    private javax.swing.JButton EF_Regresar;
    private javax.swing.JComboBox<String> EF_SeleccionarFuncion;
    private javax.swing.JLabel FONDOIMAGEN;
    private javax.swing.JLabel FONDOIMAGEN1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

   public JComboBox<String> getEF_Horario(){
       return EF_Horario;
   }
   public JComboBox<String> getEF_Obra(){
       return EF_Obra;
   }
   public JComboBox<String> getEF_SeleccionarFuncion(){
       return EF_SeleccionarFuncion;
   }
   
    public JButton getjButton2(){
        return EF_Eliminar;
    }
    public JButton getjButton3(){
        return EF_Guardar;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public JButton getjButton11() {
        return EF_Regresar;
    }
    

    public JTextField getjTextField7() {
        return EF_Fecha;
    }

    public void setjTextField7(JTextField jTextField7) {
        this.EF_Fecha = jTextField7;
    }
    
}
