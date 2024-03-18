package com.example.latihanrecyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewMahasiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Mahasiswa> mahasiswaList = generateMahasiswaList(); // Fungsi untuk menghasilkan daftar mahasiswa
        MahasiswaAdapter adapter = new MahasiswaAdapter(this, mahasiswaList);
        recyclerView.setAdapter(adapter);
    }

    // Fungsi untuk menghasilkan daftar mahasiswa
    private List<Mahasiswa> generateMahasiswaList() {
        List<Mahasiswa> list = new ArrayList<>();

        list.add(new Mahasiswa("Abmi Sukma Edri", "12250120341", R.drawable.ami));
        list.add(new Mahasiswa("Ahmad Kurniawan", "12250111514" , R.drawable.ahmed));
        list.add(new Mahasiswa("Aufa Hajati", "12250120338" , R.drawable.aufa));
        list.add(new Mahasiswa("Daffa Finanda", "12250111603", R.drawable.dudung));
        list.add(new Mahasiswa("Daffa Ikhwan Nurfauzan", "12250110979", R.drawable.dapa));
        list.add(new Mahasiswa("Dwi Jelita Adhliyah", "12250120331", R.drawable.jelita));
        list.add(new Mahasiswa("Dwi Mahdini", "12250111298", R.drawable.dwik));
        list.add(new Mahasiswa("Fajri", "12250110382", R.drawable.fajri));
        list.add(new Mahasiswa("Fakhri", "12250111381", R.drawable.fakhri));
        list.add(new Mahasiswa("Farras Lathief", "12250111328", R.drawable.farras));
        list.add(new Mahasiswa("Gilang Ramadhan Indra", "12250111323", R.drawable.gilang));
        list.add(new Mahasiswa("Hafiz Alhadid Rahman", "12250111794", R.drawable.hafidz));
        list.add(new Mahasiswa("Haritsah Naufaldy", "12250110361", R.drawable.aldy));
        list.add(new Mahasiswa("M. Nabil Dawami", "12250111527", R.drawable.nabil));
        list.add(new Mahasiswa("Muh. Zaki Erbai Syas", "12250111134", R.drawable.zaki));
        list.add(new Mahasiswa("Muhammad Aditya Rinaldi", "12250111048", R.drawable.adit));
        list.add(new Mahasiswa("Muhammad Dhimas Hadid Fachrezy", "12250111231 ", R.drawable.dms));
        list.add(new Mahasiswa("Muhammad Faruq", "12250111791", R.drawable.faruqhz));
        list.add(new Mahasiswa("Muhammad Rafly Wirayudha", "12250111489", R.drawable.rafly));
        list.add(new Mahasiswa("Nurika Dwi Wahyuni", "12250120360", R.drawable.nurika));
        list.add(new Mahasiswa("Ogya Secio Noegroho.S", "12250111346", R.drawable.ogi));
        list.add(new Mahasiswa("Raka Sabri", "12250111791", R.drawable.default_avatar));
        list.add(new Mahasiswa("Rahma Laksita", "12250110342", R.drawable.rahma));
        list.add(new Mahasiswa("Surya Hidayatullah Firdaus", "12250111759", R.drawable.surya));

        return list;
    }
}
