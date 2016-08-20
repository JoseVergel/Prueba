
package huellero;

import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPErrorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPErrorEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class crear_usuarios extends javax.swing.JFrame {

    
    private DPFPCapture Lector = DPFPGlobal.getCaptureFactory().createCapture();
    private DPFPEnrollment Reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();
    private DPFPVerification Verificador = DPFPGlobal.getVerificationFactory().createVerification();//
    private DPFPTemplate template;
    public DPFPFeatureSet featuresinscripcion;
    public DPFPFeatureSet featuresverificacion;    
    public static String TEMPLATE_PROPERTY = "template"; 
    boolean complete=false;
    String nombres,apellidos,codigo,tipoD,numeroD,email,tipoU;
    String facultad,programa,semestre,grupo,linea;
    String cargo,institucion,pais,departamento,ciudad;
    String cargoA,dependencia;
    
    public crear_usuarios() {
         setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        Iniciar(); //Agregamos los listener del huellero
        start();//Iniciamos la captura del huellero
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        panel_padre = new javax.swing.JPanel();
        estu_docen = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Facultad = new javax.swing.JComboBox();
        Programa = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        Grupo = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        Linea = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Semestre = new javax.swing.JComboBox();
        administrativo = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Dependencia = new javax.swing.JComboBox();
        CargoA = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        part_confe = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Pais = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        Departamento = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        Ciudad = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        Cargo = new javax.swing.JTextField();
        Institucion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TipoU = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Nombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NumeroD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Apellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TipoD = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        Aceptar = new org.edisoncor.gui.button.ButtonAction();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();
        jPanel2 = new javax.swing.JPanel();
        Huella = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mensaje = new javax.swing.JTextArea();
        completa = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(java.awt.Color.red);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);

        label1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label1.setText("Inscripciones");

        label2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        label2.setText("Formulario de Inscripción de Usuarios");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(505, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 70));

        panel_padre.setBackground(java.awt.Color.white);
        panel_padre.setLayout(new java.awt.CardLayout());

        estu_docen.setBackground(java.awt.Color.white);

        jLabel10.setText("Facultad:");

        Facultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ingenierias" }));
        Facultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacultadActionPerformed(evt);
            }
        });

        Programa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ingenieria de Sistemas", "Ingenieria Ambiental" }));

        jLabel11.setText("Programa:");

        Grupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("Grupo:");

        Linea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("Linea:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("Semillero:");

        jLabel8.setText("Semestre:");

        Semestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout estu_docenLayout = new javax.swing.GroupLayout(estu_docen);
        estu_docen.setLayout(estu_docenLayout);
        estu_docenLayout.setHorizontalGroup(
            estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estu_docenLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(estu_docenLayout.createSequentialGroup()
                        .addGroup(estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(82, 82, 82)
                        .addGroup(estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Linea, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(estu_docenLayout.createSequentialGroup()
                        .addGroup(estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addGap(78, 78, 78)
                        .addGroup(estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Facultad, 0, 320, Short.MAX_VALUE)
                            .addComponent(Programa, 0, 320, Short.MAX_VALUE)
                            .addComponent(Semestre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        estu_docenLayout.setVerticalGroup(
            estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estu_docenLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Facultad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Programa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(Linea, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(estu_docenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        panel_padre.add(estu_docen, "card4");

        administrativo.setBackground(java.awt.Color.white);

        jLabel15.setText("Dependencia:");

        Dependencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CargoA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setText("Cargo:");

        javax.swing.GroupLayout administrativoLayout = new javax.swing.GroupLayout(administrativo);
        administrativo.setLayout(administrativoLayout);
        administrativoLayout.setHorizontalGroup(
            administrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administrativoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(administrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(administrativoLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CargoA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(administrativoLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Dependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        administrativoLayout.setVerticalGroup(
            administrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administrativoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(administrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Dependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(administrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(CargoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        panel_padre.add(administrativo, "card4");

        part_confe.setBackground(java.awt.Color.white);

        jLabel20.setText("Cargo:");

        jLabel21.setText("Institución:");

        Pais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setText("Pais:");

        Departamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel23.setText("Departamento:");

        Ciudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel24.setText("Ciudad:");

        javax.swing.GroupLayout part_confeLayout = new javax.swing.GroupLayout(part_confe);
        part_confe.setLayout(part_confeLayout);
        part_confeLayout.setHorizontalGroup(
            part_confeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(part_confeLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(part_confeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(part_confeLayout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Ciudad, 0, 399, Short.MAX_VALUE))
                    .addGroup(part_confeLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Departamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(part_confeLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(part_confeLayout.createSequentialGroup()
                        .addGroup(part_confeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(part_confeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cargo)
                            .addComponent(Institucion))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        part_confeLayout.setVerticalGroup(
            part_confeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(part_confeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(part_confeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(part_confeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Institucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(part_confeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(part_confeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(part_confeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panel_padre.add(part_confe, "card4");

        getContentPane().add(panel_padre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 500, 210));

        jPanel3.setBackground(java.awt.Color.white);

        jLabel9.setText("Tipo de Usuario:");

        TipoU.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estudiante", "Docente", "Administrativo", "Particular", "Conferencista" }));
        TipoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoUActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombres:");

        jLabel2.setText("Código:");

        jLabel3.setText("Numero Documento:");

        jLabel4.setText("Email:");

        jLabel5.setText("Apellidos:");

        jLabel6.setText("Tipo de Documento:");

        TipoD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "TI", "CE" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NumeroD)
                    .addComponent(Email)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoU, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoD, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(259, 259, 259))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TipoD, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NumeroD, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoU, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 500, 300));

        jPanel1.setBackground(java.awt.Color.white);

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        buttonAction2.setText("Cancelar");
        buttonAction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 780, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Huella.setText("  ");
        Huella.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        Mensaje.setColumns(20);
        Mensaje.setRows(5);
        jScrollPane1.setViewportView(Mensaje);

        completa.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Huella, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(completa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Huella, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(completa, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 280, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoUActionPerformed
       
        String opcion=this.TipoU.getSelectedItem().toString();
        if(opcion.equals("Estudiante") || opcion.equals("Docente")){
            panel_padre.removeAll();
            panel_padre.add(estu_docen);
            panel_padre.repaint();
            panel_padre.revalidate();
        }else{
            if(opcion.equals("Particular") || opcion.equals("Conferencista")){
                panel_padre.removeAll();
                panel_padre.add(part_confe);
                panel_padre.repaint();
                panel_padre.revalidate();
            }else{
                if(opcion.equals("Administrativo")){
                    panel_padre.removeAll();
                    panel_padre.add(administrativo);
                    panel_padre.repaint();
                    panel_padre.revalidate();
                }
            }
        }
    }//GEN-LAST:event_TipoUActionPerformed

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction2ActionPerformed
       dispose();
    }//GEN-LAST:event_buttonAction2ActionPerformed

    private void FacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FacultadActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
       
        
        if(complete){//Si la huella ha sido completada
            
            nombres=Nombres.getText();
            apellidos=Apellidos.getText();
            codigo=Codigo.getText();
            tipoD=TipoD.getSelectedItem().toString();   
            numeroD=NumeroD.getText();
            email=Email.getText();
            tipoU=TipoU.getSelectedItem().toString();     
            
            
            switch(tipoU){

                case "Estudiante":
                case "Docente":
                    
                    facultad=Facultad.getSelectedItem().toString();
                    programa=Programa.getSelectedItem().toString();
                    semestre=Semestre.getSelectedItem().toString();
                    grupo=Grupo.getSelectedItem().toString();
                    linea=Linea.getSelectedItem().toString();
                    break;

                case "Particular":
                case "Conferencista":
                    
                    cargo=Cargo.getText();
                    institucion=Institucion.getText();
                    pais=Pais.getSelectedItem().toString();
                    departamento=Departamento.getSelectedItem().toString();
                    ciudad=Ciudad.getSelectedItem().toString();                    
                    break;
                case "Administrativo":               
                    
                    cargoA=CargoA.getSelectedItem().toString();
                    dependencia=Dependencia.getSelectedItem().toString();                    
                    break;
            }
            
            //despues de Validacion
            
            Registrar();
            
        }else{
            JOptionPane.showMessageDialog(null,"Debe registrar la huella");
        }
        
        
        
        
    }//GEN-LAST:event_AceptarActionPerformed

    
     protected void Iniciar(){
         
       
       
        Lector.addDataListener(new DPFPDataAdapter() {
            @Override 
            public void dataAcquired(final DPFPDataEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    EnviarTexto("La Huella Digital ha sido Capturada");
                    ProcesarCaptura(e.getSample());
                }
                });
            }
        });

        Lector.addReaderStatusListener(new DPFPReaderStatusAdapter() {
            @Override 
            public void readerConnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    EnviarTexto("El Sensor de Huella Digital esta Activado o Conectado");
                }
                });
            }

            @Override 
            public void readerDisconnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    EnviarTexto("El Sensor de Huella Digital esta Desactivado o no Conectado");
                }
                });
            }
        });

        Lector.addSensorListener(new DPFPSensorAdapter() {
            @Override 
            public void fingerTouched(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    EnviarTexto("El dedo ha sido colocado sobre el Lector de Huella");            
                }
                });
            }

            @Override 
            public void fingerGone(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    EnviarTexto("El dedo ha sido quitado del Lector de Huella");
                }
                });
            }
        });

        Lector.addErrorListener(new DPFPErrorAdapter(){
        public void errorReader(final DPFPErrorEvent e){
            SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                EnviarTexto("Error: "+e.getError());
            }
            });
        }
        });
    
    
    } 
    
     public void EnviarTexto(String msj){
        Mensaje.append(msj+"\n");
    }
     
    public void start(){
        Lector.startCapture();
        EnviarTexto("Utilizando el Lector de Huella Dactilar ");
    }
    public void stop(){
        Lector.stopCapture();
        EnviarTexto("No se está usando el Lector de Huella Dactilar ");
    }
    
    public void ProcesarCaptura(DPFPSample sample){
        // Procesar la muestra de la huella y crear un conjunto de características con el propósito de inscripción.
        featuresinscripcion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);

        // Procesar la muestra de la huella y crear un conjunto de características con el propósito de verificacion.
        featuresverificacion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);

        // Comprobar la calidad de la muestra de la huella y lo añade a su reclutador si es bueno
        if (featuresinscripcion != null){
            try{
                System.out.println("Las Caracteristicas de la Huella han sido creada");
                Reclutador.addFeatures(featuresinscripcion);// Agregar las caracteristicas de la huella a la plantilla a crear
                // Dibuja la huella dactilar capturada.
                Image image=CrearImagenHuella(sample);
                DibujarHuella(image);
                //btnIdentificar.setEnabled(true);
            }catch (DPFPImageQualityException ex) {
                System.err.println("Error: "+ex.getMessage());
            }finally {
                //EstadoHuellas();
                // Comprueba si la plantilla se ha creado.

                switch(Reclutador.getTemplateStatus()){
                    case TEMPLATE_STATUS_READY: // informe de éxito y detiene  la captura de huellas
                    EnviarTexto("La Plantilla de la Huella ha Sido Creada, ya puede Verificarla");    
                    stop();
                    setTemplate(Reclutador.getTemplate());
                    EnviarTexto("La Plantilla de la Huella ha Sido Creada, ya puede Verificarla"); 
                    completa.setText("Completada");  
                    complete=true;
                    break;

                    case TEMPLATE_STATUS_FAILED: // informe de fallas y reiniciar la captura de huellas
                    Reclutador.clear();
                    stop();
                    //EstadoHuellas();
                    setTemplate(null);
                    JOptionPane.showMessageDialog(this, "La Plantilla de la Huella no pudo ser creada, Repita el Proceso", "Inscripcion de Huellas Dactilares", JOptionPane.ERROR_MESSAGE);
                    start();
                    break;
                    case TEMPLATE_STATUS_INSUFFICIENT:
                        System.out.println("Template insuficiente");
                }
            }
        }
}
    
public void setTemplate(DPFPTemplate template) {
    DPFPTemplate old = this.template;
    this.template = template;
    firePropertyChange(TEMPLATE_PROPERTY, old, template);
}

public void DibujarHuella(Image image) {
    Huella.setIcon(new ImageIcon(
    image.getScaledInstance(Huella.getWidth(), Huella.getHeight(), Image.SCALE_DEFAULT)));
    repaint();
}
    
public DPFPFeatureSet extraerCaracteristicas(DPFPSample sample, DPFPDataPurpose purpose){
    DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
    try {
         return extractor.createFeatureSet(sample, purpose);
    }
    catch (DPFPImageQualityException e) {
        System.out.println("Exception de Calidad de Imagen");
         return null;
    }
}

public Image CrearImagenHuella(DPFPSample sample) {
    return DPFPGlobal.getSampleConversionFactory().createImage(sample);
}


public void Registrar(){
    
    ByteArrayInputStream Huella=new ByteArrayInputStream(template.serialize());
    Integer TamañoHuella=template.serialize().length;
    String sql="INSERT INTO Persona(TipoDocumento,NumeroDocumento,Nombre,Apellido,Huella,Email,TipoPersona) values(?,?,?,?,?,?,?)";

    conexion conect=new conexion();

    Connection con=conect.conectar();
    try {
       
        
        con.setAutoCommit(false);//Deshabilitamos la confirmacion automatica
        PreparedStatement p=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        p.setString(1,tipoD);
        p.setString(2,numeroD);
        p.setString(3,nombres);
        p.setString(4,apellidos);
        p.setBinaryStream(5, Huella, TamañoHuella);
        p.setString(6,email);
        p.setString(7,tipoU);
        
        int n=p.executeUpdate();
        ResultSet rs=p.getGeneratedKeys();
        
        if(n>0 && rs.next()){
            int id=rs.getInt(1);
            JOptionPane.showMessageDialog(null,"autoincrement"+id);
            
            switch(tipoU){

                case "Estudiante":
                    sql="INSERT INTO Estudiante(ID_Persona,Facultad,Programa,Semestre,Grupo,Linea) values(?,?,?,?,?,?)";
                    p=con.prepareStatement(sql);
                    p.setInt(1,id);
                    p.setString(2,facultad);
                    p.setString(3,programa);
                    p.setString(4,semestre);
                    p.setString(5,grupo);
                    p.setString(6,linea);      
                    break;
                case "Docente":
                    sql="INSERT INTO Docente(ID_Persona,Facultad,Programa,Grupo,Linea) values(?,?,?,?,?)";
                    p=con.prepareStatement(sql);
                    p.setInt(1,id);
                    p.setString(2,facultad);
                    p.setString(3,programa);
                    p.setString(4,grupo);
                    p.setString(5,linea);
                    break;

                case "Particular":
                    sql="INSERT INTO Particular(ID_Persona,Cargo,Institucion,Pais,Departamento,Ciudad) values(?,?,?,?,?,?)";
                    p=con.prepareStatement(sql);
                    p.setInt(1,id);
                    p.setString(2,cargo);
                    p.setString(3,institucion);
                    p.setString(4,pais);
                    p.setString(5,departamento);
                    p.setString(6,ciudad);
                    
                    break;
                case "Administrativo":
                    sql="INSERT INTO Administrativo(ID_Persona,Cargo,Dependencia) values(?,?,?)";
                    p=con.prepareStatement(sql);
                    p.setInt(1,id);
                    p.setString(2,cargoA);
                    p.setString(3,dependencia);
                    JOptionPane.showMessageDialog(null,"id="+id+" cardo= "+cargoA+"dependencia= "+dependencia);
                    
                    break;
            } 
            
            n=p.executeUpdate();
            if(n>0){
                con.commit();
                Nombres.setText("");
                //...
                JOptionPane.showMessageDialog(null,"Registro exitoso");
            }else{
                con.rollback();
                JOptionPane.showMessageDialog(null,"Error al insertar datos, vuelva a intentarlo");
            }
            
            
            
        }else{
            con.rollback();
            JOptionPane.showMessageDialog(null,"Error al insertar datos, vuelva a intentarlo");
        }
    }catch(SQLException ex) {
        
        if(con!=null){
            try {
                con.rollback();
            } catch (SQLException ex1) {
               JOptionPane.showMessageDialog(null,"Error "+ex1);
            }
        }
        JOptionPane.showMessageDialog(null,"Error al insertar datos "+ex+" "+sql);
    }
    
    
}
    
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
            java.util.logging.Logger.getLogger(crear_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crear_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crear_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crear_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crear_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction Aceptar;
    private javax.swing.JTextField Apellidos;
    private javax.swing.JTextField Cargo;
    private javax.swing.JComboBox CargoA;
    private javax.swing.JComboBox Ciudad;
    private javax.swing.JTextField Codigo;
    private javax.swing.JComboBox Departamento;
    private javax.swing.JComboBox Dependencia;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox Facultad;
    private javax.swing.JComboBox Grupo;
    private javax.swing.JLabel Huella;
    private javax.swing.JTextField Institucion;
    private javax.swing.JComboBox Linea;
    private javax.swing.JTextArea Mensaje;
    private javax.swing.JTextField Nombres;
    private javax.swing.JTextField NumeroD;
    private javax.swing.JComboBox Pais;
    private javax.swing.JComboBox Programa;
    private javax.swing.JComboBox Semestre;
    private javax.swing.JComboBox TipoD;
    private javax.swing.JComboBox TipoU;
    private javax.swing.JPanel administrativo;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private javax.swing.JLabel completa;
    private javax.swing.JPanel estu_docen;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JPanel panel_padre;
    private javax.swing.JPanel part_confe;
    // End of variables declaration//GEN-END:variables
}
