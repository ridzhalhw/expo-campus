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
public class UAD_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "S1",
            "S2"
    };

    /**
     * FAKULTAS S1-------------------------------------------------------
     */

    String[] S1 = new String[]{
            "Fakultas Tabiyah dan Dirasat Islamiyah",
            "Fakultas Ekonomi",
            "Fakultas Farmasi",
            "Fakultas Hukum",
            "Fakultas Keguruan dan Ilmu Pendidikan",
            "Fakultas Kesehatan Masyarakat",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Psikologi",
            "Fakultas Sastra, Budaya dan Ilmu Komunikasi",
            "Fakultas Teknologi Industri"
    };

    String[] S2 = new String[]{
            "Pasca Sarjana"
    };

    // Prodi Tiap Fakultas-------------------------------------------------------------------------

    String[] FTDI = new String[]{
            "Tafsir Hadits (Akreditasi A)",
            "Bahasa dan Sastra Arab (Akreditasi A)",
            "Tarbiyah (S-1)"
    };

    String[] FE = new String[]{
            "Ekonomi Pembangunan (Akreditasi B)",
            "Manajemen (Akreditasi B)",
            "Akuntansi (Akreditasi B)",
    };

    String[] FF = new String[]{
            "Farmasi (Akreditasi A)",
            "Program Profesi Apoteker (Akreditasi A)"
    };

    String[] FH = new String[]{
            "Ilmu Hukum (Akreditasi B)",
    };

    String[] FKIP = new String[]{
            "Bimbingan Konseling (Akreditasi B)",
            "Pendidikan Bahasa dan Sastra Indonesia (Akreditasi A)",
            "Pendidikan Bahasa Inggris (Akreditasi B)",
            "Pendidikan Matematika (Akreditasi B)",
            "Pendidikan Fisika (Akreditasi B)",
            "Pendidikan Biologi (Akreditasi B)",
            "Pendidikan Pancasila dan Kewarganegaraan (Akreditasi A)",
            "Pendidikan Guru Sekolah Dasar (Akreditasi B)",
            "Pendidikan Guru PAUD (Akreditasi B)",
            "PGBI-MIPA Pendidikan Biologi (S1)",
            "PGBI-MIPA Pendidikan Fisika (S1)",
            "PGBI-MIPA Pendidikan Matematika (Akreditasi B)"
    };

    String[] FKM = new String[]{
            "Ilmu Kesehatan Masyarakat (Akreditasi B)"
    };

    String[] FMIPA = new String[]{
            "Matematika (S-1)",
            "Fisika (S-1)",
            "Sistem Informasi (Akreditasi B)",
            "Biologi (S-1)"
    };

    String[] FPs = new String[]{
            "Psikologi  (Akreditasi B)"
    };

    String[] FIB = new String[]{
            "Sastra Inggris (Akreditasi B)",
            "Sastra Indonesia  (Akreditasi B)",
            "Ilmu Komunikasi  (Akreditasi B)"
    };

    String[] FTI = new String[]{
            "Teknik Industri (Akreditasi B)",
            "Teknik Informatika  (Akreditasi B)",
            "Teknik Kimia (Akreditasi B)",
            "Teknik Elektro (Akreditasi B)"
    };

    String[] Pasca = new String[]{
            "Magister Pendidikan Fisika (Akreditasi B)",
            "Magister Pendidikan Bahasa Inggris (Akreditasi C)",
            "Magister Sains Psikologi",
            "Magister Profesi Psikologi (Akreditasi B)",
            "Magister Farmasi (Akreditasi B)",
            "Magister Manajemen Pendidikan"
    };
    //====================================================================================
    //setting level ke 3

    LinkedHashMap<String, String[]> thirdLevelS1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS2 = new LinkedHashMap<>();

    //setting level ke 2

    List<String[]> secondLevel = new ArrayList<>();
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uad_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(S1);
        secondLevel.add(S2);

        //Isi Data Prodi ke Fakultas
        //D3

        //S1
        thirdLevelS1.put(S1[0], FTDI);
        thirdLevelS1.put(S1[1], FE);
        thirdLevelS1.put(S1[2], FF);
        thirdLevelS1.put(S1[3], FH);
        thirdLevelS1.put(S1[4], FKIP);
        thirdLevelS1.put(S1[5], FKM);
        thirdLevelS1.put(S1[6], FMIPA);
        thirdLevelS1.put(S1[7], FPs);
        thirdLevelS1.put(S1[8], FIB);
        thirdLevelS1.put(S1[9], FTI);

        //S2
        thirdLevelS2.put(S2[0], Pasca);

        data.add(thirdLevelS1);
        data.add(thirdLevelS2);

//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        UAD_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UAD_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
