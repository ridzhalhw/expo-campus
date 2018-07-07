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
public class UGUN_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "D3",
            "S1",
            "S2",
            "S3"
    };

    String[] D3 = new String[]{
            "Program Studi"
    };

    String[] S1 = new String[]{
            "Fakultas Ilmu Komputer dan Teknologi Informasi",
            "Fakultas Teknologi Industri",
            "Fakultas Ekonomi",
            "Fakultas Teknik Sipil dan Perencanaan",
            "Fakultas Psikologi",
            "Fakultas Sastra"
    };

    String[] S2 = new String[]{
            "Program Studi"
    };

    String[] S3 = new String[]{
            "Program Studi"
    };

    String[] PD3 = new String[]{
            "Teknik Komputer (Akreditasi A)",
            "Kebidanan(Akreditasi B)",
            "Manajemen Informatika (Akreditasi A)",
            "Manajemen Keuangan (Akreditasi A)",
            "Akuntansi (Akreditasi A)",
            "Manajemen Pemasaran (Akreditasi A)"
    };

    String[] FITI = new String[]{
            "Jurusan Sistem Informasi (Akreditasi A)",
            "Jurusan Sistem Komputer (Akreditasi A)"
    };

    String[] FTI = new String[]{
            "Jurusan Teknik Informatika (Akreditasi A)",
            "Jurusan Teknik Elektro (Akreditasi A)",
            "Jurusan Teknik Mesin (Akreditasi A)",
            "Jurusan Teknik Industri (Akreditasi A)"
    };

    String[] FE = new String[]{
            "Jurusan Akuntansi (Akreditasi A)",
            "Jurusan Manajemen (Akreditasi A)"
    };

    String[] FSP = new String[]{
            "Jurusan Teknik Arsitektur (Akreditasi A)",
            "Jurusan Teknik sipil (Akreditasi A)"
    };

    String[] FPs = new String[]{
            "Jurusan Psikologi (Akreditasi A)"
    };

    String[] FS= new String[]{
            "Jurusan sastra Inggris (Akreditasi A)"
    };

    String[] PS2 = new String[]{
            "Teknik Elektro (Akreditasi A)",
            "Teknik Sipil (Akreditasi B)",
            "Teknik Mesin (Akreditasi B)",
            "Psikologi (Akreditasi B)",
            "Manajemen Sistem Informasi (Akreditasi A)",
            "Sastra Inggris (Akreditasi B)",
            "Manajemen (Akreditasi A)"
    };

    String[] PS3 = new String[]{
            "Ilmu Ekonomi (Akreditasi A)",
            "Teknologi Informasi (Akreditasi A)",
            "Ilmu Psikologi (Akreditasi B)"
    };

    //====================================================================================
    //setting level ke 3

    LinkedHashMap<String, String[]> thirdLevelD3 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS2 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS3 = new LinkedHashMap<>();

    //setting level ke 2

    List<String[]> secondLevel = new ArrayList<>();
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ugun_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(D3);
        secondLevel.add(S1);
        secondLevel.add(S2);
        secondLevel.add(S3);

        //Isi Data Prodi ke Fakultas
        //D3
        thirdLevelD3.put(D3[0], PD3);

        //S1
        thirdLevelS1.put(S1[0], FITI);
        thirdLevelS1.put(S1[1], FTI);
        thirdLevelS1.put(S1[2], FE);
        thirdLevelS1.put(S1[3], FSP);
        thirdLevelS1.put(S1[4], FPs);
        thirdLevelS1.put(S1[5], FS);

        //S2
        thirdLevelS2.put(S2[0], PS2);

        //S3
        thirdLevelS3.put(S3[0], PS3);

        data.add(thirdLevelD3);
        data.add(thirdLevelS1);
        data.add(thirdLevelS2);
        data.add(thirdLevelS3);

//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        UGUN_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UGUN_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
