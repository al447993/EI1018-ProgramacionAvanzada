package es.uji.al447993.clasificarFlores.algorithms;

import es.uji.al447993.clasificarFlores.rows.Row;
import es.uji.al447993.clasificarFlores.tables.Table;

import java.util.*;

public class KMeans {
    private Table data;
    private int numClusters;
    private int numIterations;
    private long seed;

    public KMeans(int numClusters, int numIterations, long seed) {
        this.numClusters = numClusters;
        this.numIterations = numIterations;
        this.seed = seed;
    }


    public void train(Table datos) {
        Random random = new Random(seed);
        Set<Integer> representantes = new HashSet<>();
        List<List<Double>> centroides = new ArrayList<>();
        Map<Integer,List<Double>> grupos_centroide = new HashMap<>();
        Map<Integer,List<Double>> grupos_contenido = new HashMap<>();

        int num = 1;
        while (representantes.size() < numClusters) { //Elijo muestras al azar igual a los grupos que me marca que tengo
            representantes.add(random.nextInt(datos.getRowCount()));
            grupos_centroide.put(++num,null);
            grupos_contenido.put()
        }
        num = 0;
        for (int representante : representantes) {
            Row row = datos.getRowAt(representante);
            List<Double> contenido = row.getData();
            centroides.add(contenido);
            grupos.put(++num,contenido);
        }

        for (int i = 0; i <= numIterations; i++) {

        }

    }


}
