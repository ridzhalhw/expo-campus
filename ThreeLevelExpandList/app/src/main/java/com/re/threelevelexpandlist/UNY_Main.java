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
public class UNY_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "D3",
            "S1"
    };

    /**
     * FAKULTAS S1-------------------------------------------------------
     */
    String[] D3 = new String[]{
            "Fakultas Teknik",
            "Fakultas Ekonomi"

    };

    String[] S1 = new String[]{
            "Fakultas Ilmu Pendidikan",
            "Fakultas Bahasa dan Seni",
            "Fakultas MIPA",
            "Fakultas Ilmu Sosial",
            "Fakultas Teknik",
            "Fakultas Ilmu Keolahragaan",
            "Fakultas Ekonomi"
    };

    // Prodi Tiap Fakultas-------------------------------------------------------------------------

    String[] FTD3 = new String[]{
            "Teknik Elektro (Akreditasi B)",
            "Teknik Elektronika (Akreditasi B)",
            "Teknik Mesin (Akreditasi B)",
            "Teknik Otomotif (Akreditasi B)",
            "Teknik Sipil (Akreditasi B)",
            "Teknik Boga (Akreditasi A)",
            "Teknik Busana (Akreditasi B)",
            "Tata Rias dan Kecantikan (Akreditasi A)"
    };
    String[] FED3 = new String[]{
            "Akuntansi (Akreditasi B)",
            "Manajemen Pemasaran (Akreditasi A)",
            "Sekretaris (Akreditasi B)"
    };

    //S1
    String[] FIPS1 = new String[]{
            "Manajemen Pendidikan (Akreditasi A)",
            "Pendidikan Luar Sekolah (Akreditasi A)",
            "Pendidikan Luar Biasa (Akreditasi A)",
            "Teknologi Pendidikan (Akreditasi A)",
            "Bimbingan dan Konseling (Akreditasi A)",
            "Pendidikan Guru Sekolah Dasar (Akreditasi C)",
            "Kebijakan Pendidikan (Akreditasi B)",
            "Pendidikan Anak Usia Dini (Akreditasi A)",
            "Psikolog"
    };
    String[] FBSS1 = new String[]{
            "Pendidikan Bahasa dan Sastra Indonesia (Akreditasi A)",
            "Sastra Indonesia (Akreditasi A)",
            "Pendidikan Bahasa Inggris (Akreditasi B)",
            "Sastra Inggris (Akreditasi B)",
            "Pendidikan Bahasa Jawa (Akreditasi A)",
            "Pendidikan Bahasa Prancis (Akreditasi B)",
            "Pendidikan Bahasa Jerman (Akreditasi A)",
            "Pendidikan Seni Tari (Akreditasi A)",
            "Pendidikan Seni Musik (Akreditasi B)",
            "Pendidikan Seni Rupa (Akreditasi B)",
            "Pendidikan Kriya"
    };
    String[] FMIPAS1 = new String[]{
            "Pendidikan Matematika (Akreditasi A)",
            "Pendidikan Fisika (Akreditasi A)",
            "Pendidikan Kimia (Akreditasi A)",
            "Pendidikan Biologi (Akreditasi A)",
            "Pendidikan IPA (Akreditasi A)",
            "Matematika (Akreditasi A)",
            "Fisika (Akreditasi B)",
            "Kimia (Akreditasi A)",
            "Biologi (Akreditasi A)",
            "Statistika"
    };
    String[] FISS1 = new String[]{
            "Pendidikan Pancasila dan Kewarganegaraan (Akreditasi A)",
            "Pendidikan Geografi (Akreditasi A)",
            "Pendidikan Sejarah (Akreditasi A)",
            "Ilmu Sejarah (Akreditasi A)",
            "Pendidikan Sosiologi (Akreditasi A)",
            "Ilmu Administrasi Negara (Akreditasi B)",
            "Pendidikan IPS (Akreditasi B)",
            "Ilmu Komunikasi"
    };
    String[] FTS1 = new String[]{
            "Pendidikan Teknik Elektro (Akreditasi A)",
            "Pendidikan Teknik Mekatronika (Akreditasi A)",
            "Pendidikan Teknik Elektronika (Akreditasi A)",
            "Pendidikan Teknik Informatika (Akreditasi B)",
            "Pendidikan Teknik Mesin (Akreditasi A)",
            "Pendidikan Teknik Otomotif (Akreditasi A)",
            "Pendidikan Teknik Sipil dan Perencanaan (Akreditasi A)",
            "Pendidikan Teknik Boga (Akreditasi A)",
            "Pendidikan Teknik Busana (Akreditasi A)"
    };
    String[] FIKS1 = new String[]{
            "PJKR (Akreditasi A)",
            "Pendidikan Kepelatihan Olahraga (Akreditasi A)",
            "Ilmu Keolahragaan (Akreditasi A)",
            "PGSD Pendidikan Jasmani (Akreditasi B)"
    };
    String[] FES1 = new String[]{
            "Pendidikan Ekonomi (Akreditasi A)",
            "Pendidikan Akuntansi (Akreditasi A)",
            "Manajemen (Akreditasi B)",
            "Akuntansi (Akreditasi A)",
            "Pendidikan Administrasi Perkantoran (Akreditasi A)"
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
        setContentView(R.layout.uny_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(D3);
        secondLevel.add(S1);

        //Isi Data Prodi ke Fakultas
        //D3
        thirdLevelD3.put(D3[0], FTD3);
        thirdLevelD3.put(D3[1], FED3);

        //S1
        thirdLevelS1.put(S1[0], FIPS1);
        thirdLevelS1.put(S1[1], FBSS1);
        thirdLevelS1.put(S1[2], FMIPAS1);
        thirdLevelS1.put(S1[3], FISS1);
        thirdLevelS1.put(S1[4], FTS1);
        thirdLevelS1.put(S1[5], FIKS1);
        thirdLevelS1.put(S1[6], FES1);

        data.add(thirdLevelD3);
        data.add(thirdLevelS1);

//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        UNY_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UNY_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
