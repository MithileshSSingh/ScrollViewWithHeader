# ScrollViewWithHeader
This is a custom ScrollView with fixed header for android application.<br>
<br>
<br>
# Screenshot Type 1:<br>
Initially with top header.<br>
![svt11](https://cloud.githubusercontent.com/assets/1692653/9235156/a6dd7344-415a-11e5-8fee-22d1c3fe482f.png)
![svt12](https://cloud.githubusercontent.com/assets/1692653/9235186/c77a4cd0-415a-11e5-81fb-47d5143b33aa.png)
![svt13](https://cloud.githubusercontent.com/assets/1692653/9235207/dc1179ac-415a-11e5-951b-47f07dff6836.png)
<br>
<br>
# Screenshot Type 2:<br>
Initially with no top header.<br>
<img src="https://cloud.githubusercontent.com/assets/1692653/9235275/654d8472-415b-11e5-85ba-cf1cfdde159f.png" width="30%" height="30%" />
<img src="https://cloud.githubusercontent.com/assets/1692653/9235279/6e3bb284-415b-11e5-80d9-10b9f155fea0.png" width="30%" height="30%" />
<img src="https://cloud.githubusercontent.com/assets/1692653/9235283/73cff890-415b-11e5-88c7-ee70c95f1f57.png" width="30%" height="30%"/>
<br>
<br>

# Implementation<br>
The following code shows how to implement ScrollViewWithHeader<br><br>

XML implementation.<br>

    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.scrollviewwithheader.MainActivity" >

    <com.example.scrollviewwithheader.custom.ScrollViewWithHeader
        android:id="@+id/scroll_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" >

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical" >
            
            <TextView
                android:id="@+id/child1"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_alignParentTop="true"
                android:background="@android:color/background_light"
                android:padding="20dp"
                android:text="Child4"
                android:textStyle="bold" />

            <include layout="@layout/list_item" />

        </LinearLayout>
    </com.example.scrollviewwithheader.custom.ScrollViewWithHeader>

    <TextView
        android:id="@+id/tv_header"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:background="@android:color/background_light"
        android:padding="20dp"
        android:text="Header"
        android:textStyle="bold"
        android:visibility="gone" />

    </RelativeLayout>
<br>

Java Code implementation.

````javascript	
	scrollView = (ScrollViewWithHeader) findViewById(R.id.scroll_view);
	tvHeader = (TextView) findViewById(R.id.tv_header);
	tvChild1 = (TextView) findViewById(R.id.child1);
	tvChild2 = (TextView) findViewById(R.id.child2);
	tvChild3 = (TextView) findViewById(R.id.child3);
	tvChild4 = (TextView) findViewById(R.id.child4);
		
	scrollView.addHeader(tvHeader);
	scrollView.addChildHeaders(tvChild1);
	scrollView.addChildHeaders(tvChild2);
	scrollView.addChildHeaders(tvChild3);
	scrollView.addChildHeaders(tvChild4);
	scrollView.build();
````



