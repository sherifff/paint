/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.awt.BasicStroke;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import sun.security.jca.GetInstance;

/**
 *
 * @author Omar Elfarouk
 */
public class GUI extends javax.swing.JFrame {

    private static int Timer;
    private int thik;
    private int types;
    private Color painterColor;
    private int x, y, final1, final2;
    private ArrayList<Shapes> shapes;
    private Shapes generalShape;
    private static int bound1 = 0;
    private static int bound2 = 0;
    Stack<Shapes> redo;
    static Timer timer;
    Map<String, File> plugin;
    Constructor<?> pluginClass;

    public GUI() {
        initComponents();
        this.setExtendedState(GUI.MAXIMIZED_BOTH);
        this.setSize(750, 750);
        shapes = new ArrayList<>();
        redo = new Stack<>();
        painterColor = new Color(0);
        jFrame3.setSize(501, 409);
        jFrame3.setLocationRelativeTo(null);
        jFrame3.setUndecorated(true);
        jFrame3.setVisible(true);
        thik = 2;
        thikDisplay.setText("2");
        timer = new Timer("MyTimer");
        plugin = new HashMap<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jColorChooser = new javax.swing.JColorChooser();
        jTextField1 = new javax.swing.JTextField();
        jFrame3 = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel()
        {
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                int minX,minY,maxX,maxY;
                Graphics2D g2d = (Graphics2D)g;
                BasicStroke s ;
                for (int i=0; i<shapes.size();i++)
                {
                    if ( shapes.get(i).isSelected() ){

                        float dash1[] = {10.0f};
                        BasicStroke dashed =
                        new BasicStroke(1.0f,
                            BasicStroke.CAP_SQUARE,
                            BasicStroke.JOIN_MITER,
                            2.0f, dash1, 0.0f);
                        g2d.setStroke(dashed);
                        try{
                            g2d.drawRect((int) shapes.get(i).getShape().getBounds2D().getMinX()-shapes.get(i).getThik()/2-4, (int) shapes.get(i).getShape().getBounds2D().getMinY()-shapes.get(i).getThik()/2-4, (int) (shapes.get(i).getShape().getBounds2D().getMaxX()- shapes.get(i).getShape().getBounds2D().getMinX())+shapes.get(i).getThik()+8,  (int) (shapes.get(i).getShape().getBounds2D().getMaxY()- shapes.get(i).getShape().getBounds2D().getMinY())+shapes.get(i).getThik()+8);
                        }catch(Exception e){}
                        try{
                            FileInputStream h = new FileInputStream("Select_dot.png");
                            BufferedImage img = ImageIO.read(h);
                            g2d.drawImage(img, (int) shapes.get(i).getShape().getBounds2D().getMinX()-10,(int)shapes.get(i).getShape().getBounds2D().getMinY()-10, this);
                            g2d.drawImage(img,(int) shapes.get(i).getShape().getBounds2D().getMaxX() ,(int) shapes.get(i).getShape().getBounds2D().getMinY()-10 , this);
                            g2d.drawImage(img,(int) shapes.get(i).getShape().getBounds2D().getMinX()-10 ,(int) shapes.get(i).getShape().getBounds2D().getMaxY() , this);
                            g2d.drawImage(img,(int) shapes.get(i).getShape().getBounds2D().getMaxX() ,(int) shapes.get(i).getShape().getBounds2D().getMaxY() , this);
                        }catch( Exception e ) {}
                    }
                    try{
                        s = new BasicStroke(shapes.get(i).getThik());
                        g2d.setStroke(s);
                        g2d.setColor(shapes.get(i).getColor());
                        if ( shapes.get(i).isFill() && !(shapes.get(i).getShape() instanceof Line))
                        g2d.fill(shapes.get(i).getShape());
                        else
                        g2d.draw(shapes.get(i).getShape());
                    }catch(NullPointerException e){}

                }

                s = new BasicStroke(thik);
                g2d.setStroke(s);
                g2d.setColor(painterColor);

                if (generalShape != null ){
                    if (fill.isSelected() && !shape5.isSelected())
                    g2d.fill(generalShape.getShape());
                    else
                    g2d.draw(generalShape.getShape());
                }
            }
        }
        ;
        ref = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Tabe = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        shape1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        colorChange = new javax.swing.JButton();
        fill = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        thikDisplay = new javax.swing.JTextField();
        shape6 = new javax.swing.JToggleButton();
        shape7 = new javax.swing.JToggleButton();
        shape4 = new javax.swing.JToggleButton();
        shape5 = new javax.swing.JToggleButton();
        shape2 = new javax.swing.JToggleButton();
        shape3 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        colorEdit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Move = new javax.swing.JToggleButton();
        Resize = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        list = new java.awt.List();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jFrame1.addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                jFrame1WindowStateChanged(evt);
            }
        });

        jColorChooser.setBackground(new java.awt.Color(204, 255, 255));
        jColorChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jColorChooserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTextField1.setText("jTextField1");

        jFrame3.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame3.setResizable(false);
        jFrame3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jFrame3WindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jFrame3WindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame3WindowActivated(evt);
            }
        });
        jFrame3.getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Skip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton1);
        jButton1.setBounds(450, 10, 90, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/name1.png")));
        jFrame3.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 70, 0, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/name2.png")));
        jFrame3.getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 0);

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StartUp.jpg")));
        jFrame3.getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 550);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 153, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                Panel1MouseWheelMoved(evt);
            }
        });
        Panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel1MouseReleased(evt);
            }
        });
        Panel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel1MouseMoved(evt);
            }
        });

        ref.setEditable(false);

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1981, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 523, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint.png"))); // NOI18N

        Tabe.setBackground(new java.awt.Color(153, 255, 255));
        Tabe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tabe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabeMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        shape1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triangle-icon.png"))); // NOI18N
        shape1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Shape Properties", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 204, 255)));
        jPanel2.setForeground(new java.awt.Color(51, 204, 255));

        colorChange.setBackground(new java.awt.Color(0, 0, 0));
        colorChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorChangeActionPerformed(evt);
            }
        });

        fill.setBackground(new java.awt.Color(204, 255, 255));
        fill.setFont(new java.awt.Font("Bodoni MT Black", 2, 10)); // NOI18N
        fill.setForeground(new java.awt.Color(0, 204, 204));
        fill.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unfill-icon.png"))); // NOI18N
        fill.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/unfill-icon.png"))); // NOI18N
        fill.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/fill-icon.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thickness", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 204, 204)));

        thikDisplay.setBackground(new java.awt.Color(204, 255, 255));
        thikDisplay.setEnabled(false);
        thikDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thikDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(thikDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(thikDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fill)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(colorChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        shape6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ellipse-64.png"))); // NOI18N
        shape6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape6ActionPerformed(evt);
            }
        });

        shape7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brush-icon.png"))); // NOI18N
        shape7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape7ActionPerformed(evt);
            }
        });

        shape4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square-icon.png"))); // NOI18N
        shape4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape4ActionPerformed(evt);
            }
        });

        shape5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagetools-Line-icon.png"))); // NOI18N
        shape5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape5ActionPerformed(evt);
            }
        });

        shape2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rectangle-icon.png"))); // NOI18N
        shape2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape2ActionPerformed(evt);
            }
        });

        shape3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circle-icon.png"))); // NOI18N
        shape3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shape1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shape2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shape3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shape4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shape5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shape6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shape7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shape1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shape2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shape3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shape4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shape5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shape6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shape7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Tabe.addTab("Draw", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        colorEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/color-fill-icon.png"))); // NOI18N
        colorEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorEditActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-edit-delete-icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/move-icon.png"))); // NOI18N
        Move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveActionPerformed(evt);
            }
        });

        Resize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image-Edition-Tools-Resize-icon.png"))); // NOI18N
        Resize.setPreferredSize(new java.awt.Dimension(105, 81));
        Resize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(colorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Resize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Move, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Resize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabe.addTab("Edit", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 255, 255), null, null));
        jButton2.setMaximumSize(new java.awt.Dimension(79, 79));
        jButton2.setMinimumSize(new java.awt.Dimension(79, 79));
        jButton2.setPreferredSize(new java.awt.Dimension(79, 79));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        list.setBackground(new java.awt.Color(204, 255, 255));
        list.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        list.setForeground(new java.awt.Color(51, 255, 51));
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listMousePressed(evt);
            }
        });
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(492, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabe.addTab("Plugin", jPanel5);

        MenuBar.setBackground(new java.awt.Color(153, 255, 255));
        MenuBar.setForeground(new java.awt.Color(102, 255, 255));
        MenuBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MenuBarKeyTyped(evt);
            }
        });

        jMenu1.setBackground(new java.awt.Color(204, 255, 255));
        jMenu1.setForeground(new java.awt.Color(0, 153, 255));
        jMenu1.setText("File");

        New.setForeground(new java.awt.Color(0, 153, 255));
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jMenu1.add(New);

        jMenuItem1.setForeground(new java.awt.Color(0, 153, 255));
        jMenuItem1.setText("Load");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setForeground(new java.awt.Color(0, 153, 255));
        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setForeground(new java.awt.Color(0, 153, 255));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        MenuBar.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Undo-icon.png"))); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        MenuBar.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redo-icon.png"))); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        MenuBar.add(jMenu4);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Tabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1522, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tabe, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.getContentPane().setBackground(Color.decode("#E0FFFF"));
        this.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void Panel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MouseMoved
        ref.setText(String.valueOf(evt.getX() + " : " + evt.getY()));

    }//GEN-LAST:event_Panel1MouseMoved

    private void Panel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_Panel1MousePressed

    private void Panel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MouseReleased

        if (generalShape != null) {
            if (fill.isSelected()) {
                generalShape.setFill(true);
            } else {
                generalShape.setFill(false);
            }
            generalShape.setColor(painterColor);
            generalShape.setThik(thik);
            if (generalShape.getPoint1().getX() == 0 && generalShape.getPoint1().getY() == 0) {
                generalShape.setPoint1(new Point(x, y));
                generalShape.setPoint2(new Point(final1, final2));
            }
            if (generalShape.getX1() == 0 && generalShape.getY1() == 0) {
                generalShape.setX1(x);
                generalShape.setY1(y);
                generalShape.setX2(final1);
                generalShape.setY2(final2);
            }
            generalShape.setType(types);
            if (shapes.isEmpty() && generalShape.getShape() != null) {
                shapes.add(generalShape);
            }
            if (shapes.size() - 1 >= 0 && generalShape.getShape() != null && !generalShape.equals(shapes.get(shapes.size() - 1))) {
                shapes.add(generalShape);
            }
        }
        repaint();
    }//GEN-LAST:event_Panel1MouseReleased

    private void Panel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MouseDragged
        final1 = evt.getX();
        final2 = evt.getY();

        if (Tabe.getSelectedIndex() == 0 || Tabe.getSelectedIndex() == 2) {
            if (shape1.isSelected()) {
                generalShape = new Triangle(x, y, evt.getX(), evt.getY());
                types = 7;
            } else if (shape2.isSelected()) {
                generalShape = new Rectangle(x, y, evt.getX(), evt.getY());
                types = 5;
            } else if (shape3.isSelected()) {
                generalShape = new Circle(x, y, evt.getX(), evt.getY());
                types = 2;
            } else if (shape4.isSelected()) {
                generalShape = new Square(x, y, evt.getX(), evt.getY());
                types = 6;
            } else if (shape5.isSelected()) {
                generalShape = new Line(x, y, evt.getX(), evt.getY());
                types = 4;
            } else if (shape6.isSelected()) {
                generalShape = new Ellipse(x, y, evt.getX(), evt.getY());
                types = 3;
            } else if (shape7.isSelected()) {
                generalShape = new Brush(x, y, evt.getX(), evt.getY());
                types = 1;
                x = evt.getX();
                y = evt.getY();
                generalShape.setColor(painterColor);
                generalShape.setThik(thik);
                generalShape.setPoint1(new Point(x, y));
                generalShape.setPoint2(new Point(final1, final2));
                generalShape.setX1(x);
                generalShape.setY1(y);
                generalShape.setX2(final1);
                generalShape.setY2(final2);
                if (shapes.isEmpty() && generalShape.getShape() != null) {
                    shapes.add(generalShape);
                }
                if (shapes.size() - 1 >= 0 && generalShape.getShape() != null && !generalShape.equals(shapes.get(shapes.size() - 1))) {
                    shapes.add(generalShape);
                }
            } else {
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
                try {
                    if (pluginClass != null) {
                        generalShape = (Shapes) pluginClass.newInstance(x, y, evt.getX(), evt.getY());
                        System.out.println(generalShape.getType());
                    }
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (IllegalArgumentException ex) {
                } catch (InvocationTargetException ex) {
                }
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            }
            if (generalShape instanceof Brush || generalShape instanceof Line) {
                fill.setSelected(false);
            }
            repaint();
        } else if (Tabe.getSelectedIndex() == 1) {

            for (int i = 0; i < shapes.size(); i++) {
                if (shapes.get(i).isSelected()) {
                    int storeX;
                    int storeY;
                    if (Move.isSelected()) {
                        storeX = shapes.get(i).getPoint1().x + (final1 - x);
                        storeY = shapes.get(i).getPoint1().y + (final2 - y);
                    } else {
                        storeX = shapes.get(i).getPoint1().x - (final1 - x);
                        storeY = shapes.get(i).getPoint1().y - (final2 - y);
                    }
                    shapes.get(i).setPoint1(new Point(storeX, storeY));
                    shapes.get(i).setPoint2(
                            new Point(shapes.get(i).getPoint2().x + (final1 - x),
                            shapes.get(i).getPoint2().y + (final2 - y)));
                     shapes.get(i).setX1(storeX);
                     shapes.get(i).setY1(storeY);
                     shapes.get(i).setX2(shapes.get(i).getPoint2().x + (final1 - x));
                     shapes.get(i).setY2(shapes.get(i).getPoint2().y + (final2 - y));
                    repaint();
                }
            }

            x = final1;
            y = final2;
            repaint();
        }
    }//GEN-LAST:event_Panel1MouseDragged

    private void Panel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MouseEntered
    }//GEN-LAST:event_Panel1MouseEntered

    private void Panel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_Panel1MouseWheelMoved
        thik += evt.getWheelRotation();
        if (thik < 2) {
            thik = 2;
        }
        thikDisplay.setText(String.valueOf(thik));
    }//GEN-LAST:event_Panel1MouseWheelMoved

    private void Panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MouseClicked

        boolean flag = new Select().isSelected(shapes, evt.getX(), evt.getY());
        if (!flag) {
            for (Shapes shape : shapes) {
                shape.setSelected(false);
            }
        }
        generalShape = null;
        repaint();
    }//GEN-LAST:event_Panel1MouseClicked

    private void jFrame1WindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame1WindowStateChanged
    }//GEN-LAST:event_jFrame1WindowStateChanged

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
    }//GEN-LAST:event_formWindowStateChanged

    private void jColorChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jColorChooserMouseClicked
    }//GEN-LAST:event_jColorChooserMouseClicked

    private void thikDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thikDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thikDisplayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jFrame3.dispose();
        this.setVisible(true);
        timer.cancel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void jFrame3WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowOpened
        this.setVisible(false);
    }//GEN-LAST:event_jFrame3WindowOpened

    private void jFrame3WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowActivated
        jLabel2.setBounds(0, 100, 100, 100);
        jFrame3.setSize(547, 547);
        jFrame3.setLocation(jFrame3.getX(), 100);
        jFrame3.setSize(548, 550);
        this.setVisible(false);
    }//GEN-LAST:event_jFrame3WindowActivated

    private void jFrame3WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowClosed
        this.setVisible(true);
    }//GEN-LAST:event_jFrame3WindowClosed

    private void colorChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorChangeActionPerformed
        painterColor = jColorChooser.showDialog(this, "Choose Shape Color", getBackground());

        if (painterColor != null) {
            colorChange.setBackground(painterColor);
        } else {
            colorChange.setBackground(Color.BLACK);
        }
    }//GEN-LAST:event_colorChangeActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void shape1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape1ActionPerformed
        shape7.setSelected(false);
        shape2.setSelected(false);
        shape3.setSelected(false);
        shape4.setSelected(false);
        shape5.setSelected(false);
        shape6.setSelected(false);
    }//GEN-LAST:event_shape1ActionPerformed

    private void shape2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape2ActionPerformed
        shape1.setSelected(false);
        shape7.setSelected(false);
        shape3.setSelected(false);
        shape4.setSelected(false);
        shape5.setSelected(false);
        shape6.setSelected(false);
    }//GEN-LAST:event_shape2ActionPerformed

    private void shape3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape3ActionPerformed
        shape1.setSelected(false);
        shape2.setSelected(false);
        shape7.setSelected(false);
        shape4.setSelected(false);
        shape5.setSelected(false);
        shape6.setSelected(false);
    }//GEN-LAST:event_shape3ActionPerformed

    private void shape4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape4ActionPerformed
        shape1.setSelected(false);
        shape2.setSelected(false);
        shape3.setSelected(false);
        shape7.setSelected(false);
        shape5.setSelected(false);
        shape6.setSelected(false);
    }//GEN-LAST:event_shape4ActionPerformed

    private void shape5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape5ActionPerformed
        shape1.setSelected(false);
        shape2.setSelected(false);
        shape3.setSelected(false);
        shape4.setSelected(false);
        shape7.setSelected(false);
        shape6.setSelected(false);
    }//GEN-LAST:event_shape5ActionPerformed

    private void shape6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape6ActionPerformed
        shape1.setSelected(false);
        shape2.setSelected(false);
        shape3.setSelected(false);
        shape4.setSelected(false);
        shape5.setSelected(false);
        shape7.setSelected(false);
    }//GEN-LAST:event_shape6ActionPerformed

    private void shape7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape7ActionPerformed
        shape1.setSelected(false);
        shape2.setSelected(false);
        shape3.setSelected(false);
        shape4.setSelected(false);
        shape5.setSelected(false);
        shape6.setSelected(false);
    }//GEN-LAST:event_shape7ActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        shapes.clear();
        generalShape = null;
        repaint();
    }//GEN-LAST:event_NewActionPerformed

    private void MenuBarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MenuBarKeyTyped
    }//GEN-LAST:event_MenuBarKeyTyped

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        generalShape = null;
        try {
            redo.push(shapes.get(shapes.size() - 1));
            shapes.remove(shapes.size() - 1);
            repaint();
        } catch (Exception e) {
        }

        Panel1.doLayout();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        try {
            shapes.add(redo.pop());
            repaint();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).isSelected()) {
                shapes.remove(i);
                jButton3.doClick();
            }
        }
        generalShape = null;
        repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void colorEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorEditActionPerformed
        painterColor = jColorChooser.showDialog(this, "Choose Shape Color", getBackground());
        if (painterColor != null) {
            for (int i = 0; i < shapes.size(); i++) {
                if (shapes.get(i).isSelected()) {
                    Shapes store = new Shapes();
                store.setPoint1(shapes.get(i).getPoint1());
                store.setPoint2(shapes.get(i).getPoint2());
                store.setX1(shapes.get(i).getX1());
                store.setY1(shapes.get(i).getY1());
                store.setX2(shapes.get(i).getX2());
                store.setY2(shapes.get(i).getY2());
                store.setType(shapes.get(i).getType());
                store.setFill(shapes.get(i).isFill());
                store.setColor(painterColor);
                store.setShape(shapes.get(i).getShape());
                store.setColor(painterColor);
                store.setThik(shapes.get(i).getThik());
                store.setFill(shapes.get(i).isFill());
                    if (shapes.isEmpty()) {
                        shapes.add(store);
                    }
                    if (shapes.size() - 1 >= 0 && store.getShape() != null && !store.equals(shapes.get(shapes.size() - 1))) {
                        shapes.add(store);
                    }
                }
            }
        }
        generalShape = null;
        repaint();
        painterColor = colorChange.getBackground();
    }//GEN-LAST:event_colorEditActionPerformed

    private void ResizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResizeActionPerformed
        Move.setSelected(false);
    }//GEN-LAST:event_ResizeActionPerformed

    private void MoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveActionPerformed
        Resize.setSelected(false);
    }//GEN-LAST:event_MoveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fileChosser = new JFileChooser();
        fileChosser.showDialog(null, "Get file");
        try {

            File getFileName = fileChosser.getSelectedFile();
            File file = fileChosser.getSelectedFile().getParentFile();
            plugin.put(getFileName.getName().substring(0, getFileName.getName().length() - 6), file);
            list.add(getFileName.getName().substring(0, getFileName.getName().length() - 6));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        if (plugin.size() != 0) {
            if (list.getSelectedIndex() < plugin.size()) {
                try {
                    pluginClass = new LoadClass().getConstructor(plugin.get(list.getSelectedItem()), list.getSelectedItem());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_listMouseClicked

    private void TabeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabeMouseClicked
        Move.setSelected(true);
        shape1.setSelected(false);
        shape2.setSelected(false);
        shape3.setSelected(false);
        shape7.setSelected(false);
        shape4.setSelected(false);
        shape5.setSelected(false);
        shape6.setSelected(false);
    }//GEN-LAST:event_TabeMouseClicked

    private void listMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMousePressed
        try {
            pluginClass = new LoadClass().getConstructor(plugin.get(list.getSelectedItem()), list.getSelectedItem());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_listMousePressed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        try {
            pluginClass = new LoadClass().getConstructor(plugin.get(list.getSelectedItem()), list.getSelectedItem());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_listActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
              try{
        Loads a=new Loads();
         
         JFileChooser chosser = new JFileChooser();
            chosser.showDialog(null, "Get file");
            File file = chosser.getSelectedFile();
            String url=file.getAbsolutePath();
           if(url.contains("xml")){
               shapes=a.loadFilexml(shapes,url); 
           }
           else if(url.contains("json")){
                shapes=a.loadFilejson(shapes,url);
           }
       repaint();
}catch(Exception e){
    
}
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
                       try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root elements
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Shapes");
            doc.appendChild(rootElement);
            for (int i = 0; i < shapes.size(); i++) {

                Element shapee = doc.createElement("Shape");
                rootElement.appendChild(shapee);
                // set attribute to staff element
                Attr attr = doc.createAttribute("id");
                attr.setValue((i + 1) + "");
                shapee.setAttributeNode(attr);
                // shorten way
                // staff.setAttribute("id", "1");
                Element type = doc.createElement("type");
                if (shapes.get(i).getType() == 2) {
                    type.appendChild(doc.createTextNode("Circle"));
                    shapee.appendChild(type);
                } else if (shapes.get(i).getType() == 1) {

                    type.appendChild(doc.createTextNode("Brush"));
                    shapee.appendChild(type);
                } else if (shapes.get(i).getType() == 3) {

                    type.appendChild(doc.createTextNode("Ellipse"));
                    shapee.appendChild(type);
                } else if (shapes.get(i).getType() == 4) {

                    type.appendChild(doc.createTextNode("Line"));
                    shapee.appendChild(type);
                } else if (shapes.get(i).getType() == 5) {

                    type.appendChild(doc.createTextNode("Rectangle"));
                    shapee.appendChild(type);
                } else if (shapes.get(i).getType() == 6) {

                    type.appendChild(doc.createTextNode("Square"));
                    shapee.appendChild(type);
                } else if (shapes.get(i).getType() == 7) {
                    type.appendChild(doc.createTextNode("Triangle"));
                    shapee.appendChild(type);
                }

                //  System.out.println(shapes.get(i).getThik());
                Element thikness = doc.createElement("thikness");
                thikness.appendChild(doc.createTextNode(shapes.get(i).getThik() + ""));
                shapee.appendChild(thikness);

                Element x1 = doc.createElement("x1");
                x1.appendChild(doc.createTextNode(shapes.get(i).getX1() + ""));
                shapee.appendChild(x1);

                Element y1 = doc.createElement("y1");
                y1.appendChild(doc.createTextNode(shapes.get(i).getY1() + ""));
                shapee.appendChild(y1);

                Element x2 = doc.createElement("x2");
                x2.appendChild(doc.createTextNode(shapes.get(i).getX2() + ""));
                shapee.appendChild(x2);

                Element y2 = doc.createElement("y2");
                y2.appendChild(doc.createTextNode(shapes.get(i).getY2() + ""));
                shapee.appendChild(y2);

                Element filled = doc.createElement("filled");
                if (shapes.get(i).isFill() == true) {
                    filled.appendChild(doc.createTextNode("true"));
                } else {
                    filled.appendChild(doc.createTextNode("false"));
                }
                shapee.appendChild(filled);
                Element color = doc.createElement("color");
//               System.out.println(shapes.get(i).getColor());              
                color.appendChild(doc.createTextNode(shapes.get(i).getColor().getRGB() + ""));
                shapee.appendChild(color);
            }
         
            ////////////////////////////////////////////////
                     JSONObject obj2 = new JSONObject();
        JSONArray shapess = new JSONArray();
        for (int i = 0; i < shapes.size(); i++) {
            JSONObject obj = new JSONObject();
            obj.put("id", i + "");
            if (shapes.get(i).getType() == 2) {
                obj.put("type", "Circle");
            } else if (shapes.get(i).getType() == 1) {
                obj.put("type", "Brush");
            } else if (shapes.get(i).getType() == 3) {
                obj.put("type", "Ellipse");
            } else if (shapes.get(i).getType() == 4) {
                obj.put("type", "Line");
            } else if (shapes.get(i).getType() == 5) {
                obj.put("type", "Rectangle");

            } else if (shapes.get(i).getType() == 6) {
                obj.put("type", "Square");

            } else if (shapes.get(i).getType() == 7) {
                obj.put("type", "Triangle");
            }

              obj.put("x1", shapes.get(i).getX1() + "");
              obj.put("y1", shapes.get(i).getY1() + "");
              obj.put("x2", shapes.get(i).getX2() + "");
              obj.put("y2", shapes.get(i).getY2() + "");
              obj.put("thikness", shapes.get(i).getThik() + "");
              obj.put("color", shapes.get(i).getColor().getRGB() + "");
            if (shapes.get(i).isFill() == true) {
                obj.put("filled", "true");
            } else {
                obj.put("filled", "false");
            }
            shapess.add(obj);

        }
        obj2.put("Shapes", shapess);
          //  DOMSource source = new DOMSource(doc);
    
            JFileChooser chosser = new JFileChooser();
            chosser.showSaveDialog(null);
            File file = chosser.getSelectedFile();
            String urll=file.getAbsolutePath();
            Save r=new Save();
            if(urll.contains(".json")){

                r.savejson(urll, obj2);
            }
            else if(urll.contains(".xml")){

                r.savexml(doc, urll);
            }
            else{
                urll=urll+".xml";

                r.savexml(doc, urll);
            }
        
	        } catch (Exception e) {
	           // e.printStackTrace();
	        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new GUI().setVisible(true);

                bound1 = - 550;
                bound2 = 600;

                // Timer 
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {

//                        System.out.println("TimerTask executing counter is: " + Timer);
                        Timer++;//increments the counter

                        bound1++;
                        bound2--;
                        if (bound1 > jFrame3.getWidth()) {
                            bound1 = jLabel2.getX() - jLabel1.getWidth();
                        }
                        jLabel1.setBounds(bound1, 100, 500, 100);

                        if (bound2 < jLabel2.getX() - jLabel3.getWidth()) {
                            bound2 = 600;
                        }
                        jLabel3.setBounds(bound2, 50, 500, 100);


                        jLabel2.setBounds(0, 0, 1500, 550);
                        if (Timer == 2000) {
                            jFrame3.dispose();
                        }
                    }
                };
                timer.scheduleAtFixedRate(timerTask, 10, 8);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JToggleButton Move;
    private javax.swing.JMenuItem New;
    private javax.swing.JPanel Panel1;
    private javax.swing.JToggleButton Resize;
    private javax.swing.JTabbedPane Tabe;
    private javax.swing.JButton colorChange;
    private javax.swing.JButton colorEdit;
    private javax.swing.JCheckBox fill;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser;
    private javax.swing.JFrame jFrame1;
    private static javax.swing.JFrame jFrame3;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private java.awt.List list;
    private javax.swing.JTextField ref;
    private javax.swing.JToggleButton shape1;
    private javax.swing.JToggleButton shape2;
    private javax.swing.JToggleButton shape3;
    private javax.swing.JToggleButton shape4;
    private javax.swing.JToggleButton shape5;
    private javax.swing.JToggleButton shape6;
    private javax.swing.JToggleButton shape7;
    private javax.swing.JTextField thikDisplay;
    // End of variables declaration//GEN-END:variables
}