package main;

import chart.BarChart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BarChart barChart = BarChart.builder().withBackgroundColor("green").withDisplayTitle(true).withHeight(700).withWiddth(500).build();

        System.out.println((barChart.toString()));
    }
}
