/*
 * Copyright 2015 chenupt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yahoo.hakunamatata.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.squareup.picasso.Picasso;
import com.yahoo.hakunamatata.R;

/**
 * Created by chenupt@gmail.com on 2015/1/31.
 * Description TODO
 */
public class GuideFragment extends Fragment {

    private int bgRes;
    private ImageView imageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bgRes = getArguments().getInt("data");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_guide, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (bgRes == R.drawable.gd4) {
            getView().findViewById(R.id.image).setVisibility(View.GONE);
            // getView().findViewById(R.id.youtubeplayerfragment_container).setVisibility(View.VISIBLE);
            VideoView videoView = (VideoView) getView().findViewById(R.id.videoview);
            getView().findViewById(R.id.image).setVisibility(View.GONE);
            videoView.setVisibility(View.VISIBLE);
            //if you want the controls to appear
            videoView.setMediaController(new MediaController(getActivity()));
            Uri video = Uri.parse("android.resource://" + getActivity().getPackageName() + "/"
                    + R.raw.lionlaughhahahaha); //do not add any extension
//if your file is named sherif.mp4 and placed in /raw
//use R.raw.sherif
            videoView.setVideoURI(video);
            videoView.start();
//            PlayerYouTubeFrag youTubePlayerFragment = PlayerYouTubeFrag.newInstance("https://www.youtube.com/watch?v=VPRuL9ACZeM");
//            getChildFragmentManager().beginTransaction().add(R.id.youtubeplayerfragment_container, youTubePlayerFragment).commit();
//            getChildFragmentManager().executePendingTransactions();
//            youTubePlayerFragment.init();
        } else {
            imageView = (ImageView) getView().findViewById(R.id.image);
            Picasso.with(getActivity().getBaseContext())
                    .load(bgRes)
                    .into(imageView);
        }

        //imageView.setBackgroundResource(bgRes);
    }
}
