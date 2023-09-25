package com.example.hbtu

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hbtu.databinding.SignInBinding
import com.example.hbtu.databinding.SignUpBinding
import com.google.firebase.auth.FirebaseAuth

class SignIn : AppCompatActivity() {
    private lateinit var binding: SignInBinding
    private lateinit var firebaseAuth: FirebaseAuth
    val SHARED_PREF : String = "sharedPrefs"

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = SignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        checkbox()


        binding.textView.setOnClickListener{

            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }

        binding.button.setOnClickListener{
            val email = binding.emailEt.text.toString()
            val pass = binding.passET.text.toString()
           // val confpass = binding.confirmPassEt.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty() ) {

                    firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val sharedPreferences: SharedPreferences = getSharedPreferences(SHARED_PREF,
                                MODE_PRIVATE)
                            val editor : SharedPreferences.Editor = sharedPreferences.edit()
                            editor.putString("name","true")
                            editor.apply()

                            val intent = Intent(this, HomeActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }



            } else {
                Toast.makeText(this, "Please provide all the details", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun checkbox() {
        val sharedPreferences: SharedPreferences = getSharedPreferences(SHARED_PREF, MODE_PRIVATE)
        val check:String? = sharedPreferences.getString("name" , "")
        if(check.equals("true")){
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}