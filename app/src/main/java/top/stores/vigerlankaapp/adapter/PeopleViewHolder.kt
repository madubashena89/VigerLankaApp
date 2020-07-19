package top.stores.vigerlankaapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import top.stores.vigerlankaapp.R

class PeopleViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
    var tvPeopleItem: TextView
    var imagePeople: ImageView
    var tvPeopleItemContent: TextView


    init {
        tvPeopleItem = itemView.findViewById(R.id.tv_people_name)
        imagePeople = itemView.findViewById(R.id.peoplee_image)
        tvPeopleItemContent = itemView.findViewById(R.id.tv_people_card_content)
    }

    fun setContentText(position :Int){
        val spiceCOntentList = arrayOf(
            R.string.content_home_black_pepper, R.string.content_home_red_pepper,
            R.string.content_home_cinnamon, R.string.content_home_tumeric,
            R.string.content_home_cummin, R.string.content_home_tea_powder,
            R.string.content_home_packag_shipping)

        // tvHomeItemContent.text = getString(R.string.content_home_black_pepper)


    }


}