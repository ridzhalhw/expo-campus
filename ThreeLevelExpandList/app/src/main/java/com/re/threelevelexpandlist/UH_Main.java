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
public class UH_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "S1",
            "S2",
            "S3"
    };

    String[] S1 = new String[]{
            "Fakultas Pertanian",
            "Fakultas Ilmu Sosial dan Ilmu Politik",
            "Fakultas Ilmu Budaya",
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Hukum",
            "Fakultas Farmasi",
            "Fakultas Kedokteran Gigi",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Kehutanan",
            "Fakultas Peternakan",
            "Fakultas Teknik",
            "Fakultas Ilmu Kelautan & Perikanan",
            "Fakultas Kesehatan Masyarakat",
            "Fakultas Kedokteran"
    };

    String[] S2 = new String[]{
            "Fakultas Pertanian",
            "Fakultas Ilmu Budaya",
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Hukum",
            "Fakultas Farmasi",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Peternakan",
            "Fakultas Teknik",
            "Fakultas Kesehatan Masyarakat",
            "Fakultas Kedokteran"
    };

    String[] S3 = new String[]{
            "Fakultas Pertanian",
            "Fakultas Ilmu Budaya",
            "Fakultas Ekonomi dan Bisnis"
    };

    String[] FPtS1 = new String[]{
            "Agroteknologi (Akreditasi A)",
            "Agribisnis (Akreditasi A)",
            "Keteknikan Pertanian (Akreditasi B)",
            "Ilmu dan Teknologi Pangan (Akreditasi B)"
    };

    String[] FPtS2 = new String[]{
            "Agroteknologi",
            "Ilmu dan Teknologi Pangan",
            "Keteknikan Pertanian",
            "Hama dan Penyakit Tumbuhan (Akreditasi B)",
            "Agroindustri",
            "Perencanaan dan Pengembangan Pedesaan (Akreditasi B)",
            "Manajemen Sumberdaya Lahan",
            "Sistem-sistem Pertanian (Akreditasi B)"
    };

    String[] FPtS3 = new String[]{
            "Ilmu Pertanian (Akreditasi A)"
    };

    String[] FISIPS1 = new String[]{
            "Jurusan Ilmu Administrasi Negara (Akreditasi A)",
            "Jurusan Ilmu Komunikasi (Akreditasi B)",
            "Jurusan Sosiologi (Akreditasi B)",
            "Jurusan Ilmu Politik/Pemerintahan (Akreditasi A)",
            "Program Studi Ilmu Pemerintahan (Akreditasi B)",
            "Program Studi Ilmu Politik (Akreditasi A)",
            "Jurusan Antropologi (Akreditasi A)",
            "Jurusan Hubungan Internasional (Akreditasi A)"
    };

    String[] FIBS1 = new String[]{
            "Jurusan Sastra Indonesia (Akreditasi B)",
            "Jurusan Sastra Inggris (Akreditasi B)",
            "Jurusan Sastra Asia Barat (Arab) (Akreditasi A)",
            "Jurusan SastraBarat Roman (Perancis) (Akreditasi B)",
            "Jurusan Ilmu Sejarah (Akreditasi B)",
            "Jurusan Sastra Daerah (Akreditasi B)",
            "Arkeologi (Akreditasi B)",
            "Sastra Jepang (Akreditasi B)"
    };

    String[] FIBS2 = new String[]{
            "Ilmu Lingustik (Akreditasi B)"
    };

    String[] FIBS3 = new String[]{
            "Ilmu Lingustik (Akreditasi B)"
    };

    String[] FEBS1 = new String[]{
            "Ilmu Ekonomi",
            "Manajemen (Akreditasi A)",
            "Akuntansi (Akreditasi A)"
    };

    String[] FEBS2 = new String[]{
            "Ekonomi Perencanaan Pembangunan (EPP) (Akreditasi B)",
            "Ekonomi Sumberdaya (ESD) (Akreditasi B)",
            "Manajemen Dan Keuangan (MAK) (Akreditasi B)",
            "Magister Manajemen (MM) (Akreditasi B)",
            "Magister sains Akuntansi (MSA) (Akreditasi B)",
            "Magister Keuangan Daerah (MKD) (Akreditasi B)"
    };

    String[] FEBS3 = new String[]{
            "Program Doktor Ilmu Ekonomi (Akreditasi B)",
            "Program Doktor Ilmu Ekonomi – Kekhususan Manejemen",
            "Program Doktor Ilmu Ekonomi – kekhususan Akuntansi"
    };

    String[] FHS1 = new String[]{
            "Ilmu Hukum (Akreditasi A)",
            "Ilmu Hukum Administrasi Negara (Akreditasi B)"
    };

    String[] FHS2 = new String[]{
            "Magister Ilmu Hukum (Akreditasi A)",
            "Magister Kenotariatan (Akreditasi B)"
    };

    String[] FFS1 = new String[]{
            "Farmasi (Akreditasi A)",
            "Apoteker"
    };

    String[] FFS2 = new String[]{
            "Magister Farmasi (Akreditasi A)"
    };

    String[] FKGS1 = new String[]{
            "Kedokteran Gigi (Akreditasi A)"
    };

    String[] FMIPAS1 = new String[]{
            "Matematika (Akreditasi A)",
            "Kimia (Akreditasi A)",
            "Fisika (Akreditasi B)",
            "Biologi (Akreditasi A)"
    };

    String[] FMIPAS2 = new String[]{
            "Geofisika"
    };

    String[] FKHtS1 = new String[]{
            "Kehutanan (Akreditasi B)"
    };

    String[] FPS1 = new String[]{
            "Peternakan (Akreditasi A)"
    };

    String[] FPS2 = new String[]{
            "Ilmu dan Teknologi Peternakan (Akreditasi B)"
    };

    String[] FTS1 = new String[]{
            "Teknik Elektro (Akreditasi A)",
            "Teknik Sipil (Akreditasi A)",
            "Teknik Mesin (Akreditasi B)",
            "Teknik Industri (Akreditasi B)",
            "Teknik Perkapalan (Akreditasi B)",
            "Teknik Geologi (Akreditasi B)",
            "Teknik Arsitektur (Akreditasi B)"
    };

    String[] FTS2= new String[]{
            "Magister Teknik Sipil (Akreditasi A)",
            "Magister Teknik Elektro (Akreditasi B)",
            "Magister Teknik Mesin (Akreditasi B)",
            "Magister Teknik Arsitektur (Akreditasi B)",
            "Magister Teknik Geologi (Akreditasi B)"
    };

    String[] FIKPS1 = new String[]{
            "Ilmu Kelautan (Akreditasi A)",
            "Perikanan",
            "Program Studi Budidaya Perairan (BDP) (Akreditasi A)",
            "Program Studi Pemanfaatan Sumberdaya Perikanan (PSP) (Akreditasi A)",
            "Program Studi Sosial Ekonomi Perikanan (SEP) (Akreditasi A)"
    };

    String[] FKMS1 = new String[]{
            "Administrasi dan Kebijakan Kesehatan (Akreditasi A)"
    };
    String[] FKMS2 = new String[]{
            "Ilmu Gizi (Akreditasi A)"
    };
    String[] FKS1 = new String[]{
            "Ilmu Keperawatan (Akreditasi B)",
            "Ilmu Kedokteran (Akreditasi A)",
            "Fisioterapi (Akreditasi B)",
            "Psikologi (Akreditasi C)",
            "Kedokteran Hewan (Akreditasi B)"

    };
    String[] FKS2 = new String[]{
            "Magister Ilmu Kedokteran (Akreditasi B)",
            "Magister Ilmu Keperawatan (Akreditasi B)"
    };

    //====================================================================================
    //setting level ke 3


    LinkedHashMap<String, String[]> thirdLevelS1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS2 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelS3 = new LinkedHashMap<>();

    //setting level ke 2

    List<String[]> secondLevel = new ArrayList<>();
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uh_main);


        // Isi Data Fakultas ke Jenjang

        secondLevel.add(S1);
        secondLevel.add(S2);
        secondLevel.add(S3);

        //Isi Data Prodi ke Fakultas
        //S1
        thirdLevelS1.put(S1[0], FPtS1);
        thirdLevelS1.put(S1[1], FISIPS1);
        thirdLevelS1.put(S1[2], FIBS1);
        thirdLevelS1.put(S1[3], FEBS1);
        thirdLevelS1.put(S1[4], FHS1);
        thirdLevelS1.put(S1[5], FFS1);
        thirdLevelS1.put(S1[6], FKGS1);
        thirdLevelS1.put(S1[7], FMIPAS1);
        thirdLevelS1.put(S1[8], FKHtS1);
        thirdLevelS1.put(S1[9], FPS1);
        thirdLevelS1.put(S1[10], FTS1);
        thirdLevelS1.put(S1[11], FIKPS1);
        thirdLevelS1.put(S1[12], FKMS1);
        thirdLevelS1.put(S1[13], FKS1);

        //S2
        thirdLevelS2.put(S2[0], FPtS2);
        thirdLevelS2.put(S2[1], FIBS2);
        thirdLevelS2.put(S2[2], FEBS2);
        thirdLevelS2.put(S2[3], FHS2);
        thirdLevelS2.put(S2[4], FFS2);
        thirdLevelS2.put(S2[5], FMIPAS2);
        thirdLevelS2.put(S2[6], FPS2);
        thirdLevelS2.put(S2[7], FTS2);
        thirdLevelS2.put(S2[8], FKMS2);
        thirdLevelS2.put(S2[9], FKS2);

        //S3
        thirdLevelS3.put(S3[0], FPtS3);
        thirdLevelS3.put(S3[1], FIBS3);
        thirdLevelS3.put(S3[2], FEBS3);


        data.add(thirdLevelS1);
        data.add(thirdLevelS2);
        data.add(thirdLevelS3);


//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        UH_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UH_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
