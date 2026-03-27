package es.uji.al447993.clasificarFlores.algorithms;

import es.uji.al447993.clasificarFlores.Table;
import java.util.List;

//Al ser TableWithLabels una clase que desciende de Table, se puede emplear Table como tipo
public interface algorithms<T extends Table,V,U>{

    void train(T datos);



    U estimate(V datos);

}
