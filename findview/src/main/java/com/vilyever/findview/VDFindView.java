package com.vilyever.findview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/**
 * VDFindView
 * AndroidFindView <com.vilyever.findview>
 * Created by vilyever on 2015/8/18.
 * Feature:
 */
public class VDFindView {
    private final VDFindView self = this;


    /* #Constructors */

    /* #Overrides */    
    
    /* #Accessors */     
     
    /* #Delegates */     
     
    /* #Private Methods */    
    
    /* #Public Methods */
    public static <T extends View> T findViewById(Activity activity, int id) {
        return (T)activity.findViewById(id);
    }

    public static ViewGroup getRootView(Activity activity) {
        return findViewById(activity, android.R.id.content);
    }

    public static <T extends View> T findViewById(View view, int id) {
        return (T)view.findViewById(id);
    }

    /* #Classes */

    /* #Interfaces */     
     
    /* #Annotations @interface */    
    
    /* #Enums */
}