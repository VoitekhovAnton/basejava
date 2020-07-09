package modul1;

public class Resume implements Cloneable {

    int uuid;
    static int objID;

    public int getUuid() {
        return uuid;
    }

    public Resume() {
        uuid = objID + 1;
        objID++;
    }

    @Override
    public String toString() {
        return "id:" + uuid;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
