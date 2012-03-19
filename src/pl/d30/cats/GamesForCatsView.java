package pl.d30.cats;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
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
		
		// fish movements constants
		public static final int FISH_SPEED = 40;
		
		// fish position constants
		public static final int FISH_BOUNCE_DISTANCE = 20; // px from border means it's time to bounce
		
		private Bitmap mBackgoundImage;
		
		/** Velocity Dx */
		private double mDx;
		
		/** Velocity Dy */
		private double mDy;
		
		private Handler mHandler;
		
		/** What to draw for the Fish in its normal state */
		private Drawable mFishImage;
		
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
        	
        	// TODO: cache fish elements
        	mFishImage = context.getResources().getDrawable(R.drawable.fish_head);
        	
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
