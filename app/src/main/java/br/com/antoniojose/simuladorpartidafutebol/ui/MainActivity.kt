package br.com.antoniojose.simuladorpartidafutebol.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.antoniojose.simuladorpartidafutebol.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate( layoutInflater )
        setContentView(binding.root)

        getListMatchesApi()
        startRecyclerView()



    }

    fun startRecyclerView(){
        binding.rvMatches.layoutManager = LinearLayoutManager(this)
    }

    fun getListMatchesApi(){

    }

    fun showMessage(mensage: String){
        Snackbar.make(binding.root, "$mensage", Snackbar.LENGTH_LONG).show()
    }

}