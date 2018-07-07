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
public class PKM_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "D3",
            "D4"
    };

    /**
     * FAKULTAS S1-------------------------------------------------------
     */

    String[] D4 = new String[]{
            "Program Studi"

    };

    String[] D3 = new String[]{
            "Program Studi"

    };


    // Prodi Tiap Fakultas-------------------------------------------------------------------------
    //FC
    String[] PD4 = new String[]{
            "Promosi Kesehatan di Malang (Akreditasi C)",
            "Kebidanan di Malang (Akreditasi B)",
            "Kebidanan di Jember (Akreditasi B)",
            "Kebidanan di Kediri (Akreditasi B)"
    };
    String[] PD3 = new String[]{
            "Gizi di Malang (Akreditasi B)",
            "Keperawatan di Malang (Akreditasi B)",
            "Keperawatan di Blitar (Akreditasi B)",
            "Keperawatan di Lawang (Akreditasi B)",
            "Kebidanan di Malang (Akreditasi B)",
            "Kebidanan di Kediri (Akreditasi B)",
            "Perekam Medik dan Informasi Kesehatan di Malang (Akreditasi B)",
            "Asuransi kesehatan di Malang Akreditasi C)"
    };


    //====================================================================================
    //setting level ke 3

    LinkedHashMap<String, String[]> thirdLevelD3 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelD4 = new LinkedHashMap<>();


    //setting level ke 2

    List<String[]> secondLevel = new ArrayList<>();
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pkm_main);


        // Isi Data Fakultas ke Jenjang

        secondLevel.add(D3);
        secondLevel.add(D4);

        //Isi Data Prodi ke Fakultas
        //D4
        thirdLevelD4.put(D3[0], PD4);
        //D3
        thirdLevelD3.put(D4[0], PD3);


        //Tampilkan Semua Data
        data.add(thirdLevelD3);
        data.add(thirdLevelD4);



//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        PKM_ThreeLevelListAdapter threeLevelListAdapterAdapter = new PKM_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
