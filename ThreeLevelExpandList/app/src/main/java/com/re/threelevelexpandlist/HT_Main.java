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
public class HT_Main extends AppCompatActivity {

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
    String[] Profesi = new String[]{
            "Program Studi"
    };

    // Prodi Tiap Fakultas-------------------------------------------------------------------------

    String[] PD3 = new String[]{
            "Nautika (Akreditasi B)",
            "Ketatalaksanaan Pelayaran Niaga dan Kepelabuhan (Akreditasi B)",
            "Teknika (Akreditasi B)"
    };

    String[] PS1 = new String[]{
            "Teknik Perkapalan (Akreditasi B)",
            "Oseanografi (Akreditasi B)",
            "Ilmu Hukum (Akreditasi B)",
            "Farmasi (Akreditasi C)",
            "Kedokteran (Akreditasi B)",
            "Ilmu Administrasi Publik (Akreditasi A)",
            "Teknik Elektro (Akreditasi B)",
            "Ilmu Administrasi Bisnis (Akreditasi B)",
            "Psikologi (Akreditasi B)",
            "Teknik Sistem Perkapalan (Akreditasi B)",
            "Pendidikan Dokter Gigi (Akreditasi B)",
            "Perikanan (Akreditasi B)"
    };

    String[] PS2 = new String[]{
            "Ilmu Hukum (Akreditasi B)",
            "Administrasi dan Kebijakan Publik (Akreditasi B)"
    };

    String[] PProfesi = new String[]{
            "Dokter (Akreditasi B)"
    };

    //====================================================================================
    //setting level ke 3

    LinkedHashMap<String, String[]> thirdLevelD3 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS2 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelProfesi = new LinkedHashMap<>();

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
        secondLevel.add(Profesi);

        //Isi Data Prodi ke Fakultas
        //D3
        thirdLevelD3.put(D3[0],PD3);

        //S1
        thirdLevelS1.put(S1[0], PS1);

        //S2
        thirdLevelS2.put(S2[0], PS2);


        //S3
        thirdLevelProfesi.put(Profesi[0], PProfesi);

        data.add(thirdLevelD3);
        data.add(thirdLevelS1);
        data.add(thirdLevelS2);
        data.add(thirdLevelProfesi);
//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        HT_ThreeLevelListAdapter threeLevelListAdapterAdapter = new HT_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
