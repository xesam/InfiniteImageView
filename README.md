#InfiniteImageView

Inspired by [AndroidScrollingImageView](https://github.com/Q42/AndroidScrollingImageView)

#added feature

1. support android 2.3
2. support vertical scroll
3. support drawable

#usage

xml：

    <dev.xesam.android.widgets.InfiniteImageView
        android:id="@+id/ifi"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        InfiniteImageView:speed="-2dp"
        InfiniteImageView:src="@drawable/a_2" />

java：

    InfiniteImageView.setDrawable(new AzDrawable());

#demo
![2.gif](2.gif)



