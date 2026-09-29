package com.sanad.app958898

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sanad.app958898.databinding.ActivityMain

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMain

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        // Top App Bar Action
        binding.topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_settings -> {
                    showToast("فتح الإعدادات الشاملة")
                    true
                }
                else -> false
            }
        }

        // Quick Access Cards Actions
        binding.cardQuran.setOnClickListener { showToast("فتح القرآن الكريم") }
        binding.cardAzkar.setOnClickListener { showToast("فتح قسم الأذكار اليومية") }
        binding.cardQibla.setOnClickListener { showToast("تشغيل بوصلة القبلة الذكية") }
        binding.cardTasbeeh.setOnClickListener { showToast("فتح المسبحة الإلكترونية") }
        binding.cardDuas.setOnClickListener { showToast("فتح حصن الأدعية الشاملة") }
        binding.cardPrayers.setOnClickListener { showToast("عرض مواقيت الصلاة والأذان بالتفصيل") }

        // Progress Buttons Actions
        binding.btnQuranProgress.setOnClickListener { showToast("تحديث ورد القرآن اليومي") }
        binding.btnAzkarProgress.setOnClickListener { showToast("تحديث إنجاز الأذكار") }
        binding.btnPrayersProgress.setOnClickListener { showToast("سجل الصلوات اليومية") }

        // Bottom Navigation Actions
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    showToast("الرئيسية")
                    true
                }
                R.id.nav_quran -> {
                    showToast("القرآن الكريم")
                    true
                }
                R.id.nav_worship -> {
                    showToast("العبادات والأذكار اليومية")
                    true
                }
                R.id.nav_qibla -> {
                    showToast("اتجاه القبلة")
                    true
                }
                R.id.nav_more -> {
                    showToast("المزيد من الخدمات")
                    true
                }
                else -> false
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}