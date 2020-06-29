package modul1;

public class ArrayStorage  {
    Resume [] arr = new Resume[10000];
    int size;   //Количестов резюме в массиве

    public int getSize() {
        return size;
    }
    public void save(Resume r){
        if(size<arr.length){
            arr[size] = r;
            size++;
        }
        else
            System.out.println("Массив заполнен полностью");

    }       // Добавление элемента в массив
    /*public void delete(Resume r){
       for (int i = 0; i<=size;i++){
           if(r.equals(arr[i])){
               for (int j = i;j<size;j++){ // Сдвигаем массив влево на 1 элемент ,
                   arr[i] = arr[i+1];
               }
               size--;
               System.out.println("Элемент: "+r.toString()+" - удалён");
               return;
           }
       }
        System.out.println("Элемента: "+r.toString()+" - нет в массиве");
    }     // Удаление элемента из массива*/
    public boolean find(Resume r){
    if (size>0){
        for (int i = 0;i<size;i++){
            if(r.equals(arr[i]))
                return true;
        }
    }
    return  false;
    }    // Поиск элемента в массиве
    public ArrayStorage clear(){

        return null;
    }              // Удалеие массива из памяти
    public void showAll(){
        for (int i = 0; i<size;i++){
            System.out.println(arr[i].toString());
        }
    }             // Вывод массива
    public Resume [] getAll(){
        Resume [] allResume = new Resume[size];
        for(int i = 0;i<size;i++){
            try {
                allResume[i] = (Resume) arr[i].clone();
            }catch (CloneNotSupportedException e){
            }
        }

        return allResume;
    }
    public Resume get(int id){
        for (int i =0;i<size;i++){
            if (arr[i].getId()==id)
                return arr[i];
        }
        return null;
    }        // Возвращает резюме по id
    public void delete(int id){
        for (int i = 0;i<size;i++){ // Ищем элемент с нужным id
            if(arr[i].getId()==id){
                for (int j = i;j<size;j++){ // Сдвигаем массив влево на 1 элемент ,
                    arr[j] = arr[j+1];
                }
                size--;
                System.out.println("Элемента с id "+ id + " удалён");
                return;
            }
        }
        System.out.println("Элемента с id "+  id +"- нет в массиве");
        }

    }     // Удаление элемента из массива

