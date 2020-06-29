package modul1;

public class MainTestArrayStorage {
    // Класс для генерации данных
    static String [] nameArr = {"Aнтон","Никита","Максим","Иван","Егор","Андрей"};
    static int [] ageArr = {16,17,22,34,21,27};
    static int [] experArr = {1,2,3,5,8,13};
    static int rndNumber(){
        int number = (int)(Math.random()*6);
        return number;
    } // Рандомный индекс для массивов
    public static Resume CreateNewResume(){ // Создание резюме
        return new Resume(nameArr[rndNumber()],ageArr[rndNumber()],experArr[rndNumber()]);
    }
    public static void FillArr(int l,ArrayStorage ar){
        for (int i =0;i<l;i++){
            ar.save(CreateNewResume());
        }
    }

}
