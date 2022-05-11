public class FuncArray {

    // функция, которая возвращает массив
    public static void main(String[] args) {
        int [] numbers = {12,23,324,21,45,567,78,76,324,43,564,78,678,342};
        int [] newArr = getEvens(numbers); // привязываем новый массив к подфункции getEvens
        for (int v: newArr){ // чтобы вывести весь массив, задаем массиву переменную и ее выводи на экран
            System.out.println(v);
        }

    }

    // int[] getEvens - говорит  том, что мы возвращаем массив
    public static int[] getEvens(int [] arr){

        // находим сколько элементов будет в новом массиве
        int count = 0;  // задаем переменную
        for (int s: arr){ // задаем массиву переменную (берем число из массива)
            if (s%2==0){ //  проверка условия
                count++; // берем следующий индекс

         /* count = 0, далее берем переменную из массива и проверяем ее на условия.
         Если выражение верное, то к count прибавляется один. Далее берется следующая переменная массива.
         Если оно не верное, то к count ничего не прибавляется и далее берется следующая переменная из массива
         Из этого делаем вывод, что count равняется количеству чисел в новом массиве */

            }
        }

        // создаем массив и вносим в него элементы, удовлетворяющие условию
        int [] event = new int[count]; // создаем новый массив с колличеством найденным выше
        int index = 0; // начальная точка элементов в массиве или их индекс
        for (int k: arr){ // задаем массиву переменную (берем число из массива)
            if(k%2==0){  // проверка условия
                event [index] = k; // если условияе верно, то добавляем данное число в новый массив
                index++; // берем следующий индекс
            }
        }
        return event; // возвращение массива

    }
}
