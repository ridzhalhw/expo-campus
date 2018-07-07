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
public class UNJ_Main extends AppCompatActivity {

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

    String[] D3 = new String[]{
            "Fakultas Ilmu Sosial",
            "Fakultas Teknik",
            "Fakultas Ekonomi"
    };

    String[] S1 = new String[]{
            "Fakultas Ilmu Pendidikan",
            "Fakultas Ilmu Sosial",
            "Fakultas Ilmu Keolahragaan",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Teknik",
            "Fakultas Ekonomi",
            "Fakultas Bahasa dan Seni"
    };

    String[] S2 = new String[]{
            "Fakultas Ilmu Pendidikan",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Teknik",
            "Fakultas Ekonomi",
            "Fakultas Bahasa dan Seni",
            "Pasca Sarjana"
    };

    String[] S3 = new String[]{
            "Program Studi"
    };

    String[] PS3 = new String[]{
            "Teknologi Pendidikan (Akreditasi B)",
            "Teknologi Pendidikan Konsentrasi Pendidikan Anak Usia Dini",
            "Pendidikan Dasar",
            "Manajemen Pendidikan (Akreditasi A)",
            "Penelitian dan Evaluasi Pendidikan (Akreditasi B)",
            "Pendidikan Bahasa",
            "Pendidikan Sejarah",
            "Pendidikan Olahraga (Akreditasi A)",
            "Pendidikan Kependudukan dan Lingkungan Hidup (Akreditasi B)",
            "Pendidikan Kependudukan dan Lingkungan Hidup Konsentasi Manajemen Lingkungan",
            "Ilmu Manajemen MSDM"
    };

    String[] Pasca = new String[]{
            "Teknologi Pendidikan (Akreditasi B)",
            "Manajemen Pendidikan",
            "Penelitian dan Evaluasi Pendidikan (Akreditasi B)",
            "Pendidikan Bahasa (Akreditasi A)",
            "Linguistik Terapan (Akreditasi B)",
            "Pendidikan Olahraga (Akreditasi A)",
            "Pendidikan Olahraga Konsentrasi Manajemen Olahraga",
            "Pendidikan Kependudukan dan Lingkungan Hidup (Akreditasi A)",
            "Manajemen Lingkungan (Akreditasi B)",
            "Pendidikan Anak Usia Dini (Akreditasi B)",
            "Pendidikan Dasar (Akreditasi A)",
            "Pendidikan Sejarah (Akreditasi A)"
    };

    String[] FIPS1 = new String[]{
            "Bimbingan dan Konseling (Akreditasi B)",
            "Kurikulum dan Teknologi Pendidikan (Akreditasi A)",
            "Pendidikan Luar Biasa (PLB) (Akreditasi B)",
            "Manajemen Pendidikan (Akreditasi A)",
            "Pendidikan Luar Sekolah (Akreditasi B)",
            "Pendidikan Anak Usia Dini (PAUD) (Akreditasi B)",
            "Pendidikan Guru Sekolah Dasar (PGSD) (Akreditasi A)",
            "Psikologi (Akreditasi B)"

    };

    String[] FIPS2 = new String[]{
            "Bimbingan dan Konseling"
    };

    String[] FISD3 = new String[]{
            "Hubungan Masyarakat (Akreditasi B)",
            "Jasa Usaha Wisata (Akreditasi B)"

    };

    String[] FISS1 = new String[]{
            "Pendidikan Pancasila dan Kewarganegaraan (Akreditasi B)",
            "Pendidikan Sejarah (Akreditasi A)",
            "Pendidikan Geografi (Akreditasi A)",
            "Pendidikan Ilmu Agama Islam (Akreditasi B)",
            "Pendidikan Sosiologi (Akreditasi B)",
            "Sosiologi (Akreditasi B)",
            "Pendidikan Ilmu Pengetahuan Sosial (Akreditasi B)"

    };

    String[] FIKS1 = new String[]{
            "Pendidikan Jasmani, Kesehatan dan Rekreasi (Akreditasi A)",
            "Pendidikan Kepelatihan Olahraga (Akreditasi A)",
            "Ilmu Keolahragaan (Akreditasi A)"

    };

    String[] FMIPAS1 = new String[]{
            "Pendidikan Matematika (Akreditasi A)",
            "Matematika (Akreditasi B)",
            "Pendidikan Fisika (Akreditasi B)",
            "Fisika (Akreditasi B)",
            "Pendidikan Kimia (Akreditasi A)",
            "Kimia (Akreditasi A)",
            "Pendidikan Biologi (Akreditasi A)",
            "Biologi (Akreditasi A)",
            "Sistem Informatika (Akreditasi C)",
            "Statistika"

    };

