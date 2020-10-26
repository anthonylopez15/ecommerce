package br.com.anthony.ecommerce

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
                    addFragment(HomeFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.menu_fav -> {
                    return@OnNavigationItemSelectedListener true
                }
                R.id.menu_map -> {
                    return@OnNavigationItemSelectedListener true
                }
                R.id.menu_profile -> {
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content, fragment)
            .commit()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.apply {
            title = ""
            setDisplayShowHomeEnabled(true)
        }

        bottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        addFragment(HomeFragment())

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)
        return super.onCreateOptionsMenu(menu)
    }
}