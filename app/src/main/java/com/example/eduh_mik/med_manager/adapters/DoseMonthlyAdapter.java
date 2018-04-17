package com.example.eduh_mik.med_manager.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eduh_mik.med_manager.R;
import com.example.eduh_mik.med_manager.adapters.viewholders.DoseMonthlyViewHolder;
import com.example.eduh_mik.med_manager.adapters.viewholders.DoseViewHolder;
import com.example.eduh_mik.med_manager.models.Dose;

import java.util.ArrayList;

public class DoseMonthlyAdapter extends RecyclerView.Adapter<DoseMonthlyViewHolder>{

    private Context _context;
    private ArrayList<Dose> doseList;
    public DoseMonthlyAdapter(Context mContext, ArrayList<Dose> doseItemList) {
        this._context = mContext;
        this.doseList = doseItemList;
    }
    @Override
    public DoseMonthlyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_monthly_item, parent, false);
        return new DoseMonthlyViewHolder(_context,itemView);
    }

    @Override
    public void onBindViewHolder(final DoseMonthlyViewHolder holder, int position) {
        holder.bind(doseList.get(position));
    }
    @Override
    public int getItemCount() {
        return null== doseList ? 0 : doseList.size();
    }
}
