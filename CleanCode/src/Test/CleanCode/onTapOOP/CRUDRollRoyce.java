package onTapOOP;

import java.io.*;
import java.util.Arrays;

public class CRUDRollRoyce {
    RollRoyce[] rollRoyces;
    static int numberOfRollRoyce;

    public CRUDRollRoyce() {
        rollRoyces = new RollRoyce[100];
        numberOfRollRoyce = 0;
    }

    public boolean addRollRoyce(RollRoyce objrollRoyce) {
        rollRoyces[numberOfRollRoyce++] = objrollRoyce;
        return true;
    }

    public boolean addRollRoyceToFile(RollRoyce objRollRoyce, String filename) throws IOException {
        FileOutputStream fileoutputStream = new FileOutputStream(filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileoutputStream);
        objectOutputStream.writeObject(objRollRoyce);
        objectOutputStream.close();
        fileoutputStream.close();
        return true;
    }

    public RollRoyce getRollRoyceFromFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        RollRoyce rollRoyce = (RollRoyce) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return rollRoyce;
    }

    public boolean addRollRoyceListToFile(RollRoyce[] objRollRoyce, String filename) throws IOException {
        FileOutputStream fileoutputStream = new FileOutputStream(filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileoutputStream);
        objectOutputStream.writeObject(objRollRoyce);
        objectOutputStream.close();
        fileoutputStream.close();
        return true;
    }

    public RollRoyce[] getAllRollRoyceFromFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        RollRoyce[] rollRoyce = (RollRoyce[]) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return rollRoyce;
    }

}
