package com.example.gingerbread.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.gingerbread.R
import com.example.gingerbread.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setContentView(R.layout.activity_main)

        navController = findNavController(R.id.fragment)
        val appBarConfiguration: AppBarConfiguration = AppBarConfiguration(
                setOf(
                        R.id.recipeFragment,
                        R.id.searchFragment,
                        R.id.savedRecipeFragment,
                        R.id.jokeFragment
                )
        )
        binding.bottomNavigationView.setupWithNavController(navController)
        setupActionBarWithNavController(navController, appBarConfiguration)


//        navController.addOnDestinationChangedListener { controller, destination, arguments ->
//            when ((destination as FragmentNavigator.Destination).className) {
//                RecipeFragment::class.qualifiedName -> {
//                    binding.fab.visibility = View.VISIBLE
//                    binding.bottomAppBar.fabCradleMargin = 25f
//                    binding.bottomAppBar.fabCradleRoundedCornerRadius = 25f
//                    binding.bottomAppBar.cradleVerticalOffset = 25f
//                }
//                else -> {
//                    binding.fab.visibility = View.GONE
//                    binding.bottomAppBar.fabCradleMargin = 0f
//                    binding.bottomAppBar.fabCradleRoundedCornerRadius = 0f
//                    binding.bottomAppBar.cradleVerticalOffset = 0f
//                }
//            }
//        }


    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}