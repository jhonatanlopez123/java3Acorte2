
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhonatan
 */
    public class SpinningTop extends javax.swing.JFrame {
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        int y2=4;
        int f=0;
        int i=0;
        int t1=0;
        int w = 0;
        private int counter[]=new int[5];
        int counter1=0;
        private int f2[]=new int[5];
        int c2=4;
    /**
     * Creates new form SpinningTop
     */
    public SpinningTop() {
        initComponents();
        this.setLocationRelativeTo(null); 

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
        play = new javax.swing.JButton();
        restartgame = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        coins1 = new javax.swing.JLabel();
        coins22 = new javax.swing.JLabel();
        coins4 = new javax.swing.JLabel();
        coins33 = new javax.swing.JLabel();
        pirinola = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        coins = new javax.swing.JComboBox<>();
        play2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        acc = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        winner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spinning top");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        play.setText("Spin around -> player #");
        play.setEnabled(false);
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        restartgame.setText("restart game");
        restartgame.setEnabled(false);
        restartgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartgameActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(221, 221, 221));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "play zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Terminator Two", 1, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        jLabel4.setText("player 4");

        jLabel5.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        jLabel5.setText("player 1");

        jLabel6.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        jLabel6.setText("player 2");

        jLabel7.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        jLabel7.setText("player 3");

        jLabel8.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        jLabel8.setText("coins");

        jLabel9.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        jLabel9.setText("coins");

        jLabel10.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        jLabel10.setText("coins");

        jLabel11.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        jLabel11.setText("coins");

        coins1.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        coins1.setText("0");

        coins22.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        coins22.setText("0");

        coins4.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        coins4.setText("0");

        coins33.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        coins33.setText("0");

        pirinola.setFont(new java.awt.Font("Terminator Two", 1, 12)); // NOI18N
        pirinola.setText("   ?");
        pirinola.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pirinola.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(coins4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(coins22)
                .addGap(69, 69, 69))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(coins33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(coins1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pirinola, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9))))
                            .addComponent(jLabel7))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coins4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addComponent(coins22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coins1)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pirinola, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coins33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(224, 222, 222));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "config zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Terminator Two", 1, 12))); // NOI18N

        coins.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20", "30", "1" }));

        play2.setBackground(new java.awt.Color(153, 255, 153));
        play2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        play2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Terminator Two", 1, 10)); // NOI18N
        jLabel1.setText("coins per player:");

        jButton2.setText("add more coins");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(play2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coins, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(coins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(play2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(new java.awt.Color(221, 221, 221));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "accumulated", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Terminator Two", 1, 12))); // NOI18N

        acc.setFont(new java.awt.Font("Terminator Two", 1, 48)); // NOI18N
        acc.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(acc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(221, 221, 221));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "winner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Terminator Two", 1, 12))); // NOI18N

        winner.setFont(new java.awt.Font("Terminator Two", 1, 48)); // NOI18N
        winner.setText("?");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(winner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(winner)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(restartgame)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restartgame)
                    .addComponent(play))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("icons/icon.png"));
        return retValue;
    }
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
    i++;
    int pi = 0;
    String coins3 = coins.getSelectedItem().toString();
    int coins2 = Integer.parseInt(coins3);
    Random D = new Random();
    pi = (int)(D.nextDouble()* 6 + 1);
    if(f==0){
     for (int y=0;y<=3;y++){
          counter[y]= coins2;
          f2[y]=1;
     }
    }
    System.out.println(y2);
