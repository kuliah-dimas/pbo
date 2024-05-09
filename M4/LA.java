public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        System.out.println("Saya mengakses field nama yang berisi " + hewan.getNama());
        System.out.println("Saya mengakses field umur yang berisi " + hewan.getUmur() + " tahun");
        System.out.println();
        hewan.display();

        hewan.setNama("anjing");
        hewan.setUmur(2);
        System.out.println();
        hewan.display();
    }
}

class Hewan {
    private String nama = "kucing";
    private int umur = 1;

    public void setNama(String nama) {
        System.out.println("Saya mengubah value field nama dari " + this.nama + " menjadi " + nama);
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        System.out.println("Saya mengubah value field umur dari " + this.umur + " menjadi " + umur);
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void display() {
        System.out.println("Saya seekor " + this.nama);
        System.out.println("Saya berumur " + this.umur + " tahun");
        System.out.println();
    }
}
