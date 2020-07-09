package modul1;

public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size;   //Количестов резюме в массиве

    public int getSize() {
        return size;
    }

    public void save(Resume r) {
        if (size < storage.length) {
            storage[size] = r;
            size++;
        } else {
            System.out.println("Массив заполнен полностью");
        }


    }       // Добавление элемента в массив

    public void clear() {

        for (int i = 0; i < size; i++) {
            storage[i] = null;
            size--;
        }

    }              // Удалеие массива из памяти

    public Resume[] getAll() {
        Resume[] allResume = new Resume[size];
        for (int i = 0; i < size; i++) {
            allResume[i] = (Resume) storage[i];
        }
        return allResume;
    }

    public Resume get(int uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid() == uuid) {
                return storage[i];
            }
        }
        return null;
    }        // Возвращает резюме по id

    public void delete(int uuid) {
        for (int i = 0; i < size; i++) { // Ищем элемент с нужным id
            if (storage[i].getUuid() == uuid) {
                for (int j = i; j < size; j++) { // Сдвигаем массив влево на 1 элемент ,
                    storage[j] = storage[j + 1];
                }
                size--;
                System.out.println("Элемента с id " + uuid + " удалён");
                return;
            }
        }
        System.out.println("Элемента с id " + uuid + "- нет в массиве");
    }



}     // Удаление элемента из массива

