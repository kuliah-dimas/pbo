public class Main2 {
    public static void main(String[] args) {
        Hewan hewan = new Hewan("Babi Hutan", "4");
        hewan.tampil();

        Hewan hewan2 = new Hewan("Duyung");
        hewan2.tampil();

        Ayam ayam = new Ayam("Jantan", "2");
        ayam.tampil();

        LumbaLumba lumbaLumba = new LumbaLumba("Orca");
        lumbaLumba.tampil();
    }
}

class Hewan {
    String nama;
    String kaki;

    Hewan(String nama, String kaki) {
        this.nama = nama;
        this.kaki = kaki;
    }

    Hewan(String nama) {
        this.nama = nama;
    }

    void tampil() {
        System.out.println("Saya hewan " + this.nama);

        if (this.kaki != null) {
            System.out.println("Saya hewan berkaki " + this.kaki);
        } else {
            System.out.println("Saya tidak memiliki kaki");
        }
    }

}

class Ayam extends Hewan {
    Ayam(String nama, String kaki) {
        super(nama, kaki);
    }

    @Override
    void tampil() {
        System.out.println("Saya hewan " + this.nama);
        System.out.println("Saya hewan berkaki " + this.kaki);
    }
}

class LumbaLumba extends Hewan {
    LumbaLumba(String nama) {
        super(nama);
    }

    @Override
    void tampil() {
        System.out.println("Saya hewan " + this.nama);
        System.out.println("Saya tidak memiliki kaki");
    }
}
