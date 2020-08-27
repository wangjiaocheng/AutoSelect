package com.autoselect.maper

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.amap.api.services.cloud.CloudImage
import com.amap.api.services.cloud.CloudItem
import com.android.volley.toolbox.ImageLoader
import com.android.volley.toolbox.Volley
import com.autoselect.helper.ScreenHelper.screenDensity
import kotlinx.android.synthetic.main.activity_cloud_detail.*
import kotlinx.android.synthetic.main.layout_item.*
import kotlinx.android.synthetic.main.layout_photo.*

class MapCloudDetailActivity : AppCompatActivity() {
    private var cloudItem: CloudItem? = null
    private var cloudImages: MutableList<CloudImage> = mutableListOf()
    private val setGridView: GridView = cloudImages.run {
        grid.apply {
            layoutParams = LinearLayout.LayoutParams(
                (size * (60 + 4) * screenDensity).toInt(),
                LinearLayout.LayoutParams.MATCH_PARENT
            )
            columnWidth = (60 * screenDensity).toInt()
            horizontalSpacing = 5
            stretchMode = GridView.NO_STRETCH
            numColumns = size
            adapter = GridViewAdapter(applicationContext)
            onItemClickListener =
                AdapterView.OnItemClickListener { _, _, position, _ -> showImage(position) }
        }
    }

    inner class GridViewAdapter(var context: Context) : BaseAdapter() {
        override fun getCount(): Int = cloudImages.size
        override fun getItemId(position: Int): Long = position.toLong()
        override fun getItem(position: Int): CloudImage? = cloudImages[position]
        override fun getView(position: Int, convertView: View, parent: ViewGroup): View =
            LayoutInflater.from(context).inflate(R.layout.layout_photo, null).apply {
                ItemImage.apply {
                    setDefaultImageResId(R.mipmap.location_marker)//临时
                    setImageUrl(
                        cloudImages[position].preurl,
                        ImageLoader(Volley.newRequestQueue(context), MapCloudImageCache())
                    )
                }
            }
    }

    private fun showImage(position: Int) = cloudImages.run {
        if (isNotEmpty()) Intent(
            this@MapCloudDetailActivity, MapCloudPreviewActivity::class.java
        ).apply {
            intent.putExtra("clouditem", cloudItem)
            intent.putExtra("position", position)
        }.let { startActivity(it) }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cloud_detail)
        cloudItem = intent.getParcelableExtra("clouditem")
        cloudItem?.run {
            cloudImages = cloudImage as MutableList<CloudImage>
            if (cloudImages.isNotEmpty()) setGridView
            poiid_text.text = id
            location_text.text = latLonPoint.run { "{$latitude,$longitude}" }
            name_text.text = title
            address_text.text = snippet
            createtime_text.text = createtime
            update_time_text.text = updatetime
            distance_text.text = distance.toString()
            for ((key, value) in customfield) {
                layoutInflater.inflate(R.layout.layout_item, null).apply {
                    poi_field_id.text = key
                    poi_value_id.apply {
                        text = value
                        setTextColor(resources.getColor(R.color.black, null))//widgeter
                    }
                }.let { container.addView(it) }
            }
        }
    }
}