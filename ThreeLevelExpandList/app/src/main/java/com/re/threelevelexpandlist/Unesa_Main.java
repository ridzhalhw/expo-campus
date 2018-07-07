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
public class Unesa_Main extends AppCompatActivity {

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
            "Fakultas Bahasa & Seni",
            "Fakultas Ilmu Sosial",
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

    String[] S2 = new String[]{
            "Program Studi"

    };

    String[] S3 = new String[]{
            "Program Studi"
    };

    // Prodi Tiap Fakultas-------------------------------------------------------------------------

    String[] FBSD3 = new String[]{
            "Desain Grafis (Akreditasi A)"
    };
    String[] FISD3 = new String[]{
            "Administrasi Negara (Akreditasi B)"
    };
    String[] FTD3 = new String[]{
            "Teknik Listrik (Akreditasi B)",
            "Manajemen Informatika (Akreditasi C)",
            "Teknik Mesin (Akreditasi B)",
            "Transportasi (Akreditasi B)",
            "Tata Boga (Akreditasi A)",
            "Tata Busana (Akreditasi A)"
    };
    String[] FED3 = new String[]{
            "Akuntansi (Akreditasi B)"
    };

    //S1
    String[] FIPS1 = new String[]{
            "Bimbingan dan Konseling (Akreditasi A)",
            "Teknologi dan Pendidikan (Akreditasi B)",
            "Pendidikan Luar Sekolah (Akreditasi C)",
            "Pendidikan Luar Biasa (Akreditasi B)",
            "PGSD (Akreditasi B)",
            "Psikologi (Akreditasi B)",
            "PG-PAUD (Akreditasi A)",
            "Manajemen Pendidikan (Akreditasi B)"
    };
    String[] FBSS1 = new String[]{
            "Pendidikan Bahasa Indonesia (Akreditasi B)",
            "Pendidikan Bahasa Jawa (Akreditasi B)",
            "Pendidikan Bahasa Inggris (Akreditasi B)",
            "Pendidikan Bahasa Jerman (Akreditasi B)",
            "Pendiidkan Bahasa Jepang (Akreditasi B)",
            "Pendidikan Seni Rupa (Akreditasi A)",
            "Pendidikan Sendratasik (Akreditasi B)",
            "Sastra Indonesia (Akreditasi B)",
            "Sastra Inggris (Akreditasi B)",
            "Sastra Jerman (Akreditasi B)",
            "Pendidikan Bahasa Mandarin (Akreditasi C)"
    };
    String[] FMIPAS1 = new String[]{
            "Pendidikan Matematika (Akreditasi A)",
            "Pendidikan Biologi (Akreditasi A)",
            "Pendidikan Fisika (Akreditasi A)",
            "Pendidikan Kimia (Akreditasi A)",
            "Matematika (Akreditasi B)",
            "Fisika (Akreditasi B)",
            "Kimia (Akreditasi A)",
            "Biologi (Akreditasi A)",
            "Pendidikan Sains (Akreditasi B)"
    };
    String[] FISS1 = new String[]{
            "PPKn (Akreditasi B)",
            "Pendidikan Geografi (Akreditasi B)",
            "Pendidikan Sejarah (Akreditasi A)",
            "Ilmu Hukum (Akreditasi B)",
            "Ilmu Administrasi Negara (Akreditasi B)",
            "Sosiologi (Akreditasi A)",
            "Ilmu Komunikasi (Akreditasi B)"
    };
    String[] FTS1 = new String[]{
            "Pendidikan Teknik Elektro (Akreditasi A)",
            "Pendidikan Teknik Mesin (Akreditasi A)",
            "Pendidikan Teknik Bangunan (Akreditasi A)",
            "Teknik Sipil (Akreditasi C)",
            "Pendidikan Teknologi Informasi (Akreditasi C)",
            "Teknik Elektro (Akreditasi C)",
            "Teknik Mesin (Akreditasi C)",
            "Pendidikan Tata Boga (Akreditasi A)",
            "Pendidikan Tata Busana (Akreditasi B)",
            "Pendidikan Tata Rias (Akreditasi B)"
    };
    String[] FIKS1 = new String[]{
            "Pendidikan Jasmani dan Kesehatan (Akreditasi A)",
            "Pendidikan Kepelatihan Olahraga (Akreditasi A)",
            "Ilmu Keolahragaan (Akreditasi A)"
    };
    String[] FES1 = new String[]{
            "Pendidikan Ekonomi (Akreditasi A)",
            "Pendidikan Akuntansi (Akreditasi A)",
            "Pendidikan Administrasi Perkantoran (Akreditasi A)",
            "Pendidikan Tata Niaga (Akreditasi B)	",
            "Manajemen (Akreditasi B)",
            "Akuntansi (Akreditasi B)"
    };

    //FK
    String[] PS2 = new String[]{
            "Pendidikan Olahraga (Akreditasi A)",
            "Pendidikan Bahasa dan Sastra Indonesia-Daerah (Akreditasi B)",
            "Teknologi Pendidikan (Akreditasi B)",
            "Pendidikan Bahasa dan Sastra Asing-Jepang (Akreditasi B)",
            "Pendidikan Dasar (Akreditasi B)",
            "Pendidikan Bahasa dan Sastra Inggris (Akreditasi B)",
            "Pendidikan Ilmu Pengetahuan Sosial (Akreditasi A)",
            "Pendidikan Teknologi dan Kejuruan (Akreditasi B)",
            "Pendidikan Bahasa dan Sastra Asing-Jerman (Akreditasi B)",
            "Pendidikan Luar Biasa (Akreditasi B)",
            "Pendidikan Ekonomi. (Akreditasi B)",
            "Pendidikan Matematika (Akreditasi B)",
            "Manajemen Pendidikan (Akreditasi B)",
            "Pendidikan Seni Budaya (Akreditasi B)",
            "Pendidikan Sains (Akreditasi B)"
    };
    String[] PS3 = new String[]{
            "Teknologi Pendidikan (Akreditasi B)",
            "Pendidikan Matematika (Akreditasi B)",
            "Pendidikan Sains (Akreditasi B)",
            "Pendidikan Bahasa dan Sastra (Akreditasi B)",
            "Ilmu Keolahragaan (Akreditasi A)"
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
        setContentView(R.layout.unesa_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(D3);
        secondLevel.add(S1);
        secondLevel.add(S2);
        secondLevel.add(S3);

        //Isi Data Prodi ke Fakultas
        //D3
        thirdLevelD3.put(D3[0], FBSD3);
        thirdLevelD3.put(D3[1], FISD3);
        thirdLevelD3.put(D3[2], FTD3);
        thirdLevelD3.put(D3[3], FED3);

        //S1
        thirdLevelS1.put(S1[0], FIPS1);
        thirdLevelS1.put(S1[1], FBSS1);
        thirdLevelS1.put(S1[2], FMIPAS1);
        thirdLevelS1.put(S1[3], FISS1);
        thirdLevelS1.put(S1[4], FTS1);
        thirdLevelS1.put(S1[5], FIKS1);
        thirdLevelS1.put(S1[6], FES1);
        //S2
        thirdLevelS2.put(S2[0], PS2);
        //S3
        thirdLevelS3.put(S3[0], PS3);

        //Tampilkan Semua Data
        data.add(thirdLevelD3);
        data.add(thirdLevelS1);
        data.add(thirdLevelS2);
        data.add(thirdLevelS3);



//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        Unesa_ThreeLevelListAdapter threeLevelListAdapterAdapter = new Unesa_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
