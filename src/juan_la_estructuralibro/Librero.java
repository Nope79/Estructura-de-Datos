package juan_la_estructuralibro;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Master79
 */
public class Librero extends javax.swing.JFrame {

    /**
     * Creates new form Librero
     */
    
    EstructuraLibros x;
    
    Fichero f = new Fichero();
    
    int contador = 0;
    
    ArrayList <JButton> botones;
    
    public Librero() {
        
        initComponents();
        
        x = new EstructuraLibros();
        
        ocultar();
        
        botones = new ArrayList<JButton>(); 
        
        filaLibros.setLayout(new GridLayout(1, x.getIndex()));
        
        cargar(leer());
    }
    
    public void quitar(){
        
        if(!x.empty()){
            
            contLibros.setText(--contador + " Libros");
            
            switch(x.getIndex()){
            
                case 8:
                
                    btn7.setVisible(false);
                    break;
                
                case 7:
                
                    btn6.setVisible(false);
                    break;
                
                case 6:

                    btn5.setVisible(false);
                    break;
                
                case 5:

                    btn4.setVisible(false);
                    break;
                
                case 4:

                    btn3.setVisible(false);
                    break;
                
                case 3:

                    btn2.setVisible(false);
                    break;
                
                case 2:
                
                    btn1.setVisible(false);
                    break;
                
                case 1:

                    btn0.setVisible(false);
                    break;
            }
        
            x.eliminarPila();
        }
        
        else{
            
            JOptionPane.showMessageDialog(null, "¿Es usted tonto? O... ¿Por qué intenta quitar algo que ni siquiera tiene :D?");
        }
    }
    
    public void ocultar(){
        
        switch(x.getIndex()){
            
            case 0:
                
                btn0.setVisible(false);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);

                break;
                
            case 1:
                
                btn0.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                
                break;
                
            case 2:
                
                btn0.setVisible(false);
                btn1.setVisible(true);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);

                break;
                
            case 3:     
                
                btn0.setVisible(false);
                btn1.setVisible(false);
                btn2.setVisible(true);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);

                break;
                
            case 4:
                
                btn0.setVisible(false);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(true);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);

                break;
                
            case 5:
                
                btn0.setVisible(false);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(true);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);

                break;
                
            case  6:
                
                btn0.setVisible(false);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(true);
                btn6.setVisible(false);
                btn7.setVisible(false);

                break;
                
            case 7:
                
                btn0.setVisible(false);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(true);
                btn7.setVisible(false);

                break;
                
            case 8:
                
                btn0.setVisible(false);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(true);

                break;
        }
    }
    
    public void mostrar(Libro nuevo){
        
        switch(x.getIndex()){
            
            case 1:
                
                btn0.setText(nuevo.getIsbn());
                btn0.setVisible(true);
                break;
            
            case 2:
                
                btn1.setText(nuevo.getIsbn());
                btn1.setVisible(true);
                break;
            
            case 3:
                
                btn2.setText(nuevo.getIsbn());
                btn2.setVisible(true);
                break;
            
            case 4:
                
                btn3.setText(nuevo.getIsbn());
                btn3.setVisible(true);
                break;
            
            case 5:
                
                btn4.setText(nuevo.getIsbn());
                btn4.setVisible(true);
                break;
            
            case 6:
                
                btn5.setText(nuevo.getIsbn());
                btn5.setVisible(true);
                break;
                
            case 7:
                
                btn6.setText(nuevo.getIsbn());
                btn6.setVisible(true);
                break;
                
            case 8:
                
                btn7.setText(nuevo.getIsbn());
                btn7.setVisible(true);
                break;
        }
    }
    
    public void reiniciar(){
        
        txtAutor.setText("");
        txtTitulo.setText("");
        txtYear.setText("");
        lbISBN.setText("ISBN");
        
        btnGenISBN.setEnabled(true);
        btnGenISBN.setVisible(true);
    }
    
    public int validar(){
        
        int errores = 0;
        
        if(txtTitulo.getText().equalsIgnoreCase("")) errores++;
        if(lbISBN.getText().equalsIgnoreCase("ISBN")) errores++;
        if(txtAutor.getText().equalsIgnoreCase("")) errores++;
        try{
            int num= Integer.parseInt(txtYear.getText());
        }
        catch(Exception e){
            errores++;
        }
        return errores;
    }
    
    public void genISBN(){
        
        Libro x = new Libro();
        
        String a = x.déclenchementIsbn();
        
        lbISBN.setText(a);
        
        btnGenISBN.setEnabled(false);
    }
    
    public void agregar(){
        
        if(validar() > 0){
            
            JOptionPane.showMessageDialog(null, "Lo sentimos, Ha llenado mal las casillas :( ... Intente de nuevo...");
        }else{
            
            String titulo = txtTitulo.getText();
            
            int year = Integer.parseInt(txtYear.getText());
            String autor = txtAutor.getText();
            String isbn = lbISBN.getText();
        
            if(x.add(new Libro(titulo, year, autor, isbn)) == true){
                
                JOptionPane.showMessageDialog(null, "¡Libro añadido exitosamente :D!");
                
                reiniciar();
                
                mostrar(x.getLibrero()[x.getIndex() - 1]);
                
                llenar();
                
                contLibros.setText(++contador + " Libros");
                
                grabar();
                
            }else{
                
                JOptionPane.showMessageDialog(null, "¡Ya cuentas con este libro :0!");
            }
        }

        reiniciar();
    }
    
    
    /*public void agregarX(String isbn, String titulo, String autor, String anne) {

        if (validar() > 0) {

            JOptionPane.showMessageDialog(null, "Lo sentimos, Ha llenado mal las casillas :( ... Intente de nuevo...");
        } else {

            String titulo = txtTitulo.getText();

            int year = Integer.parseInt(txtYear.getText());
            String autor = txtAutor.getText();
            String isbn = lbISBN.getText();

            if (x.add(new Libro(titulo, year, autor, isbn)) == true) {

                JOptionPane.showMessageDialog(null, "¡Libro añadido exitosamente :D!");

                reiniciar();

                mostrar(x.getLibrero()[x.getIndex() - 1]);

                llenar();

                contLibros.setText(++contador + " Libros");

                grabar();

            } else {

                JOptionPane.showMessageDialog(null, "¡Ya cuentas con este libro :0!");
            }
        }

        reiniciar();
    }
    
    public boolean validarX(String isbn, String titulo, String autor, String anne){
        
        if(isbn == "") return false;
        if()
        
        if(txtTitulo.getText().equalsIgnoreCase("")) return false;
        if(lbISBN.getText().equalsIgnoreCase("ISBN")) return false;
        if(txtAutor.getText().equalsIgnoreCase("")) return false;
        
        try{
            int num= Integer.parseInt(txtYear.getText());
        }
        catch(Exception e){
            return false;
        }
        
        return true;
    }*/
    
    
    
    
    
    public void llenar(){
        
        try{
            
            filaLibros.removeAll();
            
            for(int i = 0; i < x.getIndex(); i++){
                
                botones.add(new JButton(x.getLibrero()[i].getIsbn()));
                botones.get(botones.size() - 1).addActionListener(evento);
                filaLibros.add(botones.get(botones.size() - 1));
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        this.pack();
    }
    
    ActionListener evento = new ActionListener(){
        
        @Override
        
        public void actionPerformed(ActionEvent ae){
            
            // identifica el elemento que se presionó
            
            JButton botoncito = (JButton) (ae.getSource());
            
            String temporal = botoncito.getText();
            Libro obj = x.buscar(temporal);
            JOptionPane.showMessageDialog(null, obj.toString());

            // literalmente lo unico que hace es mostrarte en pantalla los datos del libro que seleccionaste
        }
    };
    
    public void eliminarCola(){
        
        if(x.getIndex() > 0){
            
            String titulo = x.getLibrero()[0].getTitre();
            
            JOptionPane.showMessageDialog(null, "Libro eliminado :0" + " (" + titulo + ")");
            
            x.eliminarCola();
            
            contLibros.setText(--contador + " Libros");

            llenar();
            
            grabar();
        }else{
            
            JOptionPane.showMessageDialog(null, "Lo siento, usted ya no tiene libros para quitar :(");
        }
    }
    
    public void tomarLibro(){
        
        if(x.getIndex() > 0){
            
            String nombre;
            
            nombre = JOptionPane.showInputDialog("Por favor ingrese el título del libro que quiere borrar :)");
            
            if(x.searchTitle(nombre) == - 1){
                
                JOptionPane.showMessageDialog(null, "Usted no cuenta con el libro en cuestion =0" + "(" + nombre + ")");
            }else{
                
                x.eliminarX(nombre);
            
                contLibros.setText(--contador + " Libros");

                JOptionPane.showMessageDialog(null, "Libro eliminado :0" + "(" + nombre + ")");

                llenar();
                
                grabar();
            }
        }else{

            JOptionPane.showMessageDialog(null, "Lo siente, usted no cuenta con ningún libro para tomar :(");
        }
    }
    
    
    
    
    
    
    
    
    
    
    public void grabar() {

        FileWriter fichero = null;
        PrintWriter pw = null;

        String temp = "";

        try {

            fichero = new FileWriter("C:\\Users\\Master79\\Programación\\Estructura de Datos (Java)\\Juan_LA_EstructuraLibro\\fichero\\librero.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < x.getIndex(); i++) {

                temp = x.getLibrero()[i].getIsbn() + "#" + x.getLibrero()[i].getTitre() + "#" + x.getLibrero()[i].getAuteur() + "#" + x.getLibrero()[i].getAnnée();

                pw.println(temp);
            }

        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {

                if (null != fichero) {

                    fichero.close();
                }
            } catch (Exception e2) {

                e2.printStackTrace();
            }
        }
    }














    
    public String leer() {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        String x = "";

        try {

            archivo = new File("C:\\Users\\Master79\\Programación\\Estructura de Datos (Java)\\Juan_LA_EstructuraLibro\\fichero\\librero.txt");

            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // LECTURA DEL ARCHIVO
            String linea;
            while ((linea = br.readLine()) != null) {

                x += linea + "#";
            }
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {

                if (null != fr) {

                    fr.close();
                }

            } catch (Exception e2) {

                e2.printStackTrace();
            }
        }

        System.out.println(x);
        return x;
    }
    
    public void cargar(String s){
        
        String isbn;
        String titulo;
        String autor;
        int anne;
        
        StringTokenizer tokens = new StringTokenizer(s, "#");
        
        while(tokens.hasMoreTokens()){
            
            isbn = tokens.nextToken();
            titulo = tokens.nextToken();
            autor = tokens.nextToken();
            anne = Integer.parseInt(tokens.nextToken());
            
            if(x.add(new Libro(titulo, anne, autor, isbn)) == true){
                
                JOptionPane.showMessageDialog(null, "¡Libro añadido exitosamente :D!");
                
                reiniciar();
                
                mostrar(x.getLibrero()[x.getIndex() - 1]);
                
                llenar();
                
                contLibros.setText(++contador + " Libros");
                
            }else{
                
                JOptionPane.showMessageDialog(null, "¡Ya cuentas con este libro :0!");
            }
        }
        
        grabar();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbISBN = new javax.swing.JLabel();
        btnGenISBN = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        contLibros = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtBusTit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPosBus = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBusArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        filaLibros = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        quitarCola = new javax.swing.JButton();
        tomarLibro = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Libros");

        lbISBN.setText("ISBN");

        btnGenISBN.setText("ISBN");
        btnGenISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenISBNActionPerformed(evt);
            }
        });

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        jLabel3.setText("TÍTULO");

        jLabel4.setText("AUTOR");

        jLabel5.setText("AÑO");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        contLibros.setText("0 Libros");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbISBN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenISBN)
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(37, 37, 37)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(37, 37, 37)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contLibros)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbISBN)
                    .addComponent(btnGenISBN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(contLibros))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBusTit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusTitActionPerformed(evt);
            }
        });

        jLabel2.setText("Título");

        txtPosBus.setText("Posición");

        txtBusArea.setColumns(20);
        txtBusArea.setRows(5);
        jScrollPane2.setViewportView(txtBusArea);

        jButton1.setText("Quitar Libro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(100, 100, 100));

        btn0.setText("jButton2");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setText("jButton2");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("jButton2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("jButton2");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("jButton2");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("jButton2");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("jButton2");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("jButton2");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn0, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn0)
                .addContainerGap())
        );

        jLabel6.setText("Cola de libros");

        javax.swing.GroupLayout filaLibrosLayout = new javax.swing.GroupLayout(filaLibros);
        filaLibros.setLayout(filaLibrosLayout);
        filaLibrosLayout.setHorizontalGroup(
            filaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filaLibrosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        filaLibrosLayout.setVerticalGroup(
            filaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filaLibrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        quitarCola.setText("Quitar Libro");
        quitarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarColaActionPerformed(evt);
            }
        });

        tomarLibro.setText("Tomar Libro");
        tomarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPosBus)
                                .addGap(57, 57, 57))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusTit)))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(filaLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tomarLibro)
                                    .addComponent(quitarCola))
                                .addGap(120, 120, 120)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtPosBus))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(quitarCola))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tomarLibro)
                        .addGap(123, 123, 123))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
    }//GEN-LAST:event_txtTituloActionPerformed

    private void btnGenISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenISBNActionPerformed
        
        genISBN();
    }//GEN-LAST:event_btnGenISBNActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        agregar();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBusTitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusTitActionPerformed
    }//GEN-LAST:event_txtBusTitActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

