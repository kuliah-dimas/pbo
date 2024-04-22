class Kampus {
    String nama;

    Kampus(String nama) {
        this.nama = nama;
    }

    void tampil() {
        System.out.println("Hello, saya " + this.nama);
    }
}

class Mahasiswa extends Kampus {
    String kelas, npm;

    Mahasiswa(String nama, String kelas, String npm) {
        super(nama);
        this.kelas = kelas;
        this.npm = npm;
    }

    @Override
    void tampil() {
        super.tampil();
        System.out.println("Saya kelas " + this.kelas);
        System.out.println("NPM saya " + this.npm);
        System.out.println("Saya adalah seorang mahasiswa");
    }
}

class Dosen extends Kampus {
    String matkul, id;

    Dosen(String nama, String matkul, String id) {
        super(nama);
        this.matkul = matkul;
        this.id = id;
    }

    @Override
    void tampil() {
        super.tampil();
        System.out.println("Saya mengajar matkul " + this.matkul);
        System.out.println("ID saya adalah " + this.id);
        System.out.println("Saya adalah Seorang Dosen");
    }
}

public class Act1Pert2 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Dimas", "31A21", "50422430");
        Dosen dosen = new Dosen("Bambang", "Indonesia", "5555");

        mahasiswa.tampil();
        System.out.println();
        dosen.tampil();
    }
}

