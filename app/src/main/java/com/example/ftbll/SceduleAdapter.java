package com.example.ftbll;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SceduleAdapter extends RecyclerView.Adapter<SceduleAdapter.SceduleViewHolder>{

    private ArrayList<modeljadwal> dataList;

    public SceduleAdapter(ArrayList<modeljadwal> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public SceduleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemview, parent, false);
        return new SceduleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SceduleViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getStrHomeTeam());
        holder.txtNpm.setText(dataList.get(position).getStrAwayTeam());
        holder.txtNoHp.setText(dataList.get(position).getStrDate());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class SceduleViewHolder extends RecyclerView.ViewHolder{

        private TextView txtNama, txtNpm, txtNoHp;

        public SceduleViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = (TextView) itemView.findViewById(R.id.txtaway);
            txtNoHp = (TextView) itemView.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}
