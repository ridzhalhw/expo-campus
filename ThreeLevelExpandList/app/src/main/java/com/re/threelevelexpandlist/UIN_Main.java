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
public class UIN_Main extends AppCompatActivity {

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
            "Perbankan Syariah (Akreditasi B)",
    };
    String[] PS1 = new String[]{
            "Pendidikan Ilmu Pengetahuan Sosial (Akreditasi B)",
            "Matematika (Akreditasi B)",
            "Sastra Inggris (Akreditasi A)",
            "Bahasa dan Sastra  (Akreditasi A)",
            "Manajemen (Akreditasi A)",
            "Pendidikan Agama Islam (Akreditasi A)",
            "Ahwal Al-Syakhshiyah (Akreditasi A)",
            "Psikologi (Akreditasi B)",
            "Pendidikan IPS (Akreditasi A)",
            "Akuntansi (Akreditasi B)",
            "Teknik Informatika (Akreditasi B)",
            "Pendidikan Guru Madrasah Ibtidaiyah (Akreditasi A)",
            "Perbankan Syariah (Akreditasi B)",
            "Farmasi (Akreditasi C)",
            "Pendidikan Bahasa Arab (Akreditasi A)",
            "Hukum Bisnis Syari`ah (Akreditasi B)",
            "Pendidikan Guru Raudlatul Athfal (Akreditasi C)",
            "Manajemen Pendidikan Islam (Akreditasi B)",
            "Matematika (Akreditasi B)",
            "Biologi (Akreditasi A)",
            "Kimia (Akreditasi B)",
            "Fisika (Akreditasi B)",
            "Teknik Arsitektur (Akreditasi B)"
    };

    String[] PS2 = new String[]{
            "Pendidikan Agama Islam (Akreditasi B)",
            "Pendidikan Bahasa Arab (Akreditasi A)",
            "Manajemen Pendidikan Islam (Akreditasi B)",
            "Ahwal Al-Syakhshiyah (Akreditasi A)",
            "Pendidikan Guru Madrasah Ibtidaiyah (Akreditasi B)",
            "Ekonomi Syari`ah (Akreditasi B)",
            "Studi Ilmu Agama Islam (Akreditasi A)"
    };

    String[] PS3 = new String[]{
            "Pendidikan Bahasa Arab (Akreditasi B)",
            "Manajemen Pendidikan Islam (Akreditasi B)",
            "Pendidikan Agama Islam (Akreditasi B)"
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
        setContentView(R.layout.uin_main);


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
        UIN_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UIN_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
