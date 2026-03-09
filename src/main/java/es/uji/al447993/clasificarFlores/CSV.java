package es.uji.al447993.clasificarFlores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.ArrayList;

public class CSV {

    public Table readTable(String nombreFichero) throws IOException {

        String ref;
        try {
            ref = getClass().getClassLoader().getResource(nombreFichero).toURI().getPath();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        Table tabla;
        try(BufferedReader br = new BufferedReader(new FileReader(ref))) {
            List<String> headers = new ArrayList<String>();
            List<Row> rows = new ArrayList<Row>();


            String linea;
            int numLinea = 0;

            while((linea = br.readLine()) != null) {
                if (numLinea == 0) {
                    for (String elemento : linea.split(","))
                        headers.add(elemento);
                }
                else {
                    Row row = new Row();
                    for (String elemento : linea.split(","))
                        row.addData(Double.parseDouble(elemento));
                    rows.add(row);
                }
            }
            tabla = new Table(headers,rows);
        }

        return tabla;

    }

    public TableWithLabels readTableWithLabels(String nombreFichero) throws IOException {

        String ref;
        try {
            ref = getClass().getClassLoader().getResource(nombreFichero).toURI().getPath();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        TableWithLabels tabla;
        try(BufferedReader br = new BufferedReader(new FileReader(ref))) {
            List<String> headers = new ArrayList<String>();
            List<RowWithLabel> rows = new ArrayList<RowWithLabel>();


            String linea;
            int numLinea = 0;

            while((linea = br.readLine()) != null) {
                if (numLinea == 0) {
                    for (String elemento : linea.split(","))
                        headers.add(elemento);
                }
                else {
                    RowWithLabel row = new RowWithLabel();
                    String[] elementos = linea.split(",");
                    for (int i = 0; i < elementos.length - 1; i++)
                        row.addData(Double.parseDouble(elementos[i]));

                    row.setLabel(elementos[elementos.length - 1]);
                    rows.add(row);
                }
                numLinea++;
            }
            tabla = new TableWithLabels(headers,rows);
        }

        return tabla;
    }
}
