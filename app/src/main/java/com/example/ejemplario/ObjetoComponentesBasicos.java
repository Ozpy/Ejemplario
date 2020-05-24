package com.example.ejemplario;

import java.io.Serializable;

public class ObjetoComponentesBasicos implements Serializable {
    private String str1,strSpinner,radioButton;
    private Boolean checkBox;

    public ObjetoComponentesBasicos(String str1, String strSpinner, String radioButton, Boolean checkBox) {
        this.str1 = str1;
        this.strSpinner = strSpinner;
        this.radioButton = radioButton;
        this.checkBox = checkBox;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStrSpinner() {
        return strSpinner;
    }

    public void setStrSpinner(String strSpinner) {
        this.strSpinner = strSpinner;
    }

    public String getRadioButton() {
        return radioButton;
    }

    public void setRadioButton(String radioButton) {
        this.radioButton = radioButton;
    }

    public Boolean getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(Boolean checkBox) {
        this.checkBox = checkBox;
    }
}
