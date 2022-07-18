package com.example.animemodel;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.animemodel.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class MainModel extends Fragment implements OnItemClick {

    AnimeAdapter animeAdapter;
    FragmentMainBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<AnimeModel> list = new ArrayList<>();
        list.add(new AnimeModel("Homeless God", "Yato", 25));
        list.add(new AnimeModel("Boruto", "Boruto", 225));
        list.add(new AnimeModel("One Piece", "Luffy", 1025));
        list.add(new AnimeModel("Sin-Tyan", "Sina", 896));
        list.add(new AnimeModel("Detective Konan", "Konan", 924));
        list.add(new AnimeModel("Maruko-tyan","Momoko Sakura", 1092));
        list.add(new AnimeModel("Doraemon", "Doraemon", 1913));
        list.add(new AnimeModel("Bleach", "Ichigo", 366));
        list.add(new AnimeModel("Naruto", "Naruto", 500));

        animeAdapter = new AnimeAdapter(list, this);
        binding.recyclerAnime.setAdapter(animeAdapter);
    }

    @Override
    public void onClick(AnimeModel animeModel) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", animeModel);
        DetailFragment detailFragment = new DetailFragment();
        detailFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, detailFragment).commit();
    }
}