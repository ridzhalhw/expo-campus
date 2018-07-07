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
public class Binus_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "D3/D4",
            "S1",
            "S2",
            "S3"
    };

    /**
     * FAKULTAS S1-------------------------------------------------------
     */
    String[] D3 = new String[]{
            "Program Studi"
    };

    String[] S1 = new String[]{
            "Program Studi"
    };

    String[] S2 = new String[]{
            "Program Studi"
    };
    String[] S3 = new String[]{
            "Program Studi"
    };

    // Prodi Tiap Fakultas-------------------------------------------------------------------------

    String[] PD3 = new String[]{
            "Kompterisasi Akuntansi (Akreditasi B)",
            "D4 Perhotelan (Akreditasi A)"
    };
    String[] PS1 = new String[]{
            "Desain Komunikasi Visual (Akreditasi A)",
            "Arsitektur (Akreditasi A)",
            "Hubungan Internasional (Akreditasi B)",
            "Statistika (Akreditasi B)",
            "Sastra Jepang (Akreditasi A)",
            "Sastra Inggris (Akreditasi A)",
            "Sastra Cina (Akreditasi A)",
            "Teknik Sipil (Akreditasi A)",
            "Matematika (Akreditasi A)",
            "Teknik Industri (Akreditasi A)",
            "Desain Produk (Akreditasi B)",
            "Manajemen (Akreditasi A)",
            "Ilmu Hukum (Akreditasi B)",
            "Film (Akreditasi B)",
            "Psikologi (Akreditasi B)",
            "Teknik Informatika (Akreditasi A)",
            "Akuntansi (Akreditasi A)",
            "Desain Interior (Akreditasi B)",
            "Ilmu Komunikasi (Akreditasi B)",
            "Sistem Komputer (Akreditasi A)",
            "Sistem Informasi (Akreditasi A)"
    };

    String[] PS2 = new String[]{
            "Manajemen (Akreditasi A)",
            "Teknik Informatika (Akreditasi A)",
            "Manajemen Sistem Informasi (Akreditasi B)"
    };

    String[] PS3 = new String[]{
            "Ilmu Manajemen (Akreditasi B)"
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
        setContentView(R.layout.unpad_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(D3);
        secondLevel.add(S1);
        secondLevel.add(S2);
        secondLevel.add(S3);

        //Isi Data Prodi ke Fakultas
        //D3
        thirdLevelD3.put(D3[0],PD3);

        //S1
        thirdLevelS1.put(S1[0], PS1);

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
        Binus_ThreeLevelListAdapter threeLevelListAdapterAdapter = new Binus_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
