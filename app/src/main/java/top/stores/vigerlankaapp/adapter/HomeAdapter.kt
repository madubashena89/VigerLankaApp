package top.stores.vigerlankaapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.internal.ContextUtils.getActivity
import top.stores.vigerlankaapp.R

class HomeAdapter : RecyclerView.Adapter<HomeAdapterViewHolder>() {

    private val spiceList = arrayOf("Black Pepper",
        "Chili Powder(Red pepper)", "Cinnamon", "Tumereic",
        "Cummin", "Tea powder", "Packaging and Shipping")

    private val spiceCOntentList = arrayOf(R.string.content_home_black_pepper, R.string.content_home_red_pepper,
        R.string.content_home_cinnamon, R.string.content_home_tumeric,R.string.content_home_cummin, R.string.content_home_tea_powder,
        R.string.content_home_packag_shipping)

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
        holder.tvHomeItemContent.text = spiceCOntentListString[position]
      //  holder.setContentText(position)

    }

    private val spiceCOntentListString = arrayOf("Our Sri Lankan black pepper has a quick bite and a lingering aroma. We select only high density, early harvest berries deep black in color. We can provide any quantity with your requirements.",
        "Sri Lankan Roasted Chili Powder’s deep rich aroma and natural flavor will make your meal truly Sri Lankan. Roasted Chili Powder are prepared from toasting Sri Lankan dried chilies and then grinding them to release their potent flavor.",
       "\"True\" cinnamon is native to the island of Sri Lanka, formerly called Ceylon, just south of the Indian subcontinent. In fact, this cinnamon is sometimes referred to as Ceylon cinnamon, and is prized for its delicate flavor. ",
        "Organic turmeric powder comes from a region in Sri Lanka, where the curcumin content is north of 5%. High quality turmeric is high in essential oils and curcumin, which gives turmeric its unique orange-yellow coloring. ",
        "Cumin is used in virtually every cuisine that is or has ever been. Our fine Sri Lankan cumin is warm, nutty and slightly hot, with lemon and bitter tones. It brings our sweet flavors in food and is great in chili, curries, stews and soups.",
        "Sri Lanka is one of the world's most significant exporters of orthodox teas because of the sheer volume grown and exported. The island now known as Sri Lanka was historically referred to as “Ceylon” by the British colonial powers. ",
        "We can export any quantity of products with your requirments as boxes, 20ft and 40ft etc. Firstly you can give the requirment and will offer you a quatation. If you want any sample we can ship first then you can place your order. Please see the contact section."
    )


}