public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.showData();
    }
}

class Mahasiswa {
    String name = "Dimas Febriyanto";
    String kelas = "2IA21";
    String npm = "50422430";

    void showData() {
        System.out.println("Nama: " + name);
        System.out.println("Kelas: " + kelas);
        System.out.println("NPM: " + npm);
    }
}
