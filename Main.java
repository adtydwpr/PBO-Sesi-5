public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("        INPUT DATA NILAI MAHASISWA  ");
        System.out.println("========================================");
        Data_Mahasiswa nim1 = new Data_Mahasiswa();
        nim1.set_nim(20210040181);
        System.out.println("NIM          : " + nim1.get_nim());
        Data_Mahasiswa nama1 = new Data_Mahasiswa();
        nama1.set_nama("ADITO");
        System.out.println("NAMA         : " + nama1.get_nama());
        Data_Mahasiswa alamat1 = new Data_Mahasiswa();
        alamat1.set_alamat("SUKABUMI,BAROS");
        System.out.println("ALAMAT       : " + alamat1.get_alamat());
        Data_Mahasiswa universitas1 = new Data_Mahasiswa();
        universitas1.set_univ("NUSA PUTRA UNIVERSITY");
        System.out.println("UNIVERSITAS  : " + universitas1.get_univ());
        // buat objek Scanner untuk input data yang dibutuhkan
        Scanner mapel = new Scanner(System.in);
        Scanner dosen = new Scanner(System.in);
        Scanner inputNilai = new Scanner(System.in);
        Scanner jmlmapel = new Scanner(System.in);
        System.out.println("========================================");
        System.out.print("MASUKAN JUMLAH MAPEL: ");
        int jumlahmapel = jmlmapel.nextInt();
        if (jumlahmapel == 0) {
            System.out.println("TERIMA KASIH");
            System.exit(1);
        }
        // buat looping untuk menginput data (sesuai jumlah data yang diinput)
        int nil = 0;
        int i = 1;
        ArrayList mapelList = new ArrayList<>();
        ArrayList dosen2 = new ArrayList<>();
        ArrayList nilai2 = new ArrayList<>();
        ArrayList grade2 = new ArrayList<>();

        while (i > 0 && i <= jumlahmapel) {
            System.out.println("----------------------------");
            System.out.println("MAPEl KE-" + i);
            System.out.println("----------------------------");
            System.out.print("MASUKAN MATA PELAJARAN : ");
            String matapelajaran = mapel.nextLine();
            mapelList.add(matapelajaran);
            System.out.print("MASUKAN NAMA DOSEN     : ");
            String namadosen = dosen.nextLine();
            dosen2.add(namadosen);
            System.out.print("MASUKAN NILAI          : ");
            int nilaiMhs = inputNilai.nextInt();
            nilai2.add(nilaiMhs);
            System.out.println("----------------------------\n");
            nil += nilaiMhs;
            i++;
        }
        mapel.close();
        dosen.close();
        inputNilai.close();
        jmlmapel.close();
        int rata = nil / jumlahmapel;
        String grade;
        if (rata <= 100 && rata >= 80) {
            grade = "LULUS";
            grade2.add(grade);
        } else if (rata <= 79 && rata >= 70) {
            grade = "LULUS";
            grade2.add(grade);
        } else if (rata <= 69 && rata >= 60) {
            grade = "LULUS";
            grade2.add(grade);
        } else if (rata <= 59 && rata >= 50) {
            grade = "TIDAK LULUS";
            grade2.add(grade);
        } else if (rata < 50 && rata >= 0) {
            grade = "TIDAK LULUS";
            grade2.add(grade);
        } else {
            System.out.println("Input nilai anda salah!");
        }
        System.out.println("========================================");
        System.out.println("SELAMAT DATANG APLIKASI NILAI MAHASISWA");
        System.out.println("========================================");
        System.out.println("NIM             : " + nim1.get_nim());
        System.out.println("NAMA            : " + nama1.get_nama());
        System.out.println("ALAMAT          : " + alamat1.get_alamat());
        System.out.println("UNIVERSITAS     : " + universitas1.get_univ());
        System.out.println("-----------------------------------------");
        System.out.println("JUMLAH MAPEL    : " + jumlahmapel);
        System.out.println("MATA PELAJARAN  : " + mapelList);
        System.out.println("DOSEN           : " + dosen2);
        System.out.println("NILAI           : " + nilai2);
        System.out.println("RATA-RATA       : " + rata);
        System.out.println("KETERANGAN      : " + grade2);
        System.out.println("-----------------------------------------");

    }
}
