package top.stores.vigerlankaapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import top.stores.vigerlankaapp.R

class HomeAdapter : RecyclerView.Adapter<HomeAdapterViewHolder>() {

    private val spiceList = arrayOf("Black Pepper",
        "Red Pepper", "Cinnamon", "Tumereic",
        "Cummin", "Tea powder", "Packaging and Shipping")

    private val imageSetHome = arrayOf(
        R.drawable.black_peper, R.drawable.red_peper,
        R.drawable.cinnamon, R.drawable.tumeric,
        R.drawable.cumin, R.drawable.tea_powder,
        R.drawable.container_packaging)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapterViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_card_view, parent, false)
        return HomeAdapterViewHolder(v)
    }

    override fun getItemCount(): Int {
        return spiceList.size

    }

    override fun onBindViewHolder(holder: HomeAdapterViewHolder, position: Int) {
        holder.tvHomeItem.text = spiceList[position]
        holder.imageVSpcie.setImageResource(imageSetHome[position])

    }

}