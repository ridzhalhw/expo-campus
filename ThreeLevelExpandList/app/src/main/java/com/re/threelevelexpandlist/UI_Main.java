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
public class UI_Main extends AppCompatActivity {

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
    String[] S1= new String[]{
            "Soshum"
    };

    // Prodi Tiap Fakultas-------------------------------------------------------------------------

    String[] PS1 = new String[]{
            "ILMU HUKUM (Akreditasi A)",
            "MANAJEMEN (Akreditasi A)",
            "ILMU KOMUNIKASI (Akreditasi A)",
            "AKUNTANSI (Akreditasi A)",
            "ILMU PSIKOLOGI (Akreditasi A)",
            "ILMU HUBUNGAN INTERNASIONAL (Akreditasi A)",
            "SASTRA INGGRIS (Akreditasi A)",
            "KRIMINOLOGI (Akreditasi A)",
            "ILMU EKONOMI (Akreditasi A)",
            "ILMU ADMINISTRASI NEGARA (Akreditasi A)",
            "ILMU ADMINISTRASI FISKAL (Akreditasi A)",
            "SASTRA JEPANG (Akreditasi A)",
            "ILMU KESEJAHTERAAN SOSIAL (Akreditasi A)",
            "ILMU ADMINISTRASI NIAGA (Akreditasi A)",
            "BISNIS ISLAM UI/Universitas Indonesia (Akreditasi B)",
            "BAHASA DAN KEBUDAYAAN KOREA (Akreditasi A)",
            "ILMU EKONOMI ISLAM (Akreditasi C)",
            "ANTROPOLOGI SOSIAL (Akreditasi A)",
            "SOSIOLOGI (Akreditasi A)",
            "ILMU PERPUSTAKAAN (Akreditasi A)",
            "ILMU POLITIK (Akreditasi A)",
            "SASTRA INDONESIA (Akreditasi A)",
            "SASTRA ARAB (Akreditasi A)",
            "SASTRA JERMAN (Akreditasi A)",
            "ILMU FILSAFAT (Akreditasi A)",
            "SASTRA PERANCIS (Akreditasi A)",
            "SASTRA BELANDA (Akreditasi A)",
            "ILMU SEJARAH (Akreditasi A)",
            "SASTRA RUSIA (Akreditasi B)",
            "SASTRA CINA (Akreditasi A)",
            "ARKEOLOGI INDONESIA (Akreditasi A)",
            "SASTRA DAERAH UNTUK SASTRA JAWA (Akreditasi A)"
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
        UI_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UI_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
