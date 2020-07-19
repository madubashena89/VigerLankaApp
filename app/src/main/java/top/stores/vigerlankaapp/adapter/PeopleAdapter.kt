package top.stores.vigerlankaapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import top.stores.vigerlankaapp.R

class PeopleAdapter: RecyclerView.Adapter<PeopleViewHolder>() {

    private val peopleList = arrayOf("About Us",
        "CEO - Darshana Perera", "MD - Pradeep Gedara", "Secretary - Lakshika Chathumali")

    private val spiceCOntentList = arrayOf(
        R.string.content_home_black_pepper, R.string.content_home_red_pepper,
        R.string.content_home_cinnamon, R.string.content_home_tumeric,
        R.string.content_home_cummin, R.string.content_home_tea_powder,
        R.string.content_home_packag_shipping)

    private val imageSetHome = arrayOf(
        R.drawable.about_company_image, R.drawable.darshana,
        R.drawable.pradeep, R.drawable.lakshika)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.people_card_view, parent, false)
        return PeopleViewHolder(v)
    }

    override fun getItemCount(): Int {
        return peopleList.size

    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.tvPeopleItem.text = peopleList[position]
        holder.imagePeople.setImageResource(imageSetHome[position])
        holder.tvPeopleItemContent.text = spiceCOntentListString[position]
        //  holder.setContentText(position)

    }

    private val spiceCOntentListString = arrayOf("Vigor Lanka (Pvt) Ltd is a registered company in Sri Lanka for speciality in spices and located in Homagama, Sri Lanka. We have registered in export development authority in Sri Lanka and  we supply spices for domestic and international buyers. "
        ,"Darshana Perera is a qualifed engineer from UOM, Sri Lanka and the co founder of the company. He has great experience in domestic and international packaging, shipping and quality standards which are required from EDU Sri Lanka.",
        "Pradeep Gedara is a qualified engineer from WSU, USA and handles the international buyers. He has great experience in international shipping, paper work and client management. "
        , "Lakshika Chathumali is a well trained professional who has Msc in Statistics. She has completed many training programs about international business in Japan. ")

}


