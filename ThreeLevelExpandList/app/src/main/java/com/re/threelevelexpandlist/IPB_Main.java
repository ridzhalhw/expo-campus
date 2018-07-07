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
public class IPB_Main extends AppCompatActivity {

    /**
     * The Expandable list view.
     */
    ExpandableListView expandableListView;

    //Jenjang

    String[] jenjang = new String[]{
            "D3",
            "S1",
            "Profesi",
            "S2",
            "S3"
    };

    /**
     * FAKULTAS S1-------------------------------------------------------
     */
    String[] Prodi1 = new String[]{
            "Program Studi"
    };
    String[] Prodi2 = new String[]{
            "Program Studi"
    };
    String[] Prodi3 = new String[]{
            "Program Studi"
    };
    String[] Prodi4 = new String[]{
            "Program Studi"
    };
    String[] Prodi5 = new String[]{
            "Program Studi"
    };

    // Prodi Tiap Fakultas-------------------------------------------------------------------------

    String[] ProdiD3 = new String[]{
            "Manajemen Agribisnis (Akreditasi B)",
            "Ekowisata (Akreditasi B)",
            "Komunikasi (Akreditasi B)",
            "Keahlian Teknologi Produksi Dan Manajemen Perikanan (Akreditasi A)",
            "Teknologi Industri Benih (Akreditasi B)",
            "Teknologi Produksi Dan Manajemen Perikanan Budidaya (Akreditasi A)",
            "Teknik Komputer (Akreditasi B)",
            "Teknik Dan Manajemen Lingkungan (Akreditasi B)",
            "Teknologi Dan Manajemen Ternak (Akreditasi A)",
            "Supervisor Jaminan Mutu Pangan (Akreditasi B)",
            "Manajemen Industri Jasa Makanan Dan Gizi (Akreditasi B)",
            "Manajemen Industri (Akreditasi B)",
            "Keahlian Perkebunan Kelapa Sawit (Akreditasi B)",
            "Akuntansi (Akreditasi B)",
            "Analis Kimia (Akreditasi B)",
            "Keahlian Teknologi Dan Manajemen Produksi Perkebunan (Akreditasi B)",
            "Keahlian Paramedik Veteriner (Akreditasi B)",
            "Teknologi Produksi Dan Pengembangan Masyarakat Pertanian (Akreditasi B)",
            "Manajemen Informatika (Akreditasi B)",
            "Perencanaan Dan Pengendalian Produksi Manufaktur/jasa (Akreditasi C)"
    };
    String[] ProdiS1 = new String[]{
            "Teknologi Hasil Hutan (Akreditasi A)",
            "Konservasi Sumberdaya Hutan Dan Ekowisata (Akreditasi A)",
            "Manajemen Sumberdaya Lahan (Akreditasi A)",
            "Profesi Dokter Hewan (Akreditasi A)",
            "Ekonomi Sumberdaya Dan Lingkungan (Akreditasi A)",
            "Fisika (Akreditasi A)",
            "Teknologi Pangan (Akreditasi A)",
            "Teknik Mesin Dan Biosistem (Akreditasi B)",
            "Manajemen Hutan (Akreditasi A)",
            "Teknik Sipil Dan Lingkungan (Akreditasi A)",
            "Proteksi Tanaman (Akreditasi A)",
            "Manajemen (Akreditasi A)",
            "Statistika (Akreditasi A)",
            "Agronomi Dan Hortikultura (Akreditasi A)",
            "Ekonomi Pembangunan (Akreditasi A)",
            "Arsitektur Lansekap (Akreditasi A)",
            "Teknologi Hasil Perairan (Akreditasi A)",
            "Meteorologi Terapan (Akreditasi A)",
            "Teknologi Dan Manajemen Perikanan Tangkap (Akreditasi A)",
            "Teknologi Industri Pertanian (Akreditasi A)",
            "Matematika (Akreditasi A)",
            "Nutrisi Dan Teknologi Pakan (Akreditasi A)",
            "Teknologi Produksi Ternak (Akreditasi A)",
            "Biokimia (Akreditasi A)",
            "Kimia (Akreditasi A)",
            "Teknologi Dan Manajemen Perikanan Budidaya (Akreditasi A)",
            "Ilmu Ekonomi Syariah (Akreditasi B)",
            "Agribisnis (Akreditasi A)",
            "Biologi (Akreditasi A)",
            "Silvilkultur (Akreditasi A)",
            "Ilmu Keluarga Dan Konsumen (Akreditasi A)",
            "Manajemen Sumber Daya Perairan (Akreditasi A)",
            "Ilmu Dan Teknologi Kelautan (Akreditasi A)",
            "Komunikasi Dan Pengembangan Masyarakat (Akreditasi A)",
            "Ilmu Gizi (Akreditasi A)",
            "Ilmu Komputer (Akreditasi A)",
            "Kedokteran Hewan (Akreditasi A)",
            "Teknik Pertanian (Akreditasi A)",
            "Konservasi Sumber Daya Hutan (Akreditasi A)"
    };
    String[] ProdiProfesi = new String[]{
            "Profesi Dokter Hewan (Akreditasi A)"
    };
    String[] ProdiS2 = new String[]{
            "Biofisika (Akreditasi A)",
            "Ilmu Produksi Dan Teknologi Peternakan (Akreditasi A)",
            "Arsitektur Lanskap (Akreditasi A)",
            "Pemuliaan Dan Bioteknologi Tanaman (Akreditasi A)",
            "Ilmu Ekonomi (Akreditasi A)",
            "Teknologi Kelautan (Akreditasi A)",
            "Teknik Sipil Dan Lingkungan (Akreditasi C)",
            "Pengelolaan Daerah Aliran Sungai (Akreditasi A)",
            "Komunikasi Pembangunan Pertanian Dan Pedesaan (Akreditasi A)",
            "Entomologi (Akreditasi A)",
            "Agroteknologi Tanah (Akreditasi B)",
            "Ilmu Perencanaan Pembangunan Wilayah Dan Pedesaan (Akreditasi A)",
            "Ilmu Pengelolaan Sumberdaya Alam Dan Lingkungan (Akreditasi A)",
            "Ilmu Biomedis Hewan (Akreditasi A)",
            "Teknologi Perikanan Laut (Akreditasi A)",
            "Statistika Terapan (Akreditasi A)",
            "Ilmu Keluarga Dan Perkembangan Anak (Akreditasi A)",
            "Teknologi Pasca Panen (Akreditasi A)",
            "Teknik Mesin Pertanian Dan Pangan (Akreditasi A)",
            "Silvikultur Tropika (Akreditasi B)",
            "Manajemen Ekowisata Dan Jasa Lingkungan (Akreditasi B)",
            "Kesehatan Masyarakat Veteriner (Akreditasi A)",
            "Ilmu Pangan (Akreditasi A)",
            "Profesional Teknologi Pangan (Akreditasi A)",
            "Teknologi Hasil Perairan (Akreditasi A)",
            "Ilmu Pengelolaan Hutan (Akreditasi A)",
            "Agronomi Dan Hortikultura (Akreditasi A)",
            "Konservasi Biodiversitas Tropika (Akreditasi B)",
            "Ilmu Nutrisi Dan Pakan (Akreditasi A)",
            "Manajemen Dan Bisnis (Akreditasi A)",
            "Fitopatologi (Akreditasi A)",
            "Ilmu Gizi (Akreditasi A)",
            "Ilmu Penyuluhan Pembangunan (Akreditasi A)",
            "Ilmu Manajemen (Akreditasi B)",
            "Pengendalian Hama Terpadu (Akreditasi B)",
            "Biologi Tumbuhan (Akreditasi A)",
            "Matematika Terapan (Akreditasi A)",
            "Kimia (Akreditasi A)",
            "Teknologi Industri Pertanian (Akreditasi A)",
            "Parasitologi Dan Entomologi Kesehatan (Akreditasi B)",
            "Biosains Hewan (Akreditasi A)",
            "Mikrobiologi (Akreditasi A)",
            "Ilmu Komputer (Akreditasi A)",
            "Teknologi Informasi Pengelolaan Sumber Daya Alam (Akreditasi B)",
            "Statistika (Akreditasi A)",
            "Biokimia (Akreditasi B)",
            "Ekonomi Sumberdaya Dan Lingkungan (Akreditasi A)",
            "Ilmu Akuakultur (Akreditasi A)",
            "Pengelolaan Sumberdaya Pesisir Dan Lautan (Akreditasi A)",
            "Perencanaan Wilayah (Akreditasi A)",
            "Sains Agribisnis (Akreditasi A)",
            "Profesional Perbenihan (Akreditasi B)",
            "Mitigasi Bencana Kerusakan Lahan (Akreditasi B)",
            "Teknologi Informasi Untuk Perpustakaan (Akreditasi B)",
            "Pengelolaan Sumberdaya Perairan (Akreditasi A)",
            "Ilmu Ekonomi Pertanian (Akreditasi A)",
            "Bioteknologi (Akreditasi A)",
            "Ilmu Kelautan (Akreditasi A)",
            "Sosiologi Pedesaan (Akreditasi A)",
            "Ilmu-ilmu Faal Dan Khasiat Obat (Akreditasi A)",
            "Arsitektur Lansekap (Akreditasi A)",
            "Pengembangan Masyarakat (Akreditasi A)",
            "Primatologi (Akreditasi B)",
            "Pengembangan Industri Kecil Menengah (Akreditasi A)",
            "Manajemen Ketahanan Pangan (Akreditasi B)",
            "Biologi Reproduksi (Akreditasi A)",
            "Bioteknologi Tanah Dan Lingkungan (Akreditasi B)",
            "Manajemen Pembangunan Daerah (Akreditasi A)",
            "Anatomi Dan Perkembangan Hewan (Akreditasi B)",
            "Ekonomi Sumberdaya Kelautan Tropika (Akreditasi A)",
            "Ilmu Dan Teknologi Benih (Akreditasi B)",
            "Mikrobiologi Medik (Akreditasi A)",
            "Ilmu Dan Teknologi Hasil Hutan (Akreditasi B)",
            "Ilmu Tanah (Akreditasi A)",
            "Provesional Konservasi Keanekaragamaan Hayati (Akreditasi B)",
            "Klimatologi Terapan (Akreditasi A)",
            "Magister Manajemen (Akreditasi A)"
    };
    String[] ProdiS3 = new String[]{
            "Silvikultur Tropika (Akreditasi B)",
            "Fitopatologi (Akreditasi A)",
            "Konservasi Biodiversitas Tropika (Akreditasi B)",
            "Ilmu Produksi Dan Teknologi Peternakan (Akreditasi A)",
            "Manajemen Dan Bisnis (Akreditasi A)",
            "Ilmu Kelautan (Akreditasi A)",
            "Teknologi Kelautan (Akreditasi A)",
            "Ilmu Penyuluhan Pembangunan (Akreditasi A)",
            "Pemuliaan Dan Bioteknologi Tanaman (Akreditasi A)",
            "Kesehatan Masyarakat Veteriner (Akreditasi A)",
            "Manajemen Ekowisata Dan Jasa Lingkungan (Akreditasi B)",
            "Statistika (Akreditasi A)",
            "Teknologi Industri Pertanian (Akreditasi A)",
            "Ilmu Nutrisi Dan Pakan (Akreditasi A)",
            "Teknologi Perikanan Laut (Akreditasi A)",
            "Agronomi Dan Hortikultura (Akreditasi A)",
            "Ilmu Pengelolaan Hutan (Akreditasi B)",
            "Ilmu Gizi (Akreditasi A)",
            "Ilmu Pangan (Akreditasi A)",
            "Mikrobiologi (Akreditasi A)",
            "Pengelolaan Sumberdaya Pesisir Dan Lautan (Akreditasi B)",
            "Ekonomi Sumberdaya Kelautan Tropika (Akreditasi A)",
            "Ilmu Keteknikan Pertanian (Akreditasi A)",
            "Ilmu Akuakultur (Akreditasi A)",
            "Pengelolaan Sumberdaya Perairan (Akreditasi A)",
            "Ilmu Ekonomi Pertanian (Akreditasi A)",
            "Parasitologi Dan Entomologi Kesehatan (Akreditasi B)",
            "Biosains Hewan (Akreditasi A)",
            "Ilmu Tanah (Akreditasi A)",
            "Biologi Tumbuhan (Akreditasi A)",
            "Pengelolaan Daerah Aliran Sungai (Akreditasi A)",
            "Ilmu Dan Teknologi Hasil Hutan (Akreditasi B)",
            "Komunikasi Pembangunan Pertanian Dan Pedesaaan (Akreditasi A)",
            "Ilmu Dan Teknologi Benih (Akreditasi B)",
            "Ilmu-ilmu Faal Dan Khasiat Obat (Akreditasi B)",
            "Primatologi (Akreditasi B)",
            "Entomologi (Akreditasi A)",
            "Biologi Reproduksi (Akreditasi A)",
            "Ilmu Pengelolaan Sumber Daya Alam Dan Lingkungan (Akreditasi A)",
            "Ilmu Biomedis Hewan (Akreditasi A)",
            "Sosiologi Pedesaan (Akreditasi A)",
            "Manajemen Bisnis (Akreditasi A)",
            "Klimatologi Terapan (Akreditasi A)",
            "Ilmu Perencanaan Pembangunan Wilayah Dan Pedesaan (Akreditasi B)"

    };

