package org.pestrada.android_tdd_playground.test;

import com.donnemartin.android.photogallery.PhotoGalleryActivity;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

public class MainActivityTest extends
    ActivityInstrumentationTestCase2<PhotoGalleryActivity> {
  
  Activity mainActivity = null;
  Button button = null;

  public MainActivityTest() {
    super(PhotoGalleryActivity.class);
  }
  
  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mainActivity = getActivity();
  }
  
  public void testChangeText() {
    //button = (Button) mainActivity.findViewById(R.id.button_test);
    //TouchUtils.clickView(this, button);
    //TextView view = (TextView) mainActivity.findViewById(R.id.textView1);
    //assertEquals("new text", view.getText().toString());
  }

}
