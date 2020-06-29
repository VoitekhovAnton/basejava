package modul1;

public class Resume implements Cloneable  {
    String name;
    int age;
    int experinceOfWork;
    int id;
    static int objID;

    public int getId() {
        return id;
    }

    public  Resume(String Name, int Age, int ExperinceOfWork){
        setName(Name);
        setAge(Age);
        setExperinceOfWork(ExperinceOfWork);
        id = objID+1;
        objID++;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int value) {
        if (value>0)
            this.age = value;
        else
            System.out.println("Вам мало лет");

    }

    public int getExperinceOfWork() {
        return experinceOfWork;
    }
    public void setExperinceOfWork(int value) {
        if(value>=0)
            this.experinceOfWork = value;
        else
            System.out.println("Опыт работы не может быть отрицательным");

    }

    public String getName() {
        return name;
    }
    public void setName(String value) {
        this.name = value;
    }

    @Override
    public boolean equals(Object obj){
        if (obj!=null && obj.getClass()==this.getClass()){
            obj = (Resume)obj;
            if (((Resume) obj).name==name && ((Resume) obj).age == age && ((Resume) obj).experinceOfWork==experinceOfWork)
                return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Имя:"+name+" Возраст:" + age + " Опыт работы:" + experinceOfWork;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
