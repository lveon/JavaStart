package com;

public class Fashion {

    private int metricCode;
    private String metricValue;
    private int[] barcode;
    private boolean fashion;

    public Fashion(int metricCode, String metricValue, boolean isFashion, int [] barcode) {
        this.fashion = isFashion;
        this.barcode = new int[10];
        this.metricCode = metricCode;
        this.metricValue = metricValue;
    }

    public boolean isFashion() {
        return this.fashion;
    }

    public void setFashion(boolean fashion) {
        this.fashion = fashion;
    }


    public String getMetricValue() {
        return metricValue;
    }

    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }


    public int getMetricCode() {
        return metricCode;
    }

    public void setMetricCode(int metricCode) {
        if (metricCode>=1){
            this.metricCode=metricCode;
        } else {
            System.out.println("Metric code must be greater than zero");
        }
    }


    public int[] getBarcode() {
        return this.barcode.clone();
    }

    public void setBarcode(int[] barcode) {
        this.barcode = barcode;
    }
}




