import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

class CivitasAkademik {
    protected String nama;

    public CivitasAkademik(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
}

class Dosen extends CivitasAkademik{
    public String nip;

    public Dosen(String nama, String nip){
        super(nama);
        this.nip = nip;
    }

    public String getNip(){
        return nip;
    }

    public void display(){
        System.out.println("Nama : " + nama);
        System.out.println("   NIP  : " + nip);
    }
}

class Mahasiswa extends CivitasAkademik{
    public String nim;

    public Mahasiswa(String nama, String nim){
        super(nama);
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public void display(){
        System.out.println("Nama : " + nama);
        System.out.println("   NIP  : " + nim);
    }
}

class Hari {
    protected String namaHari;

    public Hari(String namaHari){
        this.namaHari = namaHari;
    }

    public String getnamaHari(){
        return namaHari;
    }

    public void display(){
        System.out.println(namaHari);
    }
}

class MataKuliah{
    public String namaMK;
    public String kodeMK;

    public MataKuliah(String namaMK, String kodeMK){
        this.namaMK = namaMK;
        this.kodeMK = kodeMK;
    }

    public String getNamaMK(){
        return namaMK;
    }

    public String getKodeMK(){
        return kodeMK;
    }
    public void display(){
        System.out.println(namaMK);
    }
}

class Ruangan{
    public String namaRuangan;

    public Ruangan(String namaRuangan){
        this.namaRuangan = namaRuangan;
    }

    public String getNamaRuangan(){
        return namaRuangan;
    }

    public void display(){
        System.out.println(namaRuangan);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(new Mahasiswa("Akmal", "231511059"));
        daftarMahasiswa.add(new Mahasiswa("Azka", "231511035"));
        daftarMahasiswa.add(new Mahasiswa("Bandi", "231511037"));
        daftarMahasiswa.add(new Mahasiswa("Ilham", "231511043"));
        daftarMahasiswa.add(new Mahasiswa("Nalen", "231511054"));
        daftarMahasiswa.add(new Mahasiswa("Amar", "231511044"));
        daftarMahasiswa.add(new Mahasiswa("Ahmad", "231511054"));
        daftarMahasiswa.add(new Mahasiswa("Farhan", "231511052"));
        daftarMahasiswa.add(new Mahasiswa("Radja", "231511061"));
        daftarMahasiswa.add(new Mahasiswa("Hanif", "231511047"));

        List<Dosen> daftarDosen = new ArrayList<>();
        daftarDosen.add(new Dosen("Akmal", "82139812739128"));
        daftarDosen.add(new Dosen("Darajat", "82139812739128"));
        daftarDosen.add(new Dosen("Adiansyah", "82139812739128"));
        daftarDosen.add(new Dosen("Fadilah", "82139812739128"));
        daftarDosen.add(new Dosen("Praja", "82139812739128"));
        daftarDosen.add(new Dosen("Syahid", "82139812739128"));
        daftarDosen.add(new Dosen("Fauzan", "82139812739128"));
        daftarDosen.add(new Dosen("Maulana", "82139812739128"));
        daftarDosen.add(new Dosen("Restu", "82139812739128"));
        daftarDosen.add(new Dosen("Naufal", "82139812739128"));

        List<Hari> daftarHari = new ArrayList<>();
        daftarHari.add(new Hari("Senin"));
        daftarHari.add(new Hari("Selasa"));
        daftarHari.add(new Hari("Rabu"));
        daftarHari.add(new Hari("Kamis"));
        daftarHari.add(new Hari("Jumat"));

        List<MataKuliah> daftarMatkul = new ArrayList<>();
        daftarMatkul.add(new MataKuliah("PBO", "JTK01"));
        daftarMatkul.add(new MataKuliah("Basis Data", "JTK02"));
        daftarMatkul.add(new MataKuliah("PRPL", "JTK03"));
        daftarMatkul.add(new MataKuliah("DDP", "JTK04"));
        daftarMatkul.add(new MataKuliah("SDA", "JTK05"));

        List<Ruangan> daftarRuangan = new ArrayList<>();
        daftarRuangan.add(new Ruangan("D001"));
        daftarRuangan.add(new Ruangan("D002"));
        daftarRuangan.add(new Ruangan("D003"));
        daftarRuangan.add(new Ruangan("D004"));
        daftarRuangan.add(new Ruangan("D005"));

        System.out.println("Selamat Datang di Menu Akademik");
        System.out.println("Silakan Pilih Opsi");
        System.out.println("1. Daftar Dosen");
        System.out.println("2. Daftar Mahasiswa");
        System.out.println("3. Jadwal Perkuliahan");
        System.out.print("Pilihan : ");
        String pil = in.nextLine();

        int i = 1;
        int j = 1;
        MataKuliah matkul;
        Ruangan ruang;
        switch (pil){
            case "1":
                for(Dosen dos : daftarDosen){
                    System.out.print(i + ". ");
                    dos.display();
                    i++;
                }
                break;
            case "2":
                for(Mahasiswa mhs : daftarMahasiswa){
                    System.out.print(j + ". ");
                    mhs.display();
                    j++;
                }
                break;
            case "3":
                System.out.println("Daftar Jadwal perkuliahan");

                for(Hari day : daftarHari){
                    int matkul1 = rand.nextInt(daftarMatkul.size());
                    int ruang1 = rand.nextInt(daftarRuangan.size());
                    int dosen1 = rand.nextInt(daftarDosen.size());

                    int matkul2 = rand.nextInt(daftarMatkul.size());
                    int ruang2 = rand.nextInt(daftarRuangan.size());
                    int dosen2 = rand.nextInt(daftarDosen.size());

                    int matkul3 = rand.nextInt(daftarMatkul.size());
                    int ruang3 = rand.nextInt(daftarRuangan.size());
                    int dosen3 = rand.nextInt(daftarDosen.size());

                    day.display();
                    System.out.println(" Mata Kuliah     Dosen     Ruangan");
                    System.out.printf(" -%-15s%-10s%s%n",
                            daftarMatkul.get(matkul1).getNamaMK(),
                            daftarDosen.get(dosen1).getNama(),
                            daftarRuangan.get(ruang1).getNamaRuangan());
                    System.out.printf(" -%-15s%-10s%s%n",
                            daftarMatkul.get(matkul2).getNamaMK(),
                            daftarDosen.get(dosen2).getNama(),
                            daftarRuangan.get(ruang2).getNamaRuangan());
                    System.out.printf(" -%-15s%-10s%s%n",
                            daftarMatkul.get(matkul3).getNamaMK(),
                            daftarDosen.get(dosen3).getNama(),
                            daftarRuangan.get(ruang3).getNamaRuangan());
                }
                break;
        }
    }
}