package xavier.login.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.util.*;
import android.animation.*;

import java.util.*;

import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private LinearLayout back;
	private LinearLayout signup;
	private LinearLayout signin;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear22;
	private LinearLayout linear30;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private TextView textview8;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private ImageView imageview3;
	private EditText edittext3;
	private ImageView imageview4;
	private EditText edittext4;
	private ImageView imageview5;
	private EditText edittext5;
	private ImageView imageview6;
	private EditText edittext6;
	private TextView textview9;
	private TextView textview10;
	private LinearLayout linear7;
	private LinearLayout linear6;
	private TextView textview1;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private TextView textview2;
	private TextView textview6;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear18;
	private LinearLayout linear16;
	private ImageView imageview1;
	private EditText edittext1;
	private ImageView imageview2;
	private EditText edittext2;
	private TextView textview3;
	private LinearLayout linear14;
	private TextView textview7;
	private LinearLayout linear19;
	private LinearLayout linear15;
	private LinearLayout linear17;
	private TextView textview4;
	private TextView textview5;
	
	private TimerTask t;
	private TimerTask t1;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		back = (LinearLayout) findViewById(R.id.back);
		signup = (LinearLayout) findViewById(R.id.signup);
		signin = (LinearLayout) findViewById(R.id.signin);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		edittext5 = (EditText) findViewById(R.id.edittext5);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		edittext6 = (EditText) findViewById(R.id.edittext6);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		textview7 = (TextView) findViewById(R.id.textview7);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		
		linear29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_FadeOut(linear29, 75);
			}
		});
		
		linear13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TransitionManager(signin, 400);
				textview6.setVisibility(View.VISIBLE);
				textview2.setVisibility(View.GONE);
				linear12.setVisibility(View.GONE);
				linear15.setVisibility(View.GONE);
				linear13.setVisibility(View.GONE);
				linear18.setVisibility(View.VISIBLE);
				linear17.setVisibility(View.VISIBLE);
			}
		});
		
		linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TransitionManager(signin, 400);
				textview2.setVisibility(View.VISIBLE);
				linear12.setVisibility(View.VISIBLE);
				linear13.setVisibility(View.VISIBLE);
				linear15.setVisibility(View.VISIBLE);
				linear18.setVisibility(View.GONE);
				linear17.setVisibility(View.GONE);
				textview6.setVisibility(View.GONE);
			}
		});
		
		linear15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_FadeOut(linear15, 75);
			}
		});
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_FadeOut(linear17, 75);
			}
		});
	}
	private void initializeLogic() {
		_setForeLayout(signup, signin);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		edittext1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		edittext2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		_shape(30, 30, 30, 30, "#ffffff", "#ffffff", 0, textview1);
		_shape(50, 0, 0, 50, "#e91e63", "#ffffff", 0, linear6);
		_shape(20, 0, 0, 20, "#e91e63", "#ffffff", 0, linear7);
		_shape(40, 40, 40, 40, "#ffffff", "#ffffff", 0, linear8);
		_shape(30, 30, 30, 30, "#e91e63", "#ffffff", 0, linear15);
		_shape(30, 30, 30, 30, "#e91e63", "#ffffff", 0, linear17);
		linear17.setVisibility(View.GONE);
		textview6.setVisibility(View.GONE);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		linear18.setVisibility(View.GONE);
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		edittext3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		edittext4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		edittext5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		edittext6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		linear8.setElevation(10);
		linear15.setElevation(10);
		linear17.setElevation(10);
		linear22.setElevation(10);
		linear29.setElevation(10);
		_shape(30, 30, 30, 30, "#e91e63", "#ffffff", 0, linear29);
		textview10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/royal.ttf"), 0);
		_shape(30, 30, 30, 30, "#ffffff", "#daaf37", 2, linear30);
		imageview3.setColorFilter(0xFFE91E63, PorterDuff.Mode.MULTIPLY);
		imageview4.setColorFilter(0xFFE91E63, PorterDuff.Mode.MULTIPLY);
		imageview5.setColorFilter(0xFFE91E63, PorterDuff.Mode.MULTIPLY);
		imageview6.setColorFilter(0xFFE91E63, PorterDuff.Mode.MULTIPLY);
		imageview1.setColorFilter(0xFFE91E63, PorterDuff.Mode.MULTIPLY);
		imageview2.setColorFilter(0xFFE91E63, PorterDuff.Mode.MULTIPLY);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _setForeLayout (final View _forelayout, final View _backlayout) {
		//Creator Error 404
		// Telegram @erroratten
		final LinearLayout _layout = (LinearLayout)_forelayout;
		        final LinearLayout _backview = (LinearLayout) _backlayout;
		_layout.setTranslationZ(1);
		        _backview.post(new Runnable() {
			            @Override
			            public void run() {
				                final boolean[] closed = {true};
				                final int[] current = {0};
				                final int value = 0-_backview.getWidth();
				                _backview.setTranslationX(value);
				
				                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,_layout.getHeight());
				                _layout.setLayoutParams(params);
				
				                ((android.view.ViewGroup)_layout.getParent()).setClickable(true);
				                ((android.view.ViewGroup)_layout.getParent()).setFocusable(true);
				                ((android.view.ViewGroup)_layout.getParent()).setOnTouchListener(new View.OnTouchListener() {
					                    @Override
					                    public boolean onTouch(View v, MotionEvent event) {
						                        switch (event.getAction()){
							                            case MotionEvent.ACTION_DOWN:{
								                                if (closed[0]){
									                                    current[0] = (int) event.getX();
									                                }else {
									                                    current[0] = (int) event.getX()+(_backview.getWidth());
									                                }
								                            }
							                            case MotionEvent.ACTION_MOVE:{
								                                if (event.getX()-current[0]>value&event.getX()-current[0]<0){
									                                    _layout.setTranslationX(event.getX()-current[0]);
									                                }
								
								                                if (event.getX()-current[0]<value){
									                                    _layout.setTranslationX(value);
									                                }
								                                if (event.getX()-current[0]>0){
									                                    _layout.setTranslationX(0);
									                                }
								                                break;
								                            }
							                            case MotionEvent.ACTION_UP:{
								                                int value_2 = (int) (event.getX()-current[0]);
								                                if (value_2>(value/2)){
									                                    ObjectAnimator animator = new ObjectAnimator();
									                                    animator.setTarget(_layout);
									                                    animator.setPropertyName("translationX");
									                                    animator.setFloatValues(0);
									                                    animator.setDuration(200);
									                                    animator.setInterpolator(new android.view.animation.DecelerateInterpolator());
									                                    animator.start();
									                                    closed[0] = true;
									                                }else {
									                                    ObjectAnimator animator = new ObjectAnimator();
									                                    animator.setTarget(_layout);
									                                    animator.setPropertyName("translationX");
									                                    animator.setFloatValues(value);
									                                    animator.setDuration(200);
									                                    animator.setInterpolator(new android.view.animation.DecelerateInterpolator());
									                                    animator.start();
									                                    closed[0] = false;
									                                }
								                                break;
								                            }
							                        }
						                        return false;
						                    }
					                });
				            }
			        });
	}
	
	
	private void _shape (final double _top1, final double _top2, final double _bottom2, final double _bottom1, final String _inside_color, final String _side_color, final double _side_size, final View _view) {
		Double tlr = _top1;
		Double trr = _top2;
		Double blr = _bottom2;
		Double brr = _bottom1;
		Double sw = _side_size;
		android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable();
		s.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		s.setCornerRadii(new float[] {tlr.floatValue(),tlr.floatValue(), trr.floatValue(),trr.floatValue(), blr.floatValue(),blr.floatValue(), brr.floatValue(),brr.floatValue()}); 
		
		s.setColor(Color.parseColor(_inside_color));
		s.setStroke(sw.intValue(), Color.parseColor(_side_color));
		_view.setBackground(s);
	}
	
	
	private void _Animator (final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.start();
	}
	
	
	private void _FadeOut (final View _view, final double _duration) {
		_Animator(_view, "scaleX", 0, 200);
		_Animator(_view, "scaleY", 0, 200);
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_Animator(_view, "scaleX", 1, 200);
						_Animator(_view, "scaleY", 1, 200);
					}
				});
			}
		};
		_timer.schedule(t, (int)(_duration));
	}
	
	
	private void _TransitionManager (final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
