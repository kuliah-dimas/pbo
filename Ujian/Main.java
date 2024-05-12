
public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff("123716312", "Dimas", 1100000);
        Manager manager = new Manager("187623123", "Dimas Febriyanto", 10000000);
        Direktur direktur = new Direktur("187623123", "Dimas Febriyanto", 20000000);

        System.out.println("Gaji Staff: " + staff.hitungGaji());
        System.out.println("Gaji Manager: " + manager.hitungGaji());
        System.out.println("Gaji Direktur:" + direktur.hitungGaji());

    }
}

class Karyawan {
    private String id;
    private String nama;
    private int gaji;

    Karyawan(String id, String nama, int gaji) {
        this.id = id;
        this.nama = nama;
        this.gaji = gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gaji;
    }

    public int hitungGaji() {
        return getGaji();
    }
}

class Staff extends Karyawan {
    Staff(String id, String nama, int gaji) {
        super(id, nama, gaji);
    }

    @Override
    public int hitungGaji() {
        return super.getGaji();
    }
}

class Manager extends Karyawan {
    Manager(String id, String nama, int gaji) {
        super(id, nama, gaji);
    }

    @Override
    public int hitungGaji() {
        return super.getGaji();
    }

}

class Direktur extends Karyawan {
    Direktur(String id, String nama, int gaji) {
        super(id, nama, gaji);
    }

    @Override
    public int hitungGaji() {
        return super.getGaji();
    }
}
