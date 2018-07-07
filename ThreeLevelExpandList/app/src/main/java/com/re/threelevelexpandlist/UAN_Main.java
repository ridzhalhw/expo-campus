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
public class UAN_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "D3",
            "S1",
            "Spesialis",
            "S2",
            "S3"
    };

    String[] D3 = new String[]{
        "Fakultas Ekonomi"
    };

    String[] S1 = new String[]{
            "Fakultas Pertanian",
            "Fakultas Teknologi Pertanian",
            "Fakultas Kedokteran",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Farmasi",
            "Fakultas Hukum",
            "Fakultas Ekonomi",
            "Fakultas Peternakan",
            "Fakultas Sastra",
            "Fakultas Teknik",
            "Fakultas Ilmu Sosial dan Politik"
    };

    String[] Spl = new String[]{
            "Program Studi"
    };

    String[] S2 = new String[]{
            "Program Studi"
    };

    String[] S3 = new String[]{
            "Program Studi"
    };

    String[] FED3 = new String[]{
            "Program Studi Pemasaran (Akreditasi B)",
            "Program Studi Akuntansi (Akreditasi B)",
            "Program Studi Kesekretariatan & Manajemen Perkantoran (Akreditasi C)",
            "Program Studi Keuangan Perbankkan (Akreditasi B)",
            "Program Studi Keuangan Negara & Daerah (Akreditasi B)"
    };

    String[] FPtS1 = new String[]{
            "Jurusan Agronomi (akreditasi B)",
            "Jurusan Pemuliaan Tanaman (akreditasi B)",
            "Jurusan Ilmu Tanah (akreditasi A)",
            "Jurusan Sosial Ekonomi Pertanian (Agribisnis) (akreditasi B)",
            "Jurusan Penyuluhan dan Komunikasi Pertanian",
            "Jurusan Ilmu Hama dan Penyakit Tanaman (akreditasi B)",
            "Jurusan Budidaya Pertanian (akreditasi B)"
    };

    String[] FTPS1 = new String[]{
            "Jurusan Teknologi Pertanian(akreditasi B)",
            "Jurusan Teknik Pertanian (akreditasi B)"
    };

    String[] FKS1 = new String[]{
            "Program Pendidikan Dokter Umum(akreditasi A)",
            "Program Studi Ilmu Keperawatan",
            "Program Studi Ilmu Kesehatan Masyarakat (akreditasi C)",
            "Program Studi Pendidikan Dokter Gigi (Akreditasi C)",
            "Program Studi Psikologi (Akreditasi C)"
    };

    String[] FMIPAS1 = new String[]{
            "Jurusan Kimia (akreditasi A)",
            "Jurusan Matematika (akreditasi B)",
            "Program Studi Sistem Komputer (Akreditasi C)",
            "Jurusan Fisika (akreditasi B)",
            "Jurusan Biologi (akreditasi A)"
    };

    String[] FFS1 = new String[]{
            "Program Reguler Farmasi (akreditasi A)",
            "Program Ekstensi Farmasi"
    };

    String[] FHS1 = new String[]{
            "Program Reguler Ilmu Hukum (akreditasi A)",
            "Program Ekstensi Ilmu Hukum"
    };

    String[] FES1 = new String[]{
            "Jurusan Ekonomi Pembangunan (akreditasi A)",
            "Jurusan Manajemen (akreditasi A)",
            "Jurusan Akuntansi (akreditasi A)"
    };

    String[] FPS1 = new String[]{
            "Jurusan Produksi Ternak (akreditasi A)",
            "Jurusan Nutrisi dan Makanan Ternak (akreditasi A)",
            "Jurusan Teknologi Hasil Ternak (akreditasi A)",
            "Sosial Ekonomi Peternakan (akreditasi A)",
            "Ilmu peternakan (Akreditasi A)"
    };

    String[] FSS1 = new String[]{
            "Jurusan Ilmu Sejarah (akreditasi B)",
            "Jurusan Sastra Inggris (akreditasi A)",
            "Jurusan Sastra Bahasa Indonesia (akreditasi A)",
            "Jurusan Sastra Jepang (Akreditasi A)",
            "Jurusan Sastra Minangkabau (akreditasi B)"
    };

    String[] FTS1 = new String[]{
            "Jurusan Teknik Industri (akreditasi B)",
            "Jurusan Teknik Elektro (akreditasi B)",
            "Jurusan Teknik Mesin (akreditasi A)",
            "Jurusan Teknik Lingkungan (akreditasi B)",
            "Jurusan Teknik Sipil (akreditasi B)"
    };

    String[] FISIPS1 = new String[]{
            "Jurusan Ilmu Politik (akreditasi B)",
            "Jurusan Sosiologi (akreditasi B)",
            "Jurusan Antropologi Sosial (akreditasi A)",
            "Jurusan Administrasi Negara (Akreditasi B)",
            "Program Studi Hubungan International (Akreditasi B)",
            "Jurusan Ilmu Komunikasi (Akreditasi B)"
    };

    String[] Spesialis = new String[]{
            "Ilmu Bedah",
            "IIlmu Kesehatan Anak",
            "Ilmu Kesehatan Telinga Hidung Tenggorok Bedah Kepala Leher (THT-KL)",
            "Ilmu Penyakit Dalam",
            "Kulit dan Kelamin",
            "Mata",
            "Neurologi",
            "Obstetri dan Ginekologi",
            "Patologi Anatomi",
            "Patologi Klinik",
            "Pulmonologi"
    };

    String[] Pasca = new String[]{
            "Program Studi Biologi (akreditasi B)",
            "Program Studi Kimia (akreditasi B)",
            "Program Studi Matematika (Akreditasi c)",
            "Program Studi Fisika (Akreditasi C)",
            "Program Studi Farmasi (Akreditasi B)",
            "Program Studi Biomedik",
            "Program Studi Kesehatan Masyarakat (Akreditasi B)",
            "Program Studi Perencanaan Pembangunan (akreditasi A)",
            "Program Studi Pembangunan Wilayah dan Pedesaan (akreditasi B)",
            "Program Studi Ilmu Hukum (Akreditasi B)",
            "Program Magister Kenotariatan (Akreditasi B)",
            "Program Studi Ilmu Peternakan (akreditasi A)",
            "Program Studi Ilmu Tanah (akreditasi Unggul)",
            "Program Studi Ilmu Hama dan Penyakit Tanaman (Akreditasi B)",
            "Program Studi Budidaya Pertanian ",
            "Program Studi Agronomi (akreditasi B)",
            "Program Studi Ilmu Lingkungan (Akreditasi B)",
            "Program Studi Teknologi Hasil Pertanian (Akreditasi B)",
            "Program Studi Pengelolaan Terpadu Sumber Daya Alam (Akreditasi B)",
            "Program Studi Ilmu Linguistik Kebudayaan (Akreditasi B)",
            "Program Studi Ketahanan Pangan dan Gizi",
            "Program Studi POLOKDA",
            "Program Studi Teknik Sipil (Akreditasi B)",
            "Program Magister Managemen (Akreditasi A)",
            "Program Studi Teknik Mesin (Akreditasi B)",
            "Program Studi Ilmu Sejarah (Akreditasi B)",
            "Program Studi Sosiologi (Akreditasi B)",
            "Program Magister Akuntansi (Akreditasi B)",
            "Program Studi Pembangunan Perumahan dan Pemukiman"
    };

    String[] Doktor = new String[]{
            "Program Studi Ilmu Biomedik (Akreditasi B)",
            "Program Studi Agronomi ",
            "Program Studi Ilmu Tanah",
            "Program Studi Ilmu Kimia (Akreditasi B)",
            "Program Studi Biologi (Akreditasi C)",
            "Program Ilmu-ilmu Peternakan",
            "Program Ilmu Hama dan Penyakit Tanaman",
            "Program Ilmu Pembangunan Pertanian (Akreditasi B)",
            "Program Ilmu Ekonomi (Akreditasi B)",
            "Program Ilmu Hukum (Akreditasi B)"
    };

    //====================================================================================
    //setting level ke 3

    LinkedHashMap<String, String[]> thirdLevelD3 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelSpl = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS2 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS3 = new LinkedHashMap<>();

    //setting level ke 2

    List<String[]> secondLevel = new ArrayList<>();
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uan_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(D3);
        secondLevel.add(S1);
        secondLevel.add(Spl);
        secondLevel.add(S2);
        secondLevel.add(S3);

        //Isi Data Prodi ke Fakultas
        //D3
        thirdLevelD3.put(D3[0], FED3);

        //S1
        thirdLevelS1.put(S1[0], FPtS1);
        thirdLevelS1.put(S1[1], FTPS1);
        thirdLevelS1.put(S1[2], FKS1);
        thirdLevelS1.put(S1[3], FMIPAS1);
        thirdLevelS1.put(S1[4], FFS1);
        thirdLevelS1.put(S1[5], FHS1);
        thirdLevelS1.put(S1[6], FES1);
        thirdLevelS1.put(S1[7], FPS1);
        thirdLevelS1.put(S1[8], FSS1);
        thirdLevelS1.put(S1[9], FTS1);
        thirdLevelS1.put(S1[10], FISIPS1);

        //Profesi
        thirdLevelSpl.put(Spl[0], Spesialis);

        //S2
        thirdLevelS2.put(S2[0], Pasca);

        //S3
        thirdLevelS3.put(S3[0], Doktor);

        data.add(thirdLevelD3);
        data.add(thirdLevelS1);
        data.add(thirdLevelSpl);
        data.add(thirdLevelS2);
        data.add(thirdLevelS3);

//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        UAN_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UAN_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
