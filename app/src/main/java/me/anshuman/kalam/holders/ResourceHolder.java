package me.anshuman.kalam.holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import me.anshuman.kalam.R;

public class ResourceHolder extends RecyclerView.ViewHolder {

    public TextView mName;
    public ResourceHolder(@NonNull View itemView) {
        super(itemView);

        mName=itemView.findViewById(R.id.resource_single_tv);



    }
}