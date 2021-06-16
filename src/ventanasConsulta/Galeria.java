
package ventanasConsulta;


import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;


public class Galeria extends javax.swing.JFrame {

    private int indice=1;
    ArrayList<String> ZonasHotel;
    ArrayList<String> Descripcion;
    KeyListener Mover;
    Clip sonido;
    
    
    public Galeria() {
        initComponents();
        setLocationRelativeTo(null);// Posicionar pantalla en el centro.
        setResizable(false);
        indice = 1;
        ZonasHotel = new ArrayList<String>();
        Descripcion = new ArrayList<String>();
        Llenar();
        Cambiar(1);
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/imagenes/login/Icono.png")));// Cambiar icono de ventana.
        Mover = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    if(indice<10){
                        indice++;
                        Cambiar(indice);
                    }
                    else{
                        indice=1;
                        Cambiar(indice);
                    }
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    if(indice>1){
                        indice--;
                        Cambiar(indice);
                    }
                    else{
                        indice=10;
                        Cambiar(indice);
                    }
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {  
            }
        };
        addKeyListener(Mover);
        setFocusable(true);
        try {// **************************** Cargamos los sonidos o musica *********************************
            sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File("src/audio/Musica2.wav")));
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            JOptionPane.showMessageDialog(this, "Error no se pudo abrir el archivo");
        }
        sonido.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelFotos = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelInstrucion = new javax.swing.JLabel();
        jButtonPlay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setBackground(new java.awt.Color(223, 25, 25));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1)
        );

        jPanel1.setBackground(new java.awt.Color(46, 47, 87));

        jLabelTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Titulo");

        jLabelInstrucion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelInstrucion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInstrucion.setText("Puede usar las flechas para cambiar las fotos ← →");

        jButtonPlay.setBackground(new java.awt.Color(42, 104, 189));
        jButtonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/galeria/Botonplay.png"))); // NOI18N
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });

        jTextAreaDescripcion.setEditable(false);
        jTextAreaDescripcion.setBackground(new java.awt.Color(33, 28, 76));
        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jTextAreaDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabelInstrucion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jLabelFotos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabelInstrucion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();// cierra la venta y no el sistema completo.
        sonido.close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        if(sonido.isActive())sonido.stop();     
        else sonido.start();
        this.jButtonPlay.setFocusable(false);
        this.jTextAreaDescripcion.setFocusable(false);
    }//GEN-LAST:event_jButtonPlayActionPerformed

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
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Galeria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JLabel jLabelFotos;
    private javax.swing.JLabel jLabelInstrucion;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    // End of variables declaration//GEN-END:variables
    
    private void Llenar(){
        ZonasHotel.add("Hotel Gucci Gucci");
        ZonasHotel.add("Lobby");
        ZonasHotel.add("Piscina");
        ZonasHotel.add("Jardin con piscina");
        ZonasHotel.add("Gimnasio");
        ZonasHotel.add("Restaurante");
        ZonasHotel.add("SPA");
        ZonasHotel.add("Habitacion Simple");
        ZonasHotel.add("Habitacion Doble");
        ZonasHotel.add("Habitacion Triple");
        
        Descripcion.add("Hotel Gucci Gucci\n\n"
                + "le recibirá entre olivos, cedros y magnolias,\n"
                + "en jardines con plantas exóticas y\n"
                + "una maravillosa piscina descubierta con \n"
                + "tumbonas y parasoles, donde podrá\n"
                + "saborear un trago apreciando las glicinas,\n"
                + "la paz y la tranquilidad del clima\n"
                + "templado de la Costa Azul.");
        Descripcion.add("Lobby\n\n"
                + "La recepción del hotel atiende las 24 horas\n"
                + "y realiza reservas de visitas guiadas\n\n"
                + "Entre los hoteles de 3 estrellas de Miami,\n"
                + "el Hotel lo espera con sus amplios\n"
                + "salones y espaciosas terrazas a unos\n"
                + "300 metros de la Promenade des Anglais,\n"
                + "entre Cannes y Mónaco, en una de\n"
                + "las localidades más exclusivas de\n"
                + "la Costa Azul.");
        Descripcion.add("Piscina\n\n"
                + "Junto a la piscina se encuentra\n"
                + " el solárium, donde podrá relajarse\n"
                + " y broncearse un poco antes de ir\n"
                + " a las playas de Miami.\n"
                + " La sala de fitness cardiovascular\n"
                + " (con servicio gratuito de toallas y aguas)\n"
                + " complementa perfectamente los\n"
                + " alrededores del hotel, ideales para\n"
                + " hacer un poco de footing en\n"
                + " los Jardines de Miami.");
        Descripcion.add("Jardin con piscina\n\n"
                + "Nuestro hotel cuenta con una magnífica\n"
                + " piscina al aire libre en el jardin\n"
                + " y una zona de solárium con vistas\n"
                + " al centro de la ciudad que harán aún\n"
                + " más agradable su estancia con nosotros.");
        Descripcion.add("Gimnasio\n\n"
                + "Está equipado con distintas máquinas\n"
                + "de diferentes modalidades cardiovasculares\n"
                + "y pesas, además ofrece bebidas frescas\n"
                + "que le ayudarán a recuperar las fuerzas\n"
                + "después de realizar ejercicio.\n"
                + "El Fitness Center dispone también\n"
                + "de ducha y vestuario, para\n"
                + "su máxima comodidad.");
        Descripcion.add("Restaurante\n\n"
                + "Abierto también al público, el restaurante\n"
                + "“L’Amour dans le Four” propone una cocina\n"
                + "genuina según la mejor tradición culinaria\n"
                + "local e internacional, con menús de gran\n"
                + "calidad que varían cada semana.\n\n"
                + "Los amplios espacios de esta bonita\n"
                + "morada mediterránea ofrecen también\n"
                + "un rico desayuno en una espléndida\n"
                + "terraza al aire libre, donde es posible\n"
                + "disfrutar de muchos días de sol con\n"
                + "temperaturas agradables,\n"
                + "hasta en el invierno.");
        Descripcion.add("SPA\n\n"
                + "nuestros huéspedes se podrán relajar\n"
                + "después de un intenso día de turismo\n"
                + "o de negocios en Miami. Es un servicio\n"
                + "grandioso para todos nuestros clientes.\n"
                + "Media hora antes de utilizar este\n"
                + "servicio no olvide llamar a Recepción\n"
                + "para que hagan la puesta a punto.\n"
                + "Además la Sauna dispone de duchas y\n"
                + "vestuarios para su máxima comodidad.");
        Descripcion.add("Habitacion Simple\n\n"
                + "Habitaciones de uso individual con\n"
                + "una superficie de 16 m2, equipadas\n"
                + "con una cama de 1.35 m diseñada con\n"
                + "productos naturales y acabada con 2\n"
                + "sobre-colchones para aumentar la\n"
                + "elasticidad y proporcionar\n"
                + "un mejor descanso.");
        Descripcion.add("Habitacion Doble\n\n"
                + "Las 30 habitaciones del Hotel Gucci Gucci\n"
                + "están decoradas con gusto y ofrecen todas\n"
                + "las comodidades de una moderna\n"
                + "estructura de 3 estrellas. Luminosas,\n"
                + "rodeadas del verde de las colinas,\n"
                + "dotadas de aire acondicionado, Internet,\n"
                + "teléfono y satélite TV. Algunas son con\n"
                + "terraza y algunas, en los pisos más altos,\n"
                + "con vista al mar.");
        Descripcion.add("Habitacion Triple\n\n"
                + "Habitaciones dotadas de más espacio\n"
                + "y un amplio baño con bañera y ducha.\n"
                + "Muchas tienen terraza y están disponibles\n"
                + "como habitaciones triples.\n"
                + "Algunas cuentan con vistas al mar.");
    }
    
    private void Cambiar(int i){
        this.jLabelFotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/galeria/Galeria"+i+".png")));
        this.jLabelTitulo.setText(ZonasHotel.get(i-1));
        this.jTextAreaDescripcion.setText(Descripcion.get(i-1));
    }
}