    String[] FMIPAS2 = new String[]{
            "Pendidikan Matematika (Akreditasi C)",
            "Pendidikan Fisika (Akreditasi B)",
            "Pendidikan Kimia (Akreditasi C)",
            "Pendidikan Biologi (Akreditasi C)"

    };

    String[] FTD3 = new String[]{
            "Teknik Elektronika (Akreditasi B)",
            "Teknik Mesin (Akreditasi B)",
            "Teknik Sipil  (Akreditasi B)",
            "Transportasi (Akreditasi C)",
            "Tata Boga (Akreditasi B)",
            "Tata Busana (Akreditasi B)",
            "Tata Rias (Akreditasi A)"

    };

    String[] FTS1 = new String[]{
            "Pendidikan Teknik Elektro (Akreditasi B)",
            "Pendidikan Teknik Elektronika (Akreditasi B)",
            "Pendidikan Teknik Informatika dan Komputer (Akreditasi C)",
            "Pendidikan Teknik Mesin (Akreditasi B)",
            "Pendidikan Teknik Bangunan (Akreditasi B)",
            "Pendidikan Tata Boga (Akreditasi A)",
            "Pendidikan Tata Busana (Akreditasi A)",
            "Pendidikan Tata Rias (Akreditasi A)",
            "Pendidikan Kesejahteraan Keluarga (Akreditasi A)"
    };

    String[] FTS2 = new String[]{
            "Pendidikan Teknologi dan Kejuruan (Akreditasi B)"
    };

    String[] FED3 = new String[]{
            "Sekretaris (Akreditasi B)",
            "Akuntansi (Akreditasi A)",
            "Manajemen Pemasaran (Akreditasi A)"
    };

    String[] FES1 = new String[]{
            "Pendidikan Ekonomi (Akreditasi A)",
            "Pendidikan Tata Niaga (Akreditasi B)",
            "Akuntansi (Akreditasi B)",
            "Manajemen (Akreditasi B)"

    };

    String[] FES2 = new String[]{
            "Manajemen (Akreditasi B)"
    };

    String[] FBSS1 = new String[]{
            "Pendidikan Bahasa dan Sastra Indonesia (Akreditasi A)",
            "Sastra Indonesia (Akreditasi A)",
            "Pendidikan Sastra Inggris (Akreditasi B)",
            "Sastra Inggris (Akreditasi B)",
            "Pendidikan Bahasa Prancis (Akreditasi B)",
            "Pendidikan Bahasa Jerman (Akreditasi B)",
            "Pendidikan Bahasa dan Sastra Arab (Akreditasi A)",
            "Pendidikan Bahasa Jepang (Akreditasi B)",
            "Pendidikan Bahasa Mandarin",
            "Pendidikan Seni Rupa (Akreditasi B)",
            "Pendidikan Seni Tari (Akreditasi B)",
            "Pendidikan Seni Musik (Akreditasi B)"
    };

    String[] FBS2 = new String[]{
            "Pendidikan Bahasa Inggris (Akreditasi C)"
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
        setContentView(R.layout.unj_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(D3);
        secondLevel.add(S1);
        secondLevel.add(S2);
        secondLevel.add(S3);

        //Isi Data Prodi ke Fakultas
        //D3
        thirdLevelD3.put(D3[0], FISD3);
        thirdLevelD3.put(D3[1], FTD3);
        thirdLevelD3.put(D3[2], FED3);

        //S1
        thirdLevelS1.put(S1[0], FIPS1);
        thirdLevelS1.put(S1[1], FISS1);
        thirdLevelS1.put(S1[2], FIKS1);
        thirdLevelS1.put(S1[3], FMIPAS1);
        thirdLevelS1.put(S1[4], FTS1);
        thirdLevelS1.put(S1[5], FES1);
        thirdLevelS1.put(S1[6], FBSS1);

        //S2
        thirdLevelS2.put(S2[0], FIPS2);
        thirdLevelS2.put(S2[1], FMIPAS2);
        thirdLevelS2.put(S2[2], FTS2);
        thirdLevelS2.put(S2[3], FES2);
        thirdLevelS2.put(S2[4], FBS2);
        thirdLevelS2.put(S2[5], Pasca);

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
        UNJ_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UNJ_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
