package com.lovish.spirocare.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.lovish.spirocare.R
import com.lovish.spirocare.ui.gallery.GalleryViewModel

class SlidshowFragment: Fragment() {

    private lateinit var slidshowviewmodel: SlideshowViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        slidshowviewmodel =
            ViewModelProviders.of(this).get(SlideshowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        slidshowviewmodel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}