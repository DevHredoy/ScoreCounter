import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//this window will have the textViews of all players along with their scores.

public class RealTimeWindow extends JFrame{



    ArrayList<String> listOfPlyers;




    ArrayList<JLabel> nameOfplyers=new ArrayList<JLabel>();//all the JLabels with player names
    ArrayList<JButton> listOfButtons=new ArrayList<JButton>();
ArrayList<JLabel> scoreboards=new ArrayList<>();



    ArrayList<Integer> scoresOfPlayers=new ArrayList<Integer>();
    int baseX=50,baseY=10,baseWidth=100,baseHeight=70;

    private Container c;
        int indexFordifferentScoreboard=0;


    //the for loop will create jlabels as much as the length of list of players
    //the name of the jlabel will be from the listOfPlyrs arraylist








RealTimeWindow(ArrayList<String> realList)
{
        listOfPlyers=realList;




    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setBounds(420,50,400,400);
    this.setTitle("RealTime Window :  ");
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.ORANGE);


    for(final String s :listOfPlyers)
    {
        JLabel firstJLabel=new JLabel();
        JLabel scoreboardJL=new JLabel();
        firstJLabel.setBounds(baseX,baseY,baseWidth,baseHeight);
        scoreboardJL.setBounds(baseX+200,baseY,baseWidth-20,baseHeight-20);

        firstJLabel.setText(s);
        firstJLabel.setBackground(Color.darkGray);
        c.add(firstJLabel);
        nameOfplyers.add(firstJLabel);//in every case same firstJLabel is added

        scoreboardJL.setText("0");
        scoreboardJL.setBackground(Color.LIGHT_GRAY);
        c.add(scoreboardJL);
        scoreboards.add(scoreboardJL);

        JButton plus= new JButton();
        plus.setBounds(baseX+100,baseY,baseWidth-20,baseHeight-20);
        plus.setText("+");
        c.add(plus);
        listOfButtons.add(plus);



        scoresOfPlayers.add(0);







        baseY=baseY+50;
        indexFordifferentScoreboard=indexFordifferentScoreboard+1;
    }


    for(final JButton jButton:listOfButtons)// in this for loop below we have assigned action listener with each button stored in the
                                            //list of buttons

    {jButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int d= scoresOfPlayers.get(listOfButtons.indexOf(jButton))+1;//this d is the updated score of each button and thus each player
            scoresOfPlayers.set(listOfButtons.indexOf(jButton),d);
            scoreboards.get(listOfButtons.indexOf(jButton)).setText(Integer.toString(d));

            //now we have to show these score every time it is updated.We have to find an Id for each button
            //then we have to update the score everytime.
//Alhamdulillah i have done this successfully , I could make my project in reality
            //
            //

        }
    });




    }






}











}
