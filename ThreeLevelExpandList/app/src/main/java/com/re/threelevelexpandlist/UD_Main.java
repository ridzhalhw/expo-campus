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
public class UD_Main extends AppCompatActivity {

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
            "Fakultas Sastra dan Budaya",
            "Fakultas Kedokteran",
            "Fakultas Hukum",
            "Fakultas Teknik",
            "Fakultas Pertanian",
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Peternakan",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Kedokteran Hewan",
            "Fakultas Teknologi Pertanian",
            "Fakultas Pariwisata",
            "Fakultas Ilmu Sosial dan Ilmu Politik",
            "Fakultas Kelautan dan Perikanan"
    };

    String[] S2 = new String[]{
            "Program Studi"
    };

    String[] S3 = new String[]{
            "Program Studi"
    };

    String[] FSB = new String[]{
            "Antropologi Budaya (Akreditasi B)",
            "Arkeologi (Akreditasi B)",
            "Ilmu Sejarah (Akreditasi A)",
            "Sastra Bali (Akreditasi B)",
            "Sastra Daerah ",
            "Sastra Indonesia (Akreditasi B)",
            "Sastra Inggris (Akreditasi A)",
            "Sastra Jawa Kuno (Akreditasi B)",
            "Sastra Jepang (Akreditasi A)"
    };

    String[] FK = new String[]{
            "Ilmu Keperawatan (Akreditasi B)",
            "Ilmu Kesehatan Masyarakat (Akreditasi B)",
            "Kedokteran Gigi ",
            "Pendidikan Dokter (Akreditasi A)",
            "Psikologi (Akreditasi B)",
            "Sp1 Ilmu Anestesi dan Terapi Intensif ",
            "Sp1 Ilmu Bedah ",
            "Sp1 Ilmu Kandungan ",
            "Sp1 Ilmu Orthopaedi dan Traumatologi ",
            "Sp1 Kardiologi ",
            "Sp1 Kesehatan Anak ",
            "Sp1 Kesehatan Kulit & Kelamin ",
            "Sp1 Mata ",
            "Sp1 Pathologi Anatomi ",
            "Sp1 Penyakit Dalam ",
            "Sp1 Penyakit Syaraf ",
            "Sp1 Psikiatri ",
            "Sp1 THT"
    };

    String[] FH = new String[]{
            "Ilmu Hukum (Akreditasi A)"
    };

    String[] FT = new String[]{
            "Teknik Arsitektur (Akreditasi A)",
            "Teknik Elektro (Akreditasi B)",
            "Teknik Mesin (Akreditasi A)",
            "Teknik Sipil (Akreditasi B)",
            "Teknologi Informasi (Akreditasi B)"
    };

    String[] FPt = new String[]{
            "Agribisnis (Akreditasi A)",
            "Agroteknologi (Akreditasi A)",
            "Arsitektur Pertamanan (Akreditasi C)"
    };

    String[] FEB = new String[]{
            "Akuntansi (Akreditasi A)",
            "Ekonomi Pembangunan (Akreditasi A)",
            "Manajemen (Akreditasi A)",
            "Profesi Akuntan (Akreditasi B)"
    };

    String[] FP = new String[]{
            "Peternakan (Akreditasi A)"
    };

    String[] FMIPA = new String[]{
            "Biologi (Akreditasi A)",
            "Farmasi (Akreditasi A)",
            "Fisika (Akreditasi B)",
            "Ilmu Komputer/Teknik Informatika (Akreditasi B)",
            "Kimia (Akreditasi B)",
            "Matematika (Akreditasi B)",
            "Profesi Apoteker (Akreditasi B)"
    };

    String[] FKH = new String[]{
            "Kedokteran Hewan (Akreditasi A)"
    };

    String[] FTP = new String[]{
            "Ilmu dan Teknologi Pangan (Akreditasi B)",
            "Teknik Pertanian (Akreditasi B)",
            "Teknologi Industri Pertanian (Akreditasi B)"
    };

    String[] FPr = new String[]{
            "D4 Pariwisata (Akreditasi B)",
            "Destinasi Pariwisata (Akreditasi A)",
            "Industri Perjalanan Wisata (Akreditasi B)"
    };

    String[] FISIP = new String[]{
            "Ilmu Administrasi Negara (Akreditasi B)",
            "D3 Perpustakaan (Akreditasi B)",
            "Hubungan Internasional (Akreditasi B)",
            "Ilmu Komunikasi (Akreditasi B)",
            "Ilmu Politik (Akreditasi B)",
            "Ilmu Sosiologi (Akreditasi B)"
    };

    String[] FKP = new String[]{
            "Ilmu Kelautan (Akreditasi B)",
            "Manajemen Sumberdaya Perairan (Akreditasi B)"
    };

    String[] PS2 = new String[]{
            "Agribisnis (Akreditasi A)",
            "Agroteknologi",
            "Akuntansi (Akreditasi A)",
            "Bioteknologi Pertanian (Akreditasi A)",
            "Ergonomi Fisiologi Kerja (Akreditasi B)",
            "Fisiologi Olahraga (Akreditasi B)",
            "Ilmu Biomedik (Akreditasi B)",
            "Ilmu Ekonomi (Akreditasi B)",
            "Ilmu Hukum (Akreditasi A)",
            "Ilmu Kenotariatan (Akreditasi A)",
            "Ilmu Kesehatan Masyarakat (Akreditasi B)",
            "Ilmu Lingkungan (Akreditasi A)",
            "Ilmu Peternakan (Akreditasi A)",
            "Kajian Budaya (Akreditasi B)",
            "Kajian Pariwisata (Akreditasi A)",
            "Kimia Terapan (Akreditasi B)",
            "Lahan Kering (Akreditasi A)",
            "Linguistik (Akreditasi A)",
            "Manajemen (Akreditasi A)",
            "Teknik Arsitektur (Akreditasi A)",
            "Teknik Elektro (Akreditasi B)",
            "Teknik Mesin (Akreditasi B)",
            "Teknik Sipil (Akreditasi B)",
            "Teknologi Pangan (Akreditasi B)"
    };

    String[] PS3 = new String[]{
            "Ilmu Ekonomi (Akreditasi B)",
            "Ilmu Hukum (Akreditasi B)",
            "Ilmu Kedokteran (Akreditasi B)",
            "Ilmu Lingkungan (Akreditasi B)",
            "Ilmu Manajemen (Akreditasi B)",
            "Ilmu Pertanian (Akreditasi B)",
            "Ilmu Peternakan (Akreditasi B)",
            "Ilmu Teknik ",
            "Kajian Budaya (Akreditasi B)",
            "Linguistik (Akreditasi A)",
            "Pariwisata (Akreditasi A)"
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
        setContentView(R.layout.ud_main);


        // Isi Data Fakultas ke Jenjang

        secondLevel.add(S1);
        secondLevel.add(S2);
        secondLevel.add(S3);

        //Isi Data Prodi ke Fakultas

        //S1
        thirdLevelS1.put(S1[0], FSB);
        thirdLevelS1.put(S1[1], FK);
        thirdLevelS1.put(S1[2], FH);
        thirdLevelS1.put(S1[3], FT);
        thirdLevelS1.put(S1[4], FPt);
        thirdLevelS1.put(S1[5], FEB);
        thirdLevelS1.put(S1[6], FP);
        thirdLevelS1.put(S1[7], FMIPA);
        thirdLevelS1.put(S1[8], FKH);
        thirdLevelS1.put(S1[9], FTP);
        thirdLevelS1.put(S1[10], FPr);
        thirdLevelS1.put(S1[11], FISIP);
        thirdLevelS1.put(S1[12], FKP);

        //S2
        thirdLevelS2.put(S2[0], PS2);

        //S3
        thirdLevelS3.put(S3[0], PS3);



        data.add(thirdLevelS1);
        data.add(thirdLevelS2);
        data.add(thirdLevelS3);

//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        UD_ThreeLevelListAdapter threeLevelListAdapterAdapter = new UD_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
