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
public class UGM_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "S1",
    };

    /**
     * FAKULTAS S1-------------------------------------------------------
     */
    String[] S1 = new String[]{
            "Fakultas Biologi",
            "Fakultas Ekonomika dan Bisnis",
            "Fakultas Farmasi",
            "Fakultas Filsafat",
            "Fakultas Geografi",
            "Fakultas Hukum",
            "Fakultas Ilmu Budaya",
            "Fakultas ISPOL",
            "Fakultas Kedokteran",
            "Fakultas Kedokteran Gigi",
            "Fakultas Kedokteran Hewan",
            "Fakultas Kehutanan",
            "Fakultas MIPA",
            "Fakultas Pertanian",
            "Fakultas Peternakan",
            "Fakultas Psikologi",
            "Fakultas Teknik",
            "Fakultas Teknologi Pertanian"
    };

    //FAKULTAS D3-------------------------------------------------------
/*
    String[] D3 = new String[]{
            "Vokasi"
    };
*/
    // Prodi Tiap Fakultas-------------------------------------------------------------------------

    String[] FB = new String[]{
            " Biologi (Akreditasi A)"
    };
    String[] FEB = new String[]{
            "Ilmu Ekonomi (Akreditasi A)",
            "Manajemen (Akreditasi A)",
            "Akuntansi (Akreditasi A)"

    };
    String[] FF = new String[]{
            "Farmasi (Akreditasi A)"
    };
    String[] FFil = new String[]{
            "Ilmu Filsafat (Akreditasi A)"
    };
    String[] FG = new String[]{
            "Geografi dan Ilmu Lingkungan (Akreditasi A)",
            "Kartografi dan Penginderaan Jauh (Akreditasi A)",
            "Pembangunan Wilayah (Akreditasi A)",
    };
    String[] FH = new String[]{
            "Ilmu Hukum (Akreditasi A)"
    };
    String[] FIB = new String[]{
            "Antropologi Budaya (Akredasi A)",
            "Arkeologi (Akreditasi A)",
            "Bahasa Korea (Akreditasi B)",
            "Ilmu Sejarah (Akreditasi A)",
            "Pariwisata (Akreditasi B)",
            "Sastra Arab (Akreditasi A)",
            "Sastra Indonesia (Akreditasi A)",
            "Sastra Inggris (Akreditasi A)",
            "Sastra Jepang (Akreditasi A)",
            "Sastra Nusantara",
            "Sastra Jawa (Akreditasi A)",
            "Sastra Perancis (Akreditasi B)"
    };
    String[] FISIPOL = new String[]{
            "Manajemen dan Kebijakan Publik (Akreditasi A)",
            "Ilmu Hubungan Internasional (Akreditasi A)",
            "Ilmu Komunikasi (Akreditasi A)",
            "Ilmu Pembangunan Sosial dan Kesejahteraan (Akreditasi A)",
            "Politik dan Pemerintahan (Akreditasi A)",
            "Sosiologi (Akreditasi A)"
    };
    String[] FK = new String[]{
            "Gizi Kesehatan (Akreditasi A)",
            "Ilmu Keperawatan (Akreditasi A)",
            "Pendidikan Dokter (Akreditasi A)"
    };
    String[] FKG = new String[]{
            "Pendidikan Dokter Gigi (Akreditasi A)",
            "Ilmu Keperawatan Gigi (Akreditasi B)"
    };
    String[] FKH = new String[]{
            "Kedokteran Hewan (Akreditasi A)"
    };
    String[] FHut = new String[]{
            "Kehutanan (Akreditasi A)"
    };
    String[] FMIPA = new String[]{
            "Elektronika dan Instrumentasi (Akreditasi A)",
            "Fisika (Akreditasi A)",
            "Geofisika (Akreditasi A)",
            "Ilmu Komputer (Akreditasi A)",
            "Kimia (Akreditasi A)",
            "Matematika (Akreditasi A)",
            "Statistika (Akreditasi A)"
    };
    String[] FPt = new String[]{
            "Agronomi (Akreditasi A)",
            "Budidaya Perikanan (Akreditasi A)",
            "Ilmu Hama dan Penyakit Tumbuhan (Akreditasi A)",
            "Ilmu Tanah (Akreditasi A)",
            "Manajemen Sumberdaya Perikanan (Akreditasi A)",
            "Mikrobiologi Pertanian (Akreditasi A)",
            "Penyuluhan & Komunikasi Pertanian (Akreditasi A)",
            "Sosial Ekonomi Pertanian/Agrobisnis (Akreditasi A)",
            "Teknologi Hasil Pertanian (Akreditasi A)"
    };
    String[] FP = new String[]{
            "Ilmu dan Industri Peternakan (Akreditasi A)"
    };
    String[] FPs = new String[]{
            "Psikologi (Akreditasi A)"
    };
    String[] FT = new String[]{
            "Arsitektur (Akreditasi A)",
            "Teknik Fisika (Akreditasi A)",
            "Perencanaan Wilayah dan Kota (Akreditasi A)",
            "Teknik Elektro (Akreditasi A)",
            "Teknik Geodesi (Akreditasi A)",
            "Teknik Geologi (Akreditasi A)",
            "Teknik Industri (Akreditasi A)",
            "Teknik Kimia (Akreditasi A)",
            "Teknik Mesin (Akreditasi A)",
            "Teknik Nuklir (Akreditasi A)",
            "Teknik Sipil (Akreditasi A)",
            "Teknologi Informasi (Akreditasi A)"
    };
    String[] FTP = new String[]{
            "Teknik Pertanian (Akreditasi A)",
            "Teknologi Industri Pertanian (Akreditasi A)",
            "Teknologi Pangan & Hasil Pertanian (Akreditasi A)"
    };


    //====================================================================================
    //setting level ke 3

    LinkedHashMap<String, String[]> thirdLevelS1 = new LinkedHashMap<>();
    //LinkedHashMap<String, String[]> thirdLevelD3 = new LinkedHashMap<>();


    //setting level ke 2

    List<String[]> secondLevel = new ArrayList<>();
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ugm_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(S1);
        //secondLevel.add(D3);

        //Isi Data Prodi ke Fakultas
        thirdLevelS1.put(S1[0], FB);
        thirdLevelS1.put(S1[1], FEB);
        thirdLevelS1.put(S1[2], FF);
        thirdLevelS1.put(S1[3], FFil);
        thirdLevelS1.put(S1[4], FG);
        thirdLevelS1.put(S1[5], FH);
        thirdLevelS1.put(S1[6], FIB);
        thirdLevelS1.put(S1[7], FISIPOL);
        thirdLevelS1.put(S1[8], FK);
        thirdLevelS1.put(S1[9], FKG);
        thirdLevelS1.put(S1[10], FKH);
        thirdLevelS1.put(S1[11], FHut);
        thirdLevelS1.put(S1[12], FMIPA);
        thirdLevelS1.put(S1[13], FPt);
        thirdLevelS1.put(S1[14], FP);
        thirdLevelS1.put(S1[15], FPs);
        thirdLevelS1.put(S1[16], FT);
        thirdLevelS1.put(S1[17], FTP);

        //VOKASI
       // thirdLevelD3.put(D3[0], VOKASI);


        //Tampilkan Semua Data
        data.add(thirdLevelS1);
       // data.add(thirdLevelD3);



//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        UGM_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UGM_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
