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
public class Unpad_Main extends AppCompatActivity {

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
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Kedokteran",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Ilmu Budaya",
            "Fakultas Ilmu Sosial dan Politik",
            "Fakultas Ilmu Komunikasi"
    };

    String[] S1 = new String[]{
            "Fakultas Hukum",
            "Fakultas Kedokteran",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Pertanian",
            "Fakultas Kedokteran Gigi",
            "Fakultas Ilmu Budaya",
            "Fakultas Ilmu Sosial dan Politik",
            "Fakultas Psikologi",
            "Fakultas Peternakan",
            "Fakultas Ilmu Komunikasi",
            "Fakultas Keperawatan",
            "Fakultas Perikanan dan Ilmu Kelautan",
            "Fakultas Teknologi Industri Pertanian",
            "Fakultas Farmasi",
            "Fakultas Teknik Geologi"
    };
    String[] Profesi = new String[]{
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Kedokteran",
            "Fakultas Kedokteran Gigi",
            "Fakultas Keperawatan",
            "Fakultas Farmasi"
    };
    String[] S2 = new String[]{
            "Fakultas Hukum",
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Kedokteran",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Pertanian",
            "Fakultas Kedokteran Gigi",
            "Fakultas Ilmu Budaya",
            "Fakultas Ilmu Sosial dan Politik",
            "Fakultas Psikologi",
            "Fakultas Peternakan",
            "Fakultas Ilmu Komunikasi",
            "Fakultas Keperawatan",
            "Fakultas Teknologi Industri Pertanian",
            "Fakultas Farmasi",
            "Fakultas Teknik Geologi"
    };
    String[] S3 = new String[]{
            "Fakultas Hukum",
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Kedokteran",
            "Fakultas Matematika dan Ilmu Pengetahuan Alam",
            "Fakultas Pertanian",
            "Fakultas Ilmu Budaya",
            "Fakultas Ilmu Sosial dan Politik",
            "Fakultas Psikologi",
            "Fakultas Peternakan",
            "Fakultas Ilmu Komunikasi",
            "Fakultas Teknik Geologi"
    };

    // Prodi Tiap Fakultas-------------------------------------------------------------------------

    String[] FEBD3 = new String[]{
            "Akuntasi ( Akreditasi B)",
            "Manajemen Pemasaran ( Akreditasi A)",
            "Perpajakan ( Akreditasi B)",
            "Bisnis Internasional ( Akreditasi B)",
            "Akuntansi perpajakan"
    };
    String[] FKD3 = new String[]{
            "Kebidanan ( Akreditasi B)",
            "D4 Kebidanan ( Akreditasi B)"
    };
    String[] FMIPAD3 = new String[]{
            "Manajemen Informatika ( Akreditasi B)",
            "Teknik Informatika ( Akreditasi B)",
            "Teknik Komputer ( Akreditasi B)",
            "Kimia Industri ( Akreditasi B)",
            "Analisis Kimia ( Akreditasi B)"
    };
    String[] FIBD3 = new String[]{
            "Editing",
            "Usaha Perjalanan Wisata (Akreditasi B)"
    };
    String[] FISIPD3 = new String[]{
            "Administrasi ( Akreditasi A)",
            "Administrasi Pemerintahan ( Akreditasi B)"
    };
    String[] FIKD3 = new String[]{
            "Penyiaran",
            "Kehumasan",
            "Periklanan",
            "Komunikasi Bisnis",
            "Informasi dan Perpustakaan"
    };

    //S1
    String[] FHS1 = new String[]{
            "Ilmu Hukum (Akreditasi A)",
            "Fakultas Ekonomi dan Bisnis",
            "Akuntasi (Akreditasi A)",
            "Ekonomi Pembangunan (Akreditasi A)",
            "Manajemen (Akreditasi A)",
            "Ekonomi Islam"
    };
    String[] FKS1 = new String[]{
            "Kedokteran (Akreditasi A)",
            "Kedokteran Hewan",
            "Kedokteran Twinning"
    };
    String[] FMIPAS1 = new String[]{
            "Matematika (Akreditasi A)",
            "Kimia (Akreditasi A)",
            "Fisika (Akreditasi A)",
            "Biologi (Akreditasi A)",
            "Statistika (Akreditasi B)",
            "Geofisika (Akreditasi C)",
            "Teknik Informatika (Akreditasi B)",
            "Teknik Elektro"
    };
    String[] FPtS1 = new String[]{
            "Agroteknologi (Akreditasi A)",
            "Agribisnis (Akreditasi A)"
    };
    String[] FKGS1 = new String[]{
            "Pendidikan Kedokteran Gigi (Akreditasi A)"
    };
    String[] FIBS1 = new String[]{
            "Sastra Indonesia (Akreditasi A)",
            "Sastra Sunda (Akreditasi B)",
            "Sastra Jepang (Akreditasi A)",
            "Sastra Inggris (Akreditasi A)",
            "Sastra Perancis (Akreditasi B)",
            "Sastra Jerman (Akreditasi B)",
            "Sastra Arab (Akreditasi A)",
            "Sastra Rusia (Akreditasi A)",
            "Ilmu Sejarah"
    };
    String[] FISIPS1 = new String[]{
            "Ilmu Administrasi Negara (Akreditasi A)",
            "Ilmu Hubungan Internasional (Akreditasi A)",
            "Ilmu Kesejahteraan Sosial",
            "Ilmu Pemerintahan (Akreditasi A)",
            "Ilmu Administrasi Bisnis (Akreditasi A)",
            "Ilmu Politik (Akreditasi B)",
            "Antropologi",
            "Sosiologi (Akreditasi A)"
    };
    String[] FPsS1 = new String[]{
            "Psikologi (Akreditasi A)"
    };
    String[] FPS1 = new String[]{
            "Ilmu Peternakan (Akreditasi A)"
    };
    String[] FIKS1 = new String[]{
            "Ilmu Komunikasi (Akreditasi A)",
            "Ilmu Perpustakaan (Akreditasi A)",
            "Hubungan Masyarakat (Akreditasi A)",
            "Jurnalistik (Akreditasi A)",
            "Manajemen Komunikasi (Akreditasi A)",
            "Televisi dan Film (Akreditasi B)"
    };
    String[] FKepS1 = new String[]{
            "Ilmu Keperawatan (Akreditasi A)"
    };
    String[] FPIKS1 = new String[]{
            "Perikanan (Akreditasi A)",
            "Ilmu Kelautan (Akreditasi A)"
    };
    String[] FTPS1 = new String[]{
            "Teknik Pertanian (Akreditasi A)",
            "Teknologi Pangan (Akreditasi A)",
            "Teknologi Industri Pertanian"
    };
    String[] FFS1 = new String[]{
            "Farmasi (Akreditasi A)"
    };
    String[] FTGS1 = new String[]{
            "Teknik Geologi (Akreditasi A)"
    };
    //Profesi
    String[] FEBProfesi = new String[]{
            "Pendidikan Profesi Akuntasi ( Akreditasi A)"
    };
    String[] FKProfesi = new String[]{
            "Pendidikan Dokter ( Akreditasi A)"
    };
    String[] FKGProfesi = new String[]{
            "Pendidikan Profesi Dokter Gigi ( Akreditasi A)"
    };
    String[] FKepProfesi = new String[]{
            "Profesi Ners ( Akreditasi A)"
    };
    String[] FFProfesi = new String[]{
            "Profesi Apoteker ( Akreditasi A)"
    };
    //S2
    String[] FHS2 = new String[]{
            "Ilmu Hukum ( Akreditasi A)",
            "Kenotariatan (Akreditasi A)"
    };
    String[] FEBS2 = new String[]{
            "Ilmu Ekonomi (Akreditasi A)",
            "Manajemen (Akreditasi A)",
            "Akuntasi (Akreditasi A)",
            "Ekonomi (Akreditasi A)"
    };
    String[] FKS2 = new String[]{
            "Ilmu Kedokteran Dasar (Akreditasi A)",
            "Ilmu Kesehatan Masyarakat (Akreditasi B)",
            "Kebidanan (Akreditasi B)"
    };
    String[] FMIPAS2 = new String[]{
            "Ilmu Kimia (Akreditasi B)",
            "Statistika Terapan (Akreditasi B)",
            "Matematika ( Akreditasi B)",
            "Biologi ( Akreditasi B)"
    };
    String[] FPtS2 = new String[]{
            "Ilmu Ekonomi Pertanian (Akreditasi B)",
            "Ilmu Tanah (Akreditasi B)",
            "Ilmu Tanaman (Akreditasi B)"
    };
    String[] FKGS2 = new String[]{
            "BKU Biologi Oral",
            "BKU Ilmu Material kedokteran Gigi"
    };
    String[] FIBS2 = new String[]{
            "Ilmu Sastra (Akreditasi B)",
            "Kajian Budaya (Akreditasi A)",
            "Ilmu Linguistik",
            "Ilmu Sejarah"
    };
    String[] FISIPS2 = new String[]{
            "Administrasi Publik (Akreditasi A)",
            "Administrasi Bisnis ( Akreditasi B)",
            "Ilmu Politik (Akreditasi B)",
            "Antropologi (Akreditasi B)",
            "Sosiologi ( Akreditasi A)",
            "Kesejahteraan Sosial (Akreditasi C)",
            "Ilmu- ilmu social Konsentrasi ( Akreditasi A)"
    };
    String[] FPsS2 = new String[]{
            "Psikologi (Akreditasi B)"
    };
    String[] FPS2 = new String[]{
            "Peternakan Konsentrasi Nutrisi ternak ( Akreditasi A)",
            "Peternakan Konsentrasi Produk Ternak ( Akreditasi A)",
            "Peternakan Konsentrasi Ilmu Pemuliaan dan Reproduksi Ternak ( Akreditasi A)"
    };
    String[] FIKS2 = new String[]{
            "Ilmu Komunikasi ( Akreditasi A)",
            "Komunikasi Bisnis ( Akreditasi A)",
            "Public Relation ( Akreditasi A)",
            "Ilmu Informasi dan Perpustakaan ( Akreditasi A)"
    };
    String[] FKepS2 = new String[]{
            "Keperawatan (Akreditasi B)"
    };
    String[] FTPS2 = new String[]{
            "Teknologi Agroindustri (Akreditasi B)"
    };
    String[] FFS2 = new String[]{
            "Farmasi (Akreditasi B)"
    };
    String[] FTGS2 = new String[]{
            "Teknik Geologi ( Akreditasi A)"
    };
    //S3
    String[] FHS3 = new String[]{
            "Ilmu Hukum( Akreditasi A)"
    };
    String[] FEBS3 = new String[]{
            "Ilmu Ekonomi ( Akreditasi A)",
            "Kekhususan Manajemen Bisnis",
            "Kekhususan Ekonomi Terapan"
    };
    String[] FKS3 = new String[]{
            "Ilmu Kedokteran ( Akreditasi A)"
    };
    String[] FMIPAS3 = new String[]{
            "Ilmu Kimia ( Akreditasi A)"
    };
    String[] FPtS3 = new String[]{
            "Ilmu Pertanian (regular) ( Akreditasi A)",
            "Research Ilmu Pertanian"
    };
    String[] FIBS3 = new String[]{
            "Ilmu Sastra ( Akreditasi B)"
    };
    String[] FISIPS3 = new String[]{
            "Sosiologi ( Akreditasi A)",
            "Antropologi",
            "administrasi Bisnis",
            "Administrasi Publik",
            "Ilmu Pemerintahan",
            "Hubungan Internasional ( Akreditasi B)"
    };
    String[] FPsS3 = new String[]{
            "Psikologi (Akreditasi C)",
            "Psikologi Perkembangan",
            "Psikologi Sosial",
            "Psikologi Industri dan Organisasi",
            "Psikologi Klinis",
            "Psikologi Pendidikan"
    };
    String[] FPS3 = new String[]{
            "Peternakan ( Akreditasi B)"
    };
    String[] FIKS3 = new String[]{
            "Ilmu Komunikasi ( Akreditasi A)"
    };
    String[] FTGS3 = new String[]{
            "Teknik Geologi ( Akreditasi B)"
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
        setContentView(R.layout.unpad_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(D3);
        secondLevel.add(S1);
        secondLevel.add(Profesi);
        secondLevel.add(S2);
        secondLevel.add(S3);

        //Isi Data Prodi ke Fakultas
        //D3
        thirdLevelD3.put(D3[0], FEBD3);
        thirdLevelD3.put(D3[1], FKD3);
        thirdLevelD3.put(D3[2], FMIPAD3);
        thirdLevelD3.put(D3[3], FIBD3);
        thirdLevelD3.put(D3[4], FISIPD3);
        thirdLevelD3.put(D3[5], FIKD3);

        //S1
        thirdLevelS1.put(S1[0], FHS1);
        thirdLevelS1.put(S1[1], FKS1);
        thirdLevelS1.put(S1[2], FMIPAS1);
        thirdLevelS1.put(S1[3], FPtS1);
        thirdLevelS1.put(S1[4], FKGS1);
        thirdLevelS1.put(S1[5], FIBS1);
        thirdLevelS1.put(S1[6], FISIPS1);
        thirdLevelS1.put(S1[7], FPsS1);
        thirdLevelS1.put(S1[8], FPS1);
        thirdLevelS1.put(S1[9], FIKS1);
        thirdLevelS1.put(S1[10], FKepS1);
        thirdLevelS1.put(S1[11], FPIKS1);
        thirdLevelS1.put(S1[12], FTPS1);
        thirdLevelS1.put(S1[13], FFS1);
        thirdLevelS1.put(S1[14], FTGS1);

        //Profesi
        thirdLevelProfesi.put(Profesi[0], FEBProfesi);
        thirdLevelProfesi.put(Profesi[1], FKProfesi);
        thirdLevelProfesi.put(Profesi[2], FKGProfesi);
        thirdLevelProfesi.put(Profesi[3], FKepProfesi);
        thirdLevelProfesi.put(Profesi[4], FFProfesi);

        //S2
        thirdLevelS2.put(S2[0], FHS2);
        thirdLevelS2.put(S2[1], FEBS2);
        thirdLevelS2.put(S2[2], FKS2);
        thirdLevelS2.put(S2[3], FMIPAS2);
        thirdLevelS2.put(S2[4], FPtS2);
        thirdLevelS2.put(S2[5], FKGS2);
        thirdLevelS2.put(S2[6], FIBS2);
        thirdLevelS2.put(S2[7], FISIPS2);
        thirdLevelS2.put(S2[8], FPsS2);
        thirdLevelS2.put(S2[9], FPS2);
        thirdLevelS2.put(S2[10], FIKS2);
        thirdLevelS2.put(S2[11], FKepS2);
        thirdLevelS2.put(S2[12], FTPS2);
        thirdLevelS2.put(S2[13], FFS2);
        thirdLevelS2.put(S2[14], FTGS2);

        //S3
        thirdLevelS3.put(S3[0], FHS3);
        thirdLevelS3.put(S3[1], FEBS3);
        thirdLevelS3.put(S3[2], FKS3);
        thirdLevelS3.put(S3[3], FMIPAS3);
        thirdLevelS3.put(S3[4], FPtS3);
        thirdLevelS3.put(S3[5], FIBS3);
        thirdLevelS3.put(S3[6], FISIPS3);
        thirdLevelS3.put(S3[7], FPsS3);
        thirdLevelS3.put(S3[8], FPS3);
        thirdLevelS3.put(S3[9], FIKS3);
        thirdLevelS3.put(S3[10], FTGS3);

        data.add(thirdLevelD3);
        data.add(thirdLevelS1);
        data.add(thirdLevelProfesi);
        data.add(thirdLevelS2);
        data.add(thirdLevelS3);

//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        Unpad_ThreeLevelListAdapter threeLevelListAdapterAdapter = new Unpad_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
