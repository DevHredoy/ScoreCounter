import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UI extends JFrame {
private JLabel heading,reportingInput,instruction1,instruction2,instruction3,instruction4;
private JComboBox totalPlayers;
private JTextField nameOf_Players;
private JButton add_Player,confirmTeam;
private Integer[] listOfOptions= {3,4,5,6,7,8};
int number_of_totalPlayers=0;
int x=500,y=100,z=250,l=63;//190,150,166,63)

int flag=0;
RealTimeWindow realTimeWindow;
ArrayList<String> tempList=new ArrayList<String>();



private Container c;

        UI()
        {


            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setBounds(100,50,420,350);

            c=this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.orange);

        heading=new JLabel("Score Counter");
            heading.setBounds(78,80,166,63);
            c.add(heading);



            totalPlayers=new JComboBox(listOfOptions);
            totalPlayers.setBounds(78,150,100,63);
            c.add(totalPlayers);

            confirmTeam= new JButton("confirmTeam");
            confirmTeam.setBounds(190,150,166,63);
            c.add(confirmTeam);



            reportingInput=new JLabel(" no player has been added : ");
            reportingInput.setBounds(100,460,270,80);
            c.add(reportingInput);

            instruction1=new JLabel("step 1:drop down the list and select member's quantity");
            instruction1.setBounds(x,y,z,l);
            c.add(instruction1);

            instruction2=new JLabel("step 2 : press confirm button ");
            instruction2.setBounds(x,y+30,z,l);
            c.add(instruction2);

            instruction3=new JLabel("step 3 : eveytime type name of one player and press add player ");
            instruction3.setBounds(x,y+60,z,l);
            c.add(instruction3);

            instruction4=new JLabel("step 4 : press add player everytime ");
            instruction4.setBounds(x,y+90,z,l);
            c.add(instruction4);



            nameOf_Players=new JTextField();
            nameOf_Players.setBounds(100,250,131,74);
            c.add(nameOf_Players);

            add_Player=new JButton("add Player");
            add_Player.setBounds(255,250,133,80);
            c.add(add_Player);


            confirmTeam.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String s=totalPlayers.getSelectedItem().toString();
                    int i=Integer.parseInt(s);
                    number_of_totalPlayers=i;
                }






            });

            add_Player.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String p=nameOf_Players.getText();

                    //realTimeWindow.setListOfPlyers(p);//
                    //not like this , the arraylist will be within this class , then at the end the list will be
                    // pushed in the realtime view by the constructor and at the end everything will be visible.
                    tempList.add(p);
                    reportingInput.setText(p+" has been added");
                    nameOf_Players.setText(" ");
                    flag=flag+1;
                    if(flag==number_of_totalPlayers)
                    {   realTimeWindow=new RealTimeWindow(tempList);
                        realTimeWindow.setVisible(true);
                    }
                    //if total number of player has been taken realTimeWindow will then be visible
                    //

                }
            });


        }




}
