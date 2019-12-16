/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

/**
 *
 * @author VENTI
 */
public class InpEntry extends Entry implements Inputan{

    @Override
    public String inptId() {
        String teksID = txtId.getText();
        return teksID;
    }
    
    @Override
    public String inptName(){
        String teksName = txtName.getText();
        return teksName;
    }

    @Override
    public String inptFname() {
        String teksFname = txtFname.getText();
        return teksFname;
    }

    @Override
    public String inptC() {
        String teksC = txtC.getName();
        return teksC;
    }

    @Override
    public String inptAd() {
        String teksAd = txtC.getName();
        return teksAd;
    }

    @Override
    public String inptQ() {
        String teksQ = txtQ.getName();
        return teksQ;
    }

    @Override
    public String inptE() {
        String teksE = txtE.getName();
        return teksE;
    }

    @Override
    public String inptD() {
        String teksD = txtD.getName();
        return teksD;
    }
    
}