//    if (counter[i] == 0){
//        if (i >= 0 && i <= 2){
//            i++;
//        }else if (i == 3){
//            i = 0;
//        }
//    }
    if (counter[i] >= 1) {    
        switch (i){ 
            case 0:
               play.setText("Spin around -> player 1");  
            break;
            case 1:
               play.setText("Spin around -> player 2");  
            break;
            case 2:
               play.setText("Spin around -> player 3");  
            break;
            case 3:
               play.setText("Spin around -> player 4");  
            break;    
        }
        switch (pi){
            case 1:
                System.out.println("pon 1");
                pirinola.setText("pon 1");
                    if (i == 3){
                        if (counter[2]>=1){
                            counter[2]--;
                            counter1++;
                       }
                    }else if (i == 0){
                        if (counter[3]>=1){
                            counter[3]--;
                            counter1++;
                        }
                    }else if (i == 1){
                        if (counter[0]>=1){
                            counter[0]--;
                            counter1++;
                        }
                    }else if (i == 2){
                        if (counter[1]>=1){
                            counter[1]--;
                            counter1++;
                        }
                    }
                    f=1;
                    break;

    //        case 2:
    //            System.out.println("pon 2");
    //            pirinola.setText("pon 2");
    //            counter[i]=counter[i]-2;
    //            counter1=counter1+2;
    //        break;
    //        case 3:
    //            System.out.println("toma 1");
    //            pirinola.setText("toma 1");
    //            counter[i]++;
    //            counter1--;
    //        break;
    //        case 4:
    //            System.out.println("toma 2");
    //            pirinola.setText("toma 2");
    //            counter[i]--;
    //            counter1++;
    //        break;
    //        case 5:
    //            System.out.println("toma todo");
    //            pirinola.setText("toma todo");
    //            counter[i]=counter1;
    //            counter1=0;
    //        break; 
    //        case 6:
    //            System.out.println("todos ponen");
    //            pirinola.setText("todos ponen");
    //            for (int y=0;y<=3;y++){
    //            counter[y]--;
    //            counter1++;
    //            if (counter[y]==0){
    //                counter[y]++;
    //                counter1--;
    //            }
    //            }
    //        break;
                }
    y2=4;
    for (int y=0;y<=3;y++){
          if (counter[y]==0){
                y2--;
          }else{
                w = y;
          }
          System.out.println(y2);
     }
    System.out.println(i);
    if (y2 == 1){
        if (w == 3){
            System.out.println("el ganador es: 4");
            winner.setText("4");
            play.setEnabled(false);
        }
        if (w == 0){
            System.out.println("el ganador es: 1");
            winner.setText("1");
            play.setEnabled(false);  
        } 
        if (w == 2){
            System.out.println("el ganador es: 3");
            winner.setText("3");
            play.setEnabled(false);
            
        }
        if (w == 1){
            System.out.println("el ganador es: 2");
            winner.setText("2");
            play.setEnabled(false);
            
        }
    }
    for (int y=1;y<=4;y++){
        System.out.println("jugador "+y+" : "+counter[y-1]);       
    }
    String acc2 = Integer.toString(counter1);
    String co1 = Integer.toString(counter[0]);
    String co2 = Integer.toString(counter[1]);
    String co3 = Integer.toString(counter[2]);
    String co4 = Integer.toString(counter[3]);
    acc.setText(acc2);
    coins1.setText(co1);
    coins22.setText(co2);
    coins33.setText(co3);
    coins4.setText(co4);
    System.out.println("---------------------------------");  

    }
    if (i==3){
        i=-1;
    }
    }//GEN-LAST:event_playActionPerformed

    private void restartgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartgameActionPerformed
    
        SpinningTop SpinningTop= new SpinningTop();
        SpinningTop.setVisible(true);
        dispose();  
    }//GEN-LAST:event_restartgameActionPerformed

    private void play2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play2ActionPerformed
       
        String cains2 = coins.getSelectedItem().toString();
        for (int y=1;y<=4;y++){
            System.out.println("jugador "+y+" : "+cains2);
            
        }
        System.out.println("---------------------------------");
        int cains = Integer.parseInt(cains2);    
        coins1.setText(cains2);
        coins22.setText(cains2);
        coins33.setText(cains2);
        coins4.setText(cains2);
        play.setEnabled(true);
        play.setText("Spin around -> player 1");
        restartgame.setEnabled(true);
        play2.setEnabled(false);
        
    }//GEN-LAST:event_play2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        add_more_coins add_more_coins= new add_more_coins();
//        ganador.gana.setText(c2);
        add_more_coins.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SpinningTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpinningTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpinningTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpinningTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpinningTop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc;
    public static javax.swing.JComboBox<String> coins;
    private javax.swing.JLabel coins1;
    private javax.swing.JLabel coins22;
    private javax.swing.JLabel coins33;
    private javax.swing.JLabel coins4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel pirinola;
    private javax.swing.JButton play;
    private javax.swing.JButton play2;
    private javax.swing.JButton restartgame;
    private javax.swing.JLabel winner;
    // End of variables declaration//GEN-END:variables
}