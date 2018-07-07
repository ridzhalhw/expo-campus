package com.re.threelevelexpandlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;


/**
 * Add in parent for more main category
 * Define array for genre (subcategory) for each parent category added
 * Define LinkedHasMap for each subcategory where key is subcategory name, and value is a string array
 */
public class Unair_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "S3",
            "S2",
            "Spesialis 2",
            "Spesialis 1",
            "Profesi",
            "S1",
            "D4",
            "D3"


    };

    /**
     * FAKULTAS S1-------------------------------------------------------
     */
    String[] S3 = new String[]{
            "Fakultas Pasca Sarjana",
            "Fakultas Kedokteran",
            "Fakultas Ekonomi & Bisnis",
            "Fakultas Hukum",
            "Fakultas Farmasi",
            "Fakultas Ilmu Sosial & Ilmu Politik",
            "Fakultas Kesehatan Masyarakat",
            "Fakultas Saintek",
            "Fakultas Kedokteran Hewan",
            "Fakultas Psikologi",

    };

    String[] S2 = new String[]{
            "Fakultas Pasca Sarjana",
            "Fakultas Kedokteran",
            "Fakultas Kedokteran Gigi",
            "Fakultas Ekonomi & Bisnis",
            "Fakultas Hukum",
            "Fakultas Farmasi",
            "Fakultas Ilmu Sosial & Ilmu Politik",
            "Fakultas Ilmu Budaya",
            "Fakultas Kesehatan Masyarakat",
            "Fakultas Saintek",
            "Fakultas Kedokteran Hewan",
            "Fakultas Keperawatan",
            "Fakultas Psikologi",

    };

    String[] Spl2 = new String[]{
            "Fakultas Kedokteran",

    };

    String[] Spl1 = new String[]{
            "Fakultas Kedokteran",
            "Fakultas Kedokteran Gigi",
            "Fakultas Farmasi"

    };
    String[] Profesi = new String[]{
            "Fakultas Kedokteran",
            "Fakultas Kedokteran Gigi",
            "Fakultas Ekonomi & Bisnis",
            "Fakultas Farmasi",
            "Fakultas Kedokteran Hewan",
            "Fakultas Keperawatan"

    };

    String[] S1 = new String[]{
            "Fakultas Kedokteran",
            "Fakultas Kedokteran Gigi",
            "Fakultas Ekonomi & Bisnis",
            "Fakultas Hukum",
            "Fakultas Farmasi",
            "Fakultas Ilmu Sosial & Ilmu Politik",
            "Fakultas Ilmu Budaya",
            "Fakultas Kesehatan Masyarakat",
            "Fakultas Saintek",
            "Fakultas Kedokteran Hewan",
            "Fakultas Keperawatan",
            "Fakultas Psikologi",
            "Fakultas Perikanan & Kelautan",
            "PDD BWI"

    };

    String[] D4 = new String[]{
            "Vokasi"

    };

    String[] D3 = new String[]{
            "Vokasi"

    };


    // Prodi Tiap Fakultas-------------------------------------------------------------------------
    //FC
    String[] FCS3 = new String[]{
            "Ilmu Ekonomi Islam (Akreditasi A)",
            "Pengembangan Sumber Daya Manusia (Akreditasi B)"
    };
    String[] FCS2 = new String[]{
            "Bioteknologi Perikanan dan Kelautan (Akreditasi B)",
            "Ilmu Forensik (Akreditasi B)",
            "Imunologi (Akreditasi B)",
            "Sains Hukum dan Pembangunan (Akreditasi B)",
            "Pengembangan Sumber Daya Manusia (Akreditasi A)",
            "Sains Ekonomi Islam (Akreditasi A)",
            "Manajemen Bencana (Akreditasi B)",
            "Teknobiomedik (Akreditasi B)",
            "Kajian Ilmu Kepolisian (Akreditasi C)"

    };

    //FK
    String[] FKS3 = new String[]{
            "Ilmu Kedokteran (Akreditasi A)"
    };
    String[] FKS2 = new String[]{
            "Ilmu Kedokteran Dasar (Akreditasi A)",
            "Ilmu Kedokteran Tropis (Akreditasi A)",
            "Ilmu Kesehatan Olah Raga (Akreditasi A)",
            "Ilmu Kesehatan Reproduksi (Akreditasi A)",
            "Ilmu Kedokteran Klinik (Akreditasi B)"

    };
    String[] FKSpl2 = new String[]{
            "Ilmu Penyakit Dalam",
            "Anestesiologi dan Reanimasi",
            "Obstetri dan Ginekologi",
            "Ilmu Kesehatan Anak",
            "Patalogi Klinik",
            "Psikiatri Anak dan Remaja",
            "Bedah Kepala Leher",
            "Bedah Digestif"

    };
    String[] FKSpl1 = new String[]{
            "Bedah Plastik Rekonstruksi dan Estetik (Akreditasi A)",
            "Ilmu Kesehatan Mata (Akreditasi B)",
            "Ilmu Penyakit Dalam (Akreditasi B)",
            "Neurologi (Akreditasi B)",
            "Ilmu Kesehatan Kulit dan Kelamin (Akreditasi A)",
            "Ilmu Kesehatan Telinga Hidung Tenggorok Bedah Kepala dan Leher (Akreditasi A)",
            "Anestesiologi dan Reanimasi (Akreditasi A)",
            "Ilmu Bedah (Akreditasi A)",
            "Obstetri dan Ginekologi (Akreditasi A)",
            "Pulmonologi dan Ilmu Kedokteran Respirasi (Akreditasi A)",
            "Ilmu Kedokteran Forensik dan Medikolegal (Akreditasi A)",
            "Ilmu Kesehatan Anak (Akreditasi A)",
            "Orthopaedi dan Traumatologi (Akreditasi A)",
            "Ilmu Kardiologi dan Kedokteran Vaskular (Akreditasi A)",
            "Patologi Anatomi (Akreditasi B)",
            "Patalogi Klinik (Akreditasi B)",
            "Ilmu Kedokteran Fisik dan Rehabilitasi (Akreditasi A)",
            "Radiologi (Akreditasi A)",
            "Psikiatri (Akreditasi A)",
            "Mikrobiologi klinik (Akreditasi A)",
            "Andrologi (Akreditasi B)",
            "Urologi (Akreditasi A)",
            "Bedah Thoraks Kardiovaskular (Akreditasi A)",
            "Ilmu Bedah saraf (Akreditasi A)",
            "Ilmu Bedah Anak"

    };
    String[] FKProfesi = new String[]{
            "Pendidikan Bidan",
            "Pendidikan Dokter (Akreditasi A)"

    };
    String[] FKS1 = new String[]{
            "Pendidikan Dokter (Akreditasi A)",
            "Pendidikan Bidan (Akreditasi A)"

    };
    //FKG
    String[] FKGS2 = new String[]{
            "Ilmu Kesehatan Gigi (Akreditasi B)"
    };
    String[] FKGSpl1 = new String[]{
            "Bedah Mulut dan Maksilofasial (Akreditasi A)",
            "Ilmu Penyakit Mulut (Akreditasi B)",
            "Ilmu Konservasi Gigi (Akreditasi A)",
            "Ilmu Kedokteran Gigi Anak (Akreditasi A)",
            "Periodonsia (Akreditasi B)",
            "Ortodonsia (Akreditasi A)",
            "Prostodonsia (Akreditasi A)"

    };
    String[] FKGProfesi = new String[]{
            "Pendidikan Dokter Gigi (Akreditasi A)"
    };
    String[] FKGS1 = new String[]{
            "Pendidikan Dokter Gigi (Akreditasi A)"
    };
    //FEB
    String[] FEBS3 = new String[]{
            "Ilmu Manajemen (Akreditasi B)",
            "Ilmu Akuntansi (Akreditasi B)",
            "Ilmu Ekonomi (Akreditasi B)"

    };
    String[] FEBS2 = new String[]{
            "Ilmu Ekonomi (Akreditasi A)",
            "Magister Manajemen (Akreditasi A)",
            "Akuntansi (Akreditasi A)",
            "Sains Manajemen (Akreditasi A)"

    };
    String[] FEBProfesi = new String[]{
            "Pendidikan Profesi Akuntansi (Akreditasi A)"
    };
    String[] FEBS1 = new String[]{
            "Ekonomi Islam (Akreditasi A)",
            "Ekonomi Pembangunan (Akreditasi A)",
            "Manajemen (Akreditasi A)",
            "Akuntansi (Akreditasi A)"
    };
    //FH
    String[] FHS3 = new String[]{
            "Ilmu Hukum (Akreditasi B)"
    };
    String[] FHS2 = new String[]{
            "Ilmu Hukum (Akreditasi A)",
            "Kenotariatan (Akreditasi B)"

    };
    String[] FHS1 = new String[]{
            "Ilmu Hukum (Akreditasi A)"
    };
    //FF
    String[] FFS3 = new String[]{
            "Ilmu Farmasi (Akreditasi A)"
    };
    String[] FFS2 = new String[]{
            "Ilmu Farmasi (Akreditasi A)",
            "Farmasi Klinik (Akreditasi B)"
    };
    String[] FFSpl1 = new String[]{
            "Spesialis Farmasi"
    };
    String[] FFProfesi = new String[]{
            "Pendidikan Apoteker (Akreditasi A)"
    };
    String[] FFS1 = new String[]{
            "Pendidikan Apoteker (Akreditasi A)"
    };
    //FISIP
    String[] FISIPS3 = new String[]{
            "Ilmu Ekonomi Islam (Akreditasi A)",
            "Pengembangan Sumber Daya Manusia (Akreditasi B)"
    };
    String[] FISIPS2 = new String[]{
            "Kebijakan Publik (Akreditasi A)",
            "Hubungan Internasional (Akreditasi B)",
            "Ilmu Politik (Akreditasi B)",
            "Sosiologi (Akreditasi A)",
            "Media dan Komunikasi (Akreditasi A)"
    };
    String[] FISIPS1 = new String[]{
            "Ilmu Administrasi Negara (Akreditasi A)",
            "Ilmu Hubungan Internasional (Akreditasi A)",
            "Ilmu Politik (Akreditasi A)",
            "Sosiologi (Akreditasi A)",
            "Ilmu Komunikasi (Akreditasi A)",
            "Ilmu Informasi dan Perpustakaan (Akreditasi A)",
            "Antropologi (Akreditasi A)"

    };
    //FIB
    String[] FIBS2 = new String[]{
            "Kajian Sastra dan Budaya (Akreditasi A)",
            "Ilmu Linguistik (Akreditasi B)"
    };
    String[] FIBS1 = new String[]{
            "Sastra Indonesia (Akreditasi A)",
            "Sastra Inggris (Akreditasi A)",
            "Sastra Jepang (Akreditasi B)",
            "Ilmu Sejarah (Akreditasi A)"

    };
    //FKM
    String[] FKMS3 = new String[]{
            "Ilmu Kesehatan (Akreditasi B)"
    };
    String[] FKMS2 = new String[]{
            "Ilmu Kesehatan Masyarakat (Akreditasi A)",
            "Kesehatan dan Keselamatan Kerja (Akreditasi A)",
            "Kesehatan Lingkungan (Akreditasi A)",
            "Administrasi Dan Kebijakan Kesehatan (Akreditasi A)",
            "Epidemiologi (Akreditasi A)"
    };
    String[] FKMS1 = new String[]{
            "Kesehatan Masyarakat (Akreditasi A)",
            "Ilmu Gizi (Akreditasi B)"
    };
    //FS
    String[] FSS3 = new String[]{
            "Matematika dan Ilmu Pengetahuan Alam (Akreditasi B)"
    };
    String[] FSS2 = new String[]{
            "Biologi (Akreditasi A)",
            "Kimia (Akreditasi B)"
    };
    String[] FSS1 = new String[]{
            "Teknobiomedik (Akreditasi B)",
            "Ilmu dan Teknologi Lingkungan (Akreditasi A)",
            "Matematika (Akreditasi A)",
            "Fisika (Akreditasi A)",
            "Biologi (Akreditasi A)",
            "Kimia (Akreditasi A)",
            "Sistem Informasi (Akreditasi A)",
            "Statistika (Akreditasi B)"

    };
    //FKH
    String[] FKHS3 = new String[]{
            "Sains Veteriner (Akreditasi B)"
    };
    String[] FKHS2 = new String[]{
            "Ilmu Biologi Reproduksi (Akreditasi A)",
            "Ilmu Penyakit dan Kesehatan Masyarakat Veteriner (Akreditasi A)",
            "Agribisnis Veteriner (Akreditasi A)",
            "Vaksinologi dan Imunoterapetika (Akreditasi A)"
    };
    String[] FKHProfesi = new String[]{
            "Profesi Dokter Hewan (Akreditasi A)"
    };
    String[] FKHS1 = new String[]{
            "Pendidikan Dokter Hewan (Akreditasi A)"
    };
    //FKep
    String[] FKepS2 = new String[]{
            "Keperawatan (Akreditasi B)"
    };
    String[] FKepProfesi = new String[]{
            "Pendidikan Ners (Akreditasi A)"
    };
    String[] FKepS1 = new String[]{
            "Pendidikan Ners (Akreditasi A)"
    };
    //FP
    String[] FPS3 = new String[]{
            "Psikologi (Akreditasi A)"
    };
    String[] FPS2 = new String[]{
            "Psikologi Terapan (Akreditasi B)",
            "Psikologi (Akreditasi B)",
            "Psikologi Profesi (Akreditasi A)"
    };
    String[] FPS1 = new String[]{
            "Psikologi (Akreditasi A)"
    };
    //FPK
    String[] FPKS1 = new String[]{
            "Budidaya Perairan (Akreditasi A)",
            "Teknologi Industri Hasil Perikanan"

    };
    //Vokasi
    String[] VokasiD4 = new String[]{
            "Pengobat Tradisional",
            "Fisioterapi",
            "Radiologi"

    };
    String[] VokasiD3 = new String[]{
            "Pengobat Tradisional (Akreditasi A)",
            "Fisioterapi (Akreditasi B)",
            "Analis Medis (Akreditasi B)",
            "Teknik Kesehatan Gigi (Akreditasi B)",
            "Manajemen Pemasaran (Akreditasi B)",
            "Manajemen Perbankan (Akreditasi A)",
            "Akuntansi (Akreditasi A)",
            "Perpajakan (Akreditasi A)",
            "Manajemen Kesekretariatan dan Perkantoran (Akreditasi B)",
            "Manajemen Perhotelan (Akreditasi A)",
            "Kepariwisataan / Bina Wisata (Akreditasi A)",
            "Teknisi Perpustakaan (Akreditasi A)",
            "Bahasa Inggris (Akreditasi B)",
            "Hiperkes dan Keselamatan Kerja (Akreditasi A)",
            "Otomasi Sistem Instrumentasi (Akreditasi B)",
            "Sistem Informasi (Akreditasi B)",
            "Kesehatan Ternak (Akreditasi A)"

    };
    //PDD
    String[] PDD = new String[]{
            "Akuntansi",
            "Budidaya Perairan",
            "Pendidikan Dokter Hewan",
            "Kesehatan Masyarakat"

    };

    //====================================================================================
    //setting level ke 3

    LinkedHashMap<String, String[]> thirdLevelS3 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS2 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelSpl2 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelSpl1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelProfesi = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelD4 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelD3 = new LinkedHashMap<>();


    //setting level ke 2

    List<String[]> secondLevel = new ArrayList<>();
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unair_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(S3);
        secondLevel.add(S2);
        secondLevel.add(Spl2);
        secondLevel.add(Spl1);
        secondLevel.add(Profesi);
        secondLevel.add(S1);
        secondLevel.add(D4);
        secondLevel.add(D3);

        //Isi Data Prodi ke Fakultas
        //S3
        thirdLevelS3.put(S3[0], FCS3);
        thirdLevelS3.put(S3[1], FKS3);
        thirdLevelS3.put(S3[2], FEBS3);
        thirdLevelS3.put(S3[3], FHS3);
        thirdLevelS3.put(S3[4], FFS3);
        thirdLevelS3.put(S3[5], FISIPS3);
        thirdLevelS3.put(S3[6], FKMS3);
        thirdLevelS3.put(S3[7], FSS3);
        thirdLevelS3.put(S3[8], FKHS3);
        thirdLevelS3.put(S3[9], FPS3);
        //S2
        thirdLevelS2.put(S2[0], FCS2);
        thirdLevelS2.put(S2[1], FKS2);
        thirdLevelS2.put(S2[2], FKGS2);
        thirdLevelS2.put(S2[3], FEBS2);
        thirdLevelS2.put(S2[4], FHS2);
        thirdLevelS2.put(S2[5], FFS2);
        thirdLevelS2.put(S2[6], FISIPS2);
        thirdLevelS2.put(S2[7], FIBS2);
        thirdLevelS2.put(S2[8], FKMS2);
        thirdLevelS2.put(S2[9], FSS2);
        thirdLevelS2.put(S2[10], FKHS2);
        thirdLevelS2.put(S2[11], FKepS2);
        thirdLevelS2.put(S2[12], FPS2);
        //Spl2
        thirdLevelSpl2.put(Spl2[0], FKSpl2);
        //Spl1
        thirdLevelSpl1.put(Spl1[0], FKSpl1);
        thirdLevelSpl1.put(Spl1[1], FKGSpl1);
        thirdLevelSpl1.put(Spl1[2], FFSpl1);
        //Profesi
        thirdLevelProfesi.put(Profesi[0], FKProfesi);
        thirdLevelProfesi.put(Profesi[1], FKGProfesi);
        thirdLevelProfesi.put(Profesi[2], FEBProfesi);
        thirdLevelProfesi.put(Profesi[3], FFProfesi);
        thirdLevelProfesi.put(Profesi[4], FKHProfesi);
        thirdLevelProfesi.put(Profesi[5], FKepProfesi);
        //S1
        thirdLevelS1.put(S1[0], FKS1);
        thirdLevelS1.put(S1[1], FKGS1);
        thirdLevelS1.put(S1[2], FEBS1);
        thirdLevelS1.put(S1[3], FHS1);
        thirdLevelS1.put(S1[4], FFS1);
        thirdLevelS1.put(S1[5], FISIPS1);
        thirdLevelS1.put(S1[6], FIBS1);
        thirdLevelS1.put(S1[7], FKMS1);
        thirdLevelS1.put(S1[8], FSS1);
        thirdLevelS1.put(S1[9], FKHS1);
        thirdLevelS1.put(S1[10], FKepS1);
        thirdLevelS1.put(S1[11], FPS1);
        thirdLevelS1.put(S1[12], FPKS1);
        thirdLevelS1.put(S1[13], PDD);
        //D4
        thirdLevelD4.put(D4[0], VokasiD4);
        //D3
        thirdLevelD3.put(D3[0], VokasiD3);


        //Tampilkan Semua Data
        data.add(thirdLevelS3);
        data.add(thirdLevelS2);
        data.add(thirdLevelSpl2);
        data.add(thirdLevelSpl1);
        data.add(thirdLevelProfesi);
        data.add(thirdLevelS1);
        data.add(thirdLevelD4);
        data.add(thirdLevelD3);



//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        Unair_ThreeLevelListAdapter threeLevelListAdapterAdapter = new Unair_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


        // set adapter
        expandableListView.setAdapter( threeLevelListAdapterAdapter );


        // OPTIONAL : Show one list at a time
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousGroup = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if (groupPosition != previousGroup)
                    expandableListView.collapseGroup(previousGroup);
                previousGroup = groupPosition;
            }
        });


    }
}
