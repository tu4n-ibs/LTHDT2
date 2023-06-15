package onTapOOP;

import java.io.IOException;

public class AppRollRoyce {
    public static void main(String[] args) {
//        khởi tạo đối tượng
        RollRoyce rollRoyce1 = new RollRoyce("r1", "blue", "abc", 1, 1, 1, 1);
        RollRoyce rollRoyce2 = new RollRoyce("r2", "green", "def", 1, 1, 1, 1);
        RollRoyce rollRoyce3 = new RollRoyce("r3", "red", "ghk", 1, 1, 1, 1);
//        fileName
        String fileName = "supperData.txt";
//        tạo mảng
        RollRoyce[] rollRoyces = new RollRoyce[]{rollRoyce1, rollRoyce2, rollRoyce3};
//        khởi tạo 
        CRUDRollRoyce crudRollRoyce = new CRUDRollRoyce();
        try {
            crudRollRoyce.addRollRoyce(rollRoyce1);
            crudRollRoyce.addRollRoyceToFile(rollRoyce3, fileName);
            RollRoyce r = crudRollRoyce.getRollRoyceFromFile(fileName);
            System.out.println(r);

            System.out.println();
            crudRollRoyce.addRollRoyceListToFile(rollRoyces, fileName);
            RollRoyce[] rollRoyces1 = crudRollRoyce.getAllRollRoyceFromFile(fileName);
            for (RollRoyce p : rollRoyces1
            ) {
                System.out.println(p);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("loi ");
        }
    }
}
