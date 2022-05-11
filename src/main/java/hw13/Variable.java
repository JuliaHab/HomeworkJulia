package hw13;

import java.util.ArrayList;
import java.util.List;

public class Variable {
    public static void main(String[] args) {

        List <Integer> variable = new ArrayList<>();
        variable.add(-5);
        variable.add(10);
        variable.add(80);
        variable.add(45);
        variable.add(33);
        System.out.println(variable);

        // add
        variable.add(3, 88);
        variable.add(4,105);
        System.out.println(variable);

        // set
        variable.set(2, 25);
        System.out.println(variable);

        // remove
        variable.remove(4);  // не нашла как удалить объект, только через индекс
        System.out.println(variable);

        // get
        System.out.println(variable.get(3));

        // contains
        System.out.println(variable.contains(88));
        System.out.println(variable.contains(105));

        // for
        for (int j=0; j<variable.size(); j++){
            System.out.println(variable.get(j));
        }

        // foreach
        for (Integer k: variable){
            System.out.println(k);
        }

        // size
        System.out.println(variable.size());

    }
}