    //====================================================================================
    //setting level ke 3

    LinkedHashMap<String, String[]> thirdLevelProdi1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelProdi2 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelProdi3 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelProdi4 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelProdi5 = new LinkedHashMap<>();

    //setting level ke 2

    List<String[]> secondLevel = new ArrayList<>();
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ipb_main);


        // Isi Data Fakultas ke Jenjang
        secondLevel.add(Prodi1);
        secondLevel.add(Prodi2);
        secondLevel.add(Prodi3);
        secondLevel.add(Prodi4);
        secondLevel.add(Prodi5);

        //Isi Data Prodi ke Fakultas
        //D3
        thirdLevelProdi1.put(Prodi1[0], ProdiD3);

        thirdLevelProdi2.put(Prodi2[0], ProdiS1);

        thirdLevelProdi3.put(Prodi3[0], ProdiProfesi);

        thirdLevelProdi4.put(Prodi4[0], ProdiS2);

        thirdLevelProdi5.put(Prodi5[0], ProdiS3);


        data.add(thirdLevelProdi1);
        data.add(thirdLevelProdi2);
        data.add(thirdLevelProdi3);
        data.add(thirdLevelProdi4);
        data.add(thirdLevelProdi5);

//=========================================================================================================
        // expandable listview
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);

        // parent adapter
        IPB_ThreeLevelListAdapter threeLevelListAdapterAdapter = new IPB_ThreeLevelListAdapter(this, jenjang, secondLevel, data);


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
