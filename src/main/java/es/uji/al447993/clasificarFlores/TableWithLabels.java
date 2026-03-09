package es.uji.al447993.clasificarFlores;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableWithLabels extends Table{
    //Atributos
    private List<RowWithLabel> rows;
    private Map<String,Integer> labelsToIndex;

    public TableWithLabels() {
        super(); //Constructor de Table
        labelsToIndex = new HashMap<String,Integer>();
    }
    public TableWithLabels(List<String> headers, List<RowWithLabel> filas) {
        super();
    }

    @Override
    public RowWithLabel getRowAt(int rowNumber) {
        return rows.get(rowNumber);
    }
    public Integer getLabelAsInteger(String label) {
        Integer index = labelsToIndex.size();

        if (!labelsToIndex.containsKey(label))
            labelsToIndex.put(label,index);

        return labelsToIndex.get(label);
    }
}
