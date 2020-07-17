package top.stores.vigerlankaapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import top.stores.vigerlankaapp.R

class HomeAdapterViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
    var tvHomeItem: TextView
    var imageVSpcie: ImageView


    init {
        tvHomeItem = itemView.findViewById(R.id.tv_home_spice_name)
        imageVSpcie = itemView.findViewById(R.id.home_spice_image)

    }


}
