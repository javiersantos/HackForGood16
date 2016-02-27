package com.servis.servis.bindablelayouts;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.servis.servis.R;
import com.servis.servis.models.Microservice;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.nlopez.smartadapters.views.BindableRelativeLayout;

/**
 * Created by alejandrohall on 27/02/16.
 */
public class MicroserviceLayout extends BindableRelativeLayout<Microservice> {

    @Bind(R.id.ivMicroservice)
    ImageView mIvMicroService;
    @Bind(R.id.tvTitle)
    TextView mTvTitle;
    @Bind(R.id.tvUser)
    TextView mTvUser;
    @Bind(R.id.tvPrice)
    TextView mTvPrice;
    @Bind(R.id.ratingBar)
    RatingBar ratingBar;

    public MicroserviceLayout(Context context) {
        super(context);
    }

    @Override
    public void onViewInflated() {

        ButterKnife.bind(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.microservice_layout;
    }

    @Override
    public void bind(Microservice microservice) {
        mIvMicroService.setImageDrawable(microservice.getImage());
        mTvTitle.setText(microservice.getTitle());
        mTvUser.setText(microservice.getUser());
        mTvPrice.setText(String.valueOf(microservice.getPrice())+"€/hora");
        ratingBar.setRating(microservice.getRating().floatValue());
    }
}
