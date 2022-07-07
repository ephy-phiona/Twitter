package dev.phiona.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.phiona.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
      displayTwitter()
    }
    fun displayTwitter(){
        var tweet1=Twitter("Ephy Phiona","Software development is one ofthe amaizing courses one can pursue.You can learn frontend development,Backend development,mobile development,UX researcher,UI/UX design ,Product Mangement among others.","@ephyphiona","29","78","10k","","","2h")
        var tweet2=Twitter("Tamara","Software development is one ofthe amaizing courses one can pursue.You can learn frontend development,Backend development,mobile development,UX researcher,UI/UX design ,Product Mangement among others.","@Tamara","29","78","10k","","","2h")
        var tweet3=Twitter("Awino Alice","Software development is one ofthe amaizing courses one can pursue.You can learn frontend development,Backend development,mobile development,UX researcher,UI/UX design ,Product Mangement among others.","@itsyourgirl","29","78","10k","","","2h")
        var tweet4=Twitter("itsyourgirl","Software development is one ofthe amaizing courses one can pursue.You can learn frontend development,Backend development,mobile development,UX researcher,UI/UX design ,Product Mangement among others.","@aliceawino","29","78","10k","","","2h")

        var twitterlist= listOf(tweet1,tweet2,tweet3,tweet4)
        var twitterAdapter=TweeterRvAdapter(twitterlist)
        binding.rvTwitter.layoutManager= LinearLayoutManager(this)
        binding.rvTwitter.adapter=twitterAdapter
    }
}
