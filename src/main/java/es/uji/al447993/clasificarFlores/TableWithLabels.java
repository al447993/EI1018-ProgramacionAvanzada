package es.uji.al447993.clasificarFlores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableWithLabels extends Table{
    //Atributos
    private Map<String,Integer> labelsToIndex;

    public TableWithLabels() {
        super(); //Constructor de Table
        labelsToIndex = new HashMap<String,Integer>();
    }
    public TableWithLabels(List<String> headers, List<RowWithLabel> filas) {
        super(headers, filas);
        labelsToIndex = new HashMap<String,Integer>();
    }

    @Override
    public RowWithLabel getRowAt(int rowNumber) {
        return (RowWithLabel) super.getRowAt(rowNumber);
        //Espera un Row, pero nosotros le pasamos un RowWithLabel, por lo que forzamos la conversión
    }
    public Integer getLabelAsInteger(String label) {
        Integer index = labelsToIndex.size();

        if (!labelsToIndex.containsKey(label))
            labelsToIndex.put(label,index);

        return labelsToIndex.get(label);
    }
}
