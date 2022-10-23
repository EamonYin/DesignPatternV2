package com.eamon.designpatternv2.SOLID.Single.Example2;

public class Test {
    public static void main(String[] args) {
        StudentChart studentChart = new StudentChart();
        studentChart.setDao(new StudentDao());
        studentChart.showChart();
    }
}
