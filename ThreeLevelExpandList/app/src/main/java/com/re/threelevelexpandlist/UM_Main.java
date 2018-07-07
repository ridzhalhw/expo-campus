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
public class UM_Main extends AppCompatActivity {

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
            "Program Studi"
    };


    // Prodi Tiap Fakultas-------------------------------------------------------------------------

    String[] PS1 = new String[]{
            "Pend. Matematika (Akreditasi A)",
            "Pend. Fisika (Akreditasi A)",
            "Pend. Kimia (Akreditasi B)",
            "Pend. Biologi (Akreditasi A)",
            "Pend. Teknik Mesin (Akreditasi B)",
            "Pend. Teknik Bangunan (Akreditasi B)",
            "Pend. Teknik Informatika (Akreditasi B)",
            "Pend. Teknik Otomotif (Akreditasi A)",
            "Ilmu Keolahragaan (Akreditasi B)",
            "Matematika (Akreditasi A)",
            "Fisika (Akreditasi A)",
            "Kimia (Akreditasi B)",
            "Biologi (Akreditasi A)",
            "Pend. Teknik Elektro (Akreditasi B)",
            "Bimbingan dan Konseling (Akreditasi A)",
            "Pend. Jasmani dan Kesehatan (Akreditasi A)",
            "Teknologi Pendidikan (Akreditasi A)",
            "Pend. Luar Sekolah (Akreditasi A)",
            "Administrasi Pendidikan (Akreditasi A)",
            "Pend. Guru Sekolah Dasar (Akreditasi A)",
            "Pend. Anak Usia Dini (Akreditasi B)",
            "Pend. Pancasila dan Kewarganegaraan (Akreditasi A)",
            "Pend. Bahasa, Sastra Indonesia dan Daerah (Akreditasi A)",
            "Pend. Bahasa Inggris (Akreditasi A)",
            "Pend. Bahasa Arab (Akreditasi A)",
            "Pend. Seni Rupa (Akreditasi A)",
            "Pend. Bahasa Jerman (Akreditasi A)",
            "Pendidikan Seni Tari dan Musik (Akreditasi A)",
            "Pend. Sejarah (Akreditasi A)",
            "Pend. Ekonomi (Akreditasi A)",
            "Pend. Tata Niaga (Akreditasi B)",
            "Pend. Administrasi Perkantoran (Akreditasi A)",
            "Pend. Akuntansi (Akreditasi A)",
            "Pend. Tata Boga (Akreditasi A)",
            "Pend. Tata Busana (Akreditasi B)",
            "Psikologi (Akreditasi B)",
            "Bahasa dan Sastra Indonesia (Akreditasi A)",
            "Bahasa dan Sastra Inggris (Akreditasi B)",
            "Ilmu Sejarah (Akreditasi A)",
            "Desain Komunikasi Visual (Akreditasi A)",
            "Akuntansi (Akreditasi A)",
            "Ekonomi dan Studi Pembangunan (Akreditasi B)",
            "Manajemen (Akreditasi B)",
            "Pendidikan Luar Biasa (Akreditasi B)",
            "Pendidikan Geografi (Akreditasi B)"
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
        setContentView(R.layout.unpad_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(S1);

        //Isi Data Prodi ke Fakultas


        //S1
        thirdLevelS1.put(S1[0], PS1);


        data.add(thirdLevelS1);

//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        UM_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UM_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
