package com.re.threelevelexpandlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Home extends AppCompatActivity {

    private ListView lvList;

    ListViewAdapter adapter;

    String[] values = new String[]{
            "Institut Pertanian Bogor",
            "Politeknik Kesehatan Malang",
            "Universitas Airlangga",
            "Universitas Brawijaya",
            "Universitas Gadjah Mada",
            "Universitas Negeri Surabaya",
            "Universitas Negeri Yogjakarta",
            "Universitas Padjajaran",
            "Universitas Sebelas Maret",
            "Universitas Ahmad Dahlan",
            "Universitas Andalas",
            "Universitas Gunadarma",
            "Institut Teknologi Bandung",
            "Universitas Udayana",
            "Universitas Hasanuddin",
            "Universitas Islam Indonesia",
            "Universitas Telkom",
            "Universitas Negeri Jakarta",
            "Universitas Jember",
            "Universitas Maulana Malik Ibrahim",
            "Universitas Bina Nusantara",
            "Universitas Huang Tuah Surabaya",
            "Politeknik Negeri Malang",
            "Universitas Negeri Malang",
            "Universitas Indonesia",
    };

    String[] subvalues = new String[]{
            "4 Fakultas 181 Program Studi",
            "1 Fakultas 12 Program Studi",
            "16 Fakultas 165 Program Studi",
            "16 Fakultas 87 Program Studi",
            "18 Fakultas 68 Program Studi",
            "7 Fakultas 83 Program Studi",
            "7 Fakultas 67 Program Studi",
            "16 Fakultas 67 Program Studi",
            "10 Fakultas 64 Program Studi",
            "11 Fakultas 40 Program Studi",
            "13 Fakultas 102 Program Studi",
            "9 Fakultas 28 Program Studi",
            "12 Fakultas 49 Program Studi",
            "15 Fakultas 99 Program Studi",
            "14 Fakultas 85 Program Studi",
            "8 Fakultas 28 Program Studi",
            "6 Fakultas 31 Program Studi",
            "9 Fakultas 96 Program Studi",
            "15 Fakultas 68 Program Studi",
            "4 Fakultas 34 Program Studi",
            "4 Fakultas 27 Program Studi",
            "4 Fakultas 18 Program Studi",
            "2 Fakultas 11 Program Studi",
            "1 Fakultas 45 Program Studi",
            "1 Fakultas 32 Program Studi",
    };

    Integer[] imgid = {
            R.drawable.ipb,
            R.drawable.poltekesmalang,
            R.drawable.unair,
            R.drawable.ub,
            R.drawable.ugm,
            R.drawable.unesa,
            R.drawable.uny,
            R.drawable.unpad,
            R.drawable.uns,
            R.drawable.uad,
            R.drawable.uan,
            R.drawable.ugun,
            R.drawable.itb,
            R.drawable.ud,
            R.drawable.uh,
            R.drawable.uii,
            R.drawable.telkom,
            R.drawable.unj,
            R.drawable.unej,
            R.drawable.uin,
            R.drawable.binus,
            R.drawable.ht,
            R.drawable.poltek,
            R.drawable.um,
            R.drawable.ui,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);

        lvList = (ListView) findViewById(R.id.lvList);
        adapter = new ListViewAdapter(Home.this, values, subvalues, imgid);

        lvList.setAdapter(adapter);
        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent ipb = new Intent(getApplicationContext(), IPB_Main.class);
                        startActivity(ipb);
                        break;
                    case 1:
                        Intent poltekesmalang = new Intent(getApplicationContext(), PKM_Main.class);
                        startActivity(poltekesmalang);
                        break;
                    case 2:
                        Intent unair = new Intent(getApplicationContext(), Unair_Main.class);
                        startActivity(unair);
                        break;
                    case 3:
                        Intent ub = new Intent(getApplicationContext(), UB_main.class);
                        startActivity(ub);
                        break;
                    case 4:
                        Intent ugm = new Intent(getApplicationContext(), UGM_Main.class);
                        startActivity(ugm);
                        break;
                    case 5:
                        Intent unesa = new Intent(getApplicationContext(), Unesa_Main.class);
                        startActivity(unesa);
                        break;
                    case 6:
                        Intent uny = new Intent(getApplicationContext(), UNY_Main.class);
                        startActivity(uny);
                        break;
                    case 7:
                        Intent unpad = new Intent(getApplicationContext(), Unpad_Main.class);
                        startActivity(unpad);
                        break;
                    case 8:
                        Intent uns = new Intent(getApplicationContext(), UNS_Main.class);
                        startActivity(uns);
                        break;
                    case 9:
                        Intent uad = new Intent(getApplicationContext(), UAD_Main.class);
                        startActivity(uad);
                        break;
                    case 10:
                        Intent uan = new Intent(getApplicationContext(), UAN_Main.class);
                        startActivity(uan);
                        break;
                    case 11:
                        Intent ugun = new Intent(getApplicationContext(), UGUN_Main.class);
                        startActivity(ugun);
                        break;
                    case 12:
                        Intent itb = new Intent(getApplicationContext(), ITB_Main.class);
                        startActivity(itb);
                        break;
                    case 13:
                        Intent ud = new Intent(getApplicationContext(), UD_Main.class);
                        startActivity(ud);
                        break;
                    case 14:
                        Intent uh = new Intent(getApplicationContext(), UH_Main.class);
                        startActivity(uh);
                        break;
                    case 15:
                        Intent uii = new Intent(getApplicationContext(), UII_Main.class);
                        startActivity(uii);
                        break;
                    case 16:
                        Intent telkom = new Intent(getApplicationContext(), Telkom_Main.class);
                        startActivity(telkom);
                        break;
                    case 17:
                        Intent unj = new Intent(getApplicationContext(), UNJ_Main.class);
                        startActivity(unj);
                        break;
                    case 18:
                        Intent unej = new Intent(getApplicationContext(), UNEJ_Main.class);
                        startActivity(unej);
                        break;
                    case 19:
                        Intent uin = new Intent(getApplicationContext(), UIN_Main.class);
                        startActivity(uin);
                        break;
                    case 20:
                        Intent binus = new Intent(getApplicationContext(), Binus_Main.class);
                        startActivity(binus);
                        break;
                    case 21:
                        Intent ht = new Intent(getApplicationContext(), HT_Main.class);
                        startActivity(ht);
                        break;
                    case 22:
                        Intent poltek = new Intent(getApplicationContext(), Poltek_Main.class);
                        startActivity(poltek);
                        break;
                    case 23:
                        Intent um = new Intent(getApplicationContext(), UM_Main.class);
                        startActivity(um);
                        break;
                    case 24:
                        Intent ui = new Intent(getApplicationContext(), UI_Main.class);
                        startActivity(ui);
                        break;
                }
            }
        });
    }
}
