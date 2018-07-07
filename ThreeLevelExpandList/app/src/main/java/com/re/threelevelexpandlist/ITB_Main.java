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
public class ITB_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    String[] jenjang = new String[]{
            "S1"
    };

    String[] S1 = new String[]{
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Sekolah Ilmu dan Teknologi Hayati",
            "Sekolah Farmasi",
            "Fakultas Teknik Pertambangan dan Perminyakan",
            "Fakultas Ilmu dan Teknologi Kebumian",
            "Fakultas Teknologi Industri",
            "Sekolah Teknik Elektro dan Informatika",
            "Fakultas Teknik Mesin dan Dirgantara",
            "Fakultas Teknik Sipil dan Lingkungan",
            "Sekolah Arsitektur, Perencanaan, dan Pengembangan Kebijakan",
            "Fakultas Seni Rupa dan Desain",
            "Sekolah Bisnis dan Manajemen",
    };

    String[] FMIPA = new String[]{
            "Matematika (Akreditasi A)",
            "Fisika (Akreditasi A)",
            "Astronomi (Akreditasi A)",
            "Kimia (Akreditasi A)"
    };

    String[] SITH = new String[]{
            "Mikrobiologi (Akreditasi A)",
            "Biologi (Akreditasi A)",
            "Rekayasa Hayati (Akreditasi A)",
            "Rekayasa Pertanian (Akreditasi B)",
            "Rekayasa Kehutanan (Akreditasi B)",
            "Teknologi Pasca Panen"
    };

    String[] SF = new String[]{
            "Sains dan Teknologi Farmasi (Akreditasi A)",
            "Farmasi Klinik dan Komunitas (Akreditasi A)"
    };

    String[] FTTM = new String[]{
            "Teknik Pertambangan (Akreditasi A)",
            "Teknik Perminyakan (Akreditasi A)",
            "Teknik Geofisika (Akreditasi A)",
            "Teknik Metalurgi (Akreditasi A)"
    };

    String[] FITB = new String[]{
            "Teknik Geologi (Akreditasi A)",
            "Meteorologi (Akreditasi A)",
            "Oseanografi (Akreditasi A)",
            "Teknik Geodesi dan Geomatika (Akreditasi A)"
    };

    String[] FTI = new String[]{
            "Teknik Kimia (Akreditasi A)",
            "Teknik Fisika (Akreditasi A)",
            "Teknik Industri (Akreditasi A)",
            "Manajemen Rekayasa Industri (Akreditasi A)",
            "Teknik Pangan",
            "Teknik Bioenergi dan Kemurgi",
    };

    String[] STEI = new String[]{
            "Teknik Elektro (Akreditasi A)",
            "Teknik Informatika (Akreditasi A)",
            "Teknik Tenaga Listrik (Akreditasi A)",
            "Teknik Telekomunikasi (Akreditasi A)",
            "Sistem dan Teknologi Informasi (Akreditasi A)",
            "Teknik Biomedis (Akreditasi A)"
    };

    String[] FTMD = new String[]{
            "Teknik Mesin (Akreditasi A)",
            "Aeronotika dan Astronotika (Akreditasi A)",
            "Teknik Material (Akreditasi A)"
    };

    String[] FTSL = new String[]{
            "Teknik Sipil (Akreditasi A)",
            "Teknik Lingkungan (Akreditasi A)",
            "Teknik Kelautan (Akreditasi A)",
            "Rekayasa Infrastruktur Lingkungan (Akreditasi B)",
            "Teknik dan Pengelolaan Sumber Daya Air (Akreditasi C)"
    };

    String[] SAPPK = new String[]{
            "Arsitektur (Akreditasi A)",
            "Perencanaan Wilayah dan Kota (Akreditasi A)"
    };

    String[] FSRD = new String[]{
            "Seni Rupa (Akreditasi A)",
            "Kriya (Akreditasi A)",
            "Desain Interior (Akreditasi A)",
            "Desain Komunikasi Visual (Akreditasi A)",
            "Desain Produk (Akreditasi A)"
    };

    String[] SBM = new String[]{
            "Manajemen (Akreditasi A)",
            "Kewirausahaan (Akreditasi A)"
    };

    //====================================================================================
    //setting level ke 3

    LinkedHashMap<String, String[]> thirdLevelD3 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelProfesi = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS2 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS3 = new LinkedHashMap<>();

    //setting level ke 2

    List<String[]> secondLevel = new ArrayList<>();
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itb_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(S1);

        //Isi Data Prodi ke Fakultas

        //S1
        thirdLevelS1.put(S1[0], FMIPA);
        thirdLevelS1.put(S1[1], SITH);
        thirdLevelS1.put(S1[2], SF);
        thirdLevelS1.put(S1[3], FTTM);
        thirdLevelS1.put(S1[4], FITB);
        thirdLevelS1.put(S1[5], FTI);
        thirdLevelS1.put(S1[6], STEI);
        thirdLevelS1.put(S1[7], FTMD);
        thirdLevelS1.put(S1[8], FTSL);
        thirdLevelS1.put(S1[9], SAPPK);
        thirdLevelS1.put(S1[10], FSRD);
        thirdLevelS1.put(S1[11], SBM);


        data.add(thirdLevelS1);

//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        ITB_ThreeLevelListAdapter threeLevelListAdapterAdapter = new ITB_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
