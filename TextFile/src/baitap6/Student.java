package baitap6;

import java.io.*;

public class Student implements Serializable{
    String id;
    String name;
    int diemToan;
    int diemLy;
    int diemHoa;

    public Student(String id, String name, int diemToan, int diemLy, int diemHoa) {
        this.id = id;
        this.name = name;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public int getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }

    public int getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }

    public String toString() {
        return "id: " + id
                + "name: " + name
                + "điểm toám: " + diemToan
                + "điểm lý: " + diemLy
                + "điểm hóa" + diemHoa;
    }


}
