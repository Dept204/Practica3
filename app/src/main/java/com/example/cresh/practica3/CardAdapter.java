package com.example.cresh.practica3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cresh.practica3.pojo.Coupons;

/**
 * Created by Cresh on 09/12/2016.
 */


public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {


    private Context context;
    private Coupons[] coupons;

    public CardAdapter(Coupons[] cupones, Context context) {
        super();
        this.coupons = cupones;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.coupons_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        Coupons cupon = coupons[position];
        holder.txtCoupon.setText(cupon.getCode());
    }

    @Override
    public int getItemCount() {
        return coupons.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtCoupon;

        public ViewHolder(View itemView) {
            super(itemView);
            txtCoupon = (TextView) itemView.findViewById(R.id.txtCoupon);
        }
    }
}
