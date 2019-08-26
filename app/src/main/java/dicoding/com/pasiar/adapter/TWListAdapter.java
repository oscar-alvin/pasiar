package dicoding.com.pasiar.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

import dicoding.com.pasiar.Detail;
import dicoding.com.pasiar.R;
import dicoding.com.pasiar.model.wisata;

public class TWListAdapter extends RecyclerView.Adapter<TWListAdapter.MyViewHolder> {

    private Context context;
    private List<wisata> wList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView idlok,namatempat, lokasi, jarak;
        public ImageView gambar;
        public RelativeLayout viewBackground, viewForeground;
        public CardView cvWisata;

        public MyViewHolder(View view) {
            super(view);
            idlok        = (TextView)view.findViewById(R.id.rid_lokasi);
            namatempat   = (TextView)view.findViewById(R.id.r_nama_t4);
            lokasi       = (TextView)view.findViewById(R.id.r_lokasi);
            gambar       = (ImageView)view.findViewById(R.id.r_gambar);
            jarak        = (TextView)view.findViewById(R.id.r_jarak);
//            viewBackground = (RelativeLayout) view.findViewById(R.id.view_background);
            viewForeground = (RelativeLayout) view.findViewById(R.id.view_foreground);
            cvWisata  = (CardView)view.findViewById(R.id.cardviewItem);
        }
    }

    public TWListAdapter(Context context, List<wisata> cartList) {
        this.context = context;
        this.wList = cartList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final wisata item = wList.get(holder.getAdapterPosition());

        holder.idlok.setText(item.getId_t4w()+"");
        holder.namatempat.setText(item.getNama_t4w());
        holder.lokasi.setText(item.getLokasi());
        holder.jarak.setText(item.getJarak()+" km");
        Glide.with(context).load(item.getGambar()).override(100,100).centerCrop().into(holder.gambar);

        holder.gambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JumpToDetail(holder.getAdapterPosition());
            }
        });
        holder.cvWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JumpToDetail(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return wList.size();
    }


    public void JumpToDetail(int row){
        if(row>-1){
            Intent i = new Intent(context, Detail.class);
            i.putExtra("idw", row);
            context.startActivity(i);
        }else Toast.makeText(context, "Tidak ada data/baris yang dipilih", Toast.LENGTH_SHORT);
    }
} 