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
public class UB_main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "S1",
            "D3"
    };

    /**
     * FAKULTAS S1-------------------------------------------------------
     */
    String[] S1 = new String[]{
            "Fakultas Hukum",
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Ilmu Administrasi",
            "Fakultas Pertanian",
            "Fakultas Peternakan",
            "Fakultas Teknik",
            "Fakultas Kedokteran",
            "Fakultas Perikanan dan Ilmu Kelautan",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Teknologi Pertanian",
            "Fakultas Ilmu Sosial dan Ilmu Politik",
            "Fakultas Ilmu Budaya",
            "Fakultas Kedokteran Hewan",
            "Fakultas Ilmu Komputer",
            "Fakultas Kedokteran Gigi"
    };

    //FAKULTAS D3-------------------------------------------------------

    String[] D3 = new String[]{
            "Vokasi"
    };

    // Prodi Tiap Fakultas-------------------------------------------------------------------------

    String[] FH = new String[]{
            " Ilmu Hukum (Akreditasi A)"
    };
    String[] FEB = new String[]{
            "Ekonomi Pembangunan (Akreditasi A)",
            "Ekonomi Islam (Akreditasi A)",
            "Ekonomi, Keuangan dan Perbankan (Baru)",
            "Manajemen (Akreditasi A)",
            "Kewirausahaan (Baru)",
            "Akuntansi (Akreditasi A)"

    };
    String[] FIA = new String[]{
            "Ilmu Administrasi Bisnis (Akreditasi A)",
            "Ilmu Administrasi Bisnis Minat Bisnis Internasional",
            "Pariwisata (Akreditasi B)",
            "Perpajakan (Akreditasi B)",
            "Ilmu Administrasi Publik (Akreditasi A)",
            "Ilmu Administrasi Publik minat Perencanaan Pembangunan",
            "Ilmu Administrasi Publik minat Administrasi Pemerintahan (Akreditasi B)",
            "Ilmu Perpustakaan (Akreditasi A)",
            "Ilmu Pendidikan"
    };
    String[] FPt = new String[]{
            "Agribisnis (Akreditasi A)",
            "Agroteknologi (Akreditasi A)"
    };
    String[] FP = new String[]{
            "Peternakan (Akreditasi A)"
    };
    String[] FT = new String[]{
            "Teknik Sipil (Akreditasi A)",
            "Teknik Mesin (Akreditasi A)",
            "Teknik Elektro (Akreditasi A)",
            "Teknik Pengairan (Akreditasi A)",
            "Arsitektur (Akreditasi A)",
            "Perencanaan Wilayah dan Kota (Akreditasi A)",
            "Teknik Industri (Akreditasi A)",
            "Teknik Kimia (Akreditasi A)"
    };
    String[] FK = new String[]{
            "Pendidikan Dokter (Akredasi A)",
            "Ilmu Keperawatan (Akreditasi B)",
            "Ilmu Gizi (Akreditasi B)",
            "Farmasi (Akreditasi B)",
            "Kebidanan (Akreditasi B)"
    };
    String[] FPIK = new String[]{
            "Manajemen Sumberdaya Perairan (Akreditasi B)",
            "Teknologi Hasil Perikanan (Akreditasi A)",
            "Budidaya Perairan (Akreditasi A)",
            "Pemanfaatan Sumberdaya Perikanan (Akreditasi A)",
            "Ilmu Kelautan (Akreditasi B)",
            "Agrobisnis Perikanan (Akreditasi B)"
    };
    String[] FMIPA = new String[]{
            "Biologi (Akreditasi A)",
            "Kimia (Akreditasi A)",
            "Fisika (Akreditasi A)",
            "Instrumentasi (Akreditasi B)",
            "Teknik Geofisika (Akreditasi B)",
            "Matematika (Akreditasi A)",
            "Statistika (Akreditasi A)"
    };
    String[] FTP = new String[]{
            "Ilmu dan Teknologi Pangan (Akreditasi A)",
            "Bioteknologi (Akreditasi A)",
            "Teknik Pertanian (Akreditasi A)",
            "Teknologi Bioproses (Akreditasi C)",
            "Teknik Lingkungan (Akreditasi A)",
            "Teknologi Industri Pertanian (Akreditasi A)"
    };
    String[] FISIP = new String[]{
            "Sosiologi (Akreditasi B)",
            "Ilmu Komunikasi (Akreditasi B)",
            "Psikologi (Akreditasi B)",
            "Hubungan Internasional (Akreditasi B)",
            "Ilmu Politik (Akreditasi B)",
            "Ilmu Pemerintahan (Akreditasi B)"
    };
    String[] FIB = new String[]{
            "Sastra Inggris (Akreditasi B)",
            "Sastra Jepang (Akreditasi A)",
            "Bahasa dan Sastra Perancis (Akreditasi B)",
            "Sastra Cina (Akreditasi B)",
            "Pendidikan Bahasa dan Sastra Indonesia (Akreditasi B)",
            "Pendidikan Bahasa Inggris (Akreditasi B)",
            "Pendidikan Bahasa Jepang (Akreditasi B)",
            "Seni Rupa Murni (Akreditasi B)",
            "Antropologi (Akreditasi B)"
    };
    String[] FKH = new String[]{
            "Pendidikan Dokter Hewan (Akreditasi B)"
    };
    String[] FILKOM = new String[]{
            "Teknik Informatika (Akreditasi B)",
            "Teknik Komputer (Akreditasi B)",
            "Sistem Informasi (Akreditasi B)",
            "Pendidikan Teknologi Informasi",
            "Teknologi Informasi"
    };
    String[] FKG = new String[]{
            "Kedokteran Gigi (Akreditasi B)"
    };
    String[] VOKASI = new String[]{
            "Manajemen Informatika",
            "Manajemen Informatika Bisnis dan Multimedia",
            "Teknologi Informasi dan Komputer",
            "Desain Komunikasi Visual",
            "Film dan Televisi",
            "Desain Interior",
            "Sekretaris",
            "Public Relations",
            "Perpustakaan dan Arsip",
            "Perancangan Peraturan dan Kontrak Bisnis",
            "Bahasa Inggris",
            "Pariwisata",
            "Perbankan",
            "Akuntansi Terapan"
    };


    //====================================================================================
    //setting level ke 3

    LinkedHashMap<String, String[]> thirdLevelS1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelD3 = new LinkedHashMap<>();


    //setting level ke 2

    List<String[]> secondLevel = new ArrayList<>();
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ub_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(S1);
        secondLevel.add(D3);

        //Isi Data Prodi ke Fakultas
        thirdLevelS1.put(S1[0], FH);
        thirdLevelS1.put(S1[1], FEB);
        thirdLevelS1.put(S1[2], FIA);
        thirdLevelS1.put(S1[3], FPt);
        thirdLevelS1.put(S1[4], FP);
        thirdLevelS1.put(S1[5], FT);
        thirdLevelS1.put(S1[6], FK);
        thirdLevelS1.put(S1[7], FPIK);
        thirdLevelS1.put(S1[8], FMIPA);
        thirdLevelS1.put(S1[9], FTP);
        thirdLevelS1.put(S1[10], FISIP);
        thirdLevelS1.put(S1[11], FIB);
        thirdLevelS1.put(S1[12], FKH);
        thirdLevelS1.put(S1[13], FILKOM);
        thirdLevelS1.put(S1[14], FKG);

        //VOKASI
        thirdLevelD3.put(D3[0], VOKASI);


        //Tampilkan Semua Data
        data.add(thirdLevelS1);
        data.add(thirdLevelD3);



//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        UB_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UB_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
