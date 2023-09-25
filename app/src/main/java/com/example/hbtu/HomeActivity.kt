package com.example.hbtu

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import com.example.hbtu.adapter.HomeAdapter
import com.example.hbtu.databinding.ActivityHomeBinding
import com.example.hbtu.databinding.HomeItemBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    val SHARED_PREF : String = "sharedPrefs"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.RecyclerView.adapter = HomeAdapter(
            applicationContext
        )
        binding.RecyclerView.setHasFixedSize(true)
        supportActionBar?.setTitle("HBTU") // set the top title
            // val title = actionBar?.getTitle().toString() // get the title
        actionBar?.hide()
        supportActionBar?.setDisplayShowHomeEnabled(true);
        //supportActionBar?.setLogo(R.drawable.hbtulogo);
        supportActionBar?.setDisplayUseLogoEnabled(true);


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         menuInflater.inflate(R.menu.home_menu,menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
                R.id.logout-> logout()

        }
        return super.onOptionsItemSelected(item)
    }
    private fun logout(){
        val sharedPreferences: SharedPreferences = getSharedPreferences(SHARED_PREF,
            MODE_PRIVATE)
        val editor : SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString("name","false")
        editor.apply()
        val intent = Intent(this, SignIn::class.java)
        startActivity(intent)
    }
}