//        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        quitar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       
       String isbn = btn1.getText();
       
       Libro encontrado = x.buscar(isbn);
       
       JOptionPane.showMessageDialog(null, encontrado.toString());
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        
       String isbn = btn3.getText();
       
       Libro encontrado = x.buscar(isbn);
       
       JOptionPane.showMessageDialog(null, encontrado.toString());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        
       String isbn = btn4.getText();
       
       Libro encontrado = x.buscar(isbn);
       
       JOptionPane.showMessageDialog(null, encontrado.toString());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        
       String isbn = btn5.getText();
       
       Libro encontrado = x.buscar(isbn);
       
       JOptionPane.showMessageDialog(null, encontrado.toString());
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
       
       String isbn = btn0.getText();
       
       Libro encontrado = x.buscar(isbn);
       
       JOptionPane.showMessageDialog(null, encontrado.toString());
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

       String isbn = btn2.getText();
       
       Libro encontrado = x.buscar(isbn);
       
       JOptionPane.showMessageDialog(null, encontrado.toString());
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        
       String isbn = btn6.getText();
       
       Libro encontrado = x.buscar(isbn);
       
       JOptionPane.showMessageDialog(null, encontrado.toString());
    }//GEN-LAST:event_btn6ActionPerformed

    
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        
       String isbn = btn7.getText();
       
       Libro encontrado = x.buscar(isbn);
       
       JOptionPane.showMessageDialog(null, encontrado.toString());
    }//GEN-LAST:event_btn7ActionPerformed

    private void quitarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarColaActionPerformed

        eliminarCola();
    }//GEN-LAST:event_quitarColaActionPerformed

    private void tomarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomarLibroActionPerformed
        
        tomarLibro();
    }//GEN-LAST:event_tomarLibroActionPerformed

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
            java.util.logging.Logger.getLogger(Librero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Librero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Librero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Librero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Librero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenISBN;
    private javax.swing.JLabel contLibros;
    private javax.swing.JPanel filaLibros;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbISBN;
    private javax.swing.JButton quitarCola;
    private javax.swing.JButton tomarLibro;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextArea txtBusArea;
    private javax.swing.JTextField txtBusTit;
    private javax.swing.JLabel txtPosBus;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
