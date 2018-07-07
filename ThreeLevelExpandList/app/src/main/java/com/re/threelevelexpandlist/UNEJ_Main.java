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
public class UNEJ_Main extends AppCompatActivity {

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
            "Fakultas Ekonomi",
            "Fakultas Ilmu Sosial dan Ilmu Politik",
            "Fakultas Teknik"
    };

    String[] S1 = new String[]{
            "Fakultas Sastra dan Budaya",
            "Fakultas Ekonomi",
            "Fakultas Hukum",
            "Fakultas Keguruan dan Ilmu Pendidikan",
            "Fakultas Kesehatan Masyarakat",
            "Fakultas Ilmu Sosial dan Ilmu Politik",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Pertanian",
            "Fakultas Farmasi",
            "Fakultas Teknik",
            "Fakultas Teknologi Pertanian",
            "Fakultas Kedokteran",
            "Fakultas Kedokteran Gigi",
            "Fakultas Sistem Informasi",
            "Fakultas Ilmu keperawatan"
    };

    String[] S2 = new String[]{
            "Fakultas Ekonomi",
            "Fakultas Hukum",
            "Fakultas Keguruan dan Ilmu Pendidikan",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Pertanian",
            "Fakultas Teknologi Pertanian"
    };

    String[] S3 = new String[]{
            "Fakultas Ekonomi",
            "Fakultas Hukum",
            "Fakultas Pertanian"
    };

    String[] FSBS1 = new String[]{
            "Sastra Inggris (Akreditasi B)",
            "Sastra Indonesia (Akreditasi B)",
            "Ilmu Sejarah (Akreditasi B)",
            "Televisi dan Film (Akreditasi C)"
    };

    String[] FED3 = new String[]{
            "Manajemen Perusahaan (Akreditasi B)",
            "Administrasi Keuangan (Akreditasi B)",
            "Kesekretariat (Akreditasi B)"
    };

    String[] FES1 = new String[]{
            "Ekonomi Pembangunan (Akreditasi A)",
            "Manajemen (Akreditasi A)",
            "Akutansi (Akreditasi A)"

    };

    String[] FES2 = new String[]{
            "Ilmu Manajemen (Akreditasi A)",
            "Ilmu Ekonomi (Akreditasi B)"

    };

    String[] FES3 = new String[]{
            "Ilmu Ekonomi",
            "Ilmu Manajemen"
    };

    String[] FHS1 = new String[]{
            "Ilmu Hukum (Akreditasi B)"
    };

    String[] FHS2 = new String[]{
            "Ilmu Hukum (Akreditasi B)"
    };

    String[] FHS3 = new String[]{
            "Ilmu Hukum",
            "Pendidikan Khusus Profesi Advikat "
    };

    String[] FKIPS1 = new String[]{
            "Pendidikan Matematika (Akreditasi A)",
            "Pendidikan Fisika (Akreditasi B)",
            "Pendidikan Biologi (Akreditasi A)",
            "Pendidikan Luar Sekolah (Akreditasi A)",
            "Pendidikan Ekonomi (Akreditasi B)",
            "Pendidikan Bahasa dan Sastra Indonesia (Akreditasi B)",
            "Pendidikan Guru Sekolah Dasar / PGSD (Akreditasi B)"
    };

    String[] FKIPS2 = new String[]{
            "Pendidikan Matematika dan Ilmu Pengetahuan Alam / MIPA (Akreditasi B)",
            "Pendidikan Ilmu Pengetahuan Sosial / IPS ",
            "Pendidikan Matematika (Akreditasi B)"
    };

    String[] FKMS1 = new String[]{
            "Ilmu Kesehatan Masyarakat (Akreditasi B)"
    };

    String[] FISIPD3 = new String[]{
            "Perpajakan (Akreditasi B)",
            "Usaha Perjalanan dan Akomodasi Wisata (Akreditasi B)"
    };

    String[] FISIPS1 = new String[]{
            "Ilmu Hubungan Internasional (Akreditasi A)",
            "Ilmu Administrasi Negera (Akreditasi A)",
            "Ilmu Administrasi Bisnis (Akreditasi B)",
            "Ilmu Kesejahteraan Sosial (Akreditasi B)",
            "Sosiologi (Akreditasi B)"
    };

    String[] FMIPAS1 = new String[]{
            "Matematika (Akreditasi B)",
            "Fisika (Akreditasi A)",
            "Kimia (Akreditasi B)",
            "Biologi (Akreditasi B)"
    };

    String[] FMIPAS2 = new String[]{
            "Biologi",
            "Matematika"
    };

    String[] FPtS1 = new String[]{
            "Agroteknologi (Akreditasi B)",
            "Agribisnis (Akreditasi A)"
    };

    String[] FPtS2 = new String[]{
            "Agribisnis (Akreditasi B)",
            "Agronomi (Akreditasi B)"
    };

    String[] FPtS3 = new String[]{
            "Ilmu Pertanian"
    };

    String[] FFS1 = new String[]{
            "Ilmu Farmasi (Akreditasi B)",
            "Profesi Apoteker (Akreditasi B)"
    };

    String[] FTD3 = new String[]{
            "Teknik Mesin (Akreditasi B)",
            "Teknik Informatika (Akreditasi B)",
            "Teknik Sipil (Akreditasi B)"
    };

    String[] FTS1 = new String[]{
            "Teknik Mesin (Akreditasi B)",
            "Teknik Elektro (Akreditasi B)",
            "Teknik Sipil (Akreditasi B)"
    };

    String[] FTPS1 = new String[]{
            "Teknologi Hasil Pertanian (Akreditasi A)",
            "Teknik Pertanian (Akreditasi B)",
            "Teknologi Industri Pertanian"
    };

    String[] FTPS2 = new String[]{
            "Teknologi Agroindustri"
    };

    String[] FKS1 = new String[]{
            "Pendidikan Dokter (Akreditasi A)",
            "Program Profesi Dokter (Akreditasi A)"
    };

    String[] FKGS1 = new String[]{
            "Pendidikan Dokter Gigi (Akreditasi A)",
            "Program Profesi Dokter Gigi (Akreditasi A)"
    };

    String[] FSIS1= new String[]{
            "Sistem Informasi (Akreditasi B)",
            "Teknologi Informasi"
    };

    String[] FIKS1 = new String[]{
            "Ilmu Keperawatan (Akreditasi B)",
            "Program Profesi Ners (Akreditasi B)"
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
        setContentView(R.layout.unej_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(D3);
        secondLevel.add(S1);
        secondLevel.add(S2);
        secondLevel.add(S3);

        //Isi Data Prodi ke Fakultas
        //D3
        thirdLevelD3.put(D3[0], FED3);
        thirdLevelD3.put(D3[1], FISIPD3);
        thirdLevelD3.put(D3[2], FTD3);

        //S1
        thirdLevelS1.put(S1[0], FSBS1);
        thirdLevelS1.put(S1[1], FES1);
        thirdLevelS1.put(S1[2], FHS1);
        thirdLevelS1.put(S1[3], FKIPS1);
        thirdLevelS1.put(S1[4], FKMS1);
        thirdLevelS1.put(S1[5], FISIPS1);
        thirdLevelS1.put(S1[6], FMIPAS1);
        thirdLevelS1.put(S1[7], FPtS1);
        thirdLevelS1.put(S1[8], FFS1);
        thirdLevelS1.put(S1[9], FTS1);
        thirdLevelS1.put(S1[10], FTPS1);
        thirdLevelS1.put(S1[11], FKS1);
        thirdLevelS1.put(S1[12], FKGS1);
        thirdLevelS1.put(S1[13], FSIS1);
        thirdLevelS1.put(S1[14], FIKS1);

        //S2
        thirdLevelS2.put(S2[0], FES2);
        thirdLevelS2.put(S2[1], FHS2);
        thirdLevelS2.put(S2[2], FKIPS2);
        thirdLevelS2.put(S2[3], FMIPAS2);
        thirdLevelS2.put(S2[4], FPtS2);
        thirdLevelS2.put(S2[5], FTPS2);

        //S3
        thirdLevelS3.put(S3[0], FES3);
        thirdLevelS3.put(S3[1], FHS3);
        thirdLevelS3.put(S3[2], FPtS3);

        data.add(thirdLevelD3);
        data.add(thirdLevelS1);
        data.add(thirdLevelS2);
        data.add(thirdLevelS3);

//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        UNEJ_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UNEJ_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
