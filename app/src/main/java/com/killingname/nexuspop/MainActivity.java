package com.killingname.nexuslogo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	private Integer [] lollipopcolor = {R.drawable.lollipop_circle,R.drawable.lollipop_circle_color2,R.drawable.lollipop_circle_color3,
			R.drawable.lollipop_circle_color4,R.drawable.lollipop_circle_color6,R.drawable.lollipop_circle_color7,R.drawable.lollipop_circle_color8,R.drawable.lollipop_circle_color9,R.drawable.lollipop_circle_color10,R.drawable.lollipop_circle_color10,R.drawable.lollipop_circle_color11,};
	 private int post = 0;
	 private Button btn ;
	 private  ImageView lollipopcirle , lollipoptext;
	 private RelativeLayout lollipoplayout ;
	 

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
		
			
		
		lollipoptext =(ImageView) findViewById(R.id.lollilpopText);
		lollipopcirle =(ImageView) findViewById(R.id.lollipopbg);
		light =(ImageView) findViewById(R.id.light);

	
		lollipoplayout =(RelativeLayout) findViewById(R.id.lolliopl);
	

		lollipoplayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View b) {
				// TODO Auto-generated method stub
				switch (b.getId()) {
				case R.id.lolliopl:
					post++;
					if (post > (lollipopcolor.length - 1)) {
						post = 0;

					}
					lollipopcirle.setImageResource(lollipopcolor[post]);
					break;

				default:
					break;
				}
			
			}	});
		
		
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
