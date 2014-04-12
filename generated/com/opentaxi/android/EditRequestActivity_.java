//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0-SNAPSHOT.
//


package com.opentaxi.android;

import java.io.Serializable;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.opentaxi.android.R.id;
import com.opentaxi.android.R.layout;
import com.opentaxi.generated.mysql.tables.pojos.Groups;
import com.opentaxi.generated.mysql.tables.pojos.Regions;
import com.opentaxi.models.NewCRequest;
import com.opentaxi.models.NewRequest;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class EditRequestActivity_
    extends EditRequestActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String NEW_C_REQUEST_EXTRA = "newCRequest";
    private Handler handler_ = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.new_request);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        injectExtras_();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static EditRequestActivity_.IntentBuilder_ intent(Context context) {
        return new EditRequestActivity_.IntentBuilder_(context);
    }

    public static EditRequestActivity_.IntentBuilder_ intent(Fragment supportFragment) {
        return new EditRequestActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        regionsPicker = ((Spinner) hasViews.findViewById(id.regionsPicker));
        region = ((TextView) hasViews.findViewById(id.region));
        addressChange = ((Button) hasViews.findViewById(id.addressChange));
        llFilters = ((LinearLayout) hasViews.findViewById(id.llFilters));
        pbProgress = ((ProgressBar) hasViews.findViewById(id.pbProgress));
        addressText = ((EditText) hasViews.findViewById(id.addressText));
        reqInfoButtonContainer = ((LinearLayout) hasViews.findViewById(id.reqInfoButtonContainer));
        address = ((TextView) hasViews.findViewById(id.address));
        pricesPicker = ((Spinner) hasViews.findViewById(id.pricesPicker));
        citiesPicker = ((Spinner) hasViews.findViewById(id.citiesPicker));
        requestSend = ((Button) hasViews.findViewById(id.requestSend));
        {
            View view = hasViews.findViewById(id.addressChange);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        EditRequestActivity_.this.addressChange();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.requestSend);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        EditRequestActivity_.this.requestSend();
                    }

                }
                );
            }
        }
        afterActivity();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(NEW_C_REQUEST_EXTRA)) {
                newCRequest = ((NewCRequest) extras_.getSerializable(NEW_C_REQUEST_EXTRA));
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    @Override
    public void showRegions(final Regions[] regions) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                EditRequestActivity_.super.showRegions(regions);
            }

        }
        );
    }

    @Override
    public void showPrices(final Groups[] prices) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                EditRequestActivity_.super.showPrices(prices);
            }

        }
        );
    }

    @Override
    public void SuccessDialog() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                EditRequestActivity_.super.SuccessDialog();
            }

        }
        );
    }

    @Override
    public void notSupporderDialog() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                EditRequestActivity_.super.notSupporderDialog();
            }

        }
        );
    }

    @Override
    public void showGroups(final Groups[] groups) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                EditRequestActivity_.super.showGroups(groups);
            }

        }
        );
    }

    @Override
    public void showCities(final String supported) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                EditRequestActivity_.super.showCities(supported);
            }

        }
        );
    }

    @Override
    public void setPrices() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    EditRequestActivity_.super.setPrices();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void setGroups() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    EditRequestActivity_.super.setGroups();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void setRegions() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    EditRequestActivity_.super.setRegions();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void sendRequest(final NewRequest newRequest) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    EditRequestActivity_.super.sendRequest(newRequest);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, EditRequestActivity_.class);
        }

        public IntentBuilder_(Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, EditRequestActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public EditRequestActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (context_ instanceof Activity) {
                    ((Activity) context_).startActivityForResult(intent_, requestCode);
                } else {
                    context_.startActivity(intent_);
                }
            }
        }

        public EditRequestActivity_.IntentBuilder_ newCRequest(NewCRequest newCRequest) {
            intent_.putExtra(NEW_C_REQUEST_EXTRA, ((Serializable) newCRequest));
            return this;
        }

    }

}
