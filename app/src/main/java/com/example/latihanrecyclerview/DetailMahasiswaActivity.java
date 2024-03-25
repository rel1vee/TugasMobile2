package com.example.latihanrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailMahasiswaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mahasiswa);

        // Mendapatkan data mahasiswa dari intent
        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        String nim = intent.getStringExtra("nim");
        int foto = intent.getIntExtra("foto", 0);

        // Menginisialisasi view
        ImageView imageViewMahasiswa = findViewById(R.id.imageViewDetailMahasiswa);
        TextView textViewNama = findViewById(R.id.textViewDetailNama);
        TextView textViewNIM = findViewById(R.id.textViewDetailNIM);

        // Mengatur data pada view
        imageViewMahasiswa.setImageResource(foto);
        textViewNama.setText(nama);
        textViewNIM.setText(nim);
    }
}