
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatServer extends javax.swing.JFrame {
	Socket socket;
	//PrintStream ps;
	BufferedReader br;

    public ChatServer() {
        initComponents();
        
        //bSend.addActionListener(new ButtonListener());
        
        		//SET UP SERVER SOCKET AND STREAMS
		try{			
			//create ServerSocket
			ServerSocket serverSocket = new ServerSocket(8000);
				
            // Listen for a connection request
            Socket socket = serverSocket.accept();
				
			//create input, output streams
			InputStreamReader input = new InputStreamReader(socket.getInputStream());
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
					
            //create BufferedReader for input, PrintStream for output
            BufferedReader br = new BufferedReader(input);
            PrintStream ps = new PrintStream(output);
			
			//input Thread receives strings and prints to display
			Thread inputThread = new Thread(new DisplayLoop());
			inputThread.start();
									
		}catch(Exception e){System.out.println(e);}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        pTop = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        pBot = new javax.swing.JPanel();
        jtf = new javax.swing.JTextField();
        bSend = new javax.swing.JButton();

        jScrollPane2.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display.setEditable(false);
        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        javax.swing.GroupLayout pTopLayout = new javax.swing.GroupLayout(pTop);
        pTop.setLayout(pTopLayout);
        pTopLayout.setHorizontalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );
        pTopLayout.setVerticalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTopLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jtf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfActionPerformed(evt);
            }
        });

        bSend.setText("Send");
        bSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBotLayout = new javax.swing.GroupLayout(pBot);
        pBot.setLayout(pBotLayout);
        pBotLayout.setHorizontalGroup(
            pBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotLayout.createSequentialGroup()
                .addComponent(jtf, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSend, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
        );
        pBotLayout.setVerticalGroup(
            pBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSend))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSendActionPerformed
        // TODO add your handling code here:
         
        		/*try{			
			//create ServerSocket
			ServerSocket serverSocket = new ServerSocket(8000);
				
            // Listen for a connection request
            Socket socket = serverSocket.accept();
				
			//create input, output streams
			InputStreamReader input = new InputStreamReader(socket.getInputStream());
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
					
            //create BufferedReader for input, PrintStream for output
            BufferedReader br = new BufferedReader(input);
            //PrintStream ps = new PrintStream(output);
			
			//input Thread receives strings and prints to display
			Thread inputThread = new Thread(new DisplayLoop());
			inputThread.start();
									
		}catch(Exception e){System.out.println(e);}*/
        
        
        
        //ps.println(jtf.getText());
        String text = jtf.getText();
        jtf.setText(String.valueOf(text));
       
           // ps.println(text);
      
        System.out.println(text);
        
        
	//jtf.setText("");
        //System.out.println("");
    }//GEN-LAST:event_bSendActionPerformed

    private void jtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfActionPerformed
        // TODO add your handling code here:
        //jtf.setText("");
    }//GEN-LAST:event_jtfActionPerformed

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
            java.util.logging.Logger.getLogger(ChatServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new ChatServer().setVisible(true);
            }
        });
    }
    
    /*public void actionPerformed(ActionEvent ae){
			ps.println(jtf.getText());
			jtf.setText("");
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSend;
    private javax.swing.JTextArea display;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextField jtf;
    private javax.swing.JPanel pBot;
    private javax.swing.JPanel pTop;
    // End of variables declaration//GEN-END:variables

    /*public class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            		ps.println(jtf.getText());
			jtf.setText("");
                        System.out.println("");
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }


    }*/
    
    
    
    	public class DisplayLoop implements Runnable {
		//loop keeps waiting for next line to append to jtf
		@Override
		public void run(){
			while(true){
				try{
					display.append(br.readLine() + "\n");
				}catch(Exception e){System.out.println(e);}
			}
		} //end run()
	}
}
