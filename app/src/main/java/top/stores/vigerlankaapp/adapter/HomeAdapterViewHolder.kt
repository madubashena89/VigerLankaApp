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

//            itemView.setOnClickListener {
//                var position: Int = getAdapterPosition()
//                val context = itemView.context
//                val intent = Intent(context, DetailPertanyaan::class.java).apply {
//                    putExtra("NUMBER", position)
//                    putExtra("CODE", itemKode.text)
//                    putExtra("CATEGORY", itemKategori.text)
//                    putExtra("CONTENT", itemIsi.text)
//                }
//                context.startActivity(intent)
//            }
    }


    fun setImage(position: Int) {

        val imageSetHome = arrayOf(
            R.drawable.black_peper, R.drawable.red_peper,
            R.drawable.cinnamon, R.drawable.tumeric,
            R.drawable.cumin, R.drawable.tea_powder,
            R.drawable.container_packaging)

        for (i in imageSetHome){
            imageVSpcie.setImageLevel(position)

        }
    }


}