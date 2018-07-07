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
public class UII_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "D3",
            "S1"
    };

    String[] D3 = new String[]{
            "Fakultas Ekonomi",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam"
    };

    String[] S1 = new String[]{
            "Fakultas Ekonomi",
            "Fakultas Hukum",
            "Fakultas Psikologi dan Ilmu Sosial Budaya",
            "Fakultas Teknologi Industri",
            "Fakultas Teknik Sipil dan Perencanaan",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Kedokteran",
            "Fakultas Ilmu Agama Islam"
    };

    String[] FED3 = new String[]{
            "Akuntansi (Akreditasi A)",
            "Perbankan & Keuangan (Akreditasi A)",
            "Manajemen (Akreditasi B)"
    };

    String[] FMIPAD3 = new String[]{
            "Kimia Analis (Akreditasi B)"
    };

    String[] FES1 = new String[]{
            "Akuntansi (Akreditasi A)",
            "Manajemen (Akreditasi A)",
            "Ilmu Ekonomi (Akreditasi A)"
    };

    String[] FHS1 = new String[]{
            "Hukum (Akreditasi A)"
    };

    String[] FPISS1 = new String[]{
            "Psikologi (Akreditasi A)",
            "Ilmu Komunikasi (Akreditasi A)",
            "Pendidikan Bahasa Inggris (Akreditasi B)",
            "Hubungan Internasional (Akreditasi C)"
    };

    String[] FTIS1 = new String[]{
            "Teknik Industri (Akreditasi A)",
            "Teknik Mesin (Akreditasi A)",
            "Teknik Elektro (Akreditasi A)",
            "Teknik Informatika (Akreditasi A)",
            "Teknik Kimia (Akreditasi B)"
    };

    String[] FTS1 = new String[]{
            "Teknik Sipil (Akreditasi A)",
            "Arsitektur (Akreditasi A)",
            "Teknik Lingkungan (Akreditasi A)"
    };

    String[] FMIPAS1 = new String[]{
            "Kimia (Akreditasi A)",
            "Farmasi (Akreditasi B)",
            "Statistika (Akreditasi B)",
            "Pendidikan Kimia (Akreditasi B)"
    };

    String[] FKS1 = new String[]{
            "Pendidikan Dokter (Akreditasi A)"
    };

    String[] FIASS1 = new String[]{
            "Ahwal Al Syakhshiyah (Akreditasi A)",
            "Ekonomi Islam (Akreditasi B)",
            "Pendidikan Agama Islam (Akreditasi A)"
    };


    //====================================================================================
    //setting level ke 3

    LinkedHashMap<String, String[]> thirdLevelD3 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS1 = new LinkedHashMap<>();
    //setting level ke 2

    List<String[]> secondLevel = new ArrayList<>();
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uii_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(D3);
        secondLevel.add(S1);

        //Isi Data Prodi ke Fakultas
        //D3
        thirdLevelD3.put(D3[0], FED3);
        thirdLevelD3.put(D3[1], FMIPAD3);

        //S1
        thirdLevelS1.put(S1[0], FES1);
        thirdLevelS1.put(S1[1], FHS1);
        thirdLevelS1.put(S1[2], FPISS1);
        thirdLevelS1.put(S1[3], FTIS1);
        thirdLevelS1.put(S1[4], FTS1);
        thirdLevelS1.put(S1[5], FMIPAS1);
        thirdLevelS1.put(S1[6], FKS1);
        thirdLevelS1.put(S1[7], FIASS1);


        data.add(thirdLevelD3);
        data.add(thirdLevelS1);


//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        UII_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UII_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
