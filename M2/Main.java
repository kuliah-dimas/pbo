public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs2 = new Mahasiswa(null, "2IA21", "50422430");
        mhs2.tampil();

        Mahasiswa mhs = new Mahasiswa("Dimas", "2IA21", "50422430");
        mhs.tampil();
    }
}

class Mahasiswa {

    String nama;
    String kelas;
    String npm;

    Mahasiswa(String nama, String kelas, String npm) {
        this.nama = nama;
        this.kelas = kelas;
        this.npm = npm;
    }

    void tampil() {

        if (this.nama.equals("")) {
            System.out.println("Saya tidak memiliki nama.");
        }

        System.out.println(this.nama);
        System.out.println(this.kelas);
        System.out.println(this.npm);
        System.out.println();
    }
}
