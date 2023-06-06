package com.example.onetouch.SocialMedia;

import android.net.Uri;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onetouch.Adapter.WhatsAppAdapter;
import com.example.onetouch.Model.WhatsAppStatusModel;
import com.example.onetouch.R;
import com.example.onetouch.databinding.FragmentImageBinding;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ImageFragment extends Fragment {

    private FragmentImageBinding binding;
    private ArrayList<WhatsAppStatusModel> list;
    private WhatsAppAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getData();
        binding.refresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                list = new ArrayList<>();
                getData();
                binding.refresh.setRefreshing(false);
            }
        });
        return binding.getRoot();
    }

    private void getData() {
        WhatsAppStatusModel model;
        String targetPath = Environment.getExternalStorageDirectory().getAbsolutePath() +
                "/Android/media/com.whatsapp/WhatsApp/Media/.Statuses";

        File targetDireactory = new File(targetPath);
        File[] allFile = targetDireactory.listFiles();

//        String targetPathBuisness = Environment.getExternalStorageDirectory().getAbsolutePath() +
//                "/Android/media/com.whatsapp/WhatsApp Business/Media/.Statuses";
//
//        File targetDireactoryBusiness = new File(targetPathBuisness);
//        File[] allFileBusiness = targetDireactoryBusiness.listFiles();



//        Arrays.sort(allFile, (o1, o2) -> {
//            if (o1.lastModified() > o2.lastModified()) return -1;
//            else if (o1.lastModified() < o2.lastModified()) return +1;
//            else return 0;
//        });

        Arrays.sort(allFile, ((o1, o2) -> {
            if (o1.lastModified() > o2.lastModified()) return -1;
            else if (o1.lastModified() < o2.lastModified()) return +1;
            else return 0;
        }));

        for (int i = 0; i < allFile.length; i++) {
            File file = allFile[1];

            if (Uri.fromFile(file).toString().endsWith(".jpg")) {
                model = new WhatsAppStatusModel("whats " + i, Uri.fromFile(file), allFile[i].getAbsolutePath(), file.getName());

                list.add(model);

            }
        }
        adapter = new WhatsAppAdapter(list, getContext());
        binding.WhatsAppRecyclerView.setAdapter(adapter);

//        assert allFileBusiness != null;
//        Arrays.sort(allFileBusiness, (o1, o2) -> {
//            if (o1.lastModified() > o2.lastModified()) return -1;
//            else if (o1.lastModified() < o2.lastModified()) return +1;
//            else return 0;
//        });
//
//        for (int i = 0; i < allFileBusiness.length; i++) {
//            File file = allFileBusiness[1];
//
//            if (Uri.fromFile(file).toString().endsWith(".jpg")) {
//                model = new WhatsAppStatusModel("whatsBusiness" + i, Uri.fromFile(file), allFileBusiness[i].getAbsolutePath(), file.getName());
//
//                list.add(model);
//
//            }
//        }

    }
}