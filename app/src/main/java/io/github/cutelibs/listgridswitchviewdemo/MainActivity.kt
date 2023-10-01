package io.github.cutelibs.listgridswitchviewdemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import io.github.cutelibs.listgridswitchview.CustomListGridSwitchView
import io.github.cutelibs.listgridswitchviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.customListGridSwitchView.setListIcon(
            AppCompatResources.getDrawable(
                this,
                R.drawable.ic_my_own_list
            )
        )
        binding.customListGridSwitchView.setGridIcon(
            AppCompatResources.getDrawable(
                this,
                R.drawable.ic_my_own_grid
            )
        )

        binding.customListGridSwitchView.setIconColor(R.color.purple_500)

        binding.customListGridSwitchView.setMode(CustomListGridSwitchView.SwitchMode.LIST)


        binding.customListGridSwitchView.setListener {
            if (it == CustomListGridSwitchView.SwitchMode.LIST) {

                // call recycler view adapter to show list view

            } else {

                // call recycler view adapter to show grid view
            }
        }


        binding.customListGridSwitchView.shouldRememberState(true)



        binding.checkMode.setOnClickListener {
            Toast.makeText(this, "Current mode is ${binding.customListGridSwitchView.getCurrentMode()}", Toast.LENGTH_SHORT).show()
        }

        binding.customListGridSwitchView.clearState()

    }


}