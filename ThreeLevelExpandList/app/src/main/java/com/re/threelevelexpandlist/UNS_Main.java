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
public class UNS_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "S1"
    };

    /**
     * FAKULTAS S1-------------------------------------------------------
     */
    String[] S1 = new String[]{
            "Fakultas Keguruan dan Ilmu Pendidikan",
            "Fakultas Ilmu Budaya",
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Ilmu Sosial dan Politik",
            "Fakultas Hukum",
            "Fakultas Pertanian",
            "Fakultas Kedokteran",
            "Fakultas Teknik",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Seni Rupa dan Desain"
    };

    // Prodi Tiap Fakultas-------------------------------------------------------------------------

    String[] FKIP = new String[]{
            "Pendidikan Bahasa dan Sastra Indonesia (Akreditasi A)",
            "Pendidikan Ekonomi (Akreditasi A)",
            "Pendidikan Fisika (Akreditasi A)",
            "Pendidikan Jasmani Kesehatan dan Rekreasi (Akreditasi A)",
            "Pendidikan Kepelatihan Olahraga (Akreditasi A)",
            "Pendidikan Luar Biasa (Akreditasi A)",
            "Pendidikan Pancasila dan Kewarganegaraan (Akreditasi A)",
            "Pendidikan Sejarah (Akreditasi A)",
            "Pendidikan Teknik Mesin (Akreditasi A)",
            "Pendidikan Administrasi Perkantoran (Akreditasi A)",
            "Pendidikan Guru Sekolah Dasar (Akreditasi A)",
            "Pendidikan Teknik Bangunan (Akreditasi A)",
            "Pendidikan Matematika (Akreditasi A)",
            "Pendidikan Sosiologi Antropologi (Akreditasi A)",
            "Pendidikan Akuntansi (Akreditasi A)",
            "Pendidikan Guru Pendidikan Anak Usia Dini (Akreditasi B)",
            "Bimbingan dan Konseling (Akreditasi B)",
            "Pendidikan Kimia (Akreditasi B)",
            "Pendidikan Bahasa Jawa (Akreditasi B)",
            "Pendidikan Seni Rupa (Akreditasi B)",
            "Pendidikan Biologi (Akreditasi B)",
            "Pendidikan Bahasa Inggris (Akreditasi B)",
            "Pendidikan Teknik Informatika dan Komputer (Akreditasi B)",
            "Pendidikan Geografi (Akreditasi B)",
            "Pendidikan Ilmu Pengetahuan Alam"
    };
    String[] FIB = new String[]{
            "Ilmu Sejarah (Akreditasi A)",
            "Sastra Daerah (Akreditasi A)",
            "Sastra Indonesia (Akreditasi A)",
            "Sastra Inggris (Akreditasi B)",
            "Sastra Arab (Akreditasi B)"
    };

    //S1
    String[] FEB = new String[]{
            "Akuntansi (Akreditasi A)",
            "Ekonomi Pembangunan (Akreditasi A)",
            "Manajemen (Akreditasi A)"
    };
    String[] FISIP = new String[]{
            "Ilmu Komunikasi (Akreditasi A)",
            "Ilmu Administrasi Negara (Akreditasi A)",
            "Hubungan Internasional (Akreditasi B)",
            "Sosiologi (Akreditasi B)"
    };
    String[] FH = new String[]{
            "Ilmu Hukum (Akreditasi A)"
    };
    String[] FP = new String[]{
            "Agribisnis (Akreditasi A)",
            "Ilmu Tanah (Akreditasi A)",
            "Penyuluhan dan Komunikasi Pertanian (Akreditasi A)",
            "Peternakan (Akreditasi A)",
            "Agroteknologi (Akreditasi A)",
            "Teknologi Pangan (Akreditasi A)"
    };
    String[] FK = new String[]{
            "Kedokteran (Akreditasi A)",
            "Psikologi (Akreditasi B)"
    };
    String[] FT = new String[]{
            "Teknik Sipil (Akreditasi A)",
            "Teknik Mesin (Akreditasi A)",
            "Arsitektur (Akreditasi A)",
            "Teknik Industri (Akreditasi A)",
            "Teknik Kimia (Akreditasi A)",
            "Perencanaan Wilayah dan Kota (Akreditasi B)",
            "Teknik Elektro (Akreditasi B)"
    };
    String[] FMIPA = new String[]{
            "Biologi (Akreditasi A)",
            "Fisika (Akreditasi A)",
            "Kimia (Akreditasi A)",
            "Matematika (Akreditasi B)",
            "Informatika",
            "Farmasi (Akreditasi C)",
            "Statistika"
    };
    String[] FSD = new String[]{
            "Desain Komunikasi Visual (Akreditasi A)",
            "Kriya Seni (Akreditasi A)",
            "Desain Interior (Akreditasi A)",
            "Seni Rupa Murni (Akreditasi B)"
    };

    //====================================================================================
    //setting level ke 3

    LinkedHashMap<String, String[]> thirdLevelS1 = new LinkedHashMap<>();

    //setting level ke 2

    List<String[]> secondLevel = new ArrayList<>();
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uns_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(S1);

        //Isi Data Prodi ke Fakultas

        //S1
        thirdLevelS1.put(S1[0], FKIP);
        thirdLevelS1.put(S1[1], FIB);
        thirdLevelS1.put(S1[2], FEB);
        thirdLevelS1.put(S1[3], FISIP);
        thirdLevelS1.put(S1[4], FP);
        thirdLevelS1.put(S1[5], FK);
        thirdLevelS1.put(S1[6], FT);
        thirdLevelS1.put(S1[7], FMIPA);
        thirdLevelS1.put(S1[8], FSD);

        data.add(thirdLevelS1);

//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        UNS_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UNS_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
