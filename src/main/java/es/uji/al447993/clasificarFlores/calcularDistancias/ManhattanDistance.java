package es.uji.al447993.clasificarFlores.calcularDistancias;

import java.util.List;

public class ManhattanDistance implements Distance{

    private List<Double> sample;
    private List<Double> rowData;

    //Constructores
    public ManhattanDistance(List<Double> sample, List<Double> rowData){
        this.sample = sample;
        this.rowData = rowData;
    }

    @Override
    public double calculateDistance(List<Double> sample, List<Double> rowData) {
        double suma = 0.0;

        for (int j = 0; j < sample.size(); j++) {
            suma += sample.get(j) - rowData.get(j);

        }
        return suma;
    }
}
