/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questions;

import java.io.Serializable;

/**
 *
 * @author Swapnil
 */
public class Question implements Serializable{
    
    public int quesNo;
    public String ques;
    public String opt[] = new String[4];
    public int ans;
    public int type;
    
    @Override
    public String toString() {
        String temp = "";
        temp = "Ques ID : "+quesNo;
        temp += "\nDifficulty: "+type;
        temp += "\nQues:\n"+ques;
        temp += "\n(1)"+opt[0];
        temp += "\n(2)"+opt[1];
        temp += "\n(3)"+opt[2];
        temp += "\n(4)"+opt[3];
        temp += "\nCorrect option: "+ans;
        return temp;
    }
}