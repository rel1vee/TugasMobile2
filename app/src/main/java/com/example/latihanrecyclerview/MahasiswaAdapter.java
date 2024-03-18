package com.example.latihanrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {
    private final Context context;
    private final List<Mahasiswa> mahasiswaList;

    public MahasiswaAdapter(Context context, List<Mahasiswa> mahasiswaList) {
        this.context = context;
        this.mahasiswaList = mahasiswaList;
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        Mahasiswa mahasiswa = mahasiswaList.get(position);
        holder.textViewNama.setText(mahasiswa.getNama());
        holder.textViewNIM.setText(mahasiswa.getNim());
        holder.imageViewMahasiswa.setImageResource(mahasiswa.getFoto());
    }

    @Override
    public int getItemCount() {
        return mahasiswaList.size();
    }

    public static class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNama;
        TextView textViewNIM;
        ImageView imageViewMahasiswa;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNama = itemView.findViewById(R.id.textViewNama);
            textViewNIM = itemView.findViewById(R.id.textViewNIM);
            imageViewMahasiswa = itemView.findViewById(R.id.imageViewMahasiswa);
        }
    }
}
