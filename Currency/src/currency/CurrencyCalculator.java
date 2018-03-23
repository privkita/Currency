package currency;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingWorker;

/**
 *
 * @author Tata
 */
public class CurrencyCalculator extends javax.swing.JFrame {
	
    /**
	 * 
	 */
	// Variables declaration - do not modify                     
	private javax.swing.JLabel amountLabel;
    private javax.swing.JSpinner amountSpinner;
    private javax.swing.JPanel archiveTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTabbedPane calculatorPane;
    private javax.swing.JComboBox<String> currencyComboBox;
    private javax.swing.JLabel currencyLabel;
    private javax.swing.JLabel dateChooseLabel;
    private javax.swing.JSpinner dateSpinner;
    private javax.swing.JRadioButton fromPLNButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton pobierzButton;
    private javax.swing.JButton przeliczButton;
    private javax.swing.JLabel resultDisplayed;
    private javax.swing.JLabel tableData;
    private javax.swing.JRadioButton toPLNButton;
    private Table table;
    // End of variables declaration  

    /**
     * Creates new form CurrencyCalculator
     */
    public CurrencyCalculator() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        calculatorPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        amountLabel = new javax.swing.JLabel();
        amountSpinner = new javax.swing.JSpinner();
        currencyLabel = new javax.swing.JLabel();
        currencyComboBox = new javax.swing.JComboBox<>();
        toPLNButton = new javax.swing.JRadioButton();
        fromPLNButton = new javax.swing.JRadioButton();
        przeliczButton = new javax.swing.JButton();
        resultDisplayed = new javax.swing.JLabel();
        tableData = new javax.swing.JLabel();
        archiveTable = new javax.swing.JPanel();
        dateChooseLabel = new javax.swing.JLabel();
        dateSpinner = new javax.swing.JSpinner();
        pobierzButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        this.setTitle("Kalkulator walutowy");

        amountLabel.setText(" Kwota:");

        amountSpinner.setModel(new javax.swing.SpinnerNumberModel(100, 0, null, 100));
        amountSpinner.setValue(1);

        currencyLabel.setText(" Waluta:");

        currencyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        currencyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyComboBoxActionPerformed(evt);
            }
        });

        buttonGroup1.add(toPLNButton);
        toPLNButton.setSelected(true);
        toPLNButton.setText("na złotówki");
        toPLNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toPLNButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(fromPLNButton);
        fromPLNButton.setText("na walutę obcą");
        fromPLNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromPLNButtonActionPerformed(evt);
            }
        });

        przeliczButton.setText("PRZELICZ");
        przeliczButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przeliczButtonActionPerformed(evt);
            }
        });

        resultDisplayed.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        resultDisplayed.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        tableData.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        tableData.setText("  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amountSpinner, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currencyComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(currencyLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fromPLNButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toPLNButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE))
                    .addComponent(przeliczButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultDisplayed, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableData, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(currencyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(toPLNButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromPLNButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(przeliczButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(resultDisplayed, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tableData, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );

        calculatorPane.addTab("Kalkulator walutowy", jPanel1);

        dateChooseLabel.setText("Wybierz datę");

        SimpleDateFormat model = new SimpleDateFormat("dd-MM-yyyy");
        dateSpinner.setModel(new SpinnerDateModel(new java.util.Date(), new java.util.Date(1009883340000L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));
        dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, model.toPattern()));

        pobierzButton.setText("POBIERZ");
        pobierzButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pobierzButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout archiveTableLayout = new javax.swing.GroupLayout(archiveTable);
        archiveTable.setLayout(archiveTableLayout);
        archiveTableLayout.setHorizontalGroup(
            archiveTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(archiveTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(archiveTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(archiveTableLayout.createSequentialGroup()
                        .addComponent(dateChooseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pobierzButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        archiveTableLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dateSpinner, pobierzButton});

        archiveTableLayout.setVerticalGroup(
            archiveTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(archiveTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(archiveTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateChooseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pobierzButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        archiveTableLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dateChooseLabel, dateSpinner, pobierzButton});

        calculatorPane.addTab("Tabele archiwalne", archiveTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calculatorPane, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calculatorPane)
        );

        pack();
    }// </editor-fold>
    
    private void toPLNButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        calculate();
    }                                           

    private void fromPLNButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	calculate();
    }
    
    private void przeliczButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	calculate();
    }

    private void currencyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }
    
    private void pobierzButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	printArchiveTable();
    }

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
            java.util.logging.Logger.getLogger(CurrencyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	CurrencyCalculator calculator = new CurrencyCalculator();
                calculator.setVisible(true);
                calculator.getRates();
            }
        });
    }
    
    private void getRates() {
    	
    	SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {

			@Override
			protected Void doInBackground() throws Exception {
				table = NBPHandler.getTable(LocalDate.now().toString());
				return null;
			}
    		protected void done() {
    			refreshTable();
    		}
    	};
    	worker.execute();   	
    }
    
    private void getArchiveRates() {
    	
    	SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {

			@Override
			protected Void doInBackground() throws Exception {
				String date = ((Date)dateSpinner.getValue()).toLocaleString().substring(0, 10);
				Table newTable = NBPHandler.getTable(date);
				if (newTable != null)
					table = newTable;
				return null;
			}
    		protected void done() {
    			refreshTable();
    		}
    	};
    	worker.execute();
    }
    
    private void refreshTable() {
    	tableData.setText("Tabela nr: " + table.getTableNumber() + " z dnia: " + table.getTableDate());
    	currencyComboBox.setModel(new DefaultComboBoxModel<>(table.getCurrenciesSet()));
    }

    private void calculate() {
    	BigDecimal amount = new BigDecimal("" + amountSpinner.getValue());
    	String code = ("" + currencyComboBox.getSelectedItem()).substring(0, 3);
    	Currency currency = table.findCurrency(code);
    	
    	if (toPLNButton.isSelected())
    		resultDisplayed.setText(currency.exchangeToPln(amount) + " " + "PLN");
    	
    	if(fromPLNButton.isSelected())
    		resultDisplayed.setText(currency.exchangeFromPln(amount) + " " + currency.getCode());
    }
    
    private void printArchiveTable() {
    	getArchiveRates();
    	try {
			Thread.sleep(500);
	    	jTextArea1.setText(table.toString());
	    	jTextArea1.append("\n");
	    	for (Currency currency : table.getAllCurrencies()) {
	    		jTextArea1.append(currency.toString());
	    		jTextArea1.append("\n");
	    	}
    	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
