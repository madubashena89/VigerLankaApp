package top.stores.vigerlankaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import top.stores.vigerlankaapp.fragments.ContactFragment
import top.stores.vigerlankaapp.fragments.HomeFragment
import top.stores.vigerlankaapp.fragments.PeopleFragment

class MainActivity : AppCompatActivity() {

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                moveToFragment(HomeFragment())
                return@OnNavigationItemSelectedListener true

            }
            R.id.nav_people -> {
                moveToFragment(PeopleFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_contact_us -> {
                moveToFragment(ContactFragment())
                return@OnNavigationItemSelectedListener true
            }
            
        }


        false
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    private fun moveToFragment(fragment : Fragment){
        val fragmentTrans = supportFragmentManager.beginTransaction()
        fragmentTrans.replace(R.id.fragment_container, fragment)
        fragmentTrans.commit()

    }
}