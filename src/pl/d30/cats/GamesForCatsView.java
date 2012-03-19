package pl.d30.cats;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GamesForCatsView extends SurfaceView implements SurfaceHolder {
	class GamesForCatsThread extends Thread {
		
		/*
		 * fish movements constants
		 */
		public static final int FISH_SPEED = 40;
		/*
		 * fish position constants
		 */
		public static final int FISH_BOUNCE_DISTANCE = 20; // px from border means it's time to bounce
		/*
		 * state tracking constants
		 */
		public static final int STATE_READY = 1;
		public static final int STATE_RUNNING = 2;
		public static final int STATE_PAUSE = 3;
		
		private Drawable mBackgroundImage;
		
		/** Velocity Dx */
		private double mDx;
		
		/** Velocity Dy */
		private double mDy;
		
		private Handler mHandler;
		
		/** our little fishy size */
		private int mFishWidth;
		private int mFishHeight;
		
		/** Used to figure out elapsed time between frames */
        private long mLastTime;
		
		/** What to draw for the Fish in its normal state */
		private Drawable mFishImage;
		
		/** The state of the aquarium. One of READY, RUNNING or PAUSE */
		private int mMode;
		
		/** Indicate whether the surface has been created & is ready to draw */
        private boolean mRun = false;
        
        /** Handle to the surface manager object we interact with */
        private SurfaceHolder mSurfaceHolder;
        
        public GamesForCatsThread(SurfaceHolder surfaceHolder, Context context, Handler handler) {
        	
        	// get handles to some important objects
        	mSurfaceHolder = surfaceHolder;
        	mHandler = handler;
        	mContext = context;
        	
        	Resources res = context.getResources();
        	
        	// TODO: cache here other fish elements
        	mFishImage = context.getResources().getDrawable(R.drawable.fish_head);
        	
        	// TODO: change dat background into something prettier
        	mBackgroundImage = context.getResources().getDrawable(R.drawable.background);
        	
        	// Make fish dimentions dependend on those declared in xml
        	mFishWidth = mFishImage.getIntrinsicWidth();
        	mFishHeight = mFishImage.getIntrinsicHeight();
        	
        	// TODO: initialize fish in the middle of the screen with random velocity
        }
        
        /**
         * Starts the aquarium, setting parameters for the current fish
         */
        public void doStart() {
        	synchronized(mSurfaceHolder) {
        		
        		// TODO: do some init setup here
        		
        		// TODO: pick a convinient starting location for the fish sprite
        		
        		// TODO: start woth a random motion
        		
        		
        		mLastTime = System.currentTimeMillis() + 100;
        		setState(STATE_RUNNING);
        	}
        }
        
        /**
         * Pauses the physics update & animation
         */
        public void pause() {
        	synchronized(mSurfaceHolder) {
        		if(mMode == STATE_RUNNING) setState(STATE_PAUSE);
        	}
        }
        
        public void setState(int mode) {
        	synchronized(mSurfaceHolder) {
        		setState(mode,null);
        	}
        }
        public void setState(int mode, CharSequence message) {
        	synchronized(mSurfaceHolder) {
        		mMode = mode;
        		
        		
        	}
        }
        
		
	}
	
	/** Handle to the application context, used to e.g. fetch Drawables. */
    private Context mContext;

    
    public GamesForCatsView(Context context, AttributeSet attrs) {
    	super(context,attrs);
    	
    }
    
    
	@Override
	public void addCallback(Callback callback) {
		// TODO Auto-generated method stub

	}

	@Override
	public Surface getSurface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rect getSurfaceFrame() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCreating() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Canvas lockCanvas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Canvas lockCanvas(Rect dirty) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCallback(Callback callback) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFixedSize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFormat(int format) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSizeFromLayout() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setType(int type) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unlockCanvasAndPost(Canvas canvas) {
		// TODO Auto-generated method stub

	}

}
