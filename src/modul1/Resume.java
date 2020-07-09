package modul1;

import java.util.UUID;

public class Resume implements Cloneable {

    long uuid;


    public long getUuid() {
        return uuid;
    }

    public Resume() {
        UUID uuidToGet = UUID.randomUUID();
        uuid = uuidToGet.getLeastSignificantBits();
    }

    @Override
    public String toString() {
        return "id:" + uuid;
    }


}
