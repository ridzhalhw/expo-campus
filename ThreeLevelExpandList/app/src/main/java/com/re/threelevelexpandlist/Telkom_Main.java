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
public class Telkom_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "S1",
            "S2"
    };

    String[] S1 = new String[]{
            "Fakultas Teknik Elektro",
            "Fakultas Teknik Informatika",
            "Fakultas Rekayasa Industri",
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Komunikasi dan Bisnis",
            "Fakultas Industri Kreatif"
    };

    String[] S2 = new String[]{
            "Fakultas Teknik Elektro",
            "Fakultas Teknik Informatika",
            "Fakultas Rekayasa Industri",
            "Fakultas Ekonomi dan Bisnis"
    };

    String[] TES1 = new String[]{
            "Teknik Telekomunikasi (Akreditasi A)",
            "Teknik Telekomunikasi Internasional (Akreditasi A)",
            "Teknik Elektro (Akreditasi A)",
            "Teknik Elektro Internasional (Akreditasi A)",
            "Teknik Fisika (Akreditasi B)",
            "Sistem Komputer (Akreditasi B)"
    };

    String[] TES2 = new String[]{
            "Teknik Elektro-Telekomunikasi (Akreditasi A)"
    };

    String[] TIS1 = new String[]{
            "Teknik Informatika (Akreditasi A)",
            "Teknik Informatika Internasional (Akreditasi A)",
            "Teknologi Informasi (Akreditasi C)"
    };

    String[] TIS2 = new String[]{
            "Teknik Informatika (Akreditasi B)"
    };

    String[] RIS1 = new String[]{
            "Teknik Industri (Akreditasi A)",
            "Teknik Industri Internasional (Akreditasi A)",
            "Sistem Informasi (Akreditasi A)",
            "Sistem Informasi Internasional (Akreditasi A)"
    };

    String[] RIS2 = new String[]{
            "Teknik Industri (Akreditasi B)"
    };

    String[] EBS1 = new String[]{
            "International ICT Business (Akreditasi A)",
            "MBTI (Akreditasi A)",
            "Akuntansi (Akreditasi A)"
    };

    String[] EBS2 = new String[]{
            "Manajemen (Akreditasi A)"
    };

    String[] KBS1 = new String[]{
            "Administrasi Bisnis (Akreditasi A)",
            "Administrasi Bisnis Internasional (Akreditasi A)",
            "Ilmu Komunikasi (Akreditasi A)",
            "Ilmu Komunikasi Internasional (Akreditasi A)",
            "Digital Public Relation (Akreditasi C)"
    };

    String[] IKS1 = new String[]{
            "Desain Komunikasi Visual (Akreditasi A)",
            "Desain Komunikasi Visual Interasional (Akreditasi A)",
            "Desain Produk (Akreditasi A)",
            "Desain Interior (Akreditasi A)",
            "Kriya Tekstil dan Mode (Akreditasi B)",
            "Creative Arts(Painting, Photograpy& Film, and Intermedia) (Akreditasi A)"
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
        setContentView(R.layout.telkom_main);


        // Isi Data Fakultas ke Jenjang

        secondLevel.add(S1);
        secondLevel.add(S2);


        //Isi Data Prodi ke Fakultas

        //S1
        thirdLevelS1.put(S1[0], TES1);
        thirdLevelS1.put(S1[1], TIS1);
        thirdLevelS1.put(S1[2], RIS1);
        thirdLevelS1.put(S1[3], EBS1);
        thirdLevelS1.put(S1[4], KBS1);
        thirdLevelS1.put(S1[5], IKS1);


        //S2
        thirdLevelS2.put(S2[0], TES2);
        thirdLevelS2.put(S2[1], TIS2);
        thirdLevelS2.put(S2[2], RIS2);
        thirdLevelS2.put(S2[3], EBS2);


        data.add(thirdLevelS1);
        data.add(thirdLevelS2);


//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        Telkom_ThreeLevelListAdapter threeLevelListAdapterAdapter = new Telkom_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
