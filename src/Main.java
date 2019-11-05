
public class Main {

	public static void main(String[] args) {

        Dosen dosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setNip("41227829930");
        dosen.setMatakuliah("PBO");

        mhs.setNama("Wildan Muhammad Fikri");
        mhs.setUmur(20);
        mhs.setNim("10118044");
        mhs.setKelas("IF-1");

        System.out.printf("NIP DOSEN\t: %s%n", dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        System.out.printf("%n%n");

        System.out.printf("NIM MAHASISWA\t: %s%n", mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
        System.out.println();

	}

}
