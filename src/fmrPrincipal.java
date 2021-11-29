public class fmrPrincipal extends javax.swing.JFrame {
    private double valor1 = 0;
    private String operacion = null;
    public int factorial(int A){
        if(A==0){
            return 1;
        }else{
            return A * factorial(A - 1);
        }   
    }
    public fmrPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton29 = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnPorrcentaje = new javax.swing.JButton();
        btnTAN = new javax.swing.JButton();
        btnCOS = new javax.swing.JButton();
        btnSEN = new javax.swing.JButton();
        btnLogaritmo = new javax.swing.JButton();
        btnLogaritmo10 = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnAlCuadrado = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();
        lbnBinario = new javax.swing.JRadioButton();
        lbnDecimal = new javax.swing.JRadioButton();
        lbnHexadecimal = new javax.swing.JRadioButton();
        btnCero = new javax.swing.JButton();
        btnAutor = new javax.swing.JButton();

        jButton29.setText("CE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnMultiplicacion.setText("x");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnPorrcentaje.setText("%");
        btnPorrcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorrcentajeActionPerformed(evt);
            }
        });

        btnTAN.setText("TAN");
        btnTAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTANActionPerformed(evt);
            }
        });

        btnCOS.setText("COS");
        btnCOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOSActionPerformed(evt);
            }
        });

        btnSEN.setText("SEN");
        btnSEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSENActionPerformed(evt);
            }
        });

        btnLogaritmo.setText("ln");
        btnLogaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaritmoActionPerformed(evt);
            }
        });

        btnLogaritmo10.setText("log");
        btnLogaritmo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaritmo10ActionPerformed(evt);
            }
        });

        btnRaiz.setText("Raiz");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        btnPotencia.setText("x^y");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btnAlCuadrado.setText("x^2");
        btnAlCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlCuadradoActionPerformed(evt);
            }
        });

        btnFactorial.setText("x!");
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        btnBorrarTodo.setText("C");
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btnBorrar.setText("CE");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtDatos.setColumns(20);
        txtDatos.setRows(5);
        jScrollPane1.setViewportView(txtDatos);

        lbnBinario.setText("Binario");
        lbnBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbnBinarioActionPerformed(evt);
            }
        });

        lbnDecimal.setText("Decimal");
        lbnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbnDecimalActionPerformed(evt);
            }
        });

        lbnHexadecimal.setText("Hexadecimal");
        lbnHexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbnHexadecimalActionPerformed(evt);
            }
        });

        btnCero.setText("0");

        btnAutor.setText("autor");
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCero)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUno)
                                    .addComponent(btnDos))
                                .addComponent(btnTres))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCuatro)
                                .addComponent(btnCinco)
                                .addComponent(btnSeis))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnSiete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnPunto))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnOcho)
                                        .addComponent(btnNueve))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnIgual))))
                        .addComponent(btnAutor)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMultiplicacion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDivision)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPorrcentaje))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCOS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSEN))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFactorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlCuadrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPotencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarTodo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogaritmo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogaritmo10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRaiz))
                    .addComponent(lbnBinario)
                    .addComponent(lbnDecimal)
                    .addComponent(lbnHexadecimal))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbnBinario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbnDecimal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbnHexadecimal)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSiete)
                            .addComponent(btnPunto)
                            .addComponent(btnMas)
                            .addComponent(btnMenos)
                            .addComponent(btnMultiplicacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnOcho)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnNueve))
                                .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDivision)
                                    .addComponent(btnPorrcentaje))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTAN)
                                    .addComponent(btnCOS)
                                    .addComponent(btnSEN)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCuatro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCinco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSeis)
                            .addComponent(btnTres))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCero)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogaritmo)
                            .addComponent(btnLogaritmo10)
                            .addComponent(btnRaiz))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlCuadrado)
                            .addComponent(btnPotencia)
                            .addComponent(btnBorrarTodo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFactorial)
                            .addComponent(btnBorrar)
                            .addComponent(btnAutor))))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbnBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbnBinarioActionPerformed
        lbnDecimal.setSelected(false);
        lbnHexadecimal.setSelected(false);
        txtDatos.setText(Integer.toBinaryString(Integer.parseInt(txtDatos.getText())));
    
    }//GEN-LAST:event_lbnBinarioActionPerformed

    private void lbnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbnDecimalActionPerformed
        lbnBinario.setSelected(false);
        lbnHexadecimal.setSelected(false);
        
        btnCero.setEnabled(true);
        btnUno.setEnabled(true);
        btnDos.setEnabled(true);
        btnTres.setEnabled(true);
        btnCuatro.setEnabled(true);
        btnCinco.setEnabled(true);
        btnSeis.setEnabled(true);
        btnSiete.setEnabled(true);
        btnOcho.setEnabled(true);
        btnNueve.setEnabled(true);
    }//GEN-LAST:event_lbnDecimalActionPerformed

    private void lbnHexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbnHexadecimalActionPerformed
        lbnDecimal.setSelected(false);
        lbnBinario.setSelected(false);
        txtDatos.setText(Integer.toHexString(Integer.parseInt(txtDatos.getText())));
    }//GEN-LAST:event_lbnHexadecimalActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        txtDatos.append("1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        txtDatos.append("2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        txtDatos.append("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        txtDatos.append("4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        txtDatos.append("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        txtDatos.append("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        txtDatos.append("7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        txtDatos.append("8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        txtDatos.append("9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        txtDatos.append(".");
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        Double valor2 = Double.parseDouble(txtDatos.getText());
        switch(operacion)
        {
            case "suma":
                txtDatos.setText(String.valueOf(valor1+valor2));
                break;
            case "resta":
                txtDatos.setText(String.valueOf(valor1-valor2));
                break;
            case "multiplicacion":
                txtDatos.setText(String.valueOf(valor1*valor2));
                break;
            case "Division":
                if(valor2==0){
                    txtDatos.setText(String.valueOf("E"));
                } else{
                    txtDatos.setText(String.valueOf(valor1/valor2));
                }
                break;
            case "porcentaje":
                txtDatos.setText(String.valueOf(valor1*valor2));
                break;
            case "Potencia2":
                txtDatos.setText(String.valueOf(Math.pow(valor1,valor2)));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="suma";
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="resta";
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="multiplicacion";
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="division";
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPorrcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorrcentajeActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="porcentaje";
    }//GEN-LAST:event_btnPorrcentajeActionPerformed

    private void btnTANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTANActionPerformed
         txtDatos.setText(String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(txtDatos.getText())))));
    }//GEN-LAST:event_btnTANActionPerformed

    private void btnCOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOSActionPerformed
        txtDatos.setText(String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(txtDatos.getText())))));
    }//GEN-LAST:event_btnCOSActionPerformed

    private void btnSENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSENActionPerformed
        txtDatos.setText(String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(txtDatos.getText())))));
    }//GEN-LAST:event_btnSENActionPerformed

    private void btnLogaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaritmoActionPerformed
        double valor,log;
        valor = Double.parseDouble(txtDatos.getText());
        log = Math.log(valor);
        txtDatos.setText(String.valueOf(log));
    }//GEN-LAST:event_btnLogaritmoActionPerformed

    private void btnLogaritmo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaritmo10ActionPerformed
        double numero, log;
        numero = Double.parseDouble(txtDatos.getText());
        log = Math.log10(numero);
        txtDatos.setText(String.valueOf(log));  
    }//GEN-LAST:event_btnLogaritmo10ActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        txtDatos.setText(String.valueOf(Math.sqrt(Double.parseDouble(txtDatos.getText()))));
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnAlCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlCuadradoActionPerformed
        txtDatos.setText(String.valueOf(Math.pow(Double.parseDouble(txtDatos.getText()),2)));
    }//GEN-LAST:event_btnAlCuadradoActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion = "potencia2";
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        txtDatos.setText("");
    }//GEN-LAST:event_btnBorrarTodoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String valor = txtDatos.getText();
        txtDatos.setText( valor.substring(0, valor.length()-1) );
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        txtDatos.setText(String.valueOf(factorial(Integer.parseInt(txtDatos.getText()))));
    }//GEN-LAST:event_btnFactorialActionPerformed

    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed
        FrmAutor frm = new FrmAutor();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAutorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlCuadrado;
    private javax.swing.JButton btnAutor;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnCOS;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLogaritmo;
    private javax.swing.JButton btnLogaritmo10;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorrcentaje;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnSEN;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTAN;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton jButton29;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lbnBinario;
    private javax.swing.JRadioButton lbnDecimal;
    private javax.swing.JRadioButton lbnHexadecimal;
    private javax.swing.JTextArea txtDatos;
    // End of variables declaration//GEN-END:variables
}
