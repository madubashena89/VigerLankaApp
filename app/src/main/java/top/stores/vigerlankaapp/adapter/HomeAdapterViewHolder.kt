package top.stores.vigerlankaapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import top.stores.vigerlankaapp.R
import java.text.FieldPosition

class HomeAdapterViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
    var tvHomeItem: TextView
    var imageVSpcie: ImageView
    var tvHomeItemContent: TextView


    init {
        tvHomeItem = itemView.findViewById(R.id.tv_home_spice_name)
        imageVSpcie = itemView.findViewById(R.id.home_spice_image)
        tvHomeItemContent = itemView.findViewById(R.id.tv_home_card_content)
    }

    fun setContentText(position :Int){
       val spiceCOntentList = arrayOf(R.string.content_home_black_pepper, R.string.content_home_red_pepper,
            R.string.content_home_cinnamon, R.string.content_home_tumeric,R.string.content_home_cummin, R.string.content_home_tea_powder,
            R.string.content_home_packag_shipping)

       // tvHomeItemContent.text = getString(R.string.content_home_black_pepper)


    }


}
