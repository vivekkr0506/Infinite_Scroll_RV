package com.example.infinitescroll.StaggeredRecyclerView

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView


class DynamicHeightNetworkImageView : ImageView {
    private var mAspectRatio = 0.5f

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    fun setAspectRatio(aspectRatio: Float) {
        mAspectRatio = aspectRatio
        requestLayout()
    }


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val measuredWidth = measuredWidth
        setMeasuredDimension(measuredWidth, (measuredWidth / mAspectRatio).toInt())
    }
